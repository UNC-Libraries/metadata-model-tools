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
package gov.loc.mets;

import org.eclipse.emf.ecore.EObject;

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FLocat Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.loc.mets.FLocatType#getActuate <em>Actuate</em>}</li>
 *   <li>{@link gov.loc.mets.FLocatType#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link gov.loc.mets.FLocatType#getHref <em>Href</em>}</li>
 *   <li>{@link gov.loc.mets.FLocatType#getID <em>ID</em>}</li>
 *   <li>{@link gov.loc.mets.FLocatType#getLOCTYPE <em>LOCTYPE</em>}</li>
 *   <li>{@link gov.loc.mets.FLocatType#getOTHERLOCTYPE <em>OTHERLOCTYPE</em>}</li>
 *   <li>{@link gov.loc.mets.FLocatType#getRole <em>Role</em>}</li>
 *   <li>{@link gov.loc.mets.FLocatType#getShow <em>Show</em>}</li>
 *   <li>{@link gov.loc.mets.FLocatType#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.loc.mets.FLocatType#getType <em>Type</em>}</li>
 *   <li>{@link gov.loc.mets.FLocatType#getUSE <em>USE</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.loc.mets.MetsPackage#getFLocatType()
 * @model extendedMetaData="name='FLocat_._type' kind='empty'"
 * @generated
 */
public interface FLocatType extends EObject {
        /**
	 * Returns the value of the '<em><b>Actuate</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1999.xlink.ActuateType}.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Actuate</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuate</em>' attribute.
	 * @see org.w3._1999.xlink.ActuateType
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #setActuate(ActuateType)
	 * @see gov.loc.mets.MetsPackage#getFLocatType_Actuate()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='actuate' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
        ActuateType getActuate();

        /**
	 * Sets the value of the '{@link gov.loc.mets.FLocatType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuate</em>' attribute.
	 * @see org.w3._1999.xlink.ActuateType
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @generated
	 */
        void setActuate(ActuateType value);

        /**
	 * Unsets the value of the '{@link gov.loc.mets.FLocatType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #isSetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
	 * @generated
	 */
        void unsetActuate();

        /**
	 * Returns whether the value of the '{@link gov.loc.mets.FLocatType#getActuate <em>Actuate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Actuate</em>' attribute is set.
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
	 * @generated
	 */
        boolean isSetActuate();

        /**
	 * Returns the value of the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Arcrole</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcrole</em>' attribute.
	 * @see #setArcrole(String)
	 * @see gov.loc.mets.MetsPackage#getFLocatType_Arcrole()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='arcrole' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
        String getArcrole();

        /**
	 * Sets the value of the '{@link gov.loc.mets.FLocatType#getArcrole <em>Arcrole</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arcrole</em>' attribute.
	 * @see #getArcrole()
	 * @generated
	 */
        void setArcrole(String value);

        /**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Href</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see gov.loc.mets.MetsPackage#getFLocatType_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='href' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
        String getHref();

        /**
	 * Sets the value of the '{@link gov.loc.mets.FLocatType#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
        void setHref(String value);

        /**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ID (ID/O): This attribute uniquely identifies the element within the METS document, and would allow the element to be referenced unambiguously from another element or document via an IDREF or an XPTR. For more information on using ID attributes for internal and external linking see Chapter 4 of the METS Primer.
	 * 							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see gov.loc.mets.MetsPackage#getFLocatType_ID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
        String getID();

        /**
	 * Sets the value of the '{@link gov.loc.mets.FLocatType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
        void setID(String value);

        /**
	 * Returns the value of the '<em><b>LOCTYPE</b></em>' attribute.
	 * The literals are from the enumeration {@link gov.loc.mets.LOCTYPEType}.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LOCTYPE (string/R): Specifies the locator type used in the xlink:href attribute. Valid values for LOCTYPE are: 
	 * 					ARK
	 * 					URN
	 * 					URL
	 * 					PURL
	 * 					HANDLE
	 * 					DOI
	 * 					OTHER
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LOCTYPE</em>' attribute.
	 * @see gov.loc.mets.LOCTYPEType
	 * @see #isSetLOCTYPE()
	 * @see #unsetLOCTYPE()
	 * @see #setLOCTYPE(LOCTYPEType)
	 * @see gov.loc.mets.MetsPackage#getFLocatType_LOCTYPE()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='LOCTYPE'"
	 * @generated
	 */
        LOCTYPEType getLOCTYPE();

        /**
	 * Sets the value of the '{@link gov.loc.mets.FLocatType#getLOCTYPE <em>LOCTYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LOCTYPE</em>' attribute.
	 * @see gov.loc.mets.LOCTYPEType
	 * @see #isSetLOCTYPE()
	 * @see #unsetLOCTYPE()
	 * @see #getLOCTYPE()
	 * @generated
	 */
        void setLOCTYPE(LOCTYPEType value);

        /**
	 * Unsets the value of the '{@link gov.loc.mets.FLocatType#getLOCTYPE <em>LOCTYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #isSetLOCTYPE()
	 * @see #getLOCTYPE()
	 * @see #setLOCTYPE(LOCTYPEType)
	 * @generated
	 */
        void unsetLOCTYPE();

        /**
	 * Returns whether the value of the '{@link gov.loc.mets.FLocatType#getLOCTYPE <em>LOCTYPE</em>}' attribute is set.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return whether the value of the '<em>LOCTYPE</em>' attribute is set.
	 * @see #unsetLOCTYPE()
	 * @see #getLOCTYPE()
	 * @see #setLOCTYPE(LOCTYPEType)
	 * @generated
	 */
        boolean isSetLOCTYPE();

        /**
	 * Returns the value of the '<em><b>OTHERLOCTYPE</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OTHERLOCTYPE (string/O): Specifies the locator type when the value OTHER is used in the LOCTYPE attribute. Although optional, it is strongly recommended when OTHER is used.
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>OTHERLOCTYPE</em>' attribute.
	 * @see #setOTHERLOCTYPE(String)
	 * @see gov.loc.mets.MetsPackage#getFLocatType_OTHERLOCTYPE()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='OTHERLOCTYPE'"
	 * @generated
	 */
        String getOTHERLOCTYPE();

        /**
	 * Sets the value of the '{@link gov.loc.mets.FLocatType#getOTHERLOCTYPE <em>OTHERLOCTYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OTHERLOCTYPE</em>' attribute.
	 * @see #getOTHERLOCTYPE()
	 * @generated
	 */
        void setOTHERLOCTYPE(String value);

        /**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Role</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see gov.loc.mets.MetsPackage#getFLocatType_Role()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='role' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
        String getRole();

        /**
	 * Sets the value of the '{@link gov.loc.mets.FLocatType#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
        void setRole(String value);

        /**
	 * Returns the value of the '<em><b>Show</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1999.xlink.ShowType}.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Show</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Show</em>' attribute.
	 * @see org.w3._1999.xlink.ShowType
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #setShow(ShowType)
	 * @see gov.loc.mets.MetsPackage#getFLocatType_Show()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='show' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
        ShowType getShow();

        /**
	 * Sets the value of the '{@link gov.loc.mets.FLocatType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show</em>' attribute.
	 * @see org.w3._1999.xlink.ShowType
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #getShow()
	 * @generated
	 */
        void setShow(ShowType value);

        /**
	 * Unsets the value of the '{@link gov.loc.mets.FLocatType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #isSetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType)
	 * @generated
	 */
        void unsetShow();

        /**
	 * Returns whether the value of the '{@link gov.loc.mets.FLocatType#getShow <em>Show</em>}' attribute is set.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Show</em>' attribute is set.
	 * @see #unsetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType)
	 * @generated
	 */
        boolean isSetShow();

        /**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Title</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see gov.loc.mets.MetsPackage#getFLocatType_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='title' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
        String getTitle();

        /**
	 * Sets the value of the '{@link gov.loc.mets.FLocatType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
        void setTitle(String value);

        /**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"simple"</code>.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Type</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(String)
	 * @see gov.loc.mets.MetsPackage#getFLocatType_Type()
	 * @model default="simple" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='type' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
        String getType();

        /**
	 * Sets the value of the '{@link gov.loc.mets.FLocatType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
        void setType(String value);

        /**
	 * Unsets the value of the '{@link gov.loc.mets.FLocatType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
        void unsetType();

        /**
	 * Returns whether the value of the '{@link gov.loc.mets.FLocatType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
        boolean isSetType();

        /**
	 * Returns the value of the '<em><b>USE</b></em>' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * USE (string/O): A tagging attribute to indicate the intended use of the specific copy of the file  represented by the &lt;FLocat&gt; element (e.g., service master, archive master). A USE attribute can be expressed at the&lt;fileGrp&gt; level, the &lt;file&gt; level, the &lt;FLocat&gt; level and/or the &lt;FContent&gt; level.  A USE attribute value at the &lt;fileGrp&gt; level should pertain to all of the files in the &lt;fileGrp&gt;.  A USE attribute at the &lt;file&gt; level should pertain to all copies of the file as represented by subsidiary &lt;FLocat&gt; and/or &lt;FContent&gt; elements.  A USE attribute at the &lt;FLocat&gt; or &lt;FContent&gt; level pertains to the particular copy of the file that is either referenced (&lt;FLocat&gt;) or wrapped (&lt;FContent&gt;).
	 * 							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>USE</em>' attribute.
	 * @see #setUSE(String)
	 * @see gov.loc.mets.MetsPackage#getFLocatType_USE()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='USE'"
	 * @generated
	 */
        String getUSE();

        /**
	 * Sets the value of the '{@link gov.loc.mets.FLocatType#getUSE <em>USE</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>USE</em>' attribute.
	 * @see #getUSE()
	 * @generated
	 */
        void setUSE(String value);

} // FLocatType
