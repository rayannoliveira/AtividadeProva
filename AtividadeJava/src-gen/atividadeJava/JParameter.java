/**
 */
package atividadeJava;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JParameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atividadeJava.JParameter#getDirection <em>Direction</em>}</li>
 *   <li>{@link atividadeJava.JParameter#getJmethod <em>Jmethod</em>}</li>
 * </ul>
 *
 * @see atividadeJava.AtividadeJavaPackage#getJParameter()
 * @model
 * @generated
 */
public interface JParameter extends JElement {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link atividadeJava.Direction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see atividadeJava.Direction
	 * @see #setDirection(Direction)
	 * @see atividadeJava.AtividadeJavaPackage#getJParameter_Direction()
	 * @model
	 * @generated
	 */
	Direction getDirection();

	/**
	 * Sets the value of the '{@link atividadeJava.JParameter#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see atividadeJava.Direction
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Direction value);

	/**
	 * Returns the value of the '<em><b>Jmethod</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link atividadeJava.JMethod#getJparameter <em>Jparameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jmethod</em>' container reference.
	 * @see #setJmethod(JMethod)
	 * @see atividadeJava.AtividadeJavaPackage#getJParameter_Jmethod()
	 * @see atividadeJava.JMethod#getJparameter
	 * @model opposite="jparameter" transient="false"
	 * @generated
	 */
	JMethod getJmethod();

	/**
	 * Sets the value of the '{@link atividadeJava.JParameter#getJmethod <em>Jmethod</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jmethod</em>' container reference.
	 * @see #getJmethod()
	 * @generated
	 */
	void setJmethod(JMethod value);

} // JParameter
