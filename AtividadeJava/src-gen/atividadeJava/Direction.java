/**
 */
package atividadeJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Direction</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see atividadeJava.AtividadeJavaPackage#getDirection()
 * @model
 * @generated
 */
public enum Direction implements Enumerator {
	/**
	 * The '<em><b>Input</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPUT_VALUE
	 * @generated
	 * @ordered
	 */
	INPUT(0, "input", "input"),

	/**
	 * The '<em><b>Output</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTPUT_VALUE
	 * @generated
	 * @ordered
	 */
	OUTPUT(1, "output", "output"),

	/**
	 * The '<em><b>Input Output</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPUT_OUTPUT_VALUE
	 * @generated
	 * @ordered
	 */
	INPUT_OUTPUT(2, "inputOutput", "inputOutput"),

	/**
	 * The '<em><b>Return</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETURN_VALUE
	 * @generated
	 * @ordered
	 */
	RETURN(3, "return", "return");

	/**
	 * The '<em><b>Input</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPUT
	 * @model name="input"
	 * @generated
	 * @ordered
	 */
	public static final int INPUT_VALUE = 0;

	/**
	 * The '<em><b>Output</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTPUT
	 * @model name="output"
	 * @generated
	 * @ordered
	 */
	public static final int OUTPUT_VALUE = 1;

	/**
	 * The '<em><b>Input Output</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPUT_OUTPUT
	 * @model name="inputOutput"
	 * @generated
	 * @ordered
	 */
	public static final int INPUT_OUTPUT_VALUE = 2;

	/**
	 * The '<em><b>Return</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETURN
	 * @model name="return"
	 * @generated
	 * @ordered
	 */
	public static final int RETURN_VALUE = 3;

	/**
	 * An array of all the '<em><b>Direction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Direction[] VALUES_ARRAY = new Direction[] { INPUT, OUTPUT, INPUT_OUTPUT, RETURN, };

	/**
	 * A public read-only list of all the '<em><b>Direction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Direction> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Direction</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Direction get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Direction result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Direction</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Direction getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Direction result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Direction</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Direction get(int value) {
		switch (value) {
		case INPUT_VALUE:
			return INPUT;
		case OUTPUT_VALUE:
			return OUTPUT;
		case INPUT_OUTPUT_VALUE:
			return INPUT_OUTPUT;
		case RETURN_VALUE:
			return RETURN;
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
	private Direction(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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

} //Direction
