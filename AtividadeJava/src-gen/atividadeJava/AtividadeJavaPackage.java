/**
 */
package atividadeJava;

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
 * @see atividadeJava.AtividadeJavaFactory
 * @model kind="package"
 * @generated
 */
public interface AtividadeJavaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "atividadeJava";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/atividadeJava";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "atividadeJava";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AtividadeJavaPackage eINSTANCE = atividadeJava.impl.AtividadeJavaPackageImpl.init();

	/**
	 * The meta object id for the '{@link atividadeJava.impl.JElementImpl <em>JElement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atividadeJava.impl.JElementImpl
	 * @see atividadeJava.impl.AtividadeJavaPackageImpl#getJElement()
	 * @generated
	 */
	int JELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Jpackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JELEMENT__JPACKAGE = 1;

	/**
	 * The number of structural features of the '<em>JElement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>JElement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link atividadeJava.impl.JPackageImpl <em>JPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atividadeJava.impl.JPackageImpl
	 * @see atividadeJava.impl.AtividadeJavaPackageImpl#getJPackage()
	 * @generated
	 */
	int JPACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPACKAGE__NAME = JELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Jpackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPACKAGE__JPACKAGE = JELEMENT__JPACKAGE;

	/**
	 * The feature id for the '<em><b>Jelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPACKAGE__JELEMENT = JELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>JPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPACKAGE_FEATURE_COUNT = JELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>JPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPACKAGE_OPERATION_COUNT = JELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link atividadeJava.impl.JClassifierImpl <em>JClassifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atividadeJava.impl.JClassifierImpl
	 * @see atividadeJava.impl.AtividadeJavaPackageImpl#getJClassifier()
	 * @generated
	 */
	int JCLASSIFIER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASSIFIER__NAME = JELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Jpackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASSIFIER__JPACKAGE = JELEMENT__JPACKAGE;

	/**
	 * The number of structural features of the '<em>JClassifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASSIFIER_FEATURE_COUNT = JELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>JClassifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASSIFIER_OPERATION_COUNT = JELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link atividadeJava.impl.JClassImpl <em>JClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atividadeJava.impl.JClassImpl
	 * @see atividadeJava.impl.AtividadeJavaPackageImpl#getJClass()
	 * @generated
	 */
	int JCLASS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__NAME = JCLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Jpackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__JPACKAGE = JCLASSIFIER__JPACKAGE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__VISIBILITY = JCLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Jfield</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__JFIELD = JCLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Jmethod</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__JMETHOD = JCLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>JClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS_FEATURE_COUNT = JCLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>JClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS_OPERATION_COUNT = JCLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link atividadeJava.JInterface <em>JInterface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atividadeJava.JInterface
	 * @see atividadeJava.impl.AtividadeJavaPackageImpl#getJInterface()
	 * @generated
	 */
	int JINTERFACE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINTERFACE__NAME = JCLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Jpackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINTERFACE__JPACKAGE = JCLASSIFIER__JPACKAGE;

	/**
	 * The number of structural features of the '<em>JInterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINTERFACE_FEATURE_COUNT = JCLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>JInterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINTERFACE_OPERATION_COUNT = JCLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link atividadeJava.impl.JMethodImpl <em>JMethod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atividadeJava.impl.JMethodImpl
	 * @see atividadeJava.impl.AtividadeJavaPackageImpl#getJMethod()
	 * @generated
	 */
	int JMETHOD = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD__NAME = JELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Jpackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD__JPACKAGE = JELEMENT__JPACKAGE;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD__IS_ABSTRACT = JELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Jclass</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD__JCLASS = JELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Jparameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD__JPARAMETER = JELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD__VISIBILITY = JELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>JMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD_FEATURE_COUNT = JELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>JMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD_OPERATION_COUNT = JELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link atividadeJava.impl.JFieldImpl <em>JField</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atividadeJava.impl.JFieldImpl
	 * @see atividadeJava.impl.AtividadeJavaPackageImpl#getJField()
	 * @generated
	 */
	int JFIELD = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIELD__NAME = JELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Jpackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIELD__JPACKAGE = JELEMENT__JPACKAGE;

	/**
	 * The feature id for the '<em><b>Jclass</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIELD__JCLASS = JELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIELD__VISIBILITY = JELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>JField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIELD_FEATURE_COUNT = JELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>JField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIELD_OPERATION_COUNT = JELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link atividadeJava.impl.JParameterImpl <em>JParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atividadeJava.impl.JParameterImpl
	 * @see atividadeJava.impl.AtividadeJavaPackageImpl#getJParameter()
	 * @generated
	 */
	int JPARAMETER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER__NAME = JELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Jpackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER__JPACKAGE = JELEMENT__JPACKAGE;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER__DIRECTION = JELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Jmethod</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER__JMETHOD = JELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>JParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER_FEATURE_COUNT = JELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>JParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER_OPERATION_COUNT = JELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link atividadeJava.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atividadeJava.Type
	 * @see atividadeJava.impl.AtividadeJavaPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 8;

	/**
	 * The meta object id for the '{@link atividadeJava.Vis <em>Vis</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atividadeJava.Vis
	 * @see atividadeJava.impl.AtividadeJavaPackageImpl#getVis()
	 * @generated
	 */
	int VIS = 9;

	/**
	 * The meta object id for the '{@link atividadeJava.Direction <em>Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atividadeJava.Direction
	 * @see atividadeJava.impl.AtividadeJavaPackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 10;

	/**
	 * Returns the meta object for class '{@link atividadeJava.JPackage <em>JPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JPackage</em>'.
	 * @see atividadeJava.JPackage
	 * @generated
	 */
	EClass getJPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link atividadeJava.JPackage#getJelement <em>Jelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jelement</em>'.
	 * @see atividadeJava.JPackage#getJelement()
	 * @see #getJPackage()
	 * @generated
	 */
	EReference getJPackage_Jelement();

	/**
	 * Returns the meta object for class '{@link atividadeJava.JElement <em>JElement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JElement</em>'.
	 * @see atividadeJava.JElement
	 * @generated
	 */
	EClass getJElement();

	/**
	 * Returns the meta object for the attribute '{@link atividadeJava.JElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see atividadeJava.JElement#getName()
	 * @see #getJElement()
	 * @generated
	 */
	EAttribute getJElement_Name();

	/**
	 * Returns the meta object for the container reference '{@link atividadeJava.JElement#getJpackage <em>Jpackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Jpackage</em>'.
	 * @see atividadeJava.JElement#getJpackage()
	 * @see #getJElement()
	 * @generated
	 */
	EReference getJElement_Jpackage();

	/**
	 * Returns the meta object for class '{@link atividadeJava.JClassifier <em>JClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JClassifier</em>'.
	 * @see atividadeJava.JClassifier
	 * @generated
	 */
	EClass getJClassifier();

	/**
	 * Returns the meta object for class '{@link atividadeJava.JClass <em>JClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JClass</em>'.
	 * @see atividadeJava.JClass
	 * @generated
	 */
	EClass getJClass();

	/**
	 * Returns the meta object for the attribute '{@link atividadeJava.JClass#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see atividadeJava.JClass#getVisibility()
	 * @see #getJClass()
	 * @generated
	 */
	EAttribute getJClass_Visibility();

	/**
	 * Returns the meta object for the containment reference list '{@link atividadeJava.JClass#getJfield <em>Jfield</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jfield</em>'.
	 * @see atividadeJava.JClass#getJfield()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_Jfield();

	/**
	 * Returns the meta object for the containment reference list '{@link atividadeJava.JClass#getJmethod <em>Jmethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jmethod</em>'.
	 * @see atividadeJava.JClass#getJmethod()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_Jmethod();

	/**
	 * Returns the meta object for class '{@link atividadeJava.JInterface <em>JInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JInterface</em>'.
	 * @see atividadeJava.JInterface
	 * @generated
	 */
	EClass getJInterface();

	/**
	 * Returns the meta object for class '{@link atividadeJava.JMethod <em>JMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JMethod</em>'.
	 * @see atividadeJava.JMethod
	 * @generated
	 */
	EClass getJMethod();

	/**
	 * Returns the meta object for the attribute '{@link atividadeJava.JMethod#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see atividadeJava.JMethod#isIsAbstract()
	 * @see #getJMethod()
	 * @generated
	 */
	EAttribute getJMethod_IsAbstract();

	/**
	 * Returns the meta object for the container reference '{@link atividadeJava.JMethod#getJclass <em>Jclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Jclass</em>'.
	 * @see atividadeJava.JMethod#getJclass()
	 * @see #getJMethod()
	 * @generated
	 */
	EReference getJMethod_Jclass();

	/**
	 * Returns the meta object for the containment reference list '{@link atividadeJava.JMethod#getJparameter <em>Jparameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jparameter</em>'.
	 * @see atividadeJava.JMethod#getJparameter()
	 * @see #getJMethod()
	 * @generated
	 */
	EReference getJMethod_Jparameter();

	/**
	 * Returns the meta object for the attribute '{@link atividadeJava.JMethod#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see atividadeJava.JMethod#getVisibility()
	 * @see #getJMethod()
	 * @generated
	 */
	EAttribute getJMethod_Visibility();

	/**
	 * Returns the meta object for class '{@link atividadeJava.JField <em>JField</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JField</em>'.
	 * @see atividadeJava.JField
	 * @generated
	 */
	EClass getJField();

	/**
	 * Returns the meta object for the container reference '{@link atividadeJava.JField#getJclass <em>Jclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Jclass</em>'.
	 * @see atividadeJava.JField#getJclass()
	 * @see #getJField()
	 * @generated
	 */
	EReference getJField_Jclass();

	/**
	 * Returns the meta object for the attribute '{@link atividadeJava.JField#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see atividadeJava.JField#getVisibility()
	 * @see #getJField()
	 * @generated
	 */
	EAttribute getJField_Visibility();

	/**
	 * Returns the meta object for class '{@link atividadeJava.JParameter <em>JParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JParameter</em>'.
	 * @see atividadeJava.JParameter
	 * @generated
	 */
	EClass getJParameter();

	/**
	 * Returns the meta object for the attribute '{@link atividadeJava.JParameter#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see atividadeJava.JParameter#getDirection()
	 * @see #getJParameter()
	 * @generated
	 */
	EAttribute getJParameter_Direction();

	/**
	 * Returns the meta object for the container reference '{@link atividadeJava.JParameter#getJmethod <em>Jmethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Jmethod</em>'.
	 * @see atividadeJava.JParameter#getJmethod()
	 * @see #getJParameter()
	 * @generated
	 */
	EReference getJParameter_Jmethod();

	/**
	 * Returns the meta object for enum '{@link atividadeJava.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see atividadeJava.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the meta object for enum '{@link atividadeJava.Vis <em>Vis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vis</em>'.
	 * @see atividadeJava.Vis
	 * @generated
	 */
	EEnum getVis();

	/**
	 * Returns the meta object for enum '{@link atividadeJava.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction</em>'.
	 * @see atividadeJava.Direction
	 * @generated
	 */
	EEnum getDirection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AtividadeJavaFactory getAtividadeJavaFactory();

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
		 * The meta object literal for the '{@link atividadeJava.impl.JPackageImpl <em>JPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atividadeJava.impl.JPackageImpl
		 * @see atividadeJava.impl.AtividadeJavaPackageImpl#getJPackage()
		 * @generated
		 */
		EClass JPACKAGE = eINSTANCE.getJPackage();

		/**
		 * The meta object literal for the '<em><b>Jelement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JPACKAGE__JELEMENT = eINSTANCE.getJPackage_Jelement();

		/**
		 * The meta object literal for the '{@link atividadeJava.impl.JElementImpl <em>JElement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atividadeJava.impl.JElementImpl
		 * @see atividadeJava.impl.AtividadeJavaPackageImpl#getJElement()
		 * @generated
		 */
		EClass JELEMENT = eINSTANCE.getJElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JELEMENT__NAME = eINSTANCE.getJElement_Name();

		/**
		 * The meta object literal for the '<em><b>Jpackage</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JELEMENT__JPACKAGE = eINSTANCE.getJElement_Jpackage();

		/**
		 * The meta object literal for the '{@link atividadeJava.impl.JClassifierImpl <em>JClassifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atividadeJava.impl.JClassifierImpl
		 * @see atividadeJava.impl.AtividadeJavaPackageImpl#getJClassifier()
		 * @generated
		 */
		EClass JCLASSIFIER = eINSTANCE.getJClassifier();

		/**
		 * The meta object literal for the '{@link atividadeJava.impl.JClassImpl <em>JClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atividadeJava.impl.JClassImpl
		 * @see atividadeJava.impl.AtividadeJavaPackageImpl#getJClass()
		 * @generated
		 */
		EClass JCLASS = eINSTANCE.getJClass();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JCLASS__VISIBILITY = eINSTANCE.getJClass_Visibility();

		/**
		 * The meta object literal for the '<em><b>Jfield</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__JFIELD = eINSTANCE.getJClass_Jfield();

		/**
		 * The meta object literal for the '<em><b>Jmethod</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__JMETHOD = eINSTANCE.getJClass_Jmethod();

		/**
		 * The meta object literal for the '{@link atividadeJava.JInterface <em>JInterface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atividadeJava.JInterface
		 * @see atividadeJava.impl.AtividadeJavaPackageImpl#getJInterface()
		 * @generated
		 */
		EClass JINTERFACE = eINSTANCE.getJInterface();

		/**
		 * The meta object literal for the '{@link atividadeJava.impl.JMethodImpl <em>JMethod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atividadeJava.impl.JMethodImpl
		 * @see atividadeJava.impl.AtividadeJavaPackageImpl#getJMethod()
		 * @generated
		 */
		EClass JMETHOD = eINSTANCE.getJMethod();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JMETHOD__IS_ABSTRACT = eINSTANCE.getJMethod_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Jclass</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JMETHOD__JCLASS = eINSTANCE.getJMethod_Jclass();

		/**
		 * The meta object literal for the '<em><b>Jparameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JMETHOD__JPARAMETER = eINSTANCE.getJMethod_Jparameter();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JMETHOD__VISIBILITY = eINSTANCE.getJMethod_Visibility();

		/**
		 * The meta object literal for the '{@link atividadeJava.impl.JFieldImpl <em>JField</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atividadeJava.impl.JFieldImpl
		 * @see atividadeJava.impl.AtividadeJavaPackageImpl#getJField()
		 * @generated
		 */
		EClass JFIELD = eINSTANCE.getJField();

		/**
		 * The meta object literal for the '<em><b>Jclass</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JFIELD__JCLASS = eINSTANCE.getJField_Jclass();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JFIELD__VISIBILITY = eINSTANCE.getJField_Visibility();

		/**
		 * The meta object literal for the '{@link atividadeJava.impl.JParameterImpl <em>JParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atividadeJava.impl.JParameterImpl
		 * @see atividadeJava.impl.AtividadeJavaPackageImpl#getJParameter()
		 * @generated
		 */
		EClass JPARAMETER = eINSTANCE.getJParameter();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JPARAMETER__DIRECTION = eINSTANCE.getJParameter_Direction();

		/**
		 * The meta object literal for the '<em><b>Jmethod</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JPARAMETER__JMETHOD = eINSTANCE.getJParameter_Jmethod();

		/**
		 * The meta object literal for the '{@link atividadeJava.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atividadeJava.Type
		 * @see atividadeJava.impl.AtividadeJavaPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link atividadeJava.Vis <em>Vis</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atividadeJava.Vis
		 * @see atividadeJava.impl.AtividadeJavaPackageImpl#getVis()
		 * @generated
		 */
		EEnum VIS = eINSTANCE.getVis();

		/**
		 * The meta object literal for the '{@link atividadeJava.Direction <em>Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atividadeJava.Direction
		 * @see atividadeJava.impl.AtividadeJavaPackageImpl#getDirection()
		 * @generated
		 */
		EEnum DIRECTION = eINSTANCE.getDirection();

	}

} //AtividadeJavaPackage
