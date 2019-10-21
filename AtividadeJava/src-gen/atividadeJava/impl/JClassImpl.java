/**
 */
package atividadeJava.impl;

import atividadeJava.AtividadeJavaPackage;
import atividadeJava.JClass;
import atividadeJava.JField;
import atividadeJava.JMethod;
import atividadeJava.Vis;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link atividadeJava.impl.JClassImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link atividadeJava.impl.JClassImpl#getJfield <em>Jfield</em>}</li>
 *   <li>{@link atividadeJava.impl.JClassImpl#getJmethod <em>Jmethod</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JClassImpl extends JClassifierImpl implements JClass {
	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final Vis VISIBILITY_EDEFAULT = Vis.PUBLIC;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected Vis visibility = VISIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getJfield() <em>Jfield</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJfield()
	 * @generated
	 * @ordered
	 */
	protected EList<JField> jfield;

	/**
	 * The cached value of the '{@link #getJmethod() <em>Jmethod</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJmethod()
	 * @generated
	 * @ordered
	 */
	protected EList<JMethod> jmethod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtividadeJavaPackage.Literals.JCLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vis getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(Vis newVisibility) {
		Vis oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtividadeJavaPackage.JCLASS__VISIBILITY,
					oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JField> getJfield() {
		if (jfield == null) {
			jfield = new EObjectContainmentWithInverseEList<JField>(JField.class, this,
					AtividadeJavaPackage.JCLASS__JFIELD, AtividadeJavaPackage.JFIELD__JCLASS);
		}
		return jfield;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JMethod> getJmethod() {
		if (jmethod == null) {
			jmethod = new EObjectContainmentWithInverseEList<JMethod>(JMethod.class, this,
					AtividadeJavaPackage.JCLASS__JMETHOD, AtividadeJavaPackage.JMETHOD__JCLASS);
		}
		return jmethod;
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
		case AtividadeJavaPackage.JCLASS__JFIELD:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getJfield()).basicAdd(otherEnd, msgs);
		case AtividadeJavaPackage.JCLASS__JMETHOD:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getJmethod()).basicAdd(otherEnd, msgs);
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
		case AtividadeJavaPackage.JCLASS__JFIELD:
			return ((InternalEList<?>) getJfield()).basicRemove(otherEnd, msgs);
		case AtividadeJavaPackage.JCLASS__JMETHOD:
			return ((InternalEList<?>) getJmethod()).basicRemove(otherEnd, msgs);
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
		case AtividadeJavaPackage.JCLASS__VISIBILITY:
			return getVisibility();
		case AtividadeJavaPackage.JCLASS__JFIELD:
			return getJfield();
		case AtividadeJavaPackage.JCLASS__JMETHOD:
			return getJmethod();
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
		case AtividadeJavaPackage.JCLASS__VISIBILITY:
			setVisibility((Vis) newValue);
			return;
		case AtividadeJavaPackage.JCLASS__JFIELD:
			getJfield().clear();
			getJfield().addAll((Collection<? extends JField>) newValue);
			return;
		case AtividadeJavaPackage.JCLASS__JMETHOD:
			getJmethod().clear();
			getJmethod().addAll((Collection<? extends JMethod>) newValue);
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
		case AtividadeJavaPackage.JCLASS__VISIBILITY:
			setVisibility(VISIBILITY_EDEFAULT);
			return;
		case AtividadeJavaPackage.JCLASS__JFIELD:
			getJfield().clear();
			return;
		case AtividadeJavaPackage.JCLASS__JMETHOD:
			getJmethod().clear();
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
		case AtividadeJavaPackage.JCLASS__VISIBILITY:
			return visibility != VISIBILITY_EDEFAULT;
		case AtividadeJavaPackage.JCLASS__JFIELD:
			return jfield != null && !jfield.isEmpty();
		case AtividadeJavaPackage.JCLASS__JMETHOD:
			return jmethod != null && !jmethod.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (visibility: ");
		result.append(visibility);
		result.append(')');
		return result.toString();
	}

} //JClassImpl
