package com.alexander.thesis.tool;

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Package;

public class Util {

	/**
	 * Gets a stereotype from the umlElement argument
	 * 
	 * @param umlElement     The element which has the stereotype we want
	 * @param str_stereotype The name of the stereotype we want to get from the
	 *                       argument umlElement
	 * @return The stereotype by the name ``str_stereotype``
	 * @exception IllegalArgumentException Will throw an exception if ``umlElement``
	 *                                     does not have the stereotype
	 *                                     ``str_stereotype``
	 */
	public static Stereotype getStereotype(org.eclipse.uml2.uml.Element umlElement, String str_stereotype) {
		Stereotype stereotype = umlElement.getAppliedStereotype(str_stereotype);

		if (stereotype == null)
			throw new IllegalArgumentException("Invalid stereotype!");

		return stereotype;
	}

	/**
	 * Gets the total cost of all choices made under a system/class
	 * 
	 * @param umlClass The class/system to get the total cost of
	 * @return The total cost of the class/system, will depend on
	 */
	public static List<QuantityCost> getCostOfBranch(org.eclipse.uml2.uml.Class umlClass) {
		EList<Class> vp = Util.findVariabilityPoints(umlClass);
		EList<Class> sc = VariabilityPoint.getAllSelectedChoices(vp);
		List<QuantityCost> costs = Choice.getCosts(sc);
		List<QuantityCost> summedCosts = QuantityCost.getSum(costs);

		QuantityCost.sort(summedCosts);

		return summedCosts;
	}

	/**
	 * Gets all modelling classes with the stereotype ``VariabilityPoint``
	 * 
	 * @param umlClass The root class to start the search from
	 * @return A list of all found variability points
	 */
	public static EList<Class> findVariabilityPoints(Class umlClass) {
		EList<Class> tree = getAllNestedClasses(umlClass);
		EList<Class> variabilityPoints = new BasicEList<Class>();

		for (Class node : tree) {
			if (!VariabilityPoint.isVariabilityPoint(node))
				continue;

			variabilityPoints.add(node);

		}

		return variabilityPoints;
	}

	/**
	 * Check if the stereotype is applied to the UML Element
	 * 
	 * @param umlElement
	 * @param stereotype The name of the stereotype
	 * @return If it the stereotype is applied or not
	 */
	public static boolean isStereotype(org.eclipse.uml2.uml.Element umlElement, String stereotype) {
		if (umlElement.getAppliedStereotype(stereotype) == null)
			return false;

		return true;
	}

	/**
	 * Gets all classes related to the argument `c` through associations. Uses
	 * recursion so be careful with use on LARGE trees.
	 * 
	 * @param umlClass The class to recursively get all associated classes bellow
	 * @return A EList of all classes bellow `c`
	 */
	public static EList<Class> getAllNestedClasses(Class umlClass) {
		EList<Class> list = new BasicEList<Class>();
		list.add(umlClass);

		return getAllNestedClassesHelper(list);
	}

	/**
	 * The actual recursion function that gets the next level of classes and returns
	 * them added to the argument.
	 * 
	 * @param list the list to recursively add to
	 * @return A list of the input classes + getAllNestedClassesHelper(newClasses).
	 */
	private static EList<Class> getAllNestedClassesHelper(EList<Class> list) {
		EList<Class> newClasses = new BasicEList<Class>();

		// End condition
		if (list.size() == 0)
			return new BasicEList<Class>();

		// Get next level of classes
		for (Class element : list) {
			newClasses.addAll(getNestedClasses(element));
		}

		// Add the next levels' classes' levels to the list
		list.addAll(getAllNestedClassesHelper(newClasses));
		return list;

	}

