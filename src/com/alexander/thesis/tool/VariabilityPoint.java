package com.alexander.thesis.tool;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.Stereotype;

import ImpactProfile.localBool;

public class VariabilityPoint {
	public static final String str_VariabilityPoint_stereotype = "ImpactProfile::VariabilityPoint";
	
	// VariabilityPoint properties
	public static final String str_Domain = "Domain";
	public static final String str_MutualExclusion = "MutualExclusion";
	
	public static boolean isVariabilityPoint(org.eclipse.uml2.uml.Class umlClass) {
		return Util.isStereotype(umlClass, str_VariabilityPoint_stereotype);
	}
	
	/**
	 * Gets all all choices of a specified variability point.
	 * 
	 * @param variabilityPoint The variability point who's choices to get
	 * @return
	 */
	public static EList<org.eclipse.uml2.uml.Class> getSelectedChoices(org.eclipse.uml2.uml.Class variabilityPoint) {
		EList<Class> choices = getAllChoices(variabilityPoint);
		EList<Class> selectedChoices = new BasicEList<Class>();

		// For each choice in the list choices, check if its stereotype attribute
		// selected is set to true, if so add it to the list selectedChoices
		for (Class umlClass : choices) {
			if (Choice.isSelected(umlClass))
				selectedChoices.add(umlClass);
		}

		return selectedChoices;
	}
	
	/**
	 * Gets all selected choices for each variability point in the argument
	 * @param variabilityPoints The list of variability points to get the selected choices from
	 * @return
	 */
	public static EList<org.eclipse.uml2.uml.Class> getAllSelectedChoices(EList<org.eclipse.uml2.uml.Class> variabilityPoints) {
		EList<Class> selectedChoices = new BasicEList<Class>();
		
		for (org.eclipse.uml2.uml.Class variabilityPoint : variabilityPoints)
			selectedChoices.addAll(getSelectedChoices(variabilityPoint));
		
		return selectedChoices;
	}
	
	/**
	 * Gets all classes related to the veriabilityPoint through a generalization
	 * relationship
	 * 
	 * @param variabilityPoint
	 * @return
	 */
	public static EList<org.eclipse.uml2.uml.Class> getAllChoices(org.eclipse.uml2.uml.Class variabilityPoint) {
		EList<Class> choices = new BasicEList<Class>();
		EList<Relationship> relationships = variabilityPoint.getRelationships();

		// Loop through all of the variability points relationships and if they are a
		// generalization, add the related element which is not the same as the
		// variability point
		for (Relationship relationship : relationships) {
			if (!(relationship instanceof Generalization))
				continue;

			// Add the elements linked to the variability point if it is an instance of a
			// Class AND element is not the variation point
			((Generalization) relationship).getRelatedElements().forEach(element -> {
				if (!(element instanceof Class))
					return;

				// Skip this loop if equal to the variability point
				if (((Class) element).equals(variabilityPoint))
					return;

				choices.add((Class) element);
			});
		}

		return choices;
	}
	
	/**
	 * Gets all classes with the stereotype Choice with a generalization
	 * relationship to a variation point
	 * 
	 * @param variabilityPoints The variability points of interest
	 * @return A EList of Classes with the choice stereotype
	 */
	public static EList<org.eclipse.uml2.uml.Class> getAllChoices(EList<org.eclipse.uml2.uml.Class> variabilityPoints) {
		EList<Class> choices = new BasicEList<Class>();

		// For each variability point get all choices and add them to the list choices
		for (Class variabilityPoint : variabilityPoints) {
			choices.addAll(getAllChoices(variabilityPoint));
		}

		return choices;
	}
	
	/**
	 * Get the value of the property domain in the stereotype VariabilityPoint applied to the UML Class
	 * @param umlClass The UML Class with the stereotype VariabilityPoint applied
	 * @return The domain as a string
	 */
	public static String getDomain(org.eclipse.uml2.uml.Class variabilityPoint) {
		Stereotype choice_stereotype = Util.getStereotype(variabilityPoint, str_VariabilityPoint_stereotype);
		Object obj = variabilityPoint.getValue(choice_stereotype, str_Domain);
		
		// Type check before casting
		if (!(obj instanceof localBool))
			throw new IllegalArgumentException("Expected VariabilityPoint property Domain to be of type localBool!");
		
		// Return the name of the enumeration literal
		return ((localBool) obj).getName();
	}
	
	/**
	 * Get the value of the property MutualExclusion in the stereotype VariabilityPoint applied to the UML Class
	 * @param umlClass The UML Class with the stereotype VariabilityPoint applied
	 * @return The MutualExclusion as a boolean
	 */
	public static boolean getMutualExclusion(org.eclipse.uml2.uml.Class variabilityPoint) {
		Stereotype choice_stereotype = Util.getStereotype(variabilityPoint, str_VariabilityPoint_stereotype);
		Object obj = variabilityPoint.getValue(choice_stereotype, str_MutualExclusion);
		
		// Type check before casting
		if (!(obj instanceof localBool))
			throw new IllegalArgumentException("Expected VariabilityPoint property Domain to be of type localBool!");
		
		// Return the name of the enumeration literal
		return ((localBool) obj).getLiteral().equals("true");
	}
	
	/**
	 * Same as getMutualExclusion but with a different name for easier reading in code
	 * @param variabilityPoint
	 * @return
	 */
	public static boolean isMutualExclusion(org.eclipse.uml2.uml.Class variabilityPoint) {
		return getMutualExclusion(variabilityPoint);
	}
	
	/**
	 * Check that each variability point in the argument list only has one
	 * generalization whose Choice stereotype attribute selected is true. If the
	 * variability point property mutualExclution is set to false, it will only
	 * check that at least one was selected.
	 * 
	 * @param variabilityPoints The variation points to be checked
	 * @return A list of all variation points with failed the check
	 */
	public static EList<Class> checkVariationPointMutualExclution(EList<Class> variabilityPoints) {
		EList<Class> failedVariationPoints = new BasicEList<>();

		// For each variation point check the selection status of its choices
		for (Class variationPoint : variabilityPoints) {

			// Gets if the variability point has mutual exclusion true or false
			boolean mutualExclusion = getMutualExclusion(variationPoint);

			EList<Class> choices = getAllChoices(variationPoint);
			boolean selectFound = false;

			// Check that only one choice is selected
			for (Class choice : choices) {
				boolean selected = Choice.isSelected(choice);

				// if we have multiple selections under the variability point AND
				// mutualExclusion is set to true
				if (selected && selectFound && mutualExclusion) {
					failedVariationPoints.add(variationPoint);
					break;

					// If this is the first selected choice we have, set selectFound to true.
				} else if (selected) {
					selectFound = true;
				}

			}

			// If there was no selection under the variability point
			if (!selectFound)
				failedVariationPoints.add(variationPoint);
		}

		return failedVariationPoints;
	}
}
