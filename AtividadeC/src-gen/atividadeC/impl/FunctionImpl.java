/**
 */
package atividadeC.impl;

import atividadeC.AtividadeCPackage;
import atividadeC.Function;
import atividadeC.Programa;
import atividadeC.Reservada;
import atividadeC.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link atividadeC.impl.FunctionImpl#getType <em>Type</em>}</li>
 *   <li>{@link atividadeC.impl.FunctionImpl#getRes <em>Res</em>}</li>
 *   <li>{@link atividadeC.impl.FunctionImpl#getPrograma <em>Programa</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends MinimalEObjectImpl.Container implements Function {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Type TYPE_EDEFAULT = Type.INT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRes() <em>Res</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRes()
	 * @generated
	 * @ordered
	 */
	protected static final Reservada RES_EDEFAULT = Reservada.PRINTF;

	/**
	 * The cached value of the '{@link #getRes() <em>Res</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRes()
	 * @generated
	 * @ordered
	 */
	protected Reservada res = RES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtividadeCPackage.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtividadeCPackage.FUNCTION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservada getRes() {
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRes(Reservada newRes) {
		Reservada oldRes = res;
		res = newRes == null ? RES_EDEFAULT : newRes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtividadeCPackage.FUNCTION__RES, oldRes, res));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Programa getPrograma() {
		if (eContainerFeatureID() != AtividadeCPackage.FUNCTION__PROGRAMA)
			return null;
		return (Programa) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrograma(Programa newPrograma, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newPrograma, AtividadeCPackage.FUNCTION__PROGRAMA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrograma(Programa newPrograma) {
		if (newPrograma != eInternalContainer()
				|| (eContainerFeatureID() != AtividadeCPackage.FUNCTION__PROGRAMA && newPrograma != null)) {
			if (EcoreUtil.isAncestor(this, newPrograma))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPrograma != null)
				msgs = ((InternalEObject) newPrograma).eInverseAdd(this, AtividadeCPackage.PROGRAMA__FUNCTION,
						Programa.class, msgs);
			msgs = basicSetPrograma(newPrograma, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtividadeCPackage.FUNCTION__PROGRAMA, newPrograma,
					newPrograma));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AtividadeCPackage.FUNCTION__PROGRAMA:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetPrograma((Programa) otherEnd, msgs);
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
		case AtividadeCPackage.FUNCTION__PROGRAMA:
			return basicSetPrograma(null, msgs);
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
		case AtividadeCPackage.FUNCTION__PROGRAMA:
			return eInternalContainer().eInverseRemove(this, AtividadeCPackage.PROGRAMA__FUNCTION, Programa.class,
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
		case AtividadeCPackage.FUNCTION__TYPE:
			return getType();
		case AtividadeCPackage.FUNCTION__RES:
			return getRes();
		case AtividadeCPackage.FUNCTION__PROGRAMA:
			return getPrograma();
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
		case AtividadeCPackage.FUNCTION__TYPE:
			setType((Type) newValue);
			return;
		case AtividadeCPackage.FUNCTION__RES:
			setRes((Reservada) newValue);
			return;
		case AtividadeCPackage.FUNCTION__PROGRAMA:
			setPrograma((Programa) newValue);
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
		case AtividadeCPackage.FUNCTION__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case AtividadeCPackage.FUNCTION__RES:
			setRes(RES_EDEFAULT);
			return;
		case AtividadeCPackage.FUNCTION__PROGRAMA:
			setPrograma((Programa) null);
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
		case AtividadeCPackage.FUNCTION__TYPE:
			return type != TYPE_EDEFAULT;
		case AtividadeCPackage.FUNCTION__RES:
			return res != RES_EDEFAULT;
		case AtividadeCPackage.FUNCTION__PROGRAMA:
			return getPrograma() != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", res: ");
		result.append(res);
		result.append(')');
		return result.toString();
	}

} //FunctionImpl
