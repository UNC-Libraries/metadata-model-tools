/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.loc.mods.mods;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script Term Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mods.mods.ScriptTermDefinition#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mods.mods.MODSPackage#getScriptTermDefinition()
 * @model extendedMetaData="name='scriptTermDefinition' kind='simple'"
 * @generated
 */
public interface ScriptTermDefinition extends StringPlusAuthority {
    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link gov.loc.mods.mods.CodeOrTextDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see gov.loc.mods.mods.CodeOrTextDefinition
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(CodeOrTextDefinition)
     * @see gov.loc.mods.mods.MODSPackage#getScriptTermDefinition_Type()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
    CodeOrTextDefinition getType();

    /**
     * Sets the value of the '{@link gov.loc.mods.mods.ScriptTermDefinition#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see gov.loc.mods.mods.CodeOrTextDefinition
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
    void setType(CodeOrTextDefinition value);

    /**
     * Unsets the value of the '{@link gov.loc.mods.mods.ScriptTermDefinition#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(CodeOrTextDefinition)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link gov.loc.mods.mods.ScriptTermDefinition#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(CodeOrTextDefinition)
     * @generated
     */
    boolean isSetType();

} // ScriptTermDefinition
