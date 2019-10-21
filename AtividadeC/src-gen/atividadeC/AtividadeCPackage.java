/**
 */
package atividadeC;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see atividadeC.AtividadeCFactory
 * @model kind="package"
 * @generated
 */
public interface AtividadeCPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "atividadeC";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/atividadeC";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "atividadeC";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AtividadeCPackage eINSTANCE = atividadeC.impl.AtividadeCPackageImpl.init();

	/**
	 * The meta object id for the '{@link atividadeC.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atividadeC.impl.FunctionImpl
	 * @see atividadeC.impl.AtividadeCPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Res</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__RES = 1;

	/**
	 * The feature id for the '<em><b>Programa</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PROGRAMA = 2;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link atividadeC.impl.StructImpl <em>Struct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atividadeC.impl.StructImpl
	 * @see atividadeC.impl.AtividadeCPackageImpl#getStruct()
	 * @generated
	 */
	int STRUCT = 1;

	/**
	 * The feature id for the '<em><b>Programa</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__PROGRAMA = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Res</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__RES = 2;

	/**
	 * The number of structural features of the '<em>Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link atividadeC.impl.MainImpl <em>Main</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atividadeC.impl.MainImpl
	 * @see atividadeC.impl.AtividadeCPackageImpl#getMain()
	 * @generated
	 */
	int MAIN = 2;

	/**
	 * The meta object id for the '{@link atividadeC.impl.BibliotecaImpl <em>Biblioteca</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atividadeC.impl.BibliotecaImpl
	 * @see atividadeC.impl.AtividadeCPackageImpl#getBiblioteca()
	 * @generated
	 */
	int BIBLIOTECA = 3;

	/**
	 * The meta object id for the '{@link atividadeC.impl.ProgramaImpl <em>Programa</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atividadeC.impl.ProgramaImpl
	 * @see atividadeC.impl.AtividadeCPackageImpl#getPrograma()
	 * @generated
	 */
	int PROGRAMA = 4;

	/**
	 * The feature id for the '<em><b>Biblioteca</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMA__BIBLIOTECA = 0;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMA__STRUCT = 1;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMA__FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Main</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMA__MAIN = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMA__NAME = 4;

	/**
	 * The number of structural features of the '<em>Programa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMA_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Programa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMA_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Biblioteca</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__BIBLIOTECA = PROGRAMA__BIBLIOTECA;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__STRUCT = PROGRAMA__STRUCT;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__FUNCTION = PROGRAMA__FUNCTION;

	/**
	 * The feature id for the '<em><b>Main</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__MAIN = PROGRAMA__MAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__NAME = PROGRAMA__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__TYPE = PROGRAMA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Res</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__RES = PROGRAMA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Programa</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__PROGRAMA = PROGRAMA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Main</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_FEATURE_COUNT = PROGRAMA_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Main</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_OPERATION_COUNT = PROGRAMA_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Programa</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECA__PROGRAMA = 0;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECA__LIBRARY = 1;

	/**
	 * The number of structural features of the '<em>Biblioteca</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Biblioteca</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link atividadeC.Lib <em>Lib</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atividadeC.Lib
	 * @see atividadeC.impl.AtividadeCPackageImpl#getLib()
	 * @generated
	 */
	int LIB = 5;

	/**
	 * The meta object id for the '{@link atividadeC.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atividadeC.Type
	 * @see atividadeC.impl.AtividadeCPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 6;

	/**
	 * The meta object id for the '{@link atividadeC.Reservada <em>Reservada</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atividadeC.Reservada
	 * @see atividadeC.impl.AtividadeCPackageImpl#getReservada()
	 * @generated
	 */
	int RESERVADA = 7;

	/**
	 * Returns the meta object for class '{@link atividadeC.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see atividadeC.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link atividadeC.Function#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see atividadeC.Function#getType()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Type();

	/**
	 * Returns the meta object for the attribute '{@link atividadeC.Function#getRes <em>Res</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Res</em>'.
	 * @see atividadeC.Function#getRes()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Res();

	/**
	 * Returns the meta object for the container reference '{@link atividadeC.Function#getPrograma <em>Programa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Programa</em>'.
	 * @see atividadeC.Function#getPrograma()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Programa();

	/**
	 * Returns the meta object for class '{@link atividadeC.Struct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct</em>'.
	 * @see atividadeC.Struct
	 * @generated
	 */
	EClass getStruct();

	/**
	 * Returns the meta object for the containment reference list '{@link atividadeC.Struct#getPrograma <em>Programa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programa</em>'.
	 * @see atividadeC.Struct#getPrograma()
	 * @see #getStruct()
	 * @generated
	 */
	EReference getStruct_Programa();

	/**
	 * Returns the meta object for the attribute '{@link atividadeC.Struct#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see atividadeC.Struct#getType()
	 * @see #getStruct()
	 * @generated
	 */
	EAttribute getStruct_Type();

	/**
	 * Returns the meta object for the attribute '{@link atividadeC.Struct#getRes <em>Res</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Res</em>'.
	 * @see atividadeC.Struct#getRes()
	 * @see #getStruct()
	 * @generated
	 */
	EAttribute getStruct_Res();

	/**
	 * Returns the meta object for class '{@link atividadeC.Main <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main</em>'.
	 * @see atividadeC.Main
	 * @generated
	 */
	EClass getMain();

	/**
	 * Returns the meta object for the attribute '{@link atividadeC.Main#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see atividadeC.Main#getType()
	 * @see #getMain()
	 * @generated
	 */
	EAttribute getMain_Type();

	/**
	 * Returns the meta object for the attribute '{@link atividadeC.Main#getRes <em>Res</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Res</em>'.
	 * @see atividadeC.Main#getRes()
	 * @see #getMain()
	 * @generated
	 */
	EAttribute getMain_Res();

	/**
	 * Returns the meta object for the container reference '{@link atividadeC.Main#getPrograma <em>Programa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Programa</em>'.
	 * @see atividadeC.Main#getPrograma()
	 * @see #getMain()
	 * @generated
	 */
	EReference getMain_Programa();

	/**
	 * Returns the meta object for class '{@link atividadeC.Biblioteca <em>Biblioteca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Biblioteca</em>'.
	 * @see atividadeC.Biblioteca
	 * @generated
	 */
	EClass getBiblioteca();

	/**
	 * Returns the meta object for the containment reference list '{@link atividadeC.Biblioteca#getPrograma <em>Programa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programa</em>'.
	 * @see atividadeC.Biblioteca#getPrograma()
	 * @see #getBiblioteca()
	 * @generated
	 */
	EReference getBiblioteca_Programa();

	/**
	 * Returns the meta object for the attribute '{@link atividadeC.Biblioteca#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library</em>'.
	 * @see atividadeC.Biblioteca#getLibrary()
	 * @see #getBiblioteca()
	 * @generated
	 */
	EAttribute getBiblioteca_Library();

	/**
	 * Returns the meta object for class '{@link atividadeC.Programa <em>Programa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programa</em>'.
	 * @see atividadeC.Programa
	 * @generated
	 */
	EClass getPrograma();

	/**
	 * Returns the meta object for the container reference '{@link atividadeC.Programa#getBiblioteca <em>Biblioteca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Biblioteca</em>'.
	 * @see atividadeC.Programa#getBiblioteca()
	 * @see #getPrograma()
	 * @generated
	 */
	EReference getPrograma_Biblioteca();

	/**
	 * Returns the meta object for the container reference '{@link atividadeC.Programa#getStruct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Struct</em>'.
	 * @see atividadeC.Programa#getStruct()
	 * @see #getPrograma()
	 * @generated
	 */
	EReference getPrograma_Struct();

	/**
	 * Returns the meta object for the containment reference list '{@link atividadeC.Programa#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function</em>'.
	 * @see atividadeC.Programa#getFunction()
	 * @see #getPrograma()
	 * @generated
	 */
	EReference getPrograma_Function();

	/**
	 * Returns the meta object for the containment reference '{@link atividadeC.Programa#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Main</em>'.
	 * @see atividadeC.Programa#getMain()
	 * @see #getPrograma()
	 * @generated
	 */
	EReference getPrograma_Main();

	/**
	 * Returns the meta object for the attribute '{@link atividadeC.Programa#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see atividadeC.Programa#getName()
	 * @see #getPrograma()
	 * @generated
	 */
	EAttribute getPrograma_Name();

	/**
	 * Returns the meta object for enum '{@link atividadeC.Lib <em>Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Lib</em>'.
	 * @see atividadeC.Lib
	 * @generated
	 */
	EEnum getLib();

	/**
	 * Returns the meta object for enum '{@link atividadeC.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see atividadeC.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the meta object for enum '{@link atividadeC.Reservada <em>Reservada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reservada</em>'.
	 * @see atividadeC.Reservada
	 * @generated
	 */
	EEnum getReservada();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AtividadeCFactory getAtividadeCFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link atividadeC.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atividadeC.impl.FunctionImpl
		 * @see atividadeC.impl.AtividadeCPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__TYPE = eINSTANCE.getFunction_Type();

		/**
		 * The meta object literal for the '<em><b>Res</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__RES = eINSTANCE.getFunction_Res();

		/**
		 * The meta object literal for the '<em><b>Programa</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__PROGRAMA = eINSTANCE.getFunction_Programa();

		/**
		 * The meta object literal for the '{@link atividadeC.impl.StructImpl <em>Struct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atividadeC.impl.StructImpl
		 * @see atividadeC.impl.AtividadeCPackageImpl#getStruct()
		 * @generated
		 */
		EClass STRUCT = eINSTANCE.getStruct();

		/**
		 * The meta object literal for the '<em><b>Programa</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT__PROGRAMA = eINSTANCE.getStruct_Programa();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCT__TYPE = eINSTANCE.getStruct_Type();

		/**
		 * The meta object literal for the '<em><b>Res</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCT__RES = eINSTANCE.getStruct_Res();

		/**
		 * The meta object literal for the '{@link atividadeC.impl.MainImpl <em>Main</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atividadeC.impl.MainImpl
		 * @see atividadeC.impl.AtividadeCPackageImpl#getMain()
		 * @generated
		 */
		EClass MAIN = eINSTANCE.getMain();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAIN__TYPE = eINSTANCE.getMain_Type();

		/**
		 * The meta object literal for the '<em><b>Res</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAIN__RES = eINSTANCE.getMain_Res();

		/**
		 * The meta object literal for the '<em><b>Programa</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN__PROGRAMA = eINSTANCE.getMain_Programa();

		/**
		 * The meta object literal for the '{@link atividadeC.impl.BibliotecaImpl <em>Biblioteca</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atividadeC.impl.BibliotecaImpl
		 * @see atividadeC.impl.AtividadeCPackageImpl#getBiblioteca()
		 * @generated
		 */
		EClass BIBLIOTECA = eINSTANCE.getBiblioteca();

		/**
		 * The meta object literal for the '<em><b>Programa</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIBLIOTECA__PROGRAMA = eINSTANCE.getBiblioteca_Programa();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIBLIOTECA__LIBRARY = eINSTANCE.getBiblioteca_Library();

		/**
		 * The meta object literal for the '{@link atividadeC.impl.ProgramaImpl <em>Programa</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atividadeC.impl.ProgramaImpl
		 * @see atividadeC.impl.AtividadeCPackageImpl#getPrograma()
		 * @generated
		 */
		EClass PROGRAMA = eINSTANCE.getPrograma();

		/**
		 * The meta object literal for the '<em><b>Biblioteca</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMA__BIBLIOTECA = eINSTANCE.getPrograma_Biblioteca();

		/**
		 * The meta object literal for the '<em><b>Struct</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMA__STRUCT = eINSTANCE.getPrograma_Struct();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMA__FUNCTION = eINSTANCE.getPrograma_Function();

		/**
		 * The meta object literal for the '<em><b>Main</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMA__MAIN = eINSTANCE.getPrograma_Main();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMA__NAME = eINSTANCE.getPrograma_Name();

		/**
		 * The meta object literal for the '{@link atividadeC.Lib <em>Lib</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atividadeC.Lib
		 * @see atividadeC.impl.AtividadeCPackageImpl#getLib()
		 * @generated
		 */
		EEnum LIB = eINSTANCE.getLib();

		/**
		 * The meta object literal for the '{@link atividadeC.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atividadeC.Type
		 * @see atividadeC.impl.AtividadeCPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link atividadeC.Reservada <em>Reservada</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atividadeC.Reservada
		 * @see atividadeC.impl.AtividadeCPackageImpl#getReservada()
		 * @generated
		 */
		EEnum RESERVADA = eINSTANCE.getReservada();

	}

} //AtividadeCPackage
