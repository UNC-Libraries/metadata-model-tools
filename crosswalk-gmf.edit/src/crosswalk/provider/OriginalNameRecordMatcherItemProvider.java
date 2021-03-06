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


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import crosswalk.CrosswalkPackage;
import crosswalk.OriginalNameRecordMatcher;

/**
 * This is the item provider adapter for a {@link crosswalk.OriginalNameRecordMatcher} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OriginalNameRecordMatcherItemProvider
        extends WalkWidgetItemProvider
        implements
                IEditingDomainItemProvider,
                IStructuredItemContentProvider,
                ITreeItemContentProvider,
                IItemLabelProvider,
                IItemPropertySource {
        /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public OriginalNameRecordMatcherItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

        /**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addCaseSensitivePropertyDescriptor(object);
			addIncludeFileExtensionPropertyDescriptor(object);
			addBaseFolderPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

        /**
	 * This adds a property descriptor for the Case Sensitive feature.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected void addCaseSensitivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OriginalNameRecordMatcher_caseSensitive_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OriginalNameRecordMatcher_caseSensitive_feature", "_UI_OriginalNameRecordMatcher_type"),
				 CrosswalkPackage.Literals.ORIGINAL_NAME_RECORD_MATCHER__CASE_SENSITIVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

        /**
	 * This adds a property descriptor for the Include File Extension feature.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected void addIncludeFileExtensionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OriginalNameRecordMatcher_includeFileExtension_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OriginalNameRecordMatcher_includeFileExtension_feature", "_UI_OriginalNameRecordMatcher_type"),
				 CrosswalkPackage.Literals.ORIGINAL_NAME_RECORD_MATCHER__INCLUDE_FILE_EXTENSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

        /**
	 * This adds a property descriptor for the Base Folder feature.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected void addBaseFolderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OriginalNameRecordMatcher_baseFolder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OriginalNameRecordMatcher_baseFolder_feature", "_UI_OriginalNameRecordMatcher_type"),
				 CrosswalkPackage.Literals.ORIGINAL_NAME_RECORD_MATCHER__BASE_FOLDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

        /**
	 * This returns OriginalNameRecordMatcher.gif.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OriginalNameRecordMatcher"));
	}

        /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public String getText(Object object) {
		OriginalNameRecordMatcher originalNameRecordMatcher = (OriginalNameRecordMatcher)object;
		return getString("_UI_OriginalNameRecordMatcher_type") + " " + originalNameRecordMatcher.isCaseSensitive();
	}

        /**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(OriginalNameRecordMatcher.class)) {
			case CrosswalkPackage.ORIGINAL_NAME_RECORD_MATCHER__CASE_SENSITIVE:
			case CrosswalkPackage.ORIGINAL_NAME_RECORD_MATCHER__INCLUDE_FILE_EXTENSION:
			case CrosswalkPackage.ORIGINAL_NAME_RECORD_MATCHER__BASE_FOLDER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

        /**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
