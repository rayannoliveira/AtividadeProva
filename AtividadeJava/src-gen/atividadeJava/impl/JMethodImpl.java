/**
 */
package atividadeJava.impl;

import atividadeJava.AtividadeJavaPackage;
import atividadeJava.JClass;
import atividadeJava.JMethod;
import atividadeJava.JParameter;

import atividadeJava.Vis;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JMethod</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link atividadeJava.impl.JMethodImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link atividadeJava.impl.JMethodImpl#getJclass <em>Jclass</em>}</li>
 *   <li>{@link atividadeJava.impl.JMethodImpl#getJparameter <em>Jparameter</em>}</li>
 *   <li>{@link atividadeJava.impl.JMethodImpl#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JMethodImpl extends JElementImpl implements JMethod {
	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getJparameter() <em>Jparameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJparameter()
	 * @generated
	 * @ordered
	 */
	protected EList<JParameter> jparameter;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtividadeJavaPackage.Literals.JMETHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtividadeJavaPackage.JMETHOD__IS_ABSTRACT,
					oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JClass getJclass() {
		if (eContainerFeatureID() != AtividadeJavaPackage.JMETHOD__JCLASS)
			return null;
		return (JClass) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJclass(JClass newJclass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newJclass, AtividadeJavaPackage.JMETHOD__JCLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJclass(JClass newJclass) {
		if (newJclass != eInternalContainer()
				|| (eContainerFeatureID() != AtividadeJavaPackage.JMETHOD__JCLASS && newJclass != null)) {
			if (EcoreUtil.isAncestor(this, newJclass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newJclass != null)
				msgs = ((InternalEObject) newJclass).eInverseAdd(this, AtividadeJavaPackage.JCLASS__JMETHOD,
						JClass.class, msgs);
			msgs = basicSetJclass(newJclass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtividadeJavaPackage.JMETHOD__JCLASS, newJclass,
					newJclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JParameter> getJparameter() {
		if (jparameter == null) {
			jparameter = new EObjectContainmentWithInverseEList<JParameter>(JParameter.class, this,
					AtividadeJavaPackage.JMETHOD__JPARAMETER, AtividadeJavaPackage.JPARAMETER__JMETHOD);
		}
		return jparameter;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AtividadeJavaPackage.JMETHOD__VISIBILITY,
					oldVisibility, visibility));
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
		case AtividadeJavaPackage.JMETHOD__JCLASS:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetJclass((JClass) otherEnd, msgs);
		case AtividadeJavaPackage.JMETHOD__JPARAMETER:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getJparameter()).basicAdd(otherEnd, msgs);
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
		case AtividadeJavaPackage.JMETHOD__JCLASS:
			return basicSetJclass(null, msgs);
		case AtividadeJavaPackage.JMETHOD__JPARAMETER:
			return ((InternalEList<?>) getJparameter()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case AtividadeJavaPackage.JMETHOD__JCLASS:
			return eInternalContainer().eInverseRemove(this, AtividadeJavaPackage.JCLASS__JMETHOD, JClass.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AtividadeJavaPackage.JMETHOD__IS_ABSTRACT:
			return isIsAbstract();
		case AtividadeJavaPackage.JMETHOD__JCLASS:
			return getJclass();
		case AtividadeJavaPackage.JMETHOD__JPARAMETER:
			return getJparameter();
		case AtividadeJavaPackage.JMETHOD__VISIBILITY:
			return getVisibility();
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
		case AtividadeJavaPackage.JMETHOD__IS_ABSTRACT:
			setIsAbstract((Boolean) newValue);
			return;
		case AtividadeJavaPackage.JMETHOD__JCLASS:
			setJclass((JClass) newValue);
			return;
		case AtividadeJavaPackage.JMETHOD__JPARAMETER:
			getJparameter().clear();
			getJparameter().addAll((Collection<? extends JParameter>) newValue);
			return;
		case AtividadeJavaPackage.JMETHOD__VISIBILITY:
			setVisibility((Vis) newValue);
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
		case AtividadeJavaPackage.JMETHOD__IS_ABSTRACT:
			setIsAbstract(IS_ABSTRACT_EDEFAULT);
			return;
		case AtividadeJavaPackage.JMETHOD__JCLASS:
			setJclass((JClass) null);
			return;
		case AtividadeJavaPackage.JMETHOD__JPARAMETER:
			getJparameter().clear();
			return;
		case AtividadeJavaPackage.JMETHOD__VISIBILITY:
			setVisibility(VISIBILITY_EDEFAULT);
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
		case AtividadeJavaPackage.JMETHOD__IS_ABSTRACT:
			return isAbstract != IS_ABSTRACT_EDEFAULT;
		case AtividadeJavaPackage.JMETHOD__JCLASS:
			return getJclass() != null;
		case AtividadeJavaPackage.JMETHOD__JPARAMETER:
			return jparameter != null && !jparameter.isEmpty();
		case AtividadeJavaPackage.JMETHOD__VISIBILITY:
			return visibility != VISIBILITY_EDEFAULT;
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
		result.append(" (isAbstract: ");
		result.append(isAbstract);
		result.append(", visibility: ");
		result.append(visibility);
		result.append(')');
		return result.toString();
	}

} //JMethodImpl
