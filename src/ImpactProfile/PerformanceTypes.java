/**
 */
package ImpactProfile;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Performance Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ImpactProfile.ImpactProfilePackage#getPerformanceTypes()
 * @model
 * @generated
 */
public enum PerformanceTypes implements Enumerator {
	/**
	 * The '<em><b>MIPS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIPS_VALUE
	 * @generated
	 * @ordered
	 */
	MIPS(0, "MIPS", "MIPS"),

	/**
	 * The '<em><b>MHz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MHZ_VALUE
	 * @generated
	 * @ordered
	 */
	MHZ(1, "MHz", "MHz"),

	/**
	 * The '<em><b>KB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KB_VALUE
	 * @generated
	 * @ordered
	 */
	KB(2, "KB", "KB"),

	/**
	 * The '<em><b>MB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MB_VALUE
	 * @generated
	 * @ordered
	 */
	MB(3, "MB", "MB"),

	/**
	 * The '<em><b>GB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GB_VALUE
	 * @generated
	 * @ordered
	 */
	GB(4, "GB", "GB"),

	/**
	 * The '<em><b>DMIPS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DMIPS_VALUE
	 * @generated
	 * @ordered
	 */
	DMIPS(5, "DMIPS", "DMIPS"),

	/**
	 * The '<em><b>Efficiency</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EFFICIENCY_VALUE
	 * @generated
	 * @ordered
	 */
	EFFICIENCY(6, "Efficiency", "Efficiency"),

	/**
	 * The '<em><b>NA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NA_VALUE
	 * @generated
	 * @ordered
	 */
	NA(7, "NA", "NA"),

	/**
	 * The '<em><b>Dissipation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISSIPATION_VALUE
	 * @generated
	 * @ordered
	 */
	DISSIPATION(8, "Dissipation", "Dissipation");

	/**
	 * The '<em><b>MIPS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIPS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MIPS_VALUE = 0;

	/**
	 * The '<em><b>MHz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MHZ
	 * @model name="MHz"
	 * @generated
	 * @ordered
	 */
	public static final int MHZ_VALUE = 1;

	/**
	 * The '<em><b>KB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KB_VALUE = 2;

	/**
	 * The '<em><b>MB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MB_VALUE = 3;

	/**
	 * The '<em><b>GB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GB_VALUE = 4;

	/**
	 * The '<em><b>DMIPS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DMIPS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DMIPS_VALUE = 5;

	/**
	 * The '<em><b>Efficiency</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EFFICIENCY
	 * @model name="Efficiency"
	 * @generated
	 * @ordered
	 */
	public static final int EFFICIENCY_VALUE = 6;

	/**
	 * The '<em><b>NA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NA_VALUE = 7;

	/**
	 * The '<em><b>Dissipation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISSIPATION
	 * @model name="Dissipation"
	 * @generated
	 * @ordered
	 */
	public static final int DISSIPATION_VALUE = 8;

	/**
	 * An array of all the '<em><b>Performance Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PerformanceTypes[] VALUES_ARRAY =
		new PerformanceTypes[] {
			MIPS,
			MHZ,
			KB,
			MB,
			GB,
			DMIPS,
			EFFICIENCY,
			NA,
			DISSIPATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Performance Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PerformanceTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Performance Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PerformanceTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PerformanceTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Performance Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PerformanceTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PerformanceTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Performance Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PerformanceTypes get(int value) {
		switch (value) {
			case MIPS_VALUE: return MIPS;
			case MHZ_VALUE: return MHZ;
			case KB_VALUE: return KB;
			case MB_VALUE: return MB;
			case GB_VALUE: return GB;
			case DMIPS_VALUE: return DMIPS;
			case EFFICIENCY_VALUE: return EFFICIENCY;
			case NA_VALUE: return NA;
			case DISSIPATION_VALUE: return DISSIPATION;
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
	private PerformanceTypes(int value, String name, String literal) {
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
	
} //PerformanceTypes
