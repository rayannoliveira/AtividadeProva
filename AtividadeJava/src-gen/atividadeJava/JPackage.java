/**
 */
package atividadeJava;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atividadeJava.JPackage#getJelement <em>Jelement</em>}</li>
 * </ul>
 *
 * @see atividadeJava.AtividadeJavaPackage#getJPackage()
 * @model
 * @generated
 */
public interface JPackage extends JElement {
	/**
	 * Returns the value of the '<em><b>Jelement</b></em>' containment reference list.
	 * The list contents are of type {@link atividadeJava.JElement}.
	 * It is bidirectional and its opposite is '{@link atividadeJava.JElement#getJpackage <em>Jpackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jelement</em>' containment reference list.
	 * @see atividadeJava.AtividadeJavaPackage#getJPackage_Jelement()
	 * @see atividadeJava.JElement#getJpackage
	 * @model opposite="jpackage" containment="true"
	 * @generated
	 */
	EList<JElement> getJelement();

} // JPackage
