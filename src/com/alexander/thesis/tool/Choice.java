package com.alexander.thesis.tool;

import org.eclipse.uml2.uml.Stereotype;

import ImpactProfile.PerformanceTypes;
import ImpactProfile.localBool;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Dependency;

public class Choice {
	// Choice qualified stereotype name
	public static final String str_choice_stereotype = "ImpactProfile::Choice";

	/// Choice property names
	public static final String str_selected = "Selected";
	public static final String str_Performance = "Performance";
	public static final String str_PerformanceType = "PerformanceType";
	public static final String str_Power = "Power";
	public static final String str_Multiplicity = "Multiplicity";

	/// Choice Performance types
	public static final String str_Efficiency = "Efficiency";
	public static final String str_Dissipation = "Dissipation";

	public static boolean isChoice(org.eclipse.uml2.uml.Element umlElement) {
		return Util.isStereotype(umlElement, str_choice_stereotype);
	}

	/**
	 * Gets the selections status of the argument choice
	 * 
	 * @param choice An UML class with the stereotype Choice
	 * @return Selection status of the argument UML class
	 * @exception InternalError Throws when the method is unable to retrieve a
	 *                          localBool value from the stereotype.
	 */
	public static boolean getSelected(org.eclipse.uml2.uml.Class choice) {
		Stereotype choice_stereotype = Util.getStereotype(choice, str_choice_stereotype);
		Object obj = choice.getValue(choice_stereotype, str_selected);

		// Type check before casting
		if (!(obj instanceof localBool))
			throw new InternalError("Expected Choice property Selected to be of type localBool!");

		return ((localBool) obj).getLiteral().equals("true");
	}

	/**
	 * Gets the multiplicity of the argument choice
	 * 
	 * @param choice An UML class with the stereotype Choice
	 * @return The multiplicity of the argument choice
	 * @exception InternalError Throws when the method is unable to retrieve a
	 *                          Integer value from the stereotype.
	 */
	public static int getMultiplicity(org.eclipse.uml2.uml.Class choice) {
		Stereotype choice_stereotype = Util.getStereotype(choice, str_choice_stereotype);
		Object obj = choice.getValue(choice_stereotype, str_Multiplicity);

		// Type check before casting
		if (!(obj instanceof Integer))
			throw new InternalError("Expected Choice property Multiplicity to be of type Integer!");

		return (int) obj;
	}

	/**
	 * Gets the quantity and cost of a UML Class with the stereotype Choice applied
	 * 
	 * @param choice A UML Class object with the stereotype Choice applied
	 * @return A list of all quantities and costs associated with this UML Class
	 * @exception IllegalArgumentException Throws when the property ``Costs`` is not
	 *                                     of the correct type
	 * @exception IllegalArgumentException Throws when the given choice does not
	 *                                     have the stereotype ``Choice``
	 */
	@SuppressWarnings("unchecked") // The unchecked cast is checked but eclipse is not seeing it
	public static List<QuantityCost> getCosts(org.eclipse.uml2.uml.Class choice) {
		Stereotype choice_stereotype = Util.getStereotype(choice, str_choice_stereotype);
		List<QuantityCost> costs = new ArrayList<QuantityCost>();

		// Type checking before getting values
		Object obj = choice.getValue(choice_stereotype, "Costs");

		if (!(obj instanceof EObjectContainmentEList<?>))
			throw new IllegalArgumentException(
					"The given class's choice stereotype's property 'Costs' is not an EcoreEList");

		EObjectContainmentEList<?> objList = (EObjectContainmentEList<?>) obj;

		// If empty it means there are no costs associated with this choice
		if (objList.size() <= 0)
			return new ArrayList<QuantityCost>();

		// Type check the elements of the list
		if (!(objList.get(0) instanceof ImpactProfile.QuantityCost))
			throw new IllegalArgumentException(
					"The given class's choice stereotype's property 'Costs' list does not contain DynamicEObjectImpl objects");

		// Converts the QuantityCost objects into tool dependent objects for easier
		// handling
		for (ImpactProfile.QuantityCost qc : (EList<ImpactProfile.QuantityCost>) objList)
			costs.add(new QuantityCost(qc.getQuantity(), qc.getCostPerPart()));

		return costs;
	}