	/**
	 * Gets all classes which composes the argument `c` through one associations
	 * level down
	 * 
	 * @param umlClass The UML2 Class we are looking for any associated classes
	 * @return A list of UML Classes
	 */
	public static EList<Class> getNestedClasses(Class umlClass) {
		EList<Class> children = new BasicEList<Class>();
		EList<Association> associations = umlClass.getAssociations();

		if (associations.size() == 0)
			return children; // Is empty at this point

		// Iterate through each association
		for (Association association : associations) {

			// Check that the association only has two ends, allows us to use .get(x) bellow
			if (!association.isBinary())
				continue;

			// Gets the type of the members at each end of the binary association
			Property memberEnd0 = association.getMemberEnds().get(0);
			Property memberEnd1 = association.getMemberEnds().get(1);

			// Get the classes at the end of the association, skip iteration if not classes
			if (!(memberEnd0.getType() instanceof org.eclipse.uml2.uml.Class)
					|| !(memberEnd1.getType() instanceof org.eclipse.uml2.uml.Class))
				continue;

			// Gets the elements at each ends and tries to convert them to classes
			Class memberAtEnd0 = (Class) memberEnd0.getType();
			Class memberAtEnd1 = (Class) memberEnd1.getType();

			// Add the class that is composite of the input class AND it is not the input
			// class
			if (memberEnd0.isComposite() && !memberAtEnd0.equals(umlClass)) {
				children.add(memberAtEnd0);

			} else if (memberEnd1.isComposite() && !memberAtEnd1.equals(umlClass)) {
				children.add(memberAtEnd1);

			}
		}

		return children;
	}

	/**
	 * Adds an item to a list with the string
	 * "{@literal <Client name> -<Includes/Excludes>-> <Supplier name>}"
	 * 
	 * @param constraint A relationship with the stereotype Includes OR Excludes
	 * @param list       A handle to the Java swing object to add the item to
	 */
	public static void addConstraintToList(Dependency constraint, org.eclipse.swt.widgets.List list) {
		EList<NamedElement> clients = constraint.getClients();
		EList<NamedElement> suppliers = constraint.getSuppliers();

		// Check that we do not have more or less than 1 clients/suppliers
		if (clients.size() != 1 || suppliers.size() != 1)
			throw new IllegalArgumentException("A constraint with zero clients and/or suppliers was supplied!");

		list.add("C: " + clients.get(0).getName() + " -" + Constraint.getStereotype(constraint).getName() + "-> "
				+ suppliers.get(0).getName());

	}

	/**
	 * Gets all goals from a model package.
	 * 
	 * @param rootModel The start model to start looking for goals from
	 * @return A list of goals found in the model
	 */
	public static EList<Class> getAllGoals(org.eclipse.uml2.uml.Model rootModel) {
		EList<PackageableElement> elements = rootModel.getPackagedElements();

		return getAllGoalsHelper(elements);
	}

	private static EList<Class> getAllGoalsHelper(EList<PackageableElement> elements) {
		EList<Class> goals = new BasicEList<Class>();

		// No more elements to unpack
		if (elements.size() == 0)
			return goals; // Empty at this point

		// Go though each element and check if it is a package and we need to look
		// deeper or if it is a goal and we should add it to the goals list
		for (NamedElement element : elements) {

			// If it is a package get all elements in said package and go though them as
			// well
			if (element instanceof Package) {
				goals.addAll(getAllGoalsHelper(((Package) element).getPackagedElements()));

			}

			// We are not interested in the element if it is not a package or a class so
			// skip this iteration
			if (!(element instanceof Class))
				continue;

			// Go through all of the classes owned elements (They can be classes which have
			// the Goal stereotype)
			goals.addAll(getAllGoalsHelperNamed(((Class) element).getOwnedElements()));

			// If element is a goal add it to the goals list
			if (Goal.isGoal(element))
				goals.add((Class) element);

		}

		return goals;
	}

