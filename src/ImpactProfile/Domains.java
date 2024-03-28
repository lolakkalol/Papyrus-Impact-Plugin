/**
 */
package ImpactProfile;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Domains</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ImpactProfile.ImpactProfilePackage#getDomains()
 * @model
 * @generated
 */
public enum Domains implements Enumerator {
	/**
	 * The '<em><b>Electronics</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTRONICS_VALUE
	 * @generated
	 * @ordered
	 */
	ELECTRONICS(0, "Electronics", "Electronics"),

	/**
	 * The '<em><b>Mechanical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MECHANICAL_VALUE
	 * @generated
	 * @ordered
	 */
	MECHANICAL(1, "Mechanical", "Mechanical"),

	/**
	 * The '<em><b>Software</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOFTWARE_VALUE
	 * @generated
	 * @ordered
	 */
	SOFTWARE(2, "Software", "Software"),

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
	 * The '<em><b>Electronics</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTRONICS
	 * @model name="Electronics"
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRONICS_VALUE = 0;

	/**
	 * The '<em><b>Mechanical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MECHANICAL
	 * @model name="Mechanical"
	 * @generated
	 * @ordered
	 */
	public static final int MECHANICAL_VALUE = 1;

	/**
	 * The '<em><b>Software</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOFTWARE
	 * @model name="Software"
	 * @generated
	 * @ordered
	 */
	public static final int SOFTWARE_VALUE = 2;

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
	 * An array of all the '<em><b>Domains</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Domains[] VALUES_ARRAY =
		new Domains[] {
			ELECTRONICS,
			MECHANICAL,
			SOFTWARE,
			NA,
		};

	/**
	 * A public read-only list of all the '<em><b>Domains</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Domains> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Domains</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Domains get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Domains result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Domains</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Domains getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Domains result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Domains</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Domains get(int value) {
		switch (value) {
			case ELECTRONICS_VALUE: return ELECTRONICS;
			case MECHANICAL_VALUE: return MECHANICAL;
			case SOFTWARE_VALUE: return SOFTWARE;
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
	private Domains(int value, String name, String literal) {
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
	
} //Domains
