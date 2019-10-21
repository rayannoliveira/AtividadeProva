/**
 */
package atividadeC.impl;

import atividadeC.AtividadeCPackage;
import atividadeC.Programa;
import atividadeC.Reservada;
import atividadeC.Struct;
import atividadeC.Type;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Struct</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link atividadeC.impl.StructImpl#getPrograma <em>Programa</em>}</li>
 *   <li>{@link atividadeC.impl.StructImpl#getType <em>Type</em>}</li>
 *   <li>{@link atividadeC.impl.StructImpl#getRes <em>Res</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructImpl extends MinimalEObjectImpl.Container implements Struct {
	/**
	 * The cached value of the '{@link #getPrograma() <em>Programa</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrograma()
	 * @generated
	 * @ordered
	 */
	protected EList<Programa> programa;

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
	protected StructImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtividadeCPackage.Literals.STRUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Programa> getPrograma() {
		if (programa == null) {
			programa = new EObjectContainmentWithInverseEList<Programa>(Programa.class, this,
					AtividadeCPackage.STRUCT__PROGRAMA, AtividadeCPackage.PROGRAMA__STRUCT);
		}
		return programa;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AtividadeCPackage.STRUCT__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AtividadeCPackage.STRUCT__RES, oldRes, res));
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
		case AtividadeCPackage.STRUCT__PROGRAMA:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPrograma()).basicAdd(otherEnd, msgs);
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
		case AtividadeCPackage.STRUCT__PROGRAMA:
			return ((InternalEList<?>) getPrograma()).basicRemove(otherEnd, msgs);
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
		case AtividadeCPackage.STRUCT__PROGRAMA:
			return getPrograma();
		case AtividadeCPackage.STRUCT__TYPE:
			return getType();
		case AtividadeCPackage.STRUCT__RES:
			return getRes();
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
		case AtividadeCPackage.STRUCT__PROGRAMA:
			getPrograma().clear();
			getPrograma().addAll((Collection<? extends Programa>) newValue);
			return;
		case AtividadeCPackage.STRUCT__TYPE:
			setType((Type) newValue);
			return;
		case AtividadeCPackage.STRUCT__RES:
			setRes((Reservada) newValue);
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
		case AtividadeCPackage.STRUCT__PROGRAMA:
			getPrograma().clear();
			return;
		case AtividadeCPackage.STRUCT__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case AtividadeCPackage.STRUCT__RES:
			setRes(RES_EDEFAULT);
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
		case AtividadeCPackage.STRUCT__PROGRAMA:
			return programa != null && !programa.isEmpty();
		case AtividadeCPackage.STRUCT__TYPE:
			return type != TYPE_EDEFAULT;
		case AtividadeCPackage.STRUCT__RES:
			return res != RES_EDEFAULT;
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

} //StructImpl
