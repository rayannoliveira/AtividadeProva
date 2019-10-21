/**
 */
package atividadeC.impl;

import atividadeC.AtividadeCPackage;
import atividadeC.Biblioteca;
import atividadeC.Lib;
import atividadeC.Programa;

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
 * An implementation of the model object '<em><b>Biblioteca</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link atividadeC.impl.BibliotecaImpl#getPrograma <em>Programa</em>}</li>
 *   <li>{@link atividadeC.impl.BibliotecaImpl#getLibrary <em>Library</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BibliotecaImpl extends MinimalEObjectImpl.Container implements Biblioteca {
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
	 * The default value of the '{@link #getLibrary() <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected static final Lib LIBRARY_EDEFAULT = Lib.STDLIB;

	/**
	 * The cached value of the '{@link #getLibrary() <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected Lib library = LIBRARY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BibliotecaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtividadeCPackage.Literals.BIBLIOTECA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Programa> getPrograma() {
		if (programa == null) {
			programa = new EObjectContainmentWithInverseEList<Programa>(Programa.class, this,
					AtividadeCPackage.BIBLIOTECA__PROGRAMA, AtividadeCPackage.PROGRAMA__BIBLIOTECA);
		}
		return programa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lib getLibrary() {
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibrary(Lib newLibrary) {
		Lib oldLibrary = library;
		library = newLibrary == null ? LIBRARY_EDEFAULT : newLibrary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtividadeCPackage.BIBLIOTECA__LIBRARY, oldLibrary,
					library));
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
		case AtividadeCPackage.BIBLIOTECA__PROGRAMA:
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
		case AtividadeCPackage.BIBLIOTECA__PROGRAMA:
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
		case AtividadeCPackage.BIBLIOTECA__PROGRAMA:
			return getPrograma();
		case AtividadeCPackage.BIBLIOTECA__LIBRARY:
			return getLibrary();
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
		case AtividadeCPackage.BIBLIOTECA__PROGRAMA:
			getPrograma().clear();
			getPrograma().addAll((Collection<? extends Programa>) newValue);
			return;
		case AtividadeCPackage.BIBLIOTECA__LIBRARY:
			setLibrary((Lib) newValue);
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
		case AtividadeCPackage.BIBLIOTECA__PROGRAMA:
			getPrograma().clear();
			return;
		case AtividadeCPackage.BIBLIOTECA__LIBRARY:
			setLibrary(LIBRARY_EDEFAULT);
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
		case AtividadeCPackage.BIBLIOTECA__PROGRAMA:
			return programa != null && !programa.isEmpty();
		case AtividadeCPackage.BIBLIOTECA__LIBRARY:
			return library != LIBRARY_EDEFAULT;
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
		result.append(" (library: ");
		result.append(library);
		result.append(')');
		return result.toString();
	}

} //BibliotecaImpl
