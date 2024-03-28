/**
 */
package ImpactProfile.impl;

import ImpactProfile.Choice;
import ImpactProfile.Domains;
import ImpactProfile.Excludes;
import ImpactProfile.Goal;
import ImpactProfile.GoalChecks;
import ImpactProfile.GoalTypes;
import ImpactProfile.ImpactProfileFactory;
import ImpactProfile.ImpactProfilePackage;
import ImpactProfile.Includes;
import ImpactProfile.PerformanceTypes;
import ImpactProfile.QuantityCost;
import ImpactProfile.QuantityCostList;
import ImpactProfile.VariabilityModel;
import ImpactProfile.VariabilityPoint;
import ImpactProfile.localBool;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImpactProfilePackageImpl extends EPackageImpl implements ImpactProfilePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variabilityPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityCostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variabilityModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excludesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityCostListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum domainsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum localBoolEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum performanceTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum goalTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum goalChecksEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ImpactProfile.ImpactProfilePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ImpactProfilePackageImpl() {
		super(eNS_URI, ImpactProfileFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ImpactProfilePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ImpactProfilePackage init() {
		if (isInited) return (ImpactProfilePackage)EPackage.Registry.INSTANCE.getEPackage(ImpactProfilePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredImpactProfilePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ImpactProfilePackageImpl theImpactProfilePackage = registeredImpactProfilePackage instanceof ImpactProfilePackageImpl ? (ImpactProfilePackageImpl)registeredImpactProfilePackage : new ImpactProfilePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theImpactProfilePackage.createPackageContents();

		// Initialize created meta-data
		theImpactProfilePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theImpactProfilePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ImpactProfilePackage.eNS_URI, theImpactProfilePackage);
		return theImpactProfilePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariabilityPoint() {
		return variabilityPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariabilityPoint_Base_Class() {
		return (EReference)variabilityPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariabilityPoint_Domain() {
		return (EAttribute)variabilityPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariabilityPoint_MutualExclusion() {
		return (EAttribute)variabilityPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChoice() {
		return choiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChoice_Performance() {
		return (EAttribute)choiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChoice_PerformanceType() {
		return (EAttribute)choiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChoice_Power() {
		return (EAttribute)choiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChoice_Base_Class() {
		return (EReference)choiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChoice_Costs() {
		return (EReference)choiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChoice_Selected() {
		return (EAttribute)choiceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChoice_Multiplicity() {
		return (EAttribute)choiceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuantityCost() {
		return quantityCostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuantityCost_Quantity() {
		return (EAttribute)quantityCostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuantityCost_CostPerPart() {
		return (EAttribute)quantityCostEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariabilityModel() {
		return variabilityModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariabilityModel_Base_Model() {
		return (EReference)variabilityModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIncludes() {
		return includesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIncludes_Base_Dependency() {
		return (EReference)includesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExcludes() {
		return excludesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExcludes_Base_Dependency() {
		return (EReference)excludesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGoal() {
		return goalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGoal_Goal() {
		return (EAttribute)goalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGoal_GoalType() {
		return (EAttribute)goalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGoal_GoalCheck() {
		return (EAttribute)goalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGoal_Base_Class() {
		return (EReference)goalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuantityCostList() {
		return quantityCostListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuantityCostList_CostList() {
		return (EReference)quantityCostListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDomains() {
		return domainsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getlocalBool() {
		return localBoolEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPerformanceTypes() {
		return performanceTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGoalTypes() {
		return goalTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGoalChecks() {
		return goalChecksEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImpactProfileFactory getImpactProfileFactory() {
		return (ImpactProfileFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		variabilityPointEClass = createEClass(VARIABILITY_POINT);
		createEReference(variabilityPointEClass, VARIABILITY_POINT__BASE_CLASS);
		createEAttribute(variabilityPointEClass, VARIABILITY_POINT__DOMAIN);
		createEAttribute(variabilityPointEClass, VARIABILITY_POINT__MUTUAL_EXCLUSION);

		choiceEClass = createEClass(CHOICE);
		createEAttribute(choiceEClass, CHOICE__PERFORMANCE);
		createEAttribute(choiceEClass, CHOICE__PERFORMANCE_TYPE);
		createEAttribute(choiceEClass, CHOICE__POWER);
		createEReference(choiceEClass, CHOICE__BASE_CLASS);
		createEReference(choiceEClass, CHOICE__COSTS);
		createEAttribute(choiceEClass, CHOICE__SELECTED);
		createEAttribute(choiceEClass, CHOICE__MULTIPLICITY);

		quantityCostEClass = createEClass(QUANTITY_COST);
		createEAttribute(quantityCostEClass, QUANTITY_COST__QUANTITY);
		createEAttribute(quantityCostEClass, QUANTITY_COST__COST_PER_PART);

		variabilityModelEClass = createEClass(VARIABILITY_MODEL);
		createEReference(variabilityModelEClass, VARIABILITY_MODEL__BASE_MODEL);

		includesEClass = createEClass(INCLUDES);
		createEReference(includesEClass, INCLUDES__BASE_DEPENDENCY);

		excludesEClass = createEClass(EXCLUDES);
		createEReference(excludesEClass, EXCLUDES__BASE_DEPENDENCY);

		goalEClass = createEClass(GOAL);
		createEAttribute(goalEClass, GOAL__GOAL);
		createEAttribute(goalEClass, GOAL__GOAL_TYPE);
		createEAttribute(goalEClass, GOAL__GOAL_CHECK);
		createEReference(goalEClass, GOAL__BASE_CLASS);

		quantityCostListEClass = createEClass(QUANTITY_COST_LIST);
		createEReference(quantityCostListEClass, QUANTITY_COST_LIST__COST_LIST);

		// Create enums
		domainsEEnum = createEEnum(DOMAINS);
		localBoolEEnum = createEEnum(LOCAL_BOOL);
		performanceTypesEEnum = createEEnum(PERFORMANCE_TYPES);
		goalTypesEEnum = createEEnum(GOAL_TYPES);
		goalChecksEEnum = createEEnum(GOAL_CHECKS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(variabilityPointEClass, VariabilityPoint.class, "VariabilityPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariabilityPoint_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, VariabilityPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVariabilityPoint_Domain(), this.getDomains(), "Domain", null, 1, 1, VariabilityPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVariabilityPoint_MutualExclusion(), this.getlocalBool(), "MutualExclusion", "true", 1, 1, VariabilityPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(choiceEClass, Choice.class, "Choice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChoice_Performance(), theTypesPackage.getReal(), "Performance", null, 1, 1, Choice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getChoice_PerformanceType(), this.getPerformanceTypes(), "PerformanceType", "NA", 1, 1, Choice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getChoice_Power(), theTypesPackage.getReal(), "Power", null, 1, 1, Choice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getChoice_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, Choice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getChoice_Costs(), this.getQuantityCost(), null, "Costs", null, 0, -1, Choice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getChoice_Selected(), this.getlocalBool(), "Selected", "false", 1, 1, Choice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getChoice_Multiplicity(), theTypesPackage.getInteger(), "Multiplicity", "1", 1, 1, Choice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(quantityCostEClass, QuantityCost.class, "QuantityCost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuantityCost_Quantity(), theTypesPackage.getInteger(), "Quantity", null, 1, 1, QuantityCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getQuantityCost_CostPerPart(), theTypesPackage.getReal(), "CostPerPart", null, 1, 1, QuantityCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(variabilityModelEClass, VariabilityModel.class, "VariabilityModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariabilityModel_Base_Model(), theUMLPackage.getModel(), null, "base_Model", null, 0, 1, VariabilityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(includesEClass, Includes.class, "Includes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIncludes_Base_Dependency(), theUMLPackage.getDependency(), null, "base_Dependency", null, 0, 1, Includes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(excludesEClass, Excludes.class, "Excludes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExcludes_Base_Dependency(), theUMLPackage.getDependency(), null, "base_Dependency", null, 0, 1, Excludes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGoal_Goal(), theTypesPackage.getReal(), "Goal", null, 1, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGoal_GoalType(), this.getGoalTypes(), "GoalType", "NA", 1, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGoal_GoalCheck(), this.getGoalChecks(), "GoalCheck", "NA", 1, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGoal_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(quantityCostListEClass, QuantityCostList.class, "QuantityCostList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuantityCostList_CostList(), this.getQuantityCost(), null, "CostList", null, 1, -1, QuantityCostList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(domainsEEnum, Domains.class, "Domains");
		addEEnumLiteral(domainsEEnum, Domains.ELECTRONICS);
		addEEnumLiteral(domainsEEnum, Domains.MECHANICAL);
		addEEnumLiteral(domainsEEnum, Domains.SOFTWARE);
		addEEnumLiteral(domainsEEnum, Domains.NA);

		initEEnum(localBoolEEnum, localBool.class, "localBool");
		addEEnumLiteral(localBoolEEnum, localBool.TRUE);
		addEEnumLiteral(localBoolEEnum, localBool.FALSE);

		initEEnum(performanceTypesEEnum, PerformanceTypes.class, "PerformanceTypes");
		addEEnumLiteral(performanceTypesEEnum, PerformanceTypes.MIPS);
		addEEnumLiteral(performanceTypesEEnum, PerformanceTypes.MHZ);
		addEEnumLiteral(performanceTypesEEnum, PerformanceTypes.KB);
		addEEnumLiteral(performanceTypesEEnum, PerformanceTypes.MB);
		addEEnumLiteral(performanceTypesEEnum, PerformanceTypes.GB);
		addEEnumLiteral(performanceTypesEEnum, PerformanceTypes.DMIPS);
		addEEnumLiteral(performanceTypesEEnum, PerformanceTypes.EFFICIENCY);
		addEEnumLiteral(performanceTypesEEnum, PerformanceTypes.NA);
		addEEnumLiteral(performanceTypesEEnum, PerformanceTypes.DISSIPATION);

		initEEnum(goalTypesEEnum, GoalTypes.class, "GoalTypes");
		addEEnumLiteral(goalTypesEEnum, GoalTypes.PERFORMANCE);
		addEEnumLiteral(goalTypesEEnum, GoalTypes.COST);
		addEEnumLiteral(goalTypesEEnum, GoalTypes.POWER);
		addEEnumLiteral(goalTypesEEnum, GoalTypes.NA);

		initEEnum(goalChecksEEnum, GoalChecks.class, "GoalChecks");
		addEEnumLiteral(goalChecksEEnum, GoalChecks.GT);
		addEEnumLiteral(goalChecksEEnum, GoalChecks.GTE);
		addEEnumLiteral(goalChecksEEnum, GoalChecks.LT);
		addEEnumLiteral(goalChecksEEnum, GoalChecks.LTE);
		addEEnumLiteral(goalChecksEEnum, GoalChecks.EQ);
		addEEnumLiteral(goalChecksEEnum, GoalChecks.NA);

		// Create resource
		createResource(eNS_URI);
	}

} //ImpactProfilePackageImpl
