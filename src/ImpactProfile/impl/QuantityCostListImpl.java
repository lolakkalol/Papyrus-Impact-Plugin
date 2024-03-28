/**
 */
package ImpactProfile.impl;

import ImpactProfile.ImpactProfilePackage;
import ImpactProfile.QuantityCost;
import ImpactProfile.QuantityCostList;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantity Cost List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ImpactProfile.impl.QuantityCostListImpl#getCostList <em>Cost List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuantityCostListImpl extends MinimalEObjectImpl.Container implements QuantityCostList {
	/**
	 * The cached value of the '{@link #getCostList() <em>Cost List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostList()
	 * @generated
	 * @ordered
	 */
	protected EList<QuantityCost> costList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantityCostListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImpactProfilePackage.Literals.QUANTITY_COST_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QuantityCost> getCostList() {
		if (costList == null) {
			costList = new EObjectContainmentEList<QuantityCost>(QuantityCost.class, this, ImpactProfilePackage.QUANTITY_COST_LIST__COST_LIST);
		}
		return costList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImpactProfilePackage.QUANTITY_COST_LIST__COST_LIST:
				return ((InternalEList<?>)getCostList()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImpactProfilePackage.QUANTITY_COST_LIST__COST_LIST:
				return getCostList();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ImpactProfilePackage.QUANTITY_COST_LIST__COST_LIST:
				getCostList().clear();
				getCostList().addAll((Collection<? extends QuantityCost>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ImpactProfilePackage.QUANTITY_COST_LIST__COST_LIST:
				getCostList().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ImpactProfilePackage.QUANTITY_COST_LIST__COST_LIST:
				return costList != null && !costList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuantityCostListImpl
