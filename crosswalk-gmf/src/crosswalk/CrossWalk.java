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
package crosswalk;

import org.eclipse.core.resources.IProject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cross Walk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crosswalk.CrossWalk#getDataSource <em>Data Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see crosswalk.CrosswalkPackage#getCrossWalk()
 * @model
 * @generated
 */
public interface CrossWalk extends ContextProvider, MappingContainer, Editable {
        /**
	 * Returns the value of the '<em><b>Data Source</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link crosswalk.DataSource#getWalk <em>Walk</em>}'.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Data Source</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' containment reference.
	 * @see #setDataSource(DataSource)
	 * @see crosswalk.CrosswalkPackage#getCrossWalk_DataSource()
	 * @see crosswalk.DataSource#getWalk
	 * @model opposite="Walk" containment="true" required="true"
	 * @generated
	 */
        DataSource getDataSource();

        /**
	 * Sets the value of the '{@link crosswalk.CrossWalk#getDataSource <em>Data Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' containment reference.
	 * @see #getDataSource()
	 * @generated
	 */
        void setDataSource(DataSource value);

        String getRecordID(int recordNumber);

        public void setMetsSource(MetsSource metsSource);
        MetsSource getMetsSource();

} // CrossWalk
