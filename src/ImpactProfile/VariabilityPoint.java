/**
 */
package ImpactProfile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variability Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The variability point acts as a marker in a variability tree and signals that after this a choice must be made
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ImpactProfile.VariabilityPoint#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link ImpactProfile.VariabilityPoint#getDomain <em>Domain</em>}</li>
 *   <li>{@link ImpactProfile.VariabilityPoint#getMutualExclusion <em>Mutual Exclusion</em>}</li>
 * </ul>
 *
 * @see ImpactProfile.ImpactProfilePackage#getVariabilityPoint()
 * @model
 * @generated
 */
public interface VariabilityPoint extends EObject {
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
	 * @see ImpactProfile.ImpactProfilePackage#getVariabilityPoint_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link ImpactProfile.VariabilityPoint#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' attribute.
	 * The literals are from the enumeration {@link ImpactProfile.Domains}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' attribute.
	 * @see ImpactProfile.Domains
	 * @see #setDomain(Domains)
	 * @see ImpactProfile.ImpactProfilePackage#getVariabilityPoint_Domain()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Domains getDomain();

	/**
	 * Sets the value of the '{@link ImpactProfile.VariabilityPoint#getDomain <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' attribute.
	 * @see ImpactProfile.Domains
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(Domains value);

	/**
	 * Returns the value of the '<em><b>Mutual Exclusion</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * The literals are from the enumeration {@link ImpactProfile.localBool}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mutual Exclusion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mutual Exclusion</em>' attribute.
	 * @see ImpactProfile.localBool
	 * @see #setMutualExclusion(localBool)
	 * @see ImpactProfile.ImpactProfilePackage#getVariabilityPoint_MutualExclusion()
	 * @model default="true" required="true" ordered="false"
	 * @generated
	 */
	localBool getMutualExclusion();

	/**
	 * Sets the value of the '{@link ImpactProfile.VariabilityPoint#getMutualExclusion <em>Mutual Exclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mutual Exclusion</em>' attribute.
	 * @see ImpactProfile.localBool
	 * @see #getMutualExclusion()
	 * @generated
	 */
	void setMutualExclusion(localBool value);

} // VariabilityPoint