	/**
	 * Get the value of the property ``Performance`` in the stereotype ``Choice``
	 * applied to the UML Class
	 * 
	 * @param choice The UML Class with the stereotype Choice applied
	 * @return The performance value of the argument choice
	 * @exception InternalError Throws if it was unable to retrieve a Double from
	 *                          the stereotype property
	 */
	public static double getPerformance(org.eclipse.uml2.uml.Class choice) {
		Stereotype choice_stereotype = Util.getStereotype(choice, str_choice_stereotype);
		Object obj = choice.getValue(choice_stereotype, str_Performance);

		// Type check before casting
		if (!(obj instanceof Double))
			throw new InternalError("Expected choice property Performance to be of type Double!");

		return (double) obj;
	}

	/**
	 * Get the value of the property performanceType in the stereotype Choice
	 * applied to the UML Class
	 * 
	 * @param choice The UML Class with the stereotype Choice applied
	 * @return The performance type as a string
	 * @exception InternalError Throws if it was unable to retrieve a
	 *                          PerformanceTypes from the stereotype property
	 * 
	 */
	public static String getPerformanceType(org.eclipse.uml2.uml.Class choice) {
		Stereotype choice_stereotype = Util.getStereotype(choice, str_choice_stereotype);
		Object obj = choice.getValue(choice_stereotype, str_PerformanceType);

		// Type check before casting
		if (!(obj instanceof PerformanceTypes))
			throw new InternalError("Expected choice property PerformanceType to be of type PerformanceTypes!");

		// Return the name of the enumeration literal
		return ((PerformanceTypes) obj).getName();
	}

	/**
	 * Get the value of the property power in the stereotype Choice applied to the
	 * UML Class
	 * 
	 * @param choice The UML Class with the stereotype Choice applied
	 * @return The power value
	 * @exception InternalError Throws if it was unable to retrieve a Double from
	 *                          the stereotype property
	 */
	public static double getPower(org.eclipse.uml2.uml.Class choice) {
		Stereotype choice_stereotype = Util.getStereotype(choice, str_choice_stereotype);
		Object obj = choice.getValue(choice_stereotype, str_Power);

		// Type check before casting
		if (!(obj instanceof Double))
			throw new InternalError("Expected choice property Power to be of type Double!");

		return (double) obj;
	}

	/**
	 * Same as getSelected() but with another name for easier reading of code
	 * 
	 * @param choice The choice to check
	 * @return Indicates if the argument ``Choice``'s property selected is true or
	 *         false
	 */
	public static boolean isSelected(org.eclipse.uml2.uml.Class choice) {
		return getSelected(choice);
	}

	/**
	 * Gets the costs from the classes with the Choice stereotype and adds them all
	 * to the same list. Gets the total cost including multiplicity
	 * 
	 * @param choices A EList of classes with the "Choice" stereotype
	 * @return A list of QuantityCost containing a pair of quantity and cost for
	 *         each choice in choices
	 */
	public static List<QuantityCost> getCosts(EList<Class> choices) {
		List<QuantityCost> costs = new ArrayList<QuantityCost>();

		if (choices.size() == 0)
			return new ArrayList<QuantityCost>();

		// Loop over each choice and get their individual costs
		for (Class choice : choices) {
			List<QuantityCost> coiceCost = getCosts(choice);

			coiceCost.forEach(qc -> {
				qc.cost *= Choice.getMultiplicity(choice);
			});

			costs.addAll(coiceCost);

		}

		return costs;
	}