	/**
	 * Same as the non-Named variant but this one handles NamedElements and not
	 * PackagebleElements
	 * 
	 * @param elements
	 * @return
	 */
	private static EList<Class> getAllGoalsHelperNamed(EList<Element> elements) {
		EList<Class> goals = new BasicEList<Class>();

		// No more elements to unpack
		if (elements.size() == 0)
			return goals; // Empty at this point

		// Go though each element and check if it is a package and we need to look
		// deeper or if it is a goal and we should add it to the goals list
		for (Element element : elements) {

			// If it is a package get all elements in said package and go though them as
			// well
			if (element instanceof Package)
				goals.addAll(getAllGoalsHelper(((Package) element).getPackagedElements()));

			// We are not interested in the element if it is not a package or a class so
			// skip this iteration
			if (!(element instanceof Class))
				continue;

			// Go through all of the classes owned elements (They can be classes which have
			// the Goal stereotype)
			goals.addAll(getAllGoalsHelperNamed(element.getOwnedElements()));

			// If element is a goal add it to the goals list
			if (Goal.isGoal(element))
				goals.add((Class) element);

		}

		return goals;
	}

	/**
	 * Gets all classes from the model in the ``rootModel`` argument
	 * 
	 * @param rootModel The model to start searching for classes from
	 * @return A EList of classes
	 */
	public static EList<Class> getAllClasses(org.eclipse.uml2.uml.Package rootModel) {
		EList<PackageableElement> elements = rootModel.getPackagedElements();

		return getAllClassesHelper(elements);
	}

	private static EList<Class> getAllClassesHelper(EList<PackageableElement> elements) {
		EList<Class> classes = new BasicEList<Class>();

		// No more elements to unpack
		if (elements.size() == 0)
			return classes; // Empty at this point

		// Go though each element and check if it is a package and we need to look
		// deeper or if it is a goal and we should add it to the goals list
		for (NamedElement element : elements) {

			// If it is a package get all elements in said package and go though them as
			// well
			if (element instanceof Package) {
				classes.addAll(getAllClassesHelper(((Package) element).getPackagedElements()));

			}

			// We are not interested in the element if it is not a package or a class so
			// skip this iteration
			if (!(element instanceof Class))
				continue;

			// Go through all of the classes owned elements (They can be classes which have
			// the Goal stereotype)
			classes.addAll(getAllClassesHelperNamed(((Class) element).getOwnedElements()));

			// Add element to classes
			classes.add((Class) element);

		}

		return classes;
	}

	/**
	 * Same as the non-Named variant but this one handles NamedElements and not
	 * PackagebleElements
	 * 
	 * @param elements
	 * @return
	 */
	private static EList<Class> getAllClassesHelperNamed(EList<Element> elements) {
		EList<Class> classes = new BasicEList<Class>();

		// No more elements to unpack
		if (elements.size() == 0)
			return classes; // Empty at this point

		// Go though each element and check if it is a package and we need to look
		// deeper or if it is a goal and we should add it to the goals list
		for (Element element : elements) {

			// If it is a package get all elements in said package and go though them as
			// well
			if (element instanceof Package)
				classes.addAll(getAllGoalsHelper(((Package) element).getPackagedElements()));

			// We are not interested in the element if it is not a package or a class so
			// skip this iteration
			if (!(element instanceof Class))
				continue;

			// Go through all of the classes owned elements (They can be classes which have
			// the Goal stereotype)
			classes.addAll(getAllGoalsHelperNamed(element.getOwnedElements()));

			// If element is a goal add it to the goals list
			classes.add((Class) element);

		}

		return classes;
	}

	/**
	 * Gets all requirements in a specified model, will from there search for a
	 * package named "requirements" (ignores case) and from there searches for all
	 * requirements
	 * 
	 * @param rootModel The model to search for requirements from
	 * @return A list of classes representing the requirements
	 * @exception If the method could not find the requirements package
	 */
	public static EList<Class> getAllRequirements(Package rootModel) {
		Package pkg_requirements = null;
		EList<Class> requirements = new BasicEList<Class>();

		// Find the requirements package
		for (Package pkg : rootModel.getNestedPackages())
			if (pkg.getName().equalsIgnoreCase("Requirements"))
				pkg_requirements = pkg;

		if (pkg_requirements == null)
			throw new InternalError("Could not find the requirements package!");

		// For each class in the requirements package see if it is a requirement and add
		// it to the requirements list if it is
		for (Class c : Util.getAllClasses(pkg_requirements))
			if (Requirement.isRequirement(c))
				requirements.add(c);

		return requirements;
	}
}
