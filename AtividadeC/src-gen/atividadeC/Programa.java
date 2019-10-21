/**
 */
package atividadeC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programa</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atividadeC.Programa#getBiblioteca <em>Biblioteca</em>}</li>
 *   <li>{@link atividadeC.Programa#getStruct <em>Struct</em>}</li>
 *   <li>{@link atividadeC.Programa#getFunction <em>Function</em>}</li>
 *   <li>{@link atividadeC.Programa#getMain <em>Main</em>}</li>
 *   <li>{@link atividadeC.Programa#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see atividadeC.AtividadeCPackage#getPrograma()
 * @model
 * @generated
 */
public interface Programa extends EObject {
	/**
	 * Returns the value of the '<em><b>Biblioteca</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link atividadeC.Biblioteca#getPrograma <em>Programa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Biblioteca</em>' container reference.
	 * @see #setBiblioteca(Biblioteca)
	 * @see atividadeC.AtividadeCPackage#getPrograma_Biblioteca()
	 * @see atividadeC.Biblioteca#getPrograma
	 * @model opposite="programa" transient="false"
	 * @generated
	 */
	Biblioteca getBiblioteca();

	/**
	 * Sets the value of the '{@link atividadeC.Programa#getBiblioteca <em>Biblioteca</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Biblioteca</em>' container reference.
	 * @see #getBiblioteca()
	 * @generated
	 */
	void setBiblioteca(Biblioteca value);

	/**
	 * Returns the value of the '<em><b>Struct</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link atividadeC.Struct#getPrograma <em>Programa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Struct</em>' container reference.
	 * @see #setStruct(Struct)
	 * @see atividadeC.AtividadeCPackage#getPrograma_Struct()
	 * @see atividadeC.Struct#getPrograma
	 * @model opposite="programa" transient="false"
	 * @generated
	 */
	Struct getStruct();

	/**
	 * Sets the value of the '{@link atividadeC.Programa#getStruct <em>Struct</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Struct</em>' container reference.
	 * @see #getStruct()
	 * @generated
	 */
	void setStruct(Struct value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference list.
	 * The list contents are of type {@link atividadeC.Function}.
	 * It is bidirectional and its opposite is '{@link atividadeC.Function#getPrograma <em>Programa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference list.
	 * @see atividadeC.AtividadeCPackage#getPrograma_Function()
	 * @see atividadeC.Function#getPrograma
	 * @model opposite="programa" containment="true"
	 * @generated
	 */
	EList<Function> getFunction();

	/**
	 * Returns the value of the '<em><b>Main</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link atividadeC.Main#getPrograma <em>Programa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main</em>' containment reference.
	 * @see #setMain(Main)
	 * @see atividadeC.AtividadeCPackage#getPrograma_Main()
	 * @see atividadeC.Main#getPrograma
	 * @model opposite="programa" containment="true"
	 * @generated
	 */
	Main getMain();

	/**
	 * Sets the value of the '{@link atividadeC.Programa#getMain <em>Main</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main</em>' containment reference.
	 * @see #getMain()
	 * @generated
	 */
	void setMain(Main value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see atividadeC.AtividadeCPackage#getPrograma_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link atividadeC.Programa#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Programa