	/**
	 * Gets all the constraint relationships attached to the choices in the argument
	 * list. Only gets each constraint once
	 * 
	 * @param choices A list of UML classes with the stereotype Choice
	 * @return A list of relationships representing the constraints, and have either
	 *         an Includes or Excludes stereotype attached to it
	 */
	public static EList<Dependency> getConstraints(EList<org.eclipse.uml2.uml.Class> choices) {
		EList<Dependency> constraints = new BasicEList<Dependency>();

		// Go through all choices
		for (Class choice : choices) {

			// Check each relationship attached to the current choice
			choice.getRelationships().forEach(relation -> {

				// Check if the relation is already included in the return list ``constraints``
				if (constraints.contains(relation))
					return;

				// Return/continue to the next loop iteration if it is not a dependency relation
				if (!Constraint.isDependency(relation))
					return;

				// Add to return list if it is an ``Includes`` or ``Excludes`` relation
				if (Constraint.isIncludes((Dependency) relation) || Constraint.isExcludes((Dependency) relation))
					constraints.add((Dependency) relation);
			});
		}

		return constraints;
	}

	/**
	 * Get and sums all Classes with stereotype Choice's attribute Power. A positive
	 * number indicates that it is consuming power while a negative that it is
	 * producing/supplying.
	 * 
	 * @param choices The choices whose' power is to be summed
	 * @return The sum of all power, negative means it is over producing and
	 *         positive over consuming
	 */
	public static double getTotalPower(EList<org.eclipse.uml2.uml.Class> choices) {
		double power = 0;

		// Return 0.0 if the list is of size zero instead of throwing an exception
		if (choices.size() == 0) {
			System.err.println("Passed a list of size ZERO in getAndSumPower; returning 0.");
			return 0.0;
		}

		// For each choice check if the performance type is ``Efficiency``, if it is,
		// its
		// power is affected by an efficient performance parameter and its effect shall
		// be multiplied by its power before being summed, else add the power to the
		// total directly.
		for (Class choice : choices) {

			// Get the multiplicity of the choice
			int multiplicity = getMultiplicity(choice);

			// If the performance type is efficiency add its power with a factor of its
			// performance
			if (getPerformanceType(choice).equals(str_Efficiency)) {
				power += getPerformance(choice) * getPower(choice) * multiplicity;
				continue;
			}

			power += getPower(choice) * multiplicity;
		}

		return power;
	}

	/**
	 * Gets the total power consumption of the list of choices passed into the
	 * method
	 * 
	 * @param choices A list of UML classes with the stereotype ```Choice``
	 * @return The total power consumption as a double
	 */
	public static double getTotalPowerConsumption(EList<org.eclipse.uml2.uml.Class> choices) {
		double power_consumption = 0;

		// Returns zero instead of throwing an exception
		if (choices.size() == 0) {
			System.err.println("Passed a list of size ZERO in getPowerConsumption; returning 0.");
			return 0.0;
		}

		// Loop through and sum all selected choices which consumes power
		for (Class choice : choices) {

			// Get the multiplicity of the choice
			int multiplicity = getMultiplicity(choice);

			// Add power to power_consumption if it is greater than 0, which means that it
			// consumes power. If it is less (negative) it produces power.
			double power = getPower(choice);
			power_consumption += power > 0 ? power * multiplicity : 0;
		}

		return power_consumption;
	}

	/**
	 * Gets the total heat dissipation capability, i.e. how much power it can
	 * dissipate in the model specific unit
	 * 
	 * @param choices A list of all choices which are to be checked, can include
	 *                choices with or without any heat dissipation capability
	 * @return A double representing the total heat dissipation capability of the
	 *         device
	 */
	public static double getTotalHeatDissipationCapability(EList<Class> choices) {
		double dissipation = 0.0;
		
		// Return zero instead of throwing an exception
		if (choices.size() == 0) {
			System.err
					.println("The list provided to getHeatDissipationCapability is set of size zero, returning 0.0...");
			return 0.0;
		}
		
		// For each choice, if the performance type is dissipation sum it
		for (Class choice : choices) {
			if (!getPerformanceType(choice).equals(str_Dissipation))
				continue;

			dissipation += getPerformance(choice);
		}

		return dissipation;
	}
}