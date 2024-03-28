/**
 */
package ImpactProfile.impl;

import ImpactProfile.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImpactProfileFactoryImpl extends EFactoryImpl implements ImpactProfileFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImpactProfileFactory init() {
		try {
			ImpactProfileFactory theImpactProfileFactory = (ImpactProfileFactory)EPackage.Registry.INSTANCE.getEFactory(ImpactProfilePackage.eNS_URI);
			if (theImpactProfileFactory != null) {
				return theImpactProfileFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ImpactProfileFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpactProfileFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ImpactProfilePackage.VARIABILITY_POINT: return createVariabilityPoint();
			case ImpactProfilePackage.CHOICE: return createChoice();
			case ImpactProfilePackage.QUANTITY_COST: return createQuantityCost();
			case ImpactProfilePackage.VARIABILITY_MODEL: return createVariabilityModel();
			case ImpactProfilePackage.INCLUDES: return createIncludes();
			case ImpactProfilePackage.EXCLUDES: return createExcludes();
			case ImpactProfilePackage.GOAL: return createGoal();
			case ImpactProfilePackage.QUANTITY_COST_LIST: return createQuantityCostList();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ImpactProfilePackage.DOMAINS:
				return createDomainsFromString(eDataType, initialValue);
			case ImpactProfilePackage.LOCAL_BOOL:
				return createlocalBoolFromString(eDataType, initialValue);
			case ImpactProfilePackage.PERFORMANCE_TYPES:
				return createPerformanceTypesFromString(eDataType, initialValue);
			case ImpactProfilePackage.GOAL_TYPES:
				return createGoalTypesFromString(eDataType, initialValue);
			case ImpactProfilePackage.GOAL_CHECKS:
				return createGoalChecksFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ImpactProfilePackage.DOMAINS:
				return convertDomainsToString(eDataType, instanceValue);
			case ImpactProfilePackage.LOCAL_BOOL:
				return convertlocalBoolToString(eDataType, instanceValue);
			case ImpactProfilePackage.PERFORMANCE_TYPES:
				return convertPerformanceTypesToString(eDataType, instanceValue);
			case ImpactProfilePackage.GOAL_TYPES:
				return convertGoalTypesToString(eDataType, instanceValue);
			case ImpactProfilePackage.GOAL_CHECKS:
				return convertGoalChecksToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariabilityPoint createVariabilityPoint() {
		VariabilityPointImpl variabilityPoint = new VariabilityPointImpl();
		return variabilityPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Choice createChoice() {
		ChoiceImpl choice = new ChoiceImpl();
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantityCost createQuantityCost() {
		QuantityCostImpl quantityCost = new QuantityCostImpl();
		return quantityCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariabilityModel createVariabilityModel() {
		VariabilityModelImpl variabilityModel = new VariabilityModelImpl();
		return variabilityModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Includes createIncludes() {
		IncludesImpl includes = new IncludesImpl();
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Excludes createExcludes() {
		ExcludesImpl excludes = new ExcludesImpl();
		return excludes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantityCostList createQuantityCostList() {
		QuantityCostListImpl quantityCostList = new QuantityCostListImpl();
		return quantityCostList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domains createDomainsFromString(EDataType eDataType, String initialValue) {
		Domains result = Domains.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDomainsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public localBool createlocalBoolFromString(EDataType eDataType, String initialValue) {
		localBool result = localBool.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertlocalBoolToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceTypes createPerformanceTypesFromString(EDataType eDataType, String initialValue) {
		PerformanceTypes result = PerformanceTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPerformanceTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalTypes createGoalTypesFromString(EDataType eDataType, String initialValue) {
		GoalTypes result = GoalTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGoalTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalChecks createGoalChecksFromString(EDataType eDataType, String initialValue) {
		GoalChecks result = GoalChecks.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGoalChecksToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImpactProfilePackage getImpactProfilePackage() {
		return (ImpactProfilePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ImpactProfilePackage getPackage() {
		return ImpactProfilePackage.eINSTANCE;
	}

} //ImpactProfileFactoryImpl
