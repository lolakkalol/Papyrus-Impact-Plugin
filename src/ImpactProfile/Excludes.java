/**
 */
package ImpactProfile;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Dependency;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Excludes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The dependancy  edge with this stereotypes means that the start element must NOT have the end element selected inorder to function.
 * Start element -> End element
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ImpactProfile.Excludes#getBase_Dependency <em>Base Dependency</em>}</li>
 * </ul>
 *
 * @see ImpactProfile.ImpactProfilePackage#getExcludes()
 * @model
 * @generated
 */
public interface Excludes extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Dependency</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Dependency</em>' reference.
	 * @see #setBase_Dependency(Dependency)
	 * @see ImpactProfile.ImpactProfilePackage#getExcludes_Base_Dependency()
	 * @model ordered="false"
	 * @generated
	 */
	Dependency getBase_Dependency();

	/**
	 * Sets the value of the '{@link ImpactProfile.Excludes#getBase_Dependency <em>Base Dependency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Dependency</em>' reference.
	 * @see #getBase_Dependency()
	 * @generated
	 */
	void setBase_Dependency(Dependency value);

} // Excludes
