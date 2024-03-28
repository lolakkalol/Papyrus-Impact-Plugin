package com.alexander.thesis.tool;

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;

import ImpactProfile.GoalChecks;
import ImpactProfile.GoalTypes;

import org.eclipse.uml2.uml.Class;

public class Goal {
	public static final String str_goal_stereotype = "ImpactProfile::Goal";

	// Goal properties
	public static final String str_Goal = "Goal";
	public static final String str_GoalType = "GoalType";
	public static final String str_GoalCheck = "GoalCheck";

	// Goal property values
	public static final String str_GT = "GT";
	public static final String str_GTE = "GTE";
	public static final String str_LT = "LT";
	public static final String str_LTE = "LTE";
	public static final String str_EQ = "EQ";
	public static final String str_NA = "NA";
	public static final String str_Performance = "Performance";
	public static final String str_Cost = "Cost";
	public static final String str_Power = "Power";

	public static boolean isGoal(org.eclipse.uml2.uml.Element umlElement) {
		return Util.isStereotype(umlElement, str_goal_stereotype);
	}

	/**
	 * Get the value of the Goal property of the Goal stereotype applied to a UML
	 * Class
	 * 
	 * @param goal The UML Class with the Goal stereotype
	 * @return The value of the Goal property
	 */
	public static double getGoal(org.eclipse.uml2.uml.Class goal) {
		Stereotype goal_stereotype = Util.getStereotype(goal, str_goal_stereotype);
		Object obj = goal.getValue(goal_stereotype, str_Goal);

		// Type check before casting
		if (!(obj instanceof Double))
			throw new IllegalArgumentException("Expected Goal property Goal to be of type double!");

		return (double) obj;
	}

	/**
	 * Get the value of the GoalType property of the Goal stereotype applied to a
	 * UML Class
	 * 
	 * @param goal The UML Class with the Goal stereotype
	 * @return The value of the GoalType property
	 */
	public static String getGoalType(org.eclipse.uml2.uml.Class goal) {
		Stereotype goal_stereotype = Util.getStereotype(goal, str_goal_stereotype);
		Object obj = goal.getValue(goal_stereotype, str_GoalType);

		// Type check before casting
		if (!(obj instanceof GoalTypes))
			throw new IllegalArgumentException("Expected Goal property GoalType to be of type GoalTypes!");

		return ((GoalTypes) obj).getName();
	}

	/**
	 * Get the value of the GoalCheck property of the Goal stereotype applied to a
	 * UML Class
	 * 
	 * @param goal The UML Class with the Goal stereotype
	 * @return The value of the GoalCheck property
	 */
	public static String getGoalCheck(org.eclipse.uml2.uml.Class goal) {
		Stereotype goal_stereotype = Util.getStereotype(goal, str_goal_stereotype);
		Object obj = goal.getValue(goal_stereotype, str_GoalCheck);

		// Type check before casting
		if (!(obj instanceof GoalChecks))
			throw new IllegalArgumentException("Expected Goal property GoalCheck to be of type GoalChecks!");

		return ((GoalChecks) obj).getName();
	}

	/**
	 * Given a goal, checks if the target of said goal can satisfy the goal. The
	 * goal must be attached to the target through an association and be a UML Class
	 * (It can have any stereotype including <<Block>>). If the goal has multiple
	 * targets, if one target satisfies the goal, the goal is satisfied, even if the
	 * other targets are not satisfied.
	 * 
	 * @param goal The goal to be checked
	 * @return true if the goal is satisfied else false.
	 */
	public static boolean satisfied(org.eclipse.uml2.uml.Class goal) {

		// Get target class
		EList<Relationship> relationships = goal.getRelationships();

		// The edge leading to the class which should satisfy the goal
		EList<Association> targetEdges = new BasicEList<Association>();

		// Get the target edge
		for (Relationship relationship : relationships) {
			// Association is used to specify which class the goal should apply to
			if (relationship instanceof Association) {

				targetEdges.add((Association) relationship);
			}
		}

		boolean satisfied = false;
		
		for(Association targetEdge : targetEdges) {
			Class target = null;
			
			// Get the target of the goal
			for (Property property : targetEdge.getMemberEnds()) {
				Type type = property.getType();
				if (!(type instanceof Class))
					throw new IllegalArgumentException(
							"The goal: " + goal.getName() + " had an invalid target, must be a UML class!");
	
				// It found itself skip...
				if (type.equals(goal))
					continue;
	
				target = (Class) type;
			}
	
			if (target == null)
				throw new InternalError("Could not find the target of goal: " + goal.getName());
	
			// Check if variability point or normal
			boolean variabilityPoint = VariabilityPoint.isVariabilityPoint(target);
	
			// If the target is a system and not a variabilityPoint, we need to check all
			// the selected choices under the target and sum their costs before checking if
			// the goal is satisfied.
			if (!variabilityPoint)
				satisfied = checkSystem(goal, target);
			else
				//Check if the variability point choice satisfies the goal
				satisfied = checkVariabilityPoint(goal, target);
			
			if (satisfied)
				return true;
		}
		
		return false;
	}

