/**
 */
package atividadeC;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atividadeC.Function#getType <em>Type</em>}</li>
 *   <li>{@link atividadeC.Function#getRes <em>Res</em>}</li>
 *   <li>{@link atividadeC.Function#getPrograma <em>Programa</em>}</li>
 * </ul>
 *
 * @see atividadeC.AtividadeCPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link atividadeC.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see atividadeC.Type
	 * @see #setType(Type)
	 * @see atividadeC.AtividadeCPackage#getFunction_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link atividadeC.Function#getType <em>Type</em>}' attribute.
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
	 * @see atividadeC.AtividadeCPackage#getFunction_Res()
	 * @model
	 * @generated
	 */
	Reservada getRes();

	/**
	 * Sets the value of the '{@link atividadeC.Function#getRes <em>Res</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res</em>' attribute.
	 * @see atividadeC.Reservada
	 * @see #getRes()
	 * @generated
	 */
	void setRes(Reservada value);

	/**
	 * Returns the value of the '<em><b>Programa</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link atividadeC.Programa#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programa</em>' container reference.
	 * @see #setPrograma(Programa)
	 * @see atividadeC.AtividadeCPackage#getFunction_Programa()
	 * @see atividadeC.Programa#getFunction
	 * @model opposite="function" transient="false"
	 * @generated
	 */
	Programa getPrograma();

	/**
	 * Sets the value of the '{@link atividadeC.Function#getPrograma <em>Programa</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programa</em>' container reference.
	 * @see #getPrograma()
	 * @generated
	 */
	void setPrograma(Programa value);

} // Function
