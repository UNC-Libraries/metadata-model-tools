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
package crosswalk.provider;

import edu.unc.lib.schemas.acl.provider.AclEditPlugin;
import gov.loc.mods.mods.provider.ModsEditPlugin;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.w3._1999.xlink.provider.XlinkEditPlugin;

/**
 * This is the central singleton for the Crosswalk edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class CrosswalkEditPlugin extends EMFPlugin {
        /**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public static final CrosswalkEditPlugin INSTANCE = new CrosswalkEditPlugin();

        /**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private static Implementation plugin;

        /**
	 * Create the instance.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public CrosswalkEditPlugin() {
		super
		  (new ResourceLocator [] {
		   });
	}

        /**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
        @Override
        public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

        /**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
        public static Implementation getPlugin() {
		return plugin;
	}

        /**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public static class Implementation extends EclipsePlugin {
                /**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
        }

}
