/**
 */
package atividadeJava;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JElement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atividadeJava.JElement#getName <em>Name</em>}</li>
 *   <li>{@link atividadeJava.JElement#getJpackage <em>Jpackage</em>}</li>
 * </ul>
 *
 * @see atividadeJava.AtividadeJavaPackage#getJElement()
 * @model
 * @generated
 */
public interface JElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see atividadeJava.AtividadeJavaPackage#getJElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link atividadeJava.JElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Jpackage</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link atividadeJava.JPackage#getJelement <em>Jelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jpackage</em>' container reference.
	 * @see #setJpackage(JPackage)
	 * @see atividadeJava.AtividadeJavaPackage#getJElement_Jpackage()
	 * @see atividadeJava.JPackage#getJelement
	 * @model opposite="jelement" transient="false"
	 * @generated
	 */
	JPackage getJpackage();

	/**
	 * Sets the value of the '{@link atividadeJava.JElement#getJpackage <em>Jpackage</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jpackage</em>' container reference.
	 * @see #getJpackage()
	 * @generated
	 */
	void setJpackage(JPackage value);

} // JElement
