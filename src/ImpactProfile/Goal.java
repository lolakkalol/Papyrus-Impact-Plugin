/**
 */
package ImpactProfile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Used to set goals on variability points or entire systems, will look at the choices of its targets to determin if it is satisfied or not. 
 * If the goal has multiple targets only one target needs to be satisfied for the goal to be satisfied. 
 * If the target is on a variability point the sum of the porperty GoalType in the choices need to satisfy the goal. 
 * If the target is a system all contained variability point must satisfy the goal.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ImpactProfile.Goal#getGoal <em>Goal</em>}</li>
 *   <li>{@link ImpactProfile.Goal#getGoalType <em>Goal Type</em>}</li>
 *   <li>{@link ImpactProfile.Goal#getGoalCheck <em>Goal Check</em>}</li>
 *   <li>{@link ImpactProfile.Goal#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @see ImpactProfile.ImpactProfilePackage#getGoal()
 * @model
 * @generated
 */
public interface Goal extends EObject {
	/**
	 * Returns the value of the '<em><b>Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' attribute.
	 * @see #setGoal(double)
	 * @see ImpactProfile.ImpactProfilePackage#getGoal_Goal()
	 * @model dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getGoal();

	/**
	 * Sets the value of the '{@link ImpactProfile.Goal#getGoal <em>Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' attribute.
	 * @see #getGoal()
	 * @generated
	 */
	void setGoal(double value);

	/**
	 * Returns the value of the '<em><b>Goal Type</b></em>' attribute.
	 * The default value is <code>"NA"</code>.
	 * The literals are from the enumeration {@link ImpactProfile.GoalTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal Type</em>' attribute.
	 * @see ImpactProfile.GoalTypes
	 * @see #setGoalType(GoalTypes)
	 * @see ImpactProfile.ImpactProfilePackage#getGoal_GoalType()
	 * @model default="NA" required="true" ordered="false"
	 * @generated
	 */
	GoalTypes getGoalType();

	/**
	 * Sets the value of the '{@link ImpactProfile.Goal#getGoalType <em>Goal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal Type</em>' attribute.
	 * @see ImpactProfile.GoalTypes
	 * @see #getGoalType()
	 * @generated
	 */
	void setGoalType(GoalTypes value);

	/**
	 * Returns the value of the '<em><b>Goal Check</b></em>' attribute.
	 * The default value is <code>"NA"</code>.
	 * The literals are from the enumeration {@link ImpactProfile.GoalChecks}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal Check</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal Check</em>' attribute.
	 * @see ImpactProfile.GoalChecks
	 * @see #setGoalCheck(GoalChecks)
	 * @see ImpactProfile.ImpactProfilePackage#getGoal_GoalCheck()
	 * @model default="NA" required="true" ordered="false"
	 * @generated
	 */
	GoalChecks getGoalCheck();

	/**
	 * Sets the value of the '{@link ImpactProfile.Goal#getGoalCheck <em>Goal Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal Check</em>' attribute.
	 * @see ImpactProfile.GoalChecks
	 * @see #getGoalCheck()
	 * @generated
	 */
	void setGoalCheck(GoalChecks value);

	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see ImpactProfile.ImpactProfilePackage#getGoal_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link ImpactProfile.Goal#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

} // Goal
