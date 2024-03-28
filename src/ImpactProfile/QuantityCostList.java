/**
 */
package ImpactProfile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantity Cost List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ImpactProfile.QuantityCostList#getCostList <em>Cost List</em>}</li>
 * </ul>
 *
 * @see ImpactProfile.ImpactProfilePackage#getQuantityCostList()
 * @model
 * @generated
 */
public interface QuantityCostList extends EObject {
	/**
	 * Returns the value of the '<em><b>Cost List</b></em>' containment reference list.
	 * The list contents are of type {@link ImpactProfile.QuantityCost}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost List</em>' containment reference list.
	 * @see ImpactProfile.ImpactProfilePackage#getQuantityCostList_CostList()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<QuantityCost> getCostList();

} // QuantityCostList
