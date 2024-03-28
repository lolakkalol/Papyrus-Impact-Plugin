package com.alexander.thesis.tool;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.Class;

public class Requirement {
	public static final String str_requirement_stereotype = "SysML::Requirements::Requirement";

	public static boolean isRequirement(Element element) {
		return Util.isStereotype(element, str_requirement_stereotype);
	}

	/**
	 * Checks if the goals linked to the requirement through an abstraction edge is
	 * satisfied. Is able to check all goals linked to a requirement.
	 * 
	 * @param requirement The requirement to be checked.
	 * @return A list of failed goals linked to the requirement. If the list is
	 *         empty no goals failed or no goals are linked to the requirement.
	 */
	public static EList<Class> verify(Class requirement) {

		EList<Relationship> relationships = requirement.getRelationships();
		EList<Abstraction> requirementEdges = new BasicEList<Abstraction>();
		EList<Class> failedGoals = new BasicEList<Class>();

		for (Relationship relationship : relationships)
			if (relationship instanceof Abstraction)
				requirementEdges.add((Abstraction) relationship);

		for (Abstraction requirementEdge : requirementEdges) {
			EList<NamedElement> suppliers = requirementEdge.getSuppliers();

			if (suppliers.size() != 1)
				throw new IllegalArgumentException(
						"A Abstraction edge with zero or more than one supplier found, which is not allowed!");

			if (!(suppliers.get(0) instanceof Class))
				continue;

			if (!Goal.isGoal(suppliers.get(0)))
				continue;

			Class goal = (Class) suppliers.get(0);

			if (!Goal.satisfied(goal))
				failedGoals.add(goal);
		}

		return failedGoals;
	}

}
