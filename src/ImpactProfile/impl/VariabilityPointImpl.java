/**
 */
package ImpactProfile.impl;

import ImpactProfile.Domains;
import ImpactProfile.ImpactProfilePackage;
import ImpactProfile.VariabilityPoint;
import ImpactProfile.localBool;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variability Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ImpactProfile.impl.VariabilityPointImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link ImpactProfile.impl.VariabilityPointImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link ImpactProfile.impl.VariabilityPointImpl#getMutualExclusion <em>Mutual Exclusion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariabilityPointImpl extends MinimalEObjectImpl.Container implements VariabilityPoint {
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
	 * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected static final Domains DOMAIN_EDEFAULT = Domains.ELECTRONICS;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected Domains domain = DOMAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMutualExclusion() <em>Mutual Exclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMutualExclusion()
	 * @generated
	 * @ordered
	 */
	protected static final localBool MUTUAL_EXCLUSION_EDEFAULT = localBool.TRUE;

	/**
	 * The cached value of the '{@link #getMutualExclusion() <em>Mutual Exclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMutualExclusion()
	 * @generated
	 * @ordered
	 */
	protected localBool mutualExclusion = MUTUAL_EXCLUSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariabilityPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImpactProfilePackage.Literals.VARIABILITY_POINT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImpactProfilePackage.VARIABILITY_POINT__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImpactProfilePackage.VARIABILITY_POINT__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Domains getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomain(Domains newDomain) {
		Domains oldDomain = domain;
		domain = newDomain == null ? DOMAIN_EDEFAULT : newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpactProfilePackage.VARIABILITY_POINT__DOMAIN, oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public localBool getMutualExclusion() {
		return mutualExclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMutualExclusion(localBool newMutualExclusion) {
		localBool oldMutualExclusion = mutualExclusion;
		mutualExclusion = newMutualExclusion == null ? MUTUAL_EXCLUSION_EDEFAULT : newMutualExclusion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpactProfilePackage.VARIABILITY_POINT__MUTUAL_EXCLUSION, oldMutualExclusion, mutualExclusion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImpactProfilePackage.VARIABILITY_POINT__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case ImpactProfilePackage.VARIABILITY_POINT__DOMAIN:
				return getDomain();
			case ImpactProfilePackage.VARIABILITY_POINT__MUTUAL_EXCLUSION:
				return getMutualExclusion();
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
			case ImpactProfilePackage.VARIABILITY_POINT__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case ImpactProfilePackage.VARIABILITY_POINT__DOMAIN:
				setDomain((Domains)newValue);
				return;
			case ImpactProfilePackage.VARIABILITY_POINT__MUTUAL_EXCLUSION:
				setMutualExclusion((localBool)newValue);
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
			case ImpactProfilePackage.VARIABILITY_POINT__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case ImpactProfilePackage.VARIABILITY_POINT__DOMAIN:
				setDomain(DOMAIN_EDEFAULT);
				return;
			case ImpactProfilePackage.VARIABILITY_POINT__MUTUAL_EXCLUSION:
				setMutualExclusion(MUTUAL_EXCLUSION_EDEFAULT);
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
			case ImpactProfilePackage.VARIABILITY_POINT__BASE_CLASS:
				return base_Class != null;
			case ImpactProfilePackage.VARIABILITY_POINT__DOMAIN:
				return domain != DOMAIN_EDEFAULT;
			case ImpactProfilePackage.VARIABILITY_POINT__MUTUAL_EXCLUSION:
				return mutualExclusion != MUTUAL_EXCLUSION_EDEFAULT;
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
		result.append(" (Domain: ");
		result.append(domain);
		result.append(", MutualExclusion: ");
		result.append(mutualExclusion);
		result.append(')');
		return result.toString();
	}

} //VariabilityPointImpl
