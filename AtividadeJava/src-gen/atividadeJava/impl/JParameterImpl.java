/**
 */
package atividadeJava.impl;

import atividadeJava.AtividadeJavaPackage;
import atividadeJava.Direction;
import atividadeJava.JMethod;
import atividadeJava.JParameter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JParameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link atividadeJava.impl.JParameterImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link atividadeJava.impl.JParameterImpl#getJmethod <em>Jmethod</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JParameterImpl extends JElementImpl implements JParameter {
	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final Direction DIRECTION_EDEFAULT = Direction.INPUT;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected Direction direction = DIRECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtividadeJavaPackage.Literals.JPARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(Direction newDirection) {
		Direction oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtividadeJavaPackage.JPARAMETER__DIRECTION,
					oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JMethod getJmethod() {
		if (eContainerFeatureID() != AtividadeJavaPackage.JPARAMETER__JMETHOD)
			return null;
		return (JMethod) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJmethod(JMethod newJmethod, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newJmethod, AtividadeJavaPackage.JPARAMETER__JMETHOD, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJmethod(JMethod newJmethod) {
		if (newJmethod != eInternalContainer()
				|| (eContainerFeatureID() != AtividadeJavaPackage.JPARAMETER__JMETHOD && newJmethod != null)) {
			if (EcoreUtil.isAncestor(this, newJmethod))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newJmethod != null)
				msgs = ((InternalEObject) newJmethod).eInverseAdd(this, AtividadeJavaPackage.JMETHOD__JPARAMETER,
						JMethod.class, msgs);
			msgs = basicSetJmethod(newJmethod, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtividadeJavaPackage.JPARAMETER__JMETHOD, newJmethod,
					newJmethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AtividadeJavaPackage.JPARAMETER__JMETHOD:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetJmethod((JMethod) otherEnd, msgs);
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
		case AtividadeJavaPackage.JPARAMETER__JMETHOD:
			return basicSetJmethod(null, msgs);
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
		case AtividadeJavaPackage.JPARAMETER__JMETHOD:
			return eInternalContainer().eInverseRemove(this, AtividadeJavaPackage.JMETHOD__JPARAMETER, JMethod.class,
					msgs);
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
		case AtividadeJavaPackage.JPARAMETER__DIRECTION:
			return getDirection();
		case AtividadeJavaPackage.JPARAMETER__JMETHOD:
			return getJmethod();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AtividadeJavaPackage.JPARAMETER__DIRECTION:
			setDirection((Direction) newValue);
			return;
		case AtividadeJavaPackage.JPARAMETER__JMETHOD:
			setJmethod((JMethod) newValue);
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
		case AtividadeJavaPackage.JPARAMETER__DIRECTION:
			setDirection(DIRECTION_EDEFAULT);
			return;
		case AtividadeJavaPackage.JPARAMETER__JMETHOD:
			setJmethod((JMethod) null);
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
		case AtividadeJavaPackage.JPARAMETER__DIRECTION:
			return direction != DIRECTION_EDEFAULT;
		case AtividadeJavaPackage.JPARAMETER__JMETHOD:
			return getJmethod() != null;
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
		result.append(" (direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //JParameterImpl
