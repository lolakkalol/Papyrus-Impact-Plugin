/**
 */
package ImpactProfile;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Goal Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ImpactProfile.ImpactProfilePackage#getGoalTypes()
 * @model
 * @generated
 */
public enum GoalTypes implements Enumerator {
	/**
	 * The '<em><b>Performance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERFORMANCE_VALUE
	 * @generated
	 * @ordered
	 */
	PERFORMANCE(0, "Performance", "Performance"),

	/**
	 * The '<em><b>Cost</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COST_VALUE
	 * @generated
	 * @ordered
	 */
	COST(1, "Cost", "Cost"),

	/**
	 * The '<em><b>Power</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_VALUE
	 * @generated
	 * @ordered
	 */
	POWER(2, "Power", "Power"),

	/**
	 * The '<em><b>NA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NA_VALUE
	 * @generated
	 * @ordered
	 */
	NA(3, "NA", "NA");

	/**
	 * The '<em><b>Performance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERFORMANCE
	 * @model name="Performance"
	 * @generated
	 * @ordered
	 */
	public static final int PERFORMANCE_VALUE = 0;

	/**
	 * The '<em><b>Cost</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COST
	 * @model name="Cost"
	 * @generated
	 * @ordered
	 */
	public static final int COST_VALUE = 1;

	/**
	 * The '<em><b>Power</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER
	 * @model name="Power"
	 * @generated
	 * @ordered
	 */
	public static final int POWER_VALUE = 2;

	/**
	 * The '<em><b>NA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NA_VALUE = 3;

	/**
	 * An array of all the '<em><b>Goal Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GoalTypes[] VALUES_ARRAY =
		new GoalTypes[] {
			PERFORMANCE,
			COST,
			POWER,
			NA,
		};

	/**
	 * A public read-only list of all the '<em><b>Goal Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GoalTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Goal Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GoalTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GoalTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Goal Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GoalTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GoalTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Goal Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GoalTypes get(int value) {
		switch (value) {
			case PERFORMANCE_VALUE: return PERFORMANCE;
			case COST_VALUE: return COST;
			case POWER_VALUE: return POWER;
			case NA_VALUE: return NA;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private GoalTypes(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //GoalTypes
