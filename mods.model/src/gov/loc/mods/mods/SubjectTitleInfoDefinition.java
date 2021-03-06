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
package gov.loc.mods.mods;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subject Title Info Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.SubjectTitleInfoDefinition#getType1 <em>Type1</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getSubjectTitleInfoDefinition()
 * @model extendedMetaData="name='subjectTitleInfoDefinition' kind='elementOnly'"
 * @generated
 */
public interface SubjectTitleInfoDefinition extends TitleInfoBaseDefinition {
	/**
	 * Returns the value of the '<em><b>Type1</b></em>' attribute.
	 * The literals are from the enumeration {@link gov.loc.mods.mods.TitleInfoTypeAttributeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type1</em>' attribute.
	 * @see gov.loc.mods.mods.TitleInfoTypeAttributeDefinition
	 * @see #isSetType1()
	 * @see #unsetType1()
	 * @see #setType1(TitleInfoTypeAttributeDefinition)
	 * @see gov.loc.mods.mods.MODSPackage#getSubjectTitleInfoDefinition_Type1()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	TitleInfoTypeAttributeDefinition getType1();

	/**
	 * Sets the value of the '{@link gov.loc.mods.mods.SubjectTitleInfoDefinition#getType1 <em>Type1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type1</em>' attribute.
	 * @see gov.loc.mods.mods.TitleInfoTypeAttributeDefinition
	 * @see #isSetType1()
	 * @see #unsetType1()
	 * @see #getType1()
	 * @generated
	 */
	void setType1(TitleInfoTypeAttributeDefinition value);

	/**
	 * Unsets the value of the '{@link gov.loc.mods.mods.SubjectTitleInfoDefinition#getType1 <em>Type1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType1()
	 * @see #getType1()
	 * @see #setType1(TitleInfoTypeAttributeDefinition)
	 * @generated
	 */
	void unsetType1();

	/**
	 * Returns whether the value of the '{@link gov.loc.mods.mods.SubjectTitleInfoDefinition#getType1 <em>Type1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type1</em>' attribute is set.
	 * @see #unsetType1()
	 * @see #getType1()
	 * @see #setType1(TitleInfoTypeAttributeDefinition)
	 * @generated
	 */
	boolean isSetType1();

} // SubjectTitleInfoDefinition
