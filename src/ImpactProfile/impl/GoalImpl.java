/**
 */
package ImpactProfile.impl;

import ImpactProfile.Goal;
import ImpactProfile.GoalChecks;
import ImpactProfile.GoalTypes;
import ImpactProfile.ImpactProfilePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ImpactProfile.impl.GoalImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link ImpactProfile.impl.GoalImpl#getGoalType <em>Goal Type</em>}</li>
 *   <li>{@link ImpactProfile.impl.GoalImpl#getGoalCheck <em>Goal Check</em>}</li>
 *   <li>{@link ImpactProfile.impl.GoalImpl#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoalImpl extends MinimalEObjectImpl.Container implements Goal {
	/**
	 * The default value of the '{@link #getGoal() <em>Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected static final double GOAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected double goal = GOAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGoalType() <em>Goal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalType()
	 * @generated
	 * @ordered
	 */
	protected static final GoalTypes GOAL_TYPE_EDEFAULT = GoalTypes.NA;

	/**
	 * The cached value of the '{@link #getGoalType() <em>Goal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalType()
	 * @generated
	 * @ordered
	 */
	protected GoalTypes goalType = GOAL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGoalCheck() <em>Goal Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalCheck()
	 * @generated
	 * @ordered
	 */
	protected static final GoalChecks GOAL_CHECK_EDEFAULT = GoalChecks.NA;

	/**
	 * The cached value of the '{@link #getGoalCheck() <em>Goal Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalCheck()
	 * @generated
	 * @ordered
	 */
	protected GoalChecks goalCheck = GOAL_CHECK_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImpactProfilePackage.Literals.GOAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getGoal() {
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGoal(double newGoal) {
		double oldGoal = goal;
		goal = newGoal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpactProfilePackage.GOAL__GOAL, oldGoal, goal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GoalTypes getGoalType() {
		return goalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGoalType(GoalTypes newGoalType) {
		GoalTypes oldGoalType = goalType;
		goalType = newGoalType == null ? GOAL_TYPE_EDEFAULT : newGoalType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpactProfilePackage.GOAL__GOAL_TYPE, oldGoalType, goalType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GoalChecks getGoalCheck() {
		return goalCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGoalCheck(GoalChecks newGoalCheck) {
		GoalChecks oldGoalCheck = goalCheck;
		goalCheck = newGoalCheck == null ? GOAL_CHECK_EDEFAULT : newGoalCheck;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpactProfilePackage.GOAL__GOAL_CHECK, oldGoalCheck, goalCheck));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImpactProfilePackage.GOAL__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImpactProfilePackage.GOAL__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImpactProfilePackage.GOAL__GOAL:
				return getGoal();
			case ImpactProfilePackage.GOAL__GOAL_TYPE:
				return getGoalType();
			case ImpactProfilePackage.GOAL__GOAL_CHECK:
				return getGoalCheck();
			case ImpactProfilePackage.GOAL__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
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
			case ImpactProfilePackage.GOAL__GOAL:
				setGoal((Double)newValue);
				return;
			case ImpactProfilePackage.GOAL__GOAL_TYPE:
				setGoalType((GoalTypes)newValue);
				return;
			case ImpactProfilePackage.GOAL__GOAL_CHECK:
				setGoalCheck((GoalChecks)newValue);
				return;
			case ImpactProfilePackage.GOAL__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
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
			case ImpactProfilePackage.GOAL__GOAL:
				setGoal(GOAL_EDEFAULT);
				return;
			case ImpactProfilePackage.GOAL__GOAL_TYPE:
				setGoalType(GOAL_TYPE_EDEFAULT);
				return;
			case ImpactProfilePackage.GOAL__GOAL_CHECK:
				setGoalCheck(GOAL_CHECK_EDEFAULT);
				return;
			case ImpactProfilePackage.GOAL__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
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
			case ImpactProfilePackage.GOAL__GOAL:
				return goal != GOAL_EDEFAULT;
			case ImpactProfilePackage.GOAL__GOAL_TYPE:
				return goalType != GOAL_TYPE_EDEFAULT;
			case ImpactProfilePackage.GOAL__GOAL_CHECK:
				return goalCheck != GOAL_CHECK_EDEFAULT;
			case ImpactProfilePackage.GOAL__BASE_CLASS:
				return base_Class != null;
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
		result.append(" (Goal: ");
		result.append(goal);
		result.append(", GoalType: ");
		result.append(goalType);
		result.append(", GoalCheck: ");
		result.append(goalCheck);
		result.append(')');
		return result.toString();
	}

} //GoalImpl
