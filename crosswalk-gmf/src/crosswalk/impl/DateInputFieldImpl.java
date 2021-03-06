/**
 * Copyright 2010 The University of North Carolina at Chapel Hill
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package crosswalk.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import crosswalk.CrosswalkPackage;
import crosswalk.DataException;
import crosswalk.DateInputField;
import crosswalk.DatePrecision;
import crosswalk.util.ImpreciseDate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Input Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crosswalk.impl.DateInputFieldImpl#getDatePrecision <em>Date Precision</em>}</li>
 *   <li>{@link crosswalk.impl.DateInputFieldImpl#isBlankDefaultDate <em>Blank Default Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DateInputFieldImpl extends InputFieldImpl<Date> implements DateInputField {
	/**
	 * The default value of the '{@link #getDatePrecision() <em>Date Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatePrecision()
	 * @generated
	 * @ordered
	 */
	protected static final DatePrecision DATE_PRECISION_EDEFAULT = DatePrecision.YEAR;
	/**
	 * The cached value of the '{@link #getDatePrecision() <em>Date Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatePrecision()
	 * @generated
	 * @ordered
	 */
	protected DatePrecision datePrecision = DATE_PRECISION_EDEFAULT;

	/**
	 * The default value of the '{@link #isBlankDefaultDate() <em>Blank Default Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBlankDefaultDate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BLANK_DEFAULT_DATE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isBlankDefaultDate() <em>Blank Default Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBlankDefaultDate()
	 * @generated
	 * @ordered
	 */
	protected boolean blankDefaultDate = BLANK_DEFAULT_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateInputFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrosswalkPackage.Literals.DATE_INPUT_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatePrecision getDatePrecision() {
		return datePrecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatePrecision(DatePrecision newDatePrecision) {
		DatePrecision oldDatePrecision = datePrecision;
		datePrecision = newDatePrecision == null ? DATE_PRECISION_EDEFAULT : newDatePrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.DATE_INPUT_FIELD__DATE_PRECISION, oldDatePrecision, datePrecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBlankDefaultDate() {
		return blankDefaultDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlankDefaultDate(boolean newBlankDefaultDate) {
		boolean oldBlankDefaultDate = blankDefaultDate;
		blankDefaultDate = newBlankDefaultDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.DATE_INPUT_FIELD__BLANK_DEFAULT_DATE, oldBlankDefaultDate, blankDefaultDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CrosswalkPackage.DATE_INPUT_FIELD__DATE_PRECISION:
				return getDatePrecision();
			case CrosswalkPackage.DATE_INPUT_FIELD__BLANK_DEFAULT_DATE:
				return isBlankDefaultDate();
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
			case CrosswalkPackage.DATE_INPUT_FIELD__DATE_PRECISION:
				setDatePrecision((DatePrecision)newValue);
				return;
			case CrosswalkPackage.DATE_INPUT_FIELD__BLANK_DEFAULT_DATE:
				setBlankDefaultDate((Boolean)newValue);
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
			case CrosswalkPackage.DATE_INPUT_FIELD__DATE_PRECISION:
				setDatePrecision(DATE_PRECISION_EDEFAULT);
				return;
			case CrosswalkPackage.DATE_INPUT_FIELD__BLANK_DEFAULT_DATE:
				setBlankDefaultDate(BLANK_DEFAULT_DATE_EDEFAULT);
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
			case CrosswalkPackage.DATE_INPUT_FIELD__DATE_PRECISION:
				return datePrecision != DATE_PRECISION_EDEFAULT;
			case CrosswalkPackage.DATE_INPUT_FIELD__BLANK_DEFAULT_DATE:
				return blankDefaultDate != BLANK_DEFAULT_DATE_EDEFAULT;
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
		result.append(" (datePrecision: ");
		result.append(datePrecision);
		result.append(", blankDefaultDate: ");
		result.append(blankDefaultDate);
		result.append(')');
		return result.toString();
	}

	@Override
	public Object getResult() throws DataException {
		Date date = (Date)super.getResult();
		if(date == null) return null;
		ImpreciseDate impdate = new ImpreciseDate(date);
		impdate.setPrecision(getDatePrecision());
		return impdate;
	}

} //DateInputFieldImpl
