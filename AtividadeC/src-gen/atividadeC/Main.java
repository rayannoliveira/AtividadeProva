/**
 */
package atividadeC;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link atividadeC.Main#getType <em>Type</em>}</li>
 *   <li>{@link atividadeC.Main#getRes <em>Res</em>}</li>
 *   <li>{@link atividadeC.Main#getPrograma <em>Programa</em>}</li>
 * </ul>
 *
 * @see atividadeC.AtividadeCPackage#getMain()
 * @model
 * @generated
 */
public interface Main extends Programa {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link atividadeC.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see atividadeC.Type
	 * @see #setType(Type)
	 * @see atividadeC.AtividadeCPackage#getMain_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link atividadeC.Main#getType <em>Type</em>}' attribute.
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
	 * @see atividadeC.AtividadeCPackage#getMain_Res()
	 * @model
	 * @generated
	 */
	Reservada getRes();

	/**
	 * Sets the value of the '{@link atividadeC.Main#getRes <em>Res</em>}' attribute.
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
	 * It is bidirectional and its opposite is '{@link atividadeC.Programa#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programa</em>' container reference.
	 * @see #setPrograma(Programa)
	 * @see atividadeC.AtividadeCPackage#getMain_Programa()
	 * @see atividadeC.Programa#getMain
	 * @model opposite="main" transient="false"
	 * @generated
	 */
	Programa getPrograma();

	/**
	 * Sets the value of the '{@link atividadeC.Main#getPrograma <em>Programa</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programa</em>' container reference.
	 * @see #getPrograma()
	 * @generated
	 */
	void setPrograma(Programa value);

} // Main
