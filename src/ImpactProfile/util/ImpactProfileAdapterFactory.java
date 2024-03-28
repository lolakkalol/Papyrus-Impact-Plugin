/**
 */
package ImpactProfile.util;

import ImpactProfile.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ImpactProfile.ImpactProfilePackage
 * @generated
 */
public class ImpactProfileAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ImpactProfilePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpactProfileAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ImpactProfilePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImpactProfileSwitch<Adapter> modelSwitch =
		new ImpactProfileSwitch<Adapter>() {
			@Override
			public Adapter caseVariabilityPoint(VariabilityPoint object) {
				return createVariabilityPointAdapter();
			}
			@Override
			public Adapter caseChoice(Choice object) {
				return createChoiceAdapter();
			}
			@Override
			public Adapter caseQuantityCost(QuantityCost object) {
				return createQuantityCostAdapter();
			}
			@Override
			public Adapter caseVariabilityModel(VariabilityModel object) {
				return createVariabilityModelAdapter();
			}
			@Override
			public Adapter caseIncludes(Includes object) {
				return createIncludesAdapter();
			}
			@Override
			public Adapter caseExcludes(Excludes object) {
				return createExcludesAdapter();
			}
			@Override
			public Adapter caseGoal(Goal object) {
				return createGoalAdapter();
			}
			@Override
			public Adapter caseQuantityCostList(QuantityCostList object) {
				return createQuantityCostListAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ImpactProfile.VariabilityPoint <em>Variability Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImpactProfile.VariabilityPoint
	 * @generated
	 */
	public Adapter createVariabilityPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImpactProfile.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImpactProfile.Choice
	 * @generated
	 */
	public Adapter createChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImpactProfile.QuantityCost <em>Quantity Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImpactProfile.QuantityCost
	 * @generated
	 */
	public Adapter createQuantityCostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImpactProfile.VariabilityModel <em>Variability Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImpactProfile.VariabilityModel
	 * @generated
	 */
	public Adapter createVariabilityModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImpactProfile.Includes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImpactProfile.Includes
	 * @generated
	 */
	public Adapter createIncludesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImpactProfile.Excludes <em>Excludes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImpactProfile.Excludes
	 * @generated
	 */
	public Adapter createExcludesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImpactProfile.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImpactProfile.Goal
	 * @generated
	 */
	public Adapter createGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImpactProfile.QuantityCostList <em>Quantity Cost List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImpactProfile.QuantityCostList
	 * @generated
	 */
	public Adapter createQuantityCostListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ImpactProfileAdapterFactory
