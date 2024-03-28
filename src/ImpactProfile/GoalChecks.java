/**
 */
package ImpactProfile;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Goal Checks</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ImpactProfile.ImpactProfilePackage#getGoalChecks()
 * @model
 * @generated
 */
public enum GoalChecks implements Enumerator {
	/**
	 * The '<em><b>GT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GT_VALUE
	 * @generated
	 * @ordered
	 */
	GT(0, "GT", "GT"),

	/**
	 * The '<em><b>GTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GTE_VALUE
	 * @generated
	 * @ordered
	 */
	GTE(1, "GTE", "GTE"),

	/**
	 * The '<em><b>LT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LT_VALUE
	 * @generated
	 * @ordered
	 */
	LT(2, "LT", "LT"),

	/**
	 * The '<em><b>LTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LTE_VALUE
	 * @generated
	 * @ordered
	 */
	LTE(3, "LTE", "LTE"),

	/**
	 * The '<em><b>EQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQ_VALUE
	 * @generated
	 * @ordered
	 */
	EQ(4, "EQ", "EQ"),

	/**
	 * The '<em><b>NA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NA_VALUE
	 * @generated
	 * @ordered
	 */
	NA(5, "NA", "NA");

	/**
	 * The '<em><b>GT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GT_VALUE = 0;

	/**
	 * The '<em><b>GTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GTE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GTE_VALUE = 1;

	/**
	 * The '<em><b>LT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LT_VALUE = 2;

	/**
	 * The '<em><b>LTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LTE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LTE_VALUE = 3;

	/**
	 * The '<em><b>EQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EQ_VALUE = 4;

	/**
	 * The '<em><b>NA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NA_VALUE = 5;

	/**
	 * An array of all the '<em><b>Goal Checks</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GoalChecks[] VALUES_ARRAY =
		new GoalChecks[] {
			GT,
			GTE,
			LT,
			LTE,
			EQ,
			NA,
		};

	/**
	 * A public read-only list of all the '<em><b>Goal Checks</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GoalChecks> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Goal Checks</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GoalChecks get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GoalChecks result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Goal Checks</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GoalChecks getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GoalChecks result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Goal Checks</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GoalChecks get(int value) {
		switch (value) {
			case GT_VALUE: return GT;
			case GTE_VALUE: return GTE;
			case LT_VALUE: return LT;
			case LTE_VALUE: return LTE;
			case EQ_VALUE: return EQ;
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
	private GoalChecks(int value, String name, String literal) {
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
	
} //GoalChecks
