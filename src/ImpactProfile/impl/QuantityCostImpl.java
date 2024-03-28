/**
 */
package ImpactProfile.impl;

import ImpactProfile.ImpactProfilePackage;
import ImpactProfile.QuantityCost;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantity Cost</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ImpactProfile.impl.QuantityCostImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link ImpactProfile.impl.QuantityCostImpl#getCostPerPart <em>Cost Per Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuantityCostImpl extends MinimalEObjectImpl.Container implements QuantityCost {
	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected int quantity = QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCostPerPart() <em>Cost Per Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostPerPart()
	 * @generated
	 * @ordered
	 */
	protected static final double COST_PER_PART_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCostPerPart() <em>Cost Per Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostPerPart()
	 * @generated
	 * @ordered
	 */
	protected double costPerPart = COST_PER_PART_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantityCostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImpactProfilePackage.Literals.QUANTITY_COST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(int newQuantity) {
		int oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpactProfilePackage.QUANTITY_COST__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCostPerPart() {
		return costPerPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCostPerPart(double newCostPerPart) {
		double oldCostPerPart = costPerPart;
		costPerPart = newCostPerPart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpactProfilePackage.QUANTITY_COST__COST_PER_PART, oldCostPerPart, costPerPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImpactProfilePackage.QUANTITY_COST__QUANTITY:
				return getQuantity();
			case ImpactProfilePackage.QUANTITY_COST__COST_PER_PART:
				return getCostPerPart();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ImpactProfilePackage.QUANTITY_COST__QUANTITY:
				setQuantity((Integer)newValue);
				return;
			case ImpactProfilePackage.QUANTITY_COST__COST_PER_PART:
				setCostPerPart((Double)newValue);
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
			case ImpactProfilePackage.QUANTITY_COST__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case ImpactProfilePackage.QUANTITY_COST__COST_PER_PART:
				setCostPerPart(COST_PER_PART_EDEFAULT);
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
			case ImpactProfilePackage.QUANTITY_COST__QUANTITY:
				return quantity != QUANTITY_EDEFAULT;
			case ImpactProfilePackage.QUANTITY_COST__COST_PER_PART:
				return costPerPart != COST_PER_PART_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Quantity: ");
		result.append(quantity);
		result.append(", CostPerPart: ");
		result.append(costPerPart);
		result.append(')');
		return result.toString();
	}

} //QuantityCostImpl
