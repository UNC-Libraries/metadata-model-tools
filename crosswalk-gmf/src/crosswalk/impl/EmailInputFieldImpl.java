/**
 */
package crosswalk.impl;

import crosswalk.CrosswalkPackage;
import crosswalk.EmailInputField;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Email Input Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crosswalk.impl.EmailInputFieldImpl#isProvidesEmailDepositNoticeTo <em>Provides Email Deposit Notice To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmailInputFieldImpl extends InputFieldImpl<String> implements EmailInputField {
	/**
	 * The default value of the '{@link #isProvidesEmailDepositNoticeTo() <em>Provides Email Deposit Notice To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProvidesEmailDepositNoticeTo()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROVIDES_EMAIL_DEPOSIT_NOTICE_TO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProvidesEmailDepositNoticeTo() <em>Provides Email Deposit Notice To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProvidesEmailDepositNoticeTo()
	 * @generated
	 * @ordered
	 */
	protected boolean providesEmailDepositNoticeTo = PROVIDES_EMAIL_DEPOSIT_NOTICE_TO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmailInputFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrosswalkPackage.Literals.EMAIL_INPUT_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProvidesEmailDepositNoticeTo() {
		return providesEmailDepositNoticeTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidesEmailDepositNoticeTo(boolean newProvidesEmailDepositNoticeTo) {
		boolean oldProvidesEmailDepositNoticeTo = providesEmailDepositNoticeTo;
		providesEmailDepositNoticeTo = newProvidesEmailDepositNoticeTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.EMAIL_INPUT_FIELD__PROVIDES_EMAIL_DEPOSIT_NOTICE_TO, oldProvidesEmailDepositNoticeTo, providesEmailDepositNoticeTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CrosswalkPackage.EMAIL_INPUT_FIELD__PROVIDES_EMAIL_DEPOSIT_NOTICE_TO:
				return isProvidesEmailDepositNoticeTo();
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
			case CrosswalkPackage.EMAIL_INPUT_FIELD__PROVIDES_EMAIL_DEPOSIT_NOTICE_TO:
				setProvidesEmailDepositNoticeTo((Boolean)newValue);
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
			case CrosswalkPackage.EMAIL_INPUT_FIELD__PROVIDES_EMAIL_DEPOSIT_NOTICE_TO:
				setProvidesEmailDepositNoticeTo(PROVIDES_EMAIL_DEPOSIT_NOTICE_TO_EDEFAULT);
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
			case CrosswalkPackage.EMAIL_INPUT_FIELD__PROVIDES_EMAIL_DEPOSIT_NOTICE_TO:
				return providesEmailDepositNoticeTo != PROVIDES_EMAIL_DEPOSIT_NOTICE_TO_EDEFAULT;
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
		result.append(" (providesEmailDepositNoticeTo: ");
		result.append(providesEmailDepositNoticeTo);
		result.append(')');
		return result.toString();
	}

} //EmailInputFieldImpl
