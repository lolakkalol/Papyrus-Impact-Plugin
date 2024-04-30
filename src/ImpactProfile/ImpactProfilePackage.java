/**
 */
package ImpactProfile;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ImpactProfile.ImpactProfileFactory
 * @model kind="package"
 * @generated
 */
public interface ImpactProfilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ImpactProfile";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.alexander.thesis.profile/0.1.0/ImpactProfile.xmi";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ImpactProfile";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImpactProfilePackage eINSTANCE = ImpactProfile.impl.ImpactProfilePackageImpl.init();

	/**
	 * The meta object id for the '{@link ImpactProfile.impl.VariabilityPointImpl <em>Variability Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ImpactProfile.impl.VariabilityPointImpl
	 * @see ImpactProfile.impl.ImpactProfilePackageImpl#getVariabilityPoint()
	 * @generated
	 */
	int VARIABILITY_POINT = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY_POINT__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY_POINT__DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>Mutual Exclusion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY_POINT__MUTUAL_EXCLUSION = 2;

	/**
	 * The number of structural features of the '<em>Variability Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY_POINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Variability Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ImpactProfile.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ImpactProfile.impl.ChoiceImpl
	 * @see ImpactProfile.impl.ImpactProfilePackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 1;

	/**
	 * The feature id for the '<em><b>Performance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__PERFORMANCE = 0;

	/**
	 * The feature id for the '<em><b>Performance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__PERFORMANCE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__POWER = 2;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__BASE_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Costs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__COSTS = 4;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__SELECTED = 5;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__MULTIPLICITY = 6;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ImpactProfile.impl.QuantityCostImpl <em>Quantity Cost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ImpactProfile.impl.QuantityCostImpl
	 * @see ImpactProfile.impl.ImpactProfilePackageImpl#getQuantityCost()
	 * @generated
	 */
	int QUANTITY_COST = 2;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_COST__QUANTITY = 0;

	/**
	 * The feature id for the '<em><b>Cost Per Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_COST__COST_PER_PART = 1;

	/**
	 * The number of structural features of the '<em>Quantity Cost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_COST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Quantity Cost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_COST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ImpactProfile.impl.VariabilityModelImpl <em>Variability Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ImpactProfile.impl.VariabilityModelImpl
	 * @see ImpactProfile.impl.ImpactProfilePackageImpl#getVariabilityModel()
	 * @generated
	 */
	int VARIABILITY_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Base Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY_MODEL__BASE_MODEL = 0;

	/**
	 * The number of structural features of the '<em>Variability Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Variability Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ImpactProfile.impl.IncludesImpl <em>Includes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ImpactProfile.impl.IncludesImpl
	 * @see ImpactProfile.impl.ImpactProfilePackageImpl#getIncludes()
	 * @generated
	 */
	int INCLUDES = 4;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDES__BASE_DEPENDENCY = 0;

	/**
	 * The number of structural features of the '<em>Includes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Includes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ImpactProfile.impl.ExcludesImpl <em>Excludes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ImpactProfile.impl.ExcludesImpl
	 * @see ImpactProfile.impl.ImpactProfilePackageImpl#getExcludes()
	 * @generated
	 */
	int EXCLUDES = 5;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDES__BASE_DEPENDENCY = 0;

	/**
	 * The number of structural features of the '<em>Excludes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Excludes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ImpactProfile.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ImpactProfile.impl.GoalImpl
	 * @see ImpactProfile.impl.ImpactProfilePackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 6;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__GOAL = 0;

	/**
	 * The feature id for the '<em><b>Goal Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__GOAL_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Goal Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__GOAL_CHECK = 2;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__BASE_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ImpactProfile.Domains <em>Domains</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ImpactProfile.Domains
	 * @see ImpactProfile.impl.ImpactProfilePackageImpl#getDomains()
	 * @generated
	 */
	int DOMAINS = 7;

	/**
	 * The meta object id for the '{@link ImpactProfile.localBool <em>local Bool</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ImpactProfile.localBool
	 * @see ImpactProfile.impl.ImpactProfilePackageImpl#getlocalBool()
	 * @generated
	 */
	int LOCAL_BOOL = 8;

	/**
	 * The meta object id for the '{@link ImpactProfile.PerformanceTypes <em>Performance Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ImpactProfile.PerformanceTypes
	 * @see ImpactProfile.impl.ImpactProfilePackageImpl#getPerformanceTypes()
	 * @generated
	 */
	int PERFORMANCE_TYPES = 9;

	/**
	 * The meta object id for the '{@link ImpactProfile.GoalTypes <em>Goal Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ImpactProfile.GoalTypes
	 * @see ImpactProfile.impl.ImpactProfilePackageImpl#getGoalTypes()
	 * @generated
	 */
	int GOAL_TYPES = 10;

	/**
	 * The meta object id for the '{@link ImpactProfile.GoalChecks <em>Goal Checks</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ImpactProfile.GoalChecks
	 * @see ImpactProfile.impl.ImpactProfilePackageImpl#getGoalChecks()
	 * @generated
	 */
	int GOAL_CHECKS = 11;


	/**
	 * Returns the meta object for class '{@link ImpactProfile.VariabilityPoint <em>Variability Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variability Point</em>'.
	 * @see ImpactProfile.VariabilityPoint
	 * @generated
	 */
	EClass getVariabilityPoint();

	/**
	 * Returns the meta object for the reference '{@link ImpactProfile.VariabilityPoint#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see ImpactProfile.VariabilityPoint#getBase_Class()
	 * @see #getVariabilityPoint()
	 * @generated
	 */
	EReference getVariabilityPoint_Base_Class();

	/**
	 * Returns the meta object for the attribute '{@link ImpactProfile.VariabilityPoint#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain</em>'.
	 * @see ImpactProfile.VariabilityPoint#getDomain()
	 * @see #getVariabilityPoint()
	 * @generated
	 */
	EAttribute getVariabilityPoint_Domain();

	/**
	 * Returns the meta object for the attribute '{@link ImpactProfile.VariabilityPoint#getMutualExclusion <em>Mutual Exclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutual Exclusion</em>'.
	 * @see ImpactProfile.VariabilityPoint#getMutualExclusion()
	 * @see #getVariabilityPoint()
	 * @generated
	 */
	EAttribute getVariabilityPoint_MutualExclusion();

	/**
	 * Returns the meta object for class '{@link ImpactProfile.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see ImpactProfile.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for the attribute '{@link ImpactProfile.Choice#getPerformance <em>Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Performance</em>'.
	 * @see ImpactProfile.Choice#getPerformance()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_Performance();

	/**
	 * Returns the meta object for the attribute '{@link ImpactProfile.Choice#getPerformanceType <em>Performance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Performance Type</em>'.
	 * @see ImpactProfile.Choice#getPerformanceType()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_PerformanceType();

	/**
	 * Returns the meta object for the attribute '{@link ImpactProfile.Choice#getPower <em>Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power</em>'.
	 * @see ImpactProfile.Choice#getPower()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_Power();

	/**
	 * Returns the meta object for the reference '{@link ImpactProfile.Choice#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see ImpactProfile.Choice#getBase_Class()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_Base_Class();

	/**
	 * Returns the meta object for the containment reference list '{@link ImpactProfile.Choice#getCosts <em>Costs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Costs</em>'.
	 * @see ImpactProfile.Choice#getCosts()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_Costs();

	/**
	 * Returns the meta object for the attribute '{@link ImpactProfile.Choice#getSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see ImpactProfile.Choice#getSelected()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_Selected();

	/**
	 * Returns the meta object for the attribute '{@link ImpactProfile.Choice#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see ImpactProfile.Choice#getMultiplicity()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_Multiplicity();

	/**
	 * Returns the meta object for class '{@link ImpactProfile.QuantityCost <em>Quantity Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity Cost</em>'.
	 * @see ImpactProfile.QuantityCost
	 * @generated
	 */
	EClass getQuantityCost();

	/**
	 * Returns the meta object for the attribute '{@link ImpactProfile.QuantityCost#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see ImpactProfile.QuantityCost#getQuantity()
	 * @see #getQuantityCost()
	 * @generated
	 */
	EAttribute getQuantityCost_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link ImpactProfile.QuantityCost#getCostPerPart <em>Cost Per Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Per Part</em>'.
	 * @see ImpactProfile.QuantityCost#getCostPerPart()
	 * @see #getQuantityCost()
	 * @generated
	 */
	EAttribute getQuantityCost_CostPerPart();

	/**
	 * Returns the meta object for class '{@link ImpactProfile.VariabilityModel <em>Variability Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variability Model</em>'.
	 * @see ImpactProfile.VariabilityModel
	 * @generated
	 */
	EClass getVariabilityModel();

	/**
	 * Returns the meta object for the reference '{@link ImpactProfile.VariabilityModel#getBase_Model <em>Base Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Model</em>'.
	 * @see ImpactProfile.VariabilityModel#getBase_Model()
	 * @see #getVariabilityModel()
	 * @generated
	 */
	EReference getVariabilityModel_Base_Model();

	/**
	 * Returns the meta object for class '{@link ImpactProfile.Includes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Includes</em>'.
	 * @see ImpactProfile.Includes
	 * @generated
	 */
	EClass getIncludes();

	/**
	 * Returns the meta object for the reference '{@link ImpactProfile.Includes#getBase_Dependency <em>Base Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Dependency</em>'.
	 * @see ImpactProfile.Includes#getBase_Dependency()
	 * @see #getIncludes()
	 * @generated
	 */
	EReference getIncludes_Base_Dependency();

	/**
	 * Returns the meta object for class '{@link ImpactProfile.Excludes <em>Excludes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Excludes</em>'.
	 * @see ImpactProfile.Excludes
	 * @generated
	 */
	EClass getExcludes();

	/**
	 * Returns the meta object for the reference '{@link ImpactProfile.Excludes#getBase_Dependency <em>Base Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Dependency</em>'.
	 * @see ImpactProfile.Excludes#getBase_Dependency()
	 * @see #getExcludes()
	 * @generated
	 */
	EReference getExcludes_Base_Dependency();

	/**
	 * Returns the meta object for class '{@link ImpactProfile.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see ImpactProfile.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for the attribute '{@link ImpactProfile.Goal#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goal</em>'.
	 * @see ImpactProfile.Goal#getGoal()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Goal();

	/**
	 * Returns the meta object for the attribute '{@link ImpactProfile.Goal#getGoalType <em>Goal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goal Type</em>'.
	 * @see ImpactProfile.Goal#getGoalType()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_GoalType();

	/**
	 * Returns the meta object for the attribute '{@link ImpactProfile.Goal#getGoalCheck <em>Goal Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goal Check</em>'.
	 * @see ImpactProfile.Goal#getGoalCheck()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_GoalCheck();

	/**
	 * Returns the meta object for the reference '{@link ImpactProfile.Goal#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see ImpactProfile.Goal#getBase_Class()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Base_Class();

	/**
	 * Returns the meta object for enum '{@link ImpactProfile.Domains <em>Domains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Domains</em>'.
	 * @see ImpactProfile.Domains
	 * @generated
	 */
	EEnum getDomains();

	/**
	 * Returns the meta object for enum '{@link ImpactProfile.localBool <em>local Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>local Bool</em>'.
	 * @see ImpactProfile.localBool
	 * @generated
	 */
	EEnum getlocalBool();

	/**
	 * Returns the meta object for enum '{@link ImpactProfile.PerformanceTypes <em>Performance Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Performance Types</em>'.
	 * @see ImpactProfile.PerformanceTypes
	 * @generated
	 */
	EEnum getPerformanceTypes();

	/**
	 * Returns the meta object for enum '{@link ImpactProfile.GoalTypes <em>Goal Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Goal Types</em>'.
	 * @see ImpactProfile.GoalTypes
	 * @generated
	 */
	EEnum getGoalTypes();

	/**
	 * Returns the meta object for enum '{@link ImpactProfile.GoalChecks <em>Goal Checks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Goal Checks</em>'.
	 * @see ImpactProfile.GoalChecks
	 * @generated
	 */
	EEnum getGoalChecks();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ImpactProfileFactory getImpactProfileFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ImpactProfile.impl.VariabilityPointImpl <em>Variability Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ImpactProfile.impl.VariabilityPointImpl
		 * @see ImpactProfile.impl.ImpactProfilePackageImpl#getVariabilityPoint()
		 * @generated
		 */
		EClass VARIABILITY_POINT = eINSTANCE.getVariabilityPoint();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABILITY_POINT__BASE_CLASS = eINSTANCE.getVariabilityPoint_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABILITY_POINT__DOMAIN = eINSTANCE.getVariabilityPoint_Domain();

		/**
		 * The meta object literal for the '<em><b>Mutual Exclusion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABILITY_POINT__MUTUAL_EXCLUSION = eINSTANCE.getVariabilityPoint_MutualExclusion();

		/**
		 * The meta object literal for the '{@link ImpactProfile.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ImpactProfile.impl.ChoiceImpl
		 * @see ImpactProfile.impl.ImpactProfilePackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '<em><b>Performance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__PERFORMANCE = eINSTANCE.getChoice_Performance();

		/**
		 * The meta object literal for the '<em><b>Performance Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__PERFORMANCE_TYPE = eINSTANCE.getChoice_PerformanceType();

		/**
		 * The meta object literal for the '<em><b>Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__POWER = eINSTANCE.getChoice_Power();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOICE__BASE_CLASS = eINSTANCE.getChoice_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Costs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOICE__COSTS = eINSTANCE.getChoice_Costs();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__SELECTED = eINSTANCE.getChoice_Selected();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__MULTIPLICITY = eINSTANCE.getChoice_Multiplicity();

		/**
		 * The meta object literal for the '{@link ImpactProfile.impl.QuantityCostImpl <em>Quantity Cost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ImpactProfile.impl.QuantityCostImpl
		 * @see ImpactProfile.impl.ImpactProfilePackageImpl#getQuantityCost()
		 * @generated
		 */
		EClass QUANTITY_COST = eINSTANCE.getQuantityCost();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITY_COST__QUANTITY = eINSTANCE.getQuantityCost_Quantity();

		/**
		 * The meta object literal for the '<em><b>Cost Per Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITY_COST__COST_PER_PART = eINSTANCE.getQuantityCost_CostPerPart();

		/**
		 * The meta object literal for the '{@link ImpactProfile.impl.VariabilityModelImpl <em>Variability Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ImpactProfile.impl.VariabilityModelImpl
		 * @see ImpactProfile.impl.ImpactProfilePackageImpl#getVariabilityModel()
		 * @generated
		 */
		EClass VARIABILITY_MODEL = eINSTANCE.getVariabilityModel();

		/**
		 * The meta object literal for the '<em><b>Base Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABILITY_MODEL__BASE_MODEL = eINSTANCE.getVariabilityModel_Base_Model();

		/**
		 * The meta object literal for the '{@link ImpactProfile.impl.IncludesImpl <em>Includes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ImpactProfile.impl.IncludesImpl
		 * @see ImpactProfile.impl.ImpactProfilePackageImpl#getIncludes()
		 * @generated
		 */
		EClass INCLUDES = eINSTANCE.getIncludes();

		/**
		 * The meta object literal for the '<em><b>Base Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUDES__BASE_DEPENDENCY = eINSTANCE.getIncludes_Base_Dependency();

		/**
		 * The meta object literal for the '{@link ImpactProfile.impl.ExcludesImpl <em>Excludes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ImpactProfile.impl.ExcludesImpl
		 * @see ImpactProfile.impl.ImpactProfilePackageImpl#getExcludes()
		 * @generated
		 */
		EClass EXCLUDES = eINSTANCE.getExcludes();

		/**
		 * The meta object literal for the '<em><b>Base Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCLUDES__BASE_DEPENDENCY = eINSTANCE.getExcludes_Base_Dependency();

		/**
		 * The meta object literal for the '{@link ImpactProfile.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ImpactProfile.impl.GoalImpl
		 * @see ImpactProfile.impl.ImpactProfilePackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__GOAL = eINSTANCE.getGoal_Goal();

		/**
		 * The meta object literal for the '<em><b>Goal Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__GOAL_TYPE = eINSTANCE.getGoal_GoalType();

		/**
		 * The meta object literal for the '<em><b>Goal Check</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__GOAL_CHECK = eINSTANCE.getGoal_GoalCheck();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__BASE_CLASS = eINSTANCE.getGoal_Base_Class();

		/**
		 * The meta object literal for the '{@link ImpactProfile.Domains <em>Domains</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ImpactProfile.Domains
		 * @see ImpactProfile.impl.ImpactProfilePackageImpl#getDomains()
		 * @generated
		 */
		EEnum DOMAINS = eINSTANCE.getDomains();

		/**
		 * The meta object literal for the '{@link ImpactProfile.localBool <em>local Bool</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ImpactProfile.localBool
		 * @see ImpactProfile.impl.ImpactProfilePackageImpl#getlocalBool()
		 * @generated
		 */
		EEnum LOCAL_BOOL = eINSTANCE.getlocalBool();

		/**
		 * The meta object literal for the '{@link ImpactProfile.PerformanceTypes <em>Performance Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ImpactProfile.PerformanceTypes
		 * @see ImpactProfile.impl.ImpactProfilePackageImpl#getPerformanceTypes()
		 * @generated
		 */
		EEnum PERFORMANCE_TYPES = eINSTANCE.getPerformanceTypes();

		/**
		 * The meta object literal for the '{@link ImpactProfile.GoalTypes <em>Goal Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ImpactProfile.GoalTypes
		 * @see ImpactProfile.impl.ImpactProfilePackageImpl#getGoalTypes()
		 * @generated
		 */
		EEnum GOAL_TYPES = eINSTANCE.getGoalTypes();

		/**
		 * The meta object literal for the '{@link ImpactProfile.GoalChecks <em>Goal Checks</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ImpactProfile.GoalChecks
		 * @see ImpactProfile.impl.ImpactProfilePackageImpl#getGoalChecks()
		 * @generated
		 */
		EEnum GOAL_CHECKS = eINSTANCE.getGoalChecks();

	}

} //ImpactProfilePackage
