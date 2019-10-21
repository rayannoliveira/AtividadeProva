/**
 */
package atividadeJava;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atividadeJava.JClass#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link atividadeJava.JClass#getJfield <em>Jfield</em>}</li>
 *   <li>{@link atividadeJava.JClass#getJmethod <em>Jmethod</em>}</li>
 * </ul>
 *
 * @see atividadeJava.AtividadeJavaPackage#getJClass()
 * @model
 * @generated
 */
public interface JClass extends JClassifier {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link atividadeJava.Vis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see atividadeJava.Vis
	 * @see #setVisibility(Vis)
	 * @see atividadeJava.AtividadeJavaPackage#getJClass_Visibility()
	 * @model
	 * @generated
	 */
	Vis getVisibility();

	/**
	 * Sets the value of the '{@link atividadeJava.JClass#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see atividadeJava.Vis
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Vis value);

	/**
	 * Returns the value of the '<em><b>Jfield</b></em>' containment reference list.
	 * The list contents are of type {@link atividadeJava.JField}.
	 * It is bidirectional and its opposite is '{@link atividadeJava.JField#getJclass <em>Jclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jfield</em>' containment reference list.
	 * @see atividadeJava.AtividadeJavaPackage#getJClass_Jfield()
	 * @see atividadeJava.JField#getJclass
	 * @model opposite="jclass" containment="true"
	 * @generated
	 */
	EList<JField> getJfield();

	/**
	 * Returns the value of the '<em><b>Jmethod</b></em>' containment reference list.
	 * The list contents are of type {@link atividadeJava.JMethod}.
	 * It is bidirectional and its opposite is '{@link atividadeJava.JMethod#getJclass <em>Jclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jmethod</em>' containment reference list.
	 * @see atividadeJava.AtividadeJavaPackage#getJClass_Jmethod()
	 * @see atividadeJava.JMethod#getJclass
	 * @model opposite="jclass" containment="true"
	 * @generated
	 */
	EList<JMethod> getJmethod();

} // JClass
