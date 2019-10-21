/**
 */
package atividadeC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atividadeC.Struct#getPrograma <em>Programa</em>}</li>
 *   <li>{@link atividadeC.Struct#getType <em>Type</em>}</li>
 *   <li>{@link atividadeC.Struct#getRes <em>Res</em>}</li>
 * </ul>
 *
 * @see atividadeC.AtividadeCPackage#getStruct()
 * @model
 * @generated
 */
public interface Struct extends EObject {
	/**
	 * Returns the value of the '<em><b>Programa</b></em>' containment reference list.
	 * The list contents are of type {@link atividadeC.Programa}.
	 * It is bidirectional and its opposite is '{@link atividadeC.Programa#getStruct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programa</em>' containment reference list.
	 * @see atividadeC.AtividadeCPackage#getStruct_Programa()
	 * @see atividadeC.Programa#getStruct
	 * @model opposite="struct" containment="true"
	 * @generated
	 */
	EList<Programa> getPrograma();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link atividadeC.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see atividadeC.Type
	 * @see #setType(Type)
	 * @see atividadeC.AtividadeCPackage#getStruct_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link atividadeC.Struct#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see atividadeC.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Res</b></em>' attribute.
	 * The literals are from the enumeration {@link atividadeC.Reservada}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Res</em>' attribute.
	 * @see atividadeC.Reservada
	 * @see #setRes(Reservada)
	 * @see atividadeC.AtividadeCPackage#getStruct_Res()
	 * @model
	 * @generated
	 */
	Reservada getRes();

	/**
	 * Sets the value of the '{@link atividadeC.Struct#getRes <em>Res</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res</em>' attribute.
	 * @see atividadeC.Reservada
	 * @see #getRes()
	 * @generated
	 */
	void setRes(Reservada value);

} // Struct
