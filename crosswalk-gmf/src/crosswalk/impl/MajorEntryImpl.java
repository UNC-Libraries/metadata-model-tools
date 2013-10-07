/**
 */
package crosswalk.impl;

import crosswalk.CrosswalkPackage;
import crosswalk.MajorEntry;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Major Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crosswalk.impl.MajorEntryImpl#getName <em>Name</em>}</li>
 *   <li>{@link crosswalk.impl.MajorEntryImpl#getObserverGroups <em>Observer Groups</em>}</li>
 *   <li>{@link crosswalk.impl.MajorEntryImpl#getReviewerGroups <em>Reviewer Groups</em>}</li>
 *   <li>{@link crosswalk.impl.MajorEntryImpl#getEmailDepositNoticeTo <em>Email Deposit Notice To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MajorEntryImpl extends EObjectImpl implements MajorEntry {
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
	 * The cached value of the '{@link #getObserverGroups() <em>Observer Groups</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObserverGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<String> observerGroups;

	/**
	 * The cached value of the '{@link #getReviewerGroups() <em>Reviewer Groups</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewerGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<String> reviewerGroups;

	/**
	 * The cached value of the '{@link #getEmailDepositNoticeTo() <em>Email Deposit Notice To</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailDepositNoticeTo()
	 * @generated
	 * @ordered
	 */
	protected EList<String> emailDepositNoticeTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MajorEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrosswalkPackage.Literals.MAJOR_ENTRY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.MAJOR_ENTRY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getObserverGroups() {
		if (observerGroups == null) {
			observerGroups = new EDataTypeUniqueEList<String>(String.class, this, CrosswalkPackage.MAJOR_ENTRY__OBSERVER_GROUPS);
		}
		return observerGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getReviewerGroups() {
		if (reviewerGroups == null) {
			reviewerGroups = new EDataTypeUniqueEList<String>(String.class, this, CrosswalkPackage.MAJOR_ENTRY__REVIEWER_GROUPS);
		}
		return reviewerGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEmailDepositNoticeTo() {
		if (emailDepositNoticeTo == null) {
			emailDepositNoticeTo = new EDataTypeUniqueEList<String>(String.class, this, CrosswalkPackage.MAJOR_ENTRY__EMAIL_DEPOSIT_NOTICE_TO);
		}
		return emailDepositNoticeTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CrosswalkPackage.MAJOR_ENTRY__NAME:
				return getName();
			case CrosswalkPackage.MAJOR_ENTRY__OBSERVER_GROUPS:
				return getObserverGroups();
			case CrosswalkPackage.MAJOR_ENTRY__REVIEWER_GROUPS:
				return getReviewerGroups();
			case CrosswalkPackage.MAJOR_ENTRY__EMAIL_DEPOSIT_NOTICE_TO:
				return getEmailDepositNoticeTo();
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
			case CrosswalkPackage.MAJOR_ENTRY__NAME:
				setName((String)newValue);
				return;
			case CrosswalkPackage.MAJOR_ENTRY__OBSERVER_GROUPS:
				getObserverGroups().clear();
				getObserverGroups().addAll((Collection<? extends String>)newValue);
				return;
			case CrosswalkPackage.MAJOR_ENTRY__REVIEWER_GROUPS:
				getReviewerGroups().clear();
				getReviewerGroups().addAll((Collection<? extends String>)newValue);
				return;
			case CrosswalkPackage.MAJOR_ENTRY__EMAIL_DEPOSIT_NOTICE_TO:
				getEmailDepositNoticeTo().clear();
				getEmailDepositNoticeTo().addAll((Collection<? extends String>)newValue);
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
			case CrosswalkPackage.MAJOR_ENTRY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CrosswalkPackage.MAJOR_ENTRY__OBSERVER_GROUPS:
				getObserverGroups().clear();
				return;
			case CrosswalkPackage.MAJOR_ENTRY__REVIEWER_GROUPS:
				getReviewerGroups().clear();
				return;
			case CrosswalkPackage.MAJOR_ENTRY__EMAIL_DEPOSIT_NOTICE_TO:
				getEmailDepositNoticeTo().clear();
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
			case CrosswalkPackage.MAJOR_ENTRY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CrosswalkPackage.MAJOR_ENTRY__OBSERVER_GROUPS:
				return observerGroups != null && !observerGroups.isEmpty();
			case CrosswalkPackage.MAJOR_ENTRY__REVIEWER_GROUPS:
				return reviewerGroups != null && !reviewerGroups.isEmpty();
			case CrosswalkPackage.MAJOR_ENTRY__EMAIL_DEPOSIT_NOTICE_TO:
				return emailDepositNoticeTo != null && !emailDepositNoticeTo.isEmpty();
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", observerGroups: ");
		result.append(observerGroups);
		result.append(", reviewerGroups: ");
		result.append(reviewerGroups);
		result.append(", emailDepositNoticeTo: ");
		result.append(emailDepositNoticeTo);
		result.append(')');
		return result.toString();
	}

} //MajorEntryImpl
