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
package crosswalk;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.FileBlock#getUsage <em>Usage</em>}</li>
 *   <li>{@link crosswalk.FileBlock#getLabel <em>Label</em>}</li>
 *   <li>{@link crosswalk.FileBlock#isDefaultAccess <em>Default Access</em>}</li>
 *   <li>{@link crosswalk.FileBlock#getCopyGrantsHavingRoles <em>Copy Grants Having Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getFileBlock()
 * @model
 * @generated
 */
public interface FileBlock extends MetadataBlock {
	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see #setUsage(String)
	 * @see crosswalk.CrosswalkPackage#getFileBlock_Usage()
	 * @model
	 * @generated
	 */
	String getUsage();

	/**
	 * Sets the value of the '{@link crosswalk.FileBlock#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see crosswalk.CrosswalkPackage#getFileBlock_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link crosswalk.FileBlock#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Default Access</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Access</em>' attribute.
	 * @see #setDefaultAccess(boolean)
	 * @see crosswalk.CrosswalkPackage#getFileBlock_DefaultAccess()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isDefaultAccess();

	/**
	 * Sets the value of the '{@link crosswalk.FileBlock#isDefaultAccess <em>Default Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Access</em>' attribute.
	 * @see #isDefaultAccess()
	 * @generated
	 */
	void setDefaultAccess(boolean value);

	/**
	 * Returns the value of the '<em><b>Copy Grants Having Roles</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copy Grants Having Roles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copy Grants Having Roles</em>' attribute list.
	 * @see crosswalk.CrosswalkPackage#getFileBlock_CopyGrantsHavingRoles()
	 * @model default=""
	 * @generated
	 */
	EList<String> getCopyGrantsHavingRoles();

} // FileBlock
