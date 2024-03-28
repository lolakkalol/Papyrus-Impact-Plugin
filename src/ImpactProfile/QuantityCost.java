/**
 */
package ImpactProfile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantity Cost</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ImpactProfile.QuantityCost#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link ImpactProfile.QuantityCost#getCostPerPart <em>Cost Per Part</em>}</li>
 * </ul>
 *
 * @see ImpactProfile.ImpactProfilePackage#getQuantityCost()
 * @model
 * @generated
 */
public interface QuantityCost extends EObject {
	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see ImpactProfile.ImpactProfilePackage#getQuantityCost_Quantity()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link ImpactProfile.QuantityCost#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Cost Per Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Per Part</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Per Part</em>' attribute.
	 * @see #setCostPerPart(double)
	 * @see ImpactProfile.ImpactProfilePackage#getQuantityCost_CostPerPart()
	 * @model dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getCostPerPart();

	/**
	 * Sets the value of the '{@link ImpactProfile.QuantityCost#getCostPerPart <em>Cost Per Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Per Part</em>' attribute.
	 * @see #getCostPerPart()
	 * @generated
	 */
	void setCostPerPart(double value);

} // QuantityCost
