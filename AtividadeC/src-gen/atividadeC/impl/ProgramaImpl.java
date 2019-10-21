/**
 */
package atividadeC.impl;

import atividadeC.AtividadeCPackage;
import atividadeC.Biblioteca;
import atividadeC.Function;
import atividadeC.Main;
import atividadeC.Programa;
import atividadeC.Struct;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programa</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link atividadeC.impl.ProgramaImpl#getBiblioteca <em>Biblioteca</em>}</li>
 *   <li>{@link atividadeC.impl.ProgramaImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link atividadeC.impl.ProgramaImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link atividadeC.impl.ProgramaImpl#getMain <em>Main</em>}</li>
 *   <li>{@link atividadeC.impl.ProgramaImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramaImpl extends MinimalEObjectImpl.Container implements Programa {
	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> function;

	/**
	 * The cached value of the '{@link #getMain() <em>Main</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMain()
	 * @generated
	 * @ordered
	 */
	protected Main main;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtividadeCPackage.Literals.PROGRAMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Biblioteca getBiblioteca() {
		if (eContainerFeatureID() != AtividadeCPackage.PROGRAMA__BIBLIOTECA)
			return null;
		return (Biblioteca) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBiblioteca(Biblioteca newBiblioteca, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newBiblioteca, AtividadeCPackage.PROGRAMA__BIBLIOTECA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBiblioteca(Biblioteca newBiblioteca) {
		if (newBiblioteca != eInternalContainer()
				|| (eContainerFeatureID() != AtividadeCPackage.PROGRAMA__BIBLIOTECA && newBiblioteca != null)) {
			if (EcoreUtil.isAncestor(this, newBiblioteca))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBiblioteca != null)
				msgs = ((InternalEObject) newBiblioteca).eInverseAdd(this, AtividadeCPackage.BIBLIOTECA__PROGRAMA,
						Biblioteca.class, msgs);
			msgs = basicSetBiblioteca(newBiblioteca, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtividadeCPackage.PROGRAMA__BIBLIOTECA, newBiblioteca,
					newBiblioteca));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Struct getStruct() {
		if (eContainerFeatureID() != AtividadeCPackage.PROGRAMA__STRUCT)
			return null;
		return (Struct) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStruct(Struct newStruct, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newStruct, AtividadeCPackage.PROGRAMA__STRUCT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStruct(Struct newStruct) {
		if (newStruct != eInternalContainer()
				|| (eContainerFeatureID() != AtividadeCPackage.PROGRAMA__STRUCT && newStruct != null)) {
			if (EcoreUtil.isAncestor(this, newStruct))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStruct != null)
				msgs = ((InternalEObject) newStruct).eInverseAdd(this, AtividadeCPackage.STRUCT__PROGRAMA, Struct.class,
						msgs);
			msgs = basicSetStruct(newStruct, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtividadeCPackage.PROGRAMA__STRUCT, newStruct,
					newStruct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getFunction() {
		if (function == null) {
			function = new EObjectContainmentWithInverseEList<Function>(Function.class, this,
					AtividadeCPackage.PROGRAMA__FUNCTION, AtividadeCPackage.FUNCTION__PROGRAMA);
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Main getMain() {
		return main;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMain(Main newMain, NotificationChain msgs) {
		Main oldMain = main;
		main = newMain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AtividadeCPackage.PROGRAMA__MAIN, oldMain, newMain);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMain(Main newMain) {
		if (newMain != main) {
			NotificationChain msgs = null;
			if (main != null)
				msgs = ((InternalEObject) main).eInverseRemove(this, AtividadeCPackage.MAIN__PROGRAMA, Main.class,
						msgs);
			if (newMain != null)
				msgs = ((InternalEObject) newMain).eInverseAdd(this, AtividadeCPackage.MAIN__PROGRAMA, Main.class,
						msgs);
			msgs = basicSetMain(newMain, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtividadeCPackage.PROGRAMA__MAIN, newMain, newMain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtividadeCPackage.PROGRAMA__NAME, oldName, name));
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
		case AtividadeCPackage.PROGRAMA__BIBLIOTECA:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetBiblioteca((Biblioteca) otherEnd, msgs);
		case AtividadeCPackage.PROGRAMA__STRUCT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetStruct((Struct) otherEnd, msgs);
		case AtividadeCPackage.PROGRAMA__FUNCTION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFunction()).basicAdd(otherEnd, msgs);
		case AtividadeCPackage.PROGRAMA__MAIN:
			if (main != null)
				msgs = ((InternalEObject) main).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AtividadeCPackage.PROGRAMA__MAIN, null, msgs);
			return basicSetMain((Main) otherEnd, msgs);
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
		case AtividadeCPackage.PROGRAMA__BIBLIOTECA:
			return basicSetBiblioteca(null, msgs);
		case AtividadeCPackage.PROGRAMA__STRUCT:
			return basicSetStruct(null, msgs);
		case AtividadeCPackage.PROGRAMA__FUNCTION:
			return ((InternalEList<?>) getFunction()).basicRemove(otherEnd, msgs);
		case AtividadeCPackage.PROGRAMA__MAIN:
			return basicSetMain(null, msgs);
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
		case AtividadeCPackage.PROGRAMA__BIBLIOTECA:
			return eInternalContainer().eInverseRemove(this, AtividadeCPackage.BIBLIOTECA__PROGRAMA, Biblioteca.class,
					msgs);
		case AtividadeCPackage.PROGRAMA__STRUCT:
			return eInternalContainer().eInverseRemove(this, AtividadeCPackage.STRUCT__PROGRAMA, Struct.class, msgs);
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
		case AtividadeCPackage.PROGRAMA__BIBLIOTECA:
			return getBiblioteca();
		case AtividadeCPackage.PROGRAMA__STRUCT:
			return getStruct();
		case AtividadeCPackage.PROGRAMA__FUNCTION:
			return getFunction();
		case AtividadeCPackage.PROGRAMA__MAIN:
			return getMain();
		case AtividadeCPackage.PROGRAMA__NAME:
			return getName();
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
		case AtividadeCPackage.PROGRAMA__BIBLIOTECA:
			setBiblioteca((Biblioteca) newValue);
			return;
		case AtividadeCPackage.PROGRAMA__STRUCT:
			setStruct((Struct) newValue);
			return;
		case AtividadeCPackage.PROGRAMA__FUNCTION:
			getFunction().clear();
			getFunction().addAll((Collection<? extends Function>) newValue);
			return;
		case AtividadeCPackage.PROGRAMA__MAIN:
			setMain((Main) newValue);
			return;
		case AtividadeCPackage.PROGRAMA__NAME:
			setName((String) newValue);
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
		case AtividadeCPackage.PROGRAMA__BIBLIOTECA:
			setBiblioteca((Biblioteca) null);
			return;
		case AtividadeCPackage.PROGRAMA__STRUCT:
			setStruct((Struct) null);
			return;
		case AtividadeCPackage.PROGRAMA__FUNCTION:
			getFunction().clear();
			return;
		case AtividadeCPackage.PROGRAMA__MAIN:
			setMain((Main) null);
			return;
		case AtividadeCPackage.PROGRAMA__NAME:
			setName(NAME_EDEFAULT);
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
		case AtividadeCPackage.PROGRAMA__BIBLIOTECA:
			return getBiblioteca() != null;
		case AtividadeCPackage.PROGRAMA__STRUCT:
			return getStruct() != null;
		case AtividadeCPackage.PROGRAMA__FUNCTION:
			return function != null && !function.isEmpty();
		case AtividadeCPackage.PROGRAMA__MAIN:
			return main != null;
		case AtividadeCPackage.PROGRAMA__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ProgramaImpl
