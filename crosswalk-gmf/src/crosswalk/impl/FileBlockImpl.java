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
/**
 */
package crosswalk.impl;

import crosswalk.ContextProvider;
import crosswalk.CrosswalkPackage;
import crosswalk.FileBlock;

import crosswalk.InputField;
import crosswalk.MappingContainer;
import crosswalk.OutputElement;
import crosswalk.OutputProfile;
import crosswalk.WalkWidget;
import java.util.Collection;
import crosswalk.Form;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crosswalk.impl.FileBlockImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link crosswalk.impl.FileBlockImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link crosswalk.impl.FileBlockImpl#isDefaultAccess <em>Default Access</em>}</li>
 *   <li>{@link crosswalk.impl.FileBlockImpl#getCopyGrantsHavingRoles <em>Copy Grants Having Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileBlockImpl extends MetadataBlockImpl implements FileBlock {
	/**
	 * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected static final String USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected String usage = USAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #isDefaultAccess() <em>Default Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultAccess()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_ACCESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDefaultAccess() <em>Default Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultAccess()
	 * @generated
	 * @ordered
	 */
	protected boolean defaultAccess = DEFAULT_ACCESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCopyGrantsHavingRoles() <em>Copy Grants Having Roles</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyGrantsHavingRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<String> copyGrantsHavingRoles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrosswalkPackage.Literals.FILE_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(String newUsage) {
		String oldUsage = usage;
		usage = newUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.FILE_BLOCK__USAGE, oldUsage, usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.FILE_BLOCK__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefaultAccess() {
		return defaultAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultAccess(boolean newDefaultAccess) {
		boolean oldDefaultAccess = defaultAccess;
		defaultAccess = newDefaultAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrosswalkPackage.FILE_BLOCK__DEFAULT_ACCESS, oldDefaultAccess, defaultAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCopyGrantsHavingRoles() {
		if (copyGrantsHavingRoles == null) {
			copyGrantsHavingRoles = new EDataTypeUniqueEList<String>(String.class, this, CrosswalkPackage.FILE_BLOCK__COPY_GRANTS_HAVING_ROLES);
		}
		return copyGrantsHavingRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CrosswalkPackage.FILE_BLOCK__USAGE:
				return getUsage();
			case CrosswalkPackage.FILE_BLOCK__LABEL:
				return getLabel();
			case CrosswalkPackage.FILE_BLOCK__DEFAULT_ACCESS:
				return isDefaultAccess();
			case CrosswalkPackage.FILE_BLOCK__COPY_GRANTS_HAVING_ROLES:
				return getCopyGrantsHavingRoles();
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
			case CrosswalkPackage.FILE_BLOCK__USAGE:
				setUsage((String)newValue);
				return;
			case CrosswalkPackage.FILE_BLOCK__LABEL:
				setLabel((String)newValue);
				return;
			case CrosswalkPackage.FILE_BLOCK__DEFAULT_ACCESS:
				setDefaultAccess((Boolean)newValue);
				return;
			case CrosswalkPackage.FILE_BLOCK__COPY_GRANTS_HAVING_ROLES:
				getCopyGrantsHavingRoles().clear();
				getCopyGrantsHavingRoles().addAll((Collection<? extends String>)newValue);
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
			case CrosswalkPackage.FILE_BLOCK__USAGE:
				setUsage(USAGE_EDEFAULT);
				return;
			case CrosswalkPackage.FILE_BLOCK__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case CrosswalkPackage.FILE_BLOCK__DEFAULT_ACCESS:
				setDefaultAccess(DEFAULT_ACCESS_EDEFAULT);
				return;
			case CrosswalkPackage.FILE_BLOCK__COPY_GRANTS_HAVING_ROLES:
				getCopyGrantsHavingRoles().clear();
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
			case CrosswalkPackage.FILE_BLOCK__USAGE:
				return USAGE_EDEFAULT == null ? usage != null : !USAGE_EDEFAULT.equals(usage);
			case CrosswalkPackage.FILE_BLOCK__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case CrosswalkPackage.FILE_BLOCK__DEFAULT_ACCESS:
				return defaultAccess != DEFAULT_ACCESS_EDEFAULT;
			case CrosswalkPackage.FILE_BLOCK__COPY_GRANTS_HAVING_ROLES:
				return copyGrantsHavingRoles != null && !copyGrantsHavingRoles.isEmpty();
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
		result.append(" (usage: ");
		result.append(usage);
		result.append(", label: ");
		result.append(label);
		result.append(", defaultAccess: ");
		result.append(defaultAccess);
		result.append(", copyGrantsHavingRoles: ");
		result.append(copyGrantsHavingRoles);
		result.append(')');
		return result.toString();
	}

} //FileBlockImpl
