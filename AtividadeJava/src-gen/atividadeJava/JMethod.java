/**
 */
package atividadeJava;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JMethod</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atividadeJava.JMethod#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link atividadeJava.JMethod#getJclass <em>Jclass</em>}</li>
 *   <li>{@link atividadeJava.JMethod#getJparameter <em>Jparameter</em>}</li>
 *   <li>{@link atividadeJava.JMethod#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @see atividadeJava.AtividadeJavaPackage#getJMethod()
 * @model
 * @generated
 */
public interface JMethod extends JElement {
	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see atividadeJava.AtividadeJavaPackage#getJMethod_IsAbstract()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link atividadeJava.JMethod#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Jclass</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link atividadeJava.JClass#getJmethod <em>Jmethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jclass</em>' container reference.
	 * @see #setJclass(JClass)
	 * @see atividadeJava.AtividadeJavaPackage#getJMethod_Jclass()
	 * @see atividadeJava.JClass#getJmethod
	 * @model opposite="jmethod" transient="false"
	 * @generated
	 */
	JClass getJclass();

	/**
	 * Sets the value of the '{@link atividadeJava.JMethod#getJclass <em>Jclass</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jclass</em>' container reference.
	 * @see #getJclass()
	 * @generated
	 */
	void setJclass(JClass value);

	/**
	 * Returns the value of the '<em><b>Jparameter</b></em>' containment reference list.
	 * The list contents are of type {@link atividadeJava.JParameter}.
	 * It is bidirectional and its opposite is '{@link atividadeJava.JParameter#getJmethod <em>Jmethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jparameter</em>' containment reference list.
	 * @see atividadeJava.AtividadeJavaPackage#getJMethod_Jparameter()
	 * @see atividadeJava.JParameter#getJmethod
	 * @model opposite="jmethod" containment="true"
	 * @generated
	 */
	EList<JParameter> getJparameter();

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link atividadeJava.Vis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see atividadeJava.Vis
	 * @see #setVisibility(Vis)
	 * @see atividadeJava.AtividadeJavaPackage#getJMethod_Visibility()
	 * @model
	 * @generated
	 */
	Vis getVisibility();

	/**
	 * Sets the value of the '{@link atividadeJava.JMethod#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see atividadeJava.Vis
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Vis value);

} // JMethod
