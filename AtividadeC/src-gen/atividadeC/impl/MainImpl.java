/**
 */
package atividadeC.impl;

import atividadeC.AtividadeCPackage;
import atividadeC.Main;
import atividadeC.Programa;
import atividadeC.Reservada;
import atividadeC.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link atividadeC.impl.MainImpl#getType <em>Type</em>}</li>
 *   <li>{@link atividadeC.impl.MainImpl#getRes <em>Res</em>}</li>
 *   <li>{@link atividadeC.impl.MainImpl#getPrograma <em>Programa</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MainImpl extends ProgramaImpl implements Main {
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
	protected MainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtividadeCPackage.Literals.MAIN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AtividadeCPackage.MAIN__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AtividadeCPackage.MAIN__RES, oldRes, res));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Programa getPrograma() {
		if (eContainerFeatureID() != AtividadeCPackage.MAIN__PROGRAMA)
			return null;
		return (Programa) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrograma(Programa newPrograma, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newPrograma, AtividadeCPackage.MAIN__PROGRAMA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrograma(Programa newPrograma) {
		if (newPrograma != eInternalContainer()
				|| (eContainerFeatureID() != AtividadeCPackage.MAIN__PROGRAMA && newPrograma != null)) {
			if (EcoreUtil.isAncestor(this, newPrograma))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPrograma != null)
				msgs = ((InternalEObject) newPrograma).eInverseAdd(this, AtividadeCPackage.PROGRAMA__MAIN,
						Programa.class, msgs);
			msgs = basicSetPrograma(newPrograma, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtividadeCPackage.MAIN__PROGRAMA, newPrograma,
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
		case AtividadeCPackage.MAIN__PROGRAMA:
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
		case AtividadeCPackage.MAIN__PROGRAMA:
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
		case AtividadeCPackage.MAIN__PROGRAMA:
			return eInternalContainer().eInverseRemove(this, AtividadeCPackage.PROGRAMA__MAIN, Programa.class, msgs);
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
		case AtividadeCPackage.MAIN__TYPE:
			return getType();
		case AtividadeCPackage.MAIN__RES:
			return getRes();
		case AtividadeCPackage.MAIN__PROGRAMA:
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
		case AtividadeCPackage.MAIN__TYPE:
			setType((Type) newValue);
			return;
		case AtividadeCPackage.MAIN__RES:
			setRes((Reservada) newValue);
			return;
		case AtividadeCPackage.MAIN__PROGRAMA:
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
		case AtividadeCPackage.MAIN__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case AtividadeCPackage.MAIN__RES:
			setRes(RES_EDEFAULT);
			return;
		case AtividadeCPackage.MAIN__PROGRAMA:
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
		case AtividadeCPackage.MAIN__TYPE:
			return type != TYPE_EDEFAULT;
		case AtividadeCPackage.MAIN__RES:
			return res != RES_EDEFAULT;
		case AtividadeCPackage.MAIN__PROGRAMA:
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

} //MainImpl
