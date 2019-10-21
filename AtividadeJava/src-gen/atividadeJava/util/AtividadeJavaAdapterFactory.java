/**
 */
package atividadeJava.util;

import atividadeJava.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see atividadeJava.AtividadeJavaPackage
 * @generated
 */
public class AtividadeJavaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AtividadeJavaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtividadeJavaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AtividadeJavaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtividadeJavaSwitch<Adapter> modelSwitch = new AtividadeJavaSwitch<Adapter>() {
		@Override
		public Adapter caseJPackage(JPackage object) {
			return createJPackageAdapter();
		}

		@Override
		public Adapter caseJElement(JElement object) {
			return createJElementAdapter();
		}

		@Override
		public Adapter caseJClassifier(JClassifier object) {
			return createJClassifierAdapter();
		}

		@Override
		public Adapter caseJClass(JClass object) {
			return createJClassAdapter();
		}

		@Override
		public Adapter caseJInterface(JInterface object) {
			return createJInterfaceAdapter();
		}

		@Override
		public Adapter caseJMethod(JMethod object) {
			return createJMethodAdapter();
		}

		@Override
		public Adapter caseJField(JField object) {
			return createJFieldAdapter();
		}

		@Override
		public Adapter caseJParameter(JParameter object) {
			return createJParameterAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link atividadeJava.JPackage <em>JPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atividadeJava.JPackage
	 * @generated
	 */
	public Adapter createJPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atividadeJava.JElement <em>JElement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atividadeJava.JElement
	 * @generated
	 */
	public Adapter createJElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atividadeJava.JClassifier <em>JClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atividadeJava.JClassifier
	 * @generated
	 */
	public Adapter createJClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atividadeJava.JClass <em>JClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atividadeJava.JClass
	 * @generated
	 */
	public Adapter createJClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atividadeJava.JInterface <em>JInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atividadeJava.JInterface
	 * @generated
	 */
	public Adapter createJInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atividadeJava.JMethod <em>JMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atividadeJava.JMethod
	 * @generated
	 */
	public Adapter createJMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atividadeJava.JField <em>JField</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atividadeJava.JField
	 * @generated
	 */
	public Adapter createJFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atividadeJava.JParameter <em>JParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atividadeJava.JParameter
	 * @generated
	 */
	public Adapter createJParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AtividadeJavaAdapterFactory
