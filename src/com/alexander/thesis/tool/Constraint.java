package com.alexander.thesis.tool;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Stereotype;

enum constraint_type {
	includes, excludes, none, more_than_one
}

public class Constraint {
	public static final String str_Includes_stereotype = "ImpactProfile::Includes";
	public static final String str_Excludes_stereotype = "ImpactProfile::Excludes";

	/**
	 * Checks if the UML element is a dependency edge
	 * 
	 * @param umlElement The UML element
	 * @return boolean
	 */
	public static boolean isDependency(org.eclipse.uml2.uml.Element umlElement) {
		if (umlElement instanceof org.eclipse.uml2.uml.Dependency)
			return true;

		return false;
	}

	/**
	 * Returns an enum representing which type of constraint the dependency had
	 * 
	 * @param constraint A dependency edge
	 * @return constraint_type
	 */
	public static constraint_type getType(org.eclipse.uml2.uml.Dependency constraint) {
		EList<Stereotype> stereotype_list = constraint.getAppliedStereotypes();

		if (stereotype_list.size() == 0)
			return constraint_type.none;

		if (stereotype_list.size() > 1)
			return constraint_type.more_than_one;

		if (stereotype_list.size() != 1)
			throw new InternalError("Size of the stereotype list is not equal to 1 when it was expected!");

		Stereotype stereotype = stereotype_list.get(0);

		if (stereotype.getName().equals("Includes"))
			return constraint_type.includes;

		if (stereotype.getName().equals("Excludes"))
			return constraint_type.excludes;

		return constraint_type.none;

	}
	
	public static Stereotype getStereotype(org.eclipse.uml2.uml.Dependency constraint) {
		constraint_type type = getType(constraint);
		
		switch (type) {
		case includes:
			return Util.getStereotype(constraint, str_Includes_stereotype);
			
		case excludes:
			return Util.getStereotype(constraint, str_Excludes_stereotype);
			
		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
	}

	/**
	 * Check if the dependency edge has the stereotype Includes
	 * 
	 * @param constraint The dependency edge
	 * @return true if true, else false
	 */
	public static boolean isIncludes(org.eclipse.uml2.uml.Dependency constraint) {
		if (getType(constraint) == constraint_type.includes)
			return true;

		return false;
	}

	/**
	 * Check if the dependency edge has the stereotype Excludes
	 * 
	 * @param constraint The dependency edge
	 * @return true if true, else false
	 */
	public static boolean isExcludes(org.eclipse.uml2.uml.Dependency constraint) {
		if (getType(constraint) == constraint_type.excludes)
			return true;

		return false;
	}

	/**
	 * Takes a list of relationships which are constraints and return all which are
	 * not satisfied. OBS! Assumes that the client is selected.
	 * 
	 * @param constraints to be checked
	 * @return A EList of failed constraints
	 */
	public static EList<Dependency> checkConstraints(EList<Dependency> constraints) {
		EList<Dependency> failedConstraints = new BasicEList<Dependency>();

		// Go through all constraints
		for (Dependency relationship : constraints) {

			// Get the client and the supplier. The client element is the element that needs
			// something to be true while the supplier is the constraining element.
			Dependency dependency = relationship;
			EList<NamedElement> clients = dependency.getClients();
			EList<NamedElement> suppliers = dependency.getSuppliers();

			// Check that we do not have more or less than 1 clients/suppliers
			if (clients.size() != 1 || suppliers.size() != 1)
				throw new InternalError("Bad number of clients and/or suppliers!");

			// Safe to now assume that the 0:th element exists
			Class client = (Class) clients.get(0);
			Class supplier = (Class) suppliers.get(0);

			// Check if both client and supplier has the choice stereotype
			if (!Choice.isChoice(supplier) && !Choice.isChoice(client))
				throw new InternalError("Client and/or supplier does not have a choice stereotype applied!");

			// Get the selection status of the supplier
			boolean SupplierSelected = Choice.isSelected(supplier);
			boolean ClientSelected = Choice.isSelected(client);

			// If the client is not selected the constraint does not apply!
			if (!ClientSelected)
				continue;

			// Get the active constraint types of the relation
			boolean includeIsApplied = Constraint.isIncludes(dependency);
			boolean excludeIsApplied = Constraint.isExcludes(dependency);

			// Check that two stereotypes are not applied
			if (includeIsApplied && excludeIsApplied) {
				throw new IllegalArgumentException("A Dependency edge with two constraints was supplied! Client: "
						+ client.getName() + "  Supplier: " + supplier.getName());

				// If the constraint is an include relationship the suppliers selection status
				// must be true.
				// If the constraint is an exclude relationship the suppliers selection status
				// must be false.
			} else if ((includeIsApplied && !SupplierSelected) || (excludeIsApplied && SupplierSelected)) {
				failedConstraints.add(relationship);

			} else if (!includeIsApplied && !excludeIsApplied) {
				throw new IllegalArgumentException("A Dependency edge with zero constraints was supplied! Client: "
						+ client.getName() + "  Supplier: " + supplier.getName());
			}

		}

		return failedConstraints;
	}
	
	/**
	 * Prints the selected constraint in the format "<Client name>
	 * -<Includes/Excludes>-> <Supplier name>"
	 * 
	 * @param constraint
	 */
	public static void printConstraint(Dependency constraint) {
		EList<NamedElement> clients = constraint.getClients();
		EList<NamedElement> suppliers = constraint.getSuppliers();
		
		if (clients.size() != 1 || suppliers.size() != 1)
			throw new IllegalArgumentException("Supplied constraint with too many cliens and/or suppliers!");

		System.out.print(clients.get(0).getName() + " -" + Constraint.getStereotype(constraint).getName() + "-> "
				+ suppliers.get(0).getName());

	}
}
