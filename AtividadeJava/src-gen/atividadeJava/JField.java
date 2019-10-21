/**
 */
package atividadeJava;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JField</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atividadeJava.JField#getJclass <em>Jclass</em>}</li>
 *   <li>{@link atividadeJava.JField#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @see atividadeJava.AtividadeJavaPackage#getJField()
 * @model
 * @generated
 */
public interface JField extends JElement {
	/**
	 * Returns the value of the '<em><b>Jclass</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link atividadeJava.JClass#getJfield <em>Jfield</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jclass</em>' container reference.
	 * @see #setJclass(JClass)
	 * @see atividadeJava.AtividadeJavaPackage#getJField_Jclass()
	 * @see atividadeJava.JClass#getJfield
	 * @model opposite="jfield" transient="false"
	 * @generated
	 */
	JClass getJclass();

	/**
	 * Sets the value of the '{@link atividadeJava.JField#getJclass <em>Jclass</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jclass</em>' container reference.
	 * @see #getJclass()
	 * @generated
	 */
	void setJclass(JClass value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link atividadeJava.Vis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see atividadeJava.Vis
	 * @see #setVisibility(Vis)
	 * @see atividadeJava.AtividadeJavaPackage#getJField_Visibility()
	 * @model
	 * @generated
	 */
	Vis getVisibility();

	/**
	 * Sets the value of the '{@link atividadeJava.JField#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see atividadeJava.Vis
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Vis value);

} // JField
