/**
 */
package atividadeJava.impl;

import atividadeJava.AtividadeJavaFactory;
import atividadeJava.AtividadeJavaPackage;
import atividadeJava.Direction;
import atividadeJava.JClass;
import atividadeJava.JClassifier;
import atividadeJava.JElement;
import atividadeJava.JField;
import atividadeJava.JInterface;
import atividadeJava.JMethod;
import atividadeJava.JPackage;
import atividadeJava.JParameter;
import atividadeJava.Type;
import atividadeJava.Vis;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtividadeJavaPackageImpl extends EPackageImpl implements AtividadeJavaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see atividadeJava.AtividadeJavaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AtividadeJavaPackageImpl() {
		super(eNS_URI, AtividadeJavaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AtividadeJavaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AtividadeJavaPackage init() {
		if (isInited)
			return (AtividadeJavaPackage) EPackage.Registry.INSTANCE.getEPackage(AtividadeJavaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAtividadeJavaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AtividadeJavaPackageImpl theAtividadeJavaPackage = registeredAtividadeJavaPackage instanceof AtividadeJavaPackageImpl
				? (AtividadeJavaPackageImpl) registeredAtividadeJavaPackage
				: new AtividadeJavaPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAtividadeJavaPackage.createPackageContents();

		// Initialize created meta-data
		theAtividadeJavaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAtividadeJavaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AtividadeJavaPackage.eNS_URI, theAtividadeJavaPackage);
		return theAtividadeJavaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJPackage() {
		return jPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJPackage_Jelement() {
		return (EReference) jPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJElement() {
		return jElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJElement_Name() {
		return (EAttribute) jElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJElement_Jpackage() {
		return (EReference) jElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJClassifier() {
		return jClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJClass() {
		return jClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJClass_Visibility() {
		return (EAttribute) jClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJClass_Jfield() {
		return (EReference) jClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJClass_Jmethod() {
		return (EReference) jClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJInterface() {
		return jInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJMethod() {
		return jMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJMethod_IsAbstract() {
		return (EAttribute) jMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJMethod_Jclass() {
		return (EReference) jMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJMethod_Jparameter() {
		return (EReference) jMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJMethod_Visibility() {
		return (EAttribute) jMethodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJField() {
		return jFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJField_Jclass() {
		return (EReference) jFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJField_Visibility() {
		return (EAttribute) jFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJParameter() {
		return jParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJParameter_Direction() {
		return (EAttribute) jParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJParameter_Jmethod() {
		return (EReference) jParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getType() {
		return typeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVis() {
		return visEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirection() {
		return directionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtividadeJavaFactory getAtividadeJavaFactory() {
		return (AtividadeJavaFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		jPackageEClass = createEClass(JPACKAGE);
		createEReference(jPackageEClass, JPACKAGE__JELEMENT);

		jElementEClass = createEClass(JELEMENT);
		createEAttribute(jElementEClass, JELEMENT__NAME);
		createEReference(jElementEClass, JELEMENT__JPACKAGE);

		jClassifierEClass = createEClass(JCLASSIFIER);

		jClassEClass = createEClass(JCLASS);
		createEAttribute(jClassEClass, JCLASS__VISIBILITY);
		createEReference(jClassEClass, JCLASS__JFIELD);
		createEReference(jClassEClass, JCLASS__JMETHOD);

		jInterfaceEClass = createEClass(JINTERFACE);

		jMethodEClass = createEClass(JMETHOD);
		createEAttribute(jMethodEClass, JMETHOD__IS_ABSTRACT);
		createEReference(jMethodEClass, JMETHOD__JCLASS);
		createEReference(jMethodEClass, JMETHOD__JPARAMETER);
		createEAttribute(jMethodEClass, JMETHOD__VISIBILITY);

		jFieldEClass = createEClass(JFIELD);
		createEReference(jFieldEClass, JFIELD__JCLASS);
		createEAttribute(jFieldEClass, JFIELD__VISIBILITY);

		jParameterEClass = createEClass(JPARAMETER);
		createEAttribute(jParameterEClass, JPARAMETER__DIRECTION);
		createEReference(jParameterEClass, JPARAMETER__JMETHOD);

		// Create enums
		typeEEnum = createEEnum(TYPE);
		visEEnum = createEEnum(VIS);
		directionEEnum = createEEnum(DIRECTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		jPackageEClass.getESuperTypes().add(this.getJElement());
		jClassifierEClass.getESuperTypes().add(this.getJElement());
		jClassEClass.getESuperTypes().add(this.getJClassifier());
		jInterfaceEClass.getESuperTypes().add(this.getJClassifier());
		jMethodEClass.getESuperTypes().add(this.getJElement());
		jFieldEClass.getESuperTypes().add(this.getJElement());
		jParameterEClass.getESuperTypes().add(this.getJElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(jPackageEClass, JPackage.class, "JPackage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJPackage_Jelement(), this.getJElement(), this.getJElement_Jpackage(), "jelement", null, 0, -1,
				JPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jElementEClass, JElement.class, "JElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, JElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJElement_Jpackage(), this.getJPackage(), this.getJPackage_Jelement(), "jpackage", null, 0, 1,
				JElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jClassifierEClass, JClassifier.class, "JClassifier", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(jClassEClass, JClass.class, "JClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJClass_Visibility(), this.getVis(), "visibility", null, 0, 1, JClass.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJClass_Jfield(), this.getJField(), this.getJField_Jclass(), "jfield", null, 0, -1,
				JClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJClass_Jmethod(), this.getJMethod(), this.getJMethod_Jclass(), "jmethod", null, 0, -1,
				JClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jInterfaceEClass, JInterface.class, "JInterface", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(jMethodEClass, JMethod.class, "JMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJMethod_IsAbstract(), theXMLTypePackage.getBoolean(), "isAbstract", null, 0, 1, JMethod.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJMethod_Jclass(), this.getJClass(), this.getJClass_Jmethod(), "jclass", null, 0, 1,
				JMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJMethod_Jparameter(), this.getJParameter(), this.getJParameter_Jmethod(), "jparameter", null,
				0, -1, JMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJMethod_Visibility(), this.getVis(), "visibility", null, 0, 1, JMethod.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jFieldEClass, JField.class, "JField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJField_Jclass(), this.getJClass(), this.getJClass_Jfield(), "jclass", null, 0, 1,
				JField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJField_Visibility(), this.getVis(), "visibility", null, 0, 1, JField.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jParameterEClass, JParameter.class, "JParameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJParameter_Direction(), this.getDirection(), "direction", null, 0, 1, JParameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJParameter_Jmethod(), this.getJMethod(), this.getJMethod_Jparameter(), "jmethod", null, 0, 1,
				JParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeEEnum, Type.class, "Type");
		addEEnumLiteral(typeEEnum, Type.STRING);
		addEEnumLiteral(typeEEnum, Type.BOOLEAN);
		addEEnumLiteral(typeEEnum, Type.INT);
		addEEnumLiteral(typeEEnum, Type.FLOAT);

		initEEnum(visEEnum, Vis.class, "Vis");
		addEEnumLiteral(visEEnum, Vis.PUBLIC);
		addEEnumLiteral(visEEnum, Vis.PRIVATE);
		addEEnumLiteral(visEEnum, Vis.PROTECTED);

		initEEnum(directionEEnum, Direction.class, "Direction");
		addEEnumLiteral(directionEEnum, Direction.INPUT);
		addEEnumLiteral(directionEEnum, Direction.OUTPUT);
		addEEnumLiteral(directionEEnum, Direction.INPUT_OUTPUT);
		addEEnumLiteral(directionEEnum, Direction.RETURN);

		// Create resource
		createResource(eNS_URI);
	}

} //AtividadeJavaPackageImpl
