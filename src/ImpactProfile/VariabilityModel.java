/**
 */
package ImpactProfile;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variability Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Is used to identify the root model package of the variability model
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ImpactProfile.VariabilityModel#getBase_Model <em>Base Model</em>}</li>
 * </ul>
 *
 * @see ImpactProfile.ImpactProfilePackage#getVariabilityModel()
 * @model
 * @generated
 */
public interface VariabilityModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Model</em>' reference.
	 * @see #setBase_Model(Model)
	 * @see ImpactProfile.ImpactProfilePackage#getVariabilityModel_Base_Model()
	 * @model ordered="false"
	 * @generated
	 */
	Model getBase_Model();

	/**
	 * Sets the value of the '{@link ImpactProfile.VariabilityModel#getBase_Model <em>Base Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Model</em>' reference.
	 * @see #getBase_Model()
	 * @generated
	 */
	void setBase_Model(Model value);

} // VariabilityModel
