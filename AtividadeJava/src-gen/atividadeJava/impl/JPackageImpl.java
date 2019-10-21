/**
 */
package atividadeJava.impl;

import atividadeJava.AtividadeJavaPackage;
import atividadeJava.JElement;
import atividadeJava.JPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JPackage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link atividadeJava.impl.JPackageImpl#getJelement <em>Jelement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JPackageImpl extends JElementImpl implements JPackage {
	/**
	 * The cached value of the '{@link #getJelement() <em>Jelement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJelement()
	 * @generated
	 * @ordered
	 */
	protected EList<JElement> jelement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtividadeJavaPackage.Literals.JPACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JElement> getJelement() {
		if (jelement == null) {
			jelement = new EObjectContainmentWithInverseEList<JElement>(JElement.class, this,
					AtividadeJavaPackage.JPACKAGE__JELEMENT, AtividadeJavaPackage.JELEMENT__JPACKAGE);
		}
		return jelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AtividadeJavaPackage.JPACKAGE__JELEMENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getJelement()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AtividadeJavaPackage.JPACKAGE__JELEMENT:
			return ((InternalEList<?>) getJelement()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AtividadeJavaPackage.JPACKAGE__JELEMENT:
			return getJelement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AtividadeJavaPackage.JPACKAGE__JELEMENT:
			getJelement().clear();
			getJelement().addAll((Collection<? extends JElement>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case AtividadeJavaPackage.JPACKAGE__JELEMENT:
			getJelement().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case AtividadeJavaPackage.JPACKAGE__JELEMENT:
			return jelement != null && !jelement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //JPackageImpl
