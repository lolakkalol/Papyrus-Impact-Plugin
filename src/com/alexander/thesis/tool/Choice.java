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
	public static final String str_choice_stereotype = "ImpactProfile::Choice";

	// Choice properties
	public static final String str_selected = "Selected";
	public static final String str_Performance = "Performance";
	public static final String str_PerformanceType = "PerformanceType";
	public static final String str_Power = "Power";
	public static final String str_Multiplicity = "Multiplicity";
	
	// Performance types
	public static final String str_Efficiency = "Efficiency";
	public static final String str_Dissipation = "Dissipation";

	public static boolean isChoice(org.eclipse.uml2.uml.Element umlElement) {
		return Util.isStereotype(umlElement, str_choice_stereotype);
	}
	
	/**
	 * Gets the selections status of the choice
	 * @param choice An UML class with the stereotype Choice
	 * @return Selection status
	 */
	public static boolean getSelected(org.eclipse.uml2.uml.Class choice) {
		Stereotype choice_stereotype = Util.getStereotype(choice, str_choice_stereotype);
		Object obj = choice.getValue(choice_stereotype, str_selected);

		// Type check before casting
		if (!(obj instanceof localBool))
			throw new IllegalArgumentException("Expected Choice property Selected to be of type localBool!");

		return ((localBool) obj).getLiteral().equals("true");
	}
	
	/**
	 * Gets the selections status of the choice
	 * @param choice An UML class with the stereotype Choice
	 * @return Selection status
	 */
	public static int getMultiplicity(org.eclipse.uml2.uml.Class choice) {
		Stereotype choice_stereotype = Util.getStereotype(choice, str_choice_stereotype);
		Object obj = choice.getValue(choice_stereotype, str_Multiplicity);

		// Type check before casting
		if (!(obj instanceof Integer))
			throw new IllegalArgumentException("Expected Choice property Multiplicity to be of type Integer!");

		return (int) obj;
	}

	/**
	 * Gets the quantity and cost of a UML Class with the stereotype Choice applied
	 * 
	 * @param choice The UML Class object with the stereotype Choice applied
	 * @return A list of all quantities and costs associated with this UML Class
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

		// If empty it means there are not costs associated with this choice
		EObjectContainmentEList<?> objList = (EObjectContainmentEList<?>) obj;
		
		if (objList.size() <= 0)
			return new ArrayList<QuantityCost>();

		if (!(objList.get(0) instanceof ImpactProfile.QuantityCost))
			throw new IllegalArgumentException(
					"The given class's choice stereotype's property 'Costs' list does not contain DynamicEObjectImpl objects");

		// Converts the QuantityCost objects into tool dependent objects
		for (ImpactProfile.QuantityCost qc : (EList<ImpactProfile.QuantityCost>) objList)
			costs.add(new QuantityCost(qc.getQuantity(), qc.getCostPerPart()));
		
		return costs;
	}

	/**
	 * Get the value of the property performance in the stereotype Choice applied to
	 * the UML Class
	 * 
	 * @param choice The UML Class with the stereotype Choice applied
	 * @return The performance value
	 */
	public static double getPerformance(org.eclipse.uml2.uml.Class choice) {
		Stereotype choice_stereotype = Util.getStereotype(choice, str_choice_stereotype);
		Object obj = choice.getValue(choice_stereotype, str_Performance);

		// Type check before casting
		if (!(obj instanceof Double))
			throw new IllegalArgumentException("Expected choice property Performance to be of type Double!");

		return (double) obj;
	}

	/**
	 * Get the value of the property performanceType in the stereotype Choice
	 * applied to the UML Class
	 * 
	 * @param choice The UML Class with the stereotype Choice applied
	 * @return The performance type as a string
	 */
	public static String getPerformanceType(org.eclipse.uml2.uml.Class choice) {
		Stereotype choice_stereotype = Util.getStereotype(choice, str_choice_stereotype);
		Object obj = choice.getValue(choice_stereotype, str_PerformanceType);

		// Type check before casting
		if (!(obj instanceof PerformanceTypes))
			throw new IllegalArgumentException(
					"Expected choice property PerformanceType to be of type PerformanceTypes!");

		// Return the name of the enumeration literal
		return ((PerformanceTypes) obj).getName();
	}

	/**
	 * Get the value of the property power in the stereotype Choice applied to the
	 * UML Class
	 * 
	 * @param choice The UML Class with the stereotype Choice applied
	 * @return The power value
	 */
	public static double getPower(org.eclipse.uml2.uml.Class choice) {
		Stereotype choice_stereotype = Util.getStereotype(choice, str_choice_stereotype);
		Object obj = choice.getValue(choice_stereotype, str_Power);

		// Type check before casting
		if (!(obj instanceof Double))
			throw new IllegalArgumentException("Expected choice property Power to be of type Double!");

		return (double) obj;
	}

	/**
	 * Same as getSelected() but with another name for easier reading of code
	 * 
	 * @param choice
	 * @return
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
			
			coiceCost.forEach( qc -> {
				qc.cost *= Choice.getMultiplicity(choice); 
			});
			
			costs.addAll(coiceCost);
			
		}

		return costs;
	}

	/**
	 * Gets all the constraint relationships attached to the choices in the argument
	 * list. Only gets each constraint one.
	 * 
	 * @param choices A list of Classes with the stereotype Choice
	 * @return A list of relationships representing the constraints, and have either
	 *         an Includes or Excludes stereotype attached to it.
	 */
	public static EList<Dependency> getConstraints(EList<org.eclipse.uml2.uml.Class> choices) {
		EList<Dependency> constraints = new BasicEList<Dependency>();

		// For each relationship a choice have, if it is 1) not in the constraint list
		// already and 2)
		// has either the Includes or Excludes stereotype, add it to the constraint list
		// to be returned
		for (Class choice : choices) {
			choice.getRelationships().forEach(relation -> {
				if (constraints.contains(relation))
					return;

				if (!Constraint.isDependency(relation))
					return;

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

		if (choices.size() == 0) {
			System.err.println("Passed a list of size ZERO in getAndSumPower; returning 0.");
			return 0.0;
		}

		// For each choice check if the performance type is efficiency, if it is, its
		// power is affected by an efficient performance parameter and its effect shall
		// be multiplied by its power before being summed, else add the power to the
		// total.
		for (Class choice : choices) {
			// Get the multiplicity of the choice
			int multiplicity = getMultiplicity(choice);
			
			if (getPerformanceType(choice).equals(str_Efficiency)) {
				power += getPerformance(choice) * getPower(choice) * multiplicity;
				continue;
			}

			power += getPower(choice) * multiplicity;
		}

		return power;
	}
	
	public static double getTotalPowerConsumption(EList<org.eclipse.uml2.uml.Class> choices) {
		double power_consumption = 0;

		if (choices.size() == 0) {
			System.err.println("Passed a list of size ZERO in getPowerConsumption; returning 0.");
			return 0.0;
		}

		// Loop through and sum all selected choices which consumes power
		for (Class choice : choices) {
			// Get the multiplicity of the choice
			int multiplicity = getMultiplicity(choice);
			
			// Add power to consumption if it is greater than 0, which means that it
			// consumes power. If it is less (negative) it produces power.
			double power = getPower(choice);
			power_consumption += power > 0 ? power * multiplicity : 0;
		}

		return power_consumption;
	}
	
	/**
	 * 
	 * @param choices
	 * @return
	 */
	public static double getTotalHeatDissipationCapability(EList<Class> choices) {
		double dissipation = 0.0;

		if (choices.size() == 0) {
			System.err
					.println("The list provided to getHeatDissipationCapability is set of size zero, returning 0.0...");
			return 0.0;
		}

		for (Class choice : choices) {
			if (!getPerformanceType(choice).equals(str_Dissipation))
				continue;

			dissipation += getPerformance(choice);
		}

		return dissipation;
	}
}