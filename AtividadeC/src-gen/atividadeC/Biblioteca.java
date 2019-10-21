/**
 */
package atividadeC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Biblioteca</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atividadeC.Biblioteca#getPrograma <em>Programa</em>}</li>
 *   <li>{@link atividadeC.Biblioteca#getLibrary <em>Library</em>}</li>
 * </ul>
 *
 * @see atividadeC.AtividadeCPackage#getBiblioteca()
 * @model
 * @generated
 */
public interface Biblioteca extends EObject {
	/**
	 * Returns the value of the '<em><b>Programa</b></em>' containment reference list.
	 * The list contents are of type {@link atividadeC.Programa}.
	 * It is bidirectional and its opposite is '{@link atividadeC.Programa#getBiblioteca <em>Biblioteca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programa</em>' containment reference list.
	 * @see atividadeC.AtividadeCPackage#getBiblioteca_Programa()
	 * @see atividadeC.Programa#getBiblioteca
	 * @model opposite="biblioteca" containment="true"
	 * @generated
	 */
	EList<Programa> getPrograma();

	/**
	 * Returns the value of the '<em><b>Library</b></em>' attribute.
	 * The literals are from the enumeration {@link atividadeC.Lib}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' attribute.
	 * @see atividadeC.Lib
	 * @see #setLibrary(Lib)
	 * @see atividadeC.AtividadeCPackage#getBiblioteca_Library()
	 * @model
	 * @generated
	 */
	Lib getLibrary();

	/**
	 * Sets the value of the '{@link atividadeC.Biblioteca#getLibrary <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' attribute.
	 * @see atividadeC.Lib
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(Lib value);

} // Biblioteca
