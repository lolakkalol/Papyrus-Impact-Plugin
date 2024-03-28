/**
 */
package ImpactProfile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Marks that the block that this stereotype is marked to is 1) mutualy exclusive with all other blocks on the same level and stereotype 2) that it is a choice 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ImpactProfile.Choice#getPerformance <em>Performance</em>}</li>
 *   <li>{@link ImpactProfile.Choice#getPerformanceType <em>Performance Type</em>}</li>
 *   <li>{@link ImpactProfile.Choice#getPower <em>Power</em>}</li>
 *   <li>{@link ImpactProfile.Choice#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link ImpactProfile.Choice#getCosts <em>Costs</em>}</li>
 *   <li>{@link ImpactProfile.Choice#getSelected <em>Selected</em>}</li>
 *   <li>{@link ImpactProfile.Choice#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @see ImpactProfile.ImpactProfilePackage#getChoice()
 * @model
 * @generated
 */
public interface Choice extends EObject {
	/**
	 * Returns the value of the '<em><b>Performance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance</em>' attribute.
	 * @see #setPerformance(double)
	 * @see ImpactProfile.ImpactProfilePackage#getChoice_Performance()
	 * @model dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getPerformance();

	/**
	 * Sets the value of the '{@link ImpactProfile.Choice#getPerformance <em>Performance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance</em>' attribute.
	 * @see #getPerformance()
	 * @generated
	 */
	void setPerformance(double value);

	/**
	 * Returns the value of the '<em><b>Performance Type</b></em>' attribute.
	 * The default value is <code>"NA"</code>.
	 * The literals are from the enumeration {@link ImpactProfile.PerformanceTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performance Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance Type</em>' attribute.
	 * @see ImpactProfile.PerformanceTypes
	 * @see #setPerformanceType(PerformanceTypes)
	 * @see ImpactProfile.ImpactProfilePackage#getChoice_PerformanceType()
	 * @model default="NA" required="true" ordered="false"
	 * @generated
	 */
	PerformanceTypes getPerformanceType();

	/**
	 * Sets the value of the '{@link ImpactProfile.Choice#getPerformanceType <em>Performance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance Type</em>' attribute.
	 * @see ImpactProfile.PerformanceTypes
	 * @see #getPerformanceType()
	 * @generated
	 */
	void setPerformanceType(PerformanceTypes value);

	/**
	 * Returns the value of the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power</em>' attribute.
	 * @see #setPower(double)
	 * @see ImpactProfile.ImpactProfilePackage#getChoice_Power()
	 * @model dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getPower();

	/**
	 * Sets the value of the '{@link ImpactProfile.Choice#getPower <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' attribute.
	 * @see #getPower()
	 * @generated
	 */
	void setPower(double value);

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
	 * @see ImpactProfile.ImpactProfilePackage#getChoice_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link ImpactProfile.Choice#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Costs</b></em>' containment reference list.
	 * The list contents are of type {@link ImpactProfile.QuantityCost}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Costs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Costs</em>' containment reference list.
	 * @see ImpactProfile.ImpactProfilePackage#getChoice_Costs()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<QuantityCost> getCosts();

	/**
	 * Returns the value of the '<em><b>Selected</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link ImpactProfile.localBool}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' attribute.
	 * @see ImpactProfile.localBool
	 * @see #setSelected(localBool)
	 * @see ImpactProfile.ImpactProfilePackage#getChoice_Selected()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	localBool getSelected();

	/**
	 * Sets the value of the '{@link ImpactProfile.Choice#getSelected <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' attribute.
	 * @see ImpactProfile.localBool
	 * @see #getSelected()
	 * @generated
	 */
	void setSelected(localBool value);

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see #setMultiplicity(int)
	 * @see ImpactProfile.ImpactProfilePackage#getChoice_Multiplicity()
	 * @model default="1" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getMultiplicity();

	/**
	 * Sets the value of the '{@link ImpactProfile.Choice#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(int value);

} // Choice
