/**
 */
package atividadeJava;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see atividadeJava.AtividadeJavaPackage
 * @generated
 */
public interface AtividadeJavaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AtividadeJavaFactory eINSTANCE = atividadeJava.impl.AtividadeJavaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>JPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JPackage</em>'.
	 * @generated
	 */
	JPackage createJPackage();

	/**
	 * Returns a new object of class '<em>JElement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JElement</em>'.
	 * @generated
	 */
	JElement createJElement();

	/**
	 * Returns a new object of class '<em>JClassifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JClassifier</em>'.
	 * @generated
	 */
	JClassifier createJClassifier();

	/**
	 * Returns a new object of class '<em>JClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JClass</em>'.
	 * @generated
	 */
	JClass createJClass();

	/**
	 * Returns a new object of class '<em>JMethod</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JMethod</em>'.
	 * @generated
	 */
	JMethod createJMethod();

	/**
	 * Returns a new object of class '<em>JField</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JField</em>'.
	 * @generated
	 */
	JField createJField();

	/**
	 * Returns a new object of class '<em>JParameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JParameter</em>'.
	 * @generated
	 */
	JParameter createJParameter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AtividadeJavaPackage getAtividadeJavaPackage();

} //AtividadeJavaFactory