	/**
	 * Given a goal, check if the system, i.e. all choices which compose a UML Class
	 * (or SysML block), is satisfied. Only works for cost goals.
	 * 
	 * @param goal   The goal to be checked
	 * @param system The system to be checked
	 * @return true if satisfied false if not.
	 */
	public static boolean checkSystem(org.eclipse.uml2.uml.Class goal, org.eclipse.uml2.uml.Class system) {
		// Get the goal properties
		double goal_property = getGoal(goal);
		String goalCheck_property = getGoalCheck(goal);
		String goalType_property = getGoalType(goal);

		// Currently not capable of checking other goals than cost for systems, hence an
		// illegal goal and wont be checked.
		if (!(goalType_property.equals(str_Cost) || goalType_property.equals(str_Power)))
			throw new IllegalArgumentException("The goal: " + goal.getName() + " has the type: " + goalType_property
					+ " while the target is not a variability point which is not allowed!");
		if (goalType_property.equals(str_Cost)) {
		// 	Get the total summed costs and check if they can satisfy the goal
			List<QuantityCost> summedCosts = Util.getCostOfBranch(system);
			return checkCost(summedCosts, goal_property, goalCheck_property);
		} else {
			
			// Get and sum all selected choices power
			EList<Class> variabilityPoints =  Util.findVariabilityPoints(system);
			EList<Class> choices = VariabilityPoint.getAllSelectedChoices(variabilityPoints);
			double total_power = Choice.getTotalPowerConsumption(choices);
			return compareAxB(total_power, goal_property, goalCheck_property);
		}
	}

	/**
	 * Given a goal, check if the variability point's choices can satisfy the goal.
	 * Works for all types of goals but, all choices must satisfy the goal for the
	 * goal to be deemed satisfied.
	 * 
	 * @param goal             The goal to check
	 * @param variabilityPoint The variability point whose choices are to be checked
	 * @return true if satisfied false if not.
	 */
	public static boolean checkVariabilityPoint(org.eclipse.uml2.uml.Class goal,
			org.eclipse.uml2.uml.Class variabilityPoint) {
		// Get the goal properties
		double goal_property = getGoal(goal);
		String goalCheck_property = getGoalCheck(goal);
		String goalType_property = getGoalType(goal);

		// Check if the variabilityPoint goal is satisfied
		// Each choice must satisfy the goal in order for the goal to be deemed
		// satisfied.
		boolean satisfied = true;

		EList<Class> choices = VariabilityPoint.getSelectedChoices(variabilityPoint);

		for (Class choice : choices) {

			switch (goalType_property) {
			case str_Cost: {
				satisfied = checkCost(Choice.getCosts(choice), goal_property, goalCheck_property);
				break;
			}

			case str_Performance: {
				satisfied = compareAxB(Choice.getPerformance(choice), goal_property, goalCheck_property);
				break;
			}

			case str_Power: {
				satisfied = compareAxB(Choice.getPower(choice), goal_property, goalCheck_property);
				break;
			}

			case str_NA:
				return false;

			default:
				throw new IllegalArgumentException("Unexpected value: " + goalType_property);
			}

			if (satisfied == false)
				return satisfied;
		}

		return true;
	}

	/**
	 * Checks if the provided costs list does satisfy the goal depending on the
	 * check. If one of the costs in the list goes over the goal the goal is deemed
	 * not satisfied.
	 * 
	 * @param costs The list of QuantityCost to check
	 * @param goal  The goal the list is to be checked against
	 * @param check The type of check to perform. Valid options are "GT", "GTE",
	 *              "LT", "LTE" and, "EQ".
	 * @return
	 */
	public static boolean checkCost(List<QuantityCost> costs, double goal, String check) {
		boolean satisfied = true;

		// Go through all quantity costs and compare them to the goal
		for (QuantityCost qc : costs) {
			// Only set satisfied to false if the compare is false
			satisfied = compareAxB(qc.cost, goal, check) ? satisfied : false;

			// If one of the quantities does not satisfy the goal the entire thing fails
			if (!satisfied)
				break;

		}

		return satisfied;
	}

	private static boolean compareAxB(double a, double b, String check) {
		switch (check) {
		case str_GT:
			return a > b;

		case str_GTE:
			return a >= b;

		case str_LT:
			return a < b;

		case str_LTE:
			return a <= b;

		case str_EQ:
			return a == b;

		default:
			throw new IllegalArgumentException("Unexpected value: " + check);
		}
	}

	public static void satisfied(EList<org.eclipse.uml2.uml.Class> goals) {
	}
}
