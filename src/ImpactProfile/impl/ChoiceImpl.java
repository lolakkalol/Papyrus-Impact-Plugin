/**
 */
package ImpactProfile.impl;

import ImpactProfile.Choice;
import ImpactProfile.ImpactProfilePackage;
import ImpactProfile.PerformanceTypes;
import ImpactProfile.QuantityCost;
import ImpactProfile.localBool;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ImpactProfile.impl.ChoiceImpl#getPerformance <em>Performance</em>}</li>
 *   <li>{@link ImpactProfile.impl.ChoiceImpl#getPerformanceType <em>Performance Type</em>}</li>
 *   <li>{@link ImpactProfile.impl.ChoiceImpl#getPower <em>Power</em>}</li>
 *   <li>{@link ImpactProfile.impl.ChoiceImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link ImpactProfile.impl.ChoiceImpl#getCosts <em>Costs</em>}</li>
 *   <li>{@link ImpactProfile.impl.ChoiceImpl#getSelected <em>Selected</em>}</li>
 *   <li>{@link ImpactProfile.impl.ChoiceImpl#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChoiceImpl extends MinimalEObjectImpl.Container implements Choice {
	/**
	 * The default value of the '{@link #getPerformance() <em>Performance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformance()
	 * @generated
	 * @ordered
	 */
	protected static final double PERFORMANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPerformance() <em>Performance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformance()
	 * @generated
	 * @ordered
	 */
	protected double performance = PERFORMANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPerformanceType() <em>Performance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceType()
	 * @generated
	 * @ordered
	 */
	protected static final PerformanceTypes PERFORMANCE_TYPE_EDEFAULT = PerformanceTypes.NA;

	/**
	 * The cached value of the '{@link #getPerformanceType() <em>Performance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceType()
	 * @generated
	 * @ordered
	 */
	protected PerformanceTypes performanceType = PERFORMANCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected static final double POWER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected double power = POWER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * The cached value of the '{@link #getCosts() <em>Costs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCosts()
	 * @generated
	 * @ordered
	 */
	protected EList<QuantityCost> costs;

	/**
	 * The default value of the '{@link #getSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelected()
	 * @generated
	 * @ordered
	 */
	protected static final localBool SELECTED_EDEFAULT = localBool.FALSE;

	/**
	 * The cached value of the '{@link #getSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelected()
	 * @generated
	 * @ordered
	 */
	protected localBool selected = SELECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final int MULTIPLICITY_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected int multiplicity = MULTIPLICITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImpactProfilePackage.Literals.CHOICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPerformance() {
		return performance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerformance(double newPerformance) {
		double oldPerformance = performance;
		performance = newPerformance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpactProfilePackage.CHOICE__PERFORMANCE, oldPerformance, performance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PerformanceTypes getPerformanceType() {
		return performanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerformanceType(PerformanceTypes newPerformanceType) {
		PerformanceTypes oldPerformanceType = performanceType;
		performanceType = newPerformanceType == null ? PERFORMANCE_TYPE_EDEFAULT : newPerformanceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpactProfilePackage.CHOICE__PERFORMANCE_TYPE, oldPerformanceType, performanceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPower() {
		return power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPower(double newPower) {
		double oldPower = power;
		power = newPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpactProfilePackage.CHOICE__POWER, oldPower, power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImpactProfilePackage.CHOICE__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpactProfilePackage.CHOICE__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QuantityCost> getCosts() {
		if (costs == null) {
			costs = new EObjectContainmentEList<QuantityCost>(QuantityCost.class, this, ImpactProfilePackage.CHOICE__COSTS);
		}
		return costs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public localBool getSelected() {
		return selected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelected(localBool newSelected) {
		localBool oldSelected = selected;
		selected = newSelected == null ? SELECTED_EDEFAULT : newSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpactProfilePackage.CHOICE__SELECTED, oldSelected, selected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiplicity(int newMultiplicity) {
		int oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpactProfilePackage.CHOICE__MULTIPLICITY, oldMultiplicity, multiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImpactProfilePackage.CHOICE__COSTS:
				return ((InternalEList<?>)getCosts()).basicRemove(otherEnd, msgs);
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
			case ImpactProfilePackage.CHOICE__PERFORMANCE:
				return getPerformance();
			case ImpactProfilePackage.CHOICE__PERFORMANCE_TYPE:
				return getPerformanceType();
			case ImpactProfilePackage.CHOICE__POWER:
				return getPower();
			case ImpactProfilePackage.CHOICE__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case ImpactProfilePackage.CHOICE__COSTS:
				return getCosts();
			case ImpactProfilePackage.CHOICE__SELECTED:
				return getSelected();
			case ImpactProfilePackage.CHOICE__MULTIPLICITY:
				return getMultiplicity();
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
			case ImpactProfilePackage.CHOICE__PERFORMANCE:
				setPerformance((Double)newValue);
				return;
			case ImpactProfilePackage.CHOICE__PERFORMANCE_TYPE:
				setPerformanceType((PerformanceTypes)newValue);
				return;
			case ImpactProfilePackage.CHOICE__POWER:
				setPower((Double)newValue);
				return;
			case ImpactProfilePackage.CHOICE__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case ImpactProfilePackage.CHOICE__COSTS:
				getCosts().clear();
				getCosts().addAll((Collection<? extends QuantityCost>)newValue);
				return;
			case ImpactProfilePackage.CHOICE__SELECTED:
				setSelected((localBool)newValue);
				return;
			case ImpactProfilePackage.CHOICE__MULTIPLICITY:
				setMultiplicity((Integer)newValue);
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
			case ImpactProfilePackage.CHOICE__PERFORMANCE:
				setPerformance(PERFORMANCE_EDEFAULT);
				return;
			case ImpactProfilePackage.CHOICE__PERFORMANCE_TYPE:
				setPerformanceType(PERFORMANCE_TYPE_EDEFAULT);
				return;
			case ImpactProfilePackage.CHOICE__POWER:
				setPower(POWER_EDEFAULT);
				return;
			case ImpactProfilePackage.CHOICE__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case ImpactProfilePackage.CHOICE__COSTS:
				getCosts().clear();
				return;
			case ImpactProfilePackage.CHOICE__SELECTED:
				setSelected(SELECTED_EDEFAULT);
				return;
			case ImpactProfilePackage.CHOICE__MULTIPLICITY:
				setMultiplicity(MULTIPLICITY_EDEFAULT);
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
			case ImpactProfilePackage.CHOICE__PERFORMANCE:
				return performance != PERFORMANCE_EDEFAULT;
			case ImpactProfilePackage.CHOICE__PERFORMANCE_TYPE:
				return performanceType != PERFORMANCE_TYPE_EDEFAULT;
			case ImpactProfilePackage.CHOICE__POWER:
				return power != POWER_EDEFAULT;
			case ImpactProfilePackage.CHOICE__BASE_CLASS:
				return base_Class != null;
			case ImpactProfilePackage.CHOICE__COSTS:
				return costs != null && !costs.isEmpty();
			case ImpactProfilePackage.CHOICE__SELECTED:
				return selected != SELECTED_EDEFAULT;
			case ImpactProfilePackage.CHOICE__MULTIPLICITY:
				return multiplicity != MULTIPLICITY_EDEFAULT;
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
		result.append(" (Performance: ");
		result.append(performance);
		result.append(", PerformanceType: ");
		result.append(performanceType);
		result.append(", Power: ");
		result.append(power);
		result.append(", Selected: ");
		result.append(selected);
		result.append(", Multiplicity: ");
		result.append(multiplicity);
		result.append(')');
		return result.toString();
	}

} //ChoiceImpl
