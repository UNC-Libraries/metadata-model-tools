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
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import crosswalk.CrossWalk;
import crosswalk.CrosswalkFactory;
import crosswalk.CrosswalkPackage;

/**
 * This is the item provider adapter for a {@link crosswalk.CrossWalk} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CrossWalkItemProvider
        extends ContextProviderItemProvider
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
        public CrossWalkItemProvider(AdapterFactory adapterFactory) {
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

			addExceptionsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

        /**
	 * This adds a property descriptor for the Exceptions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExceptionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MappingContainer_exceptions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappingContainer_exceptions_feature", "_UI_MappingContainer_type"),
				 CrosswalkPackage.Literals.MAPPING_CONTAINER__EXCEPTIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

								/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CrosswalkPackage.Literals.MAPPING_CONTAINER__WIDGETS);
			childrenFeatures.add(CrosswalkPackage.Literals.MAPPING_CONTAINER__ELEMENTS);
			childrenFeatures.add(CrosswalkPackage.Literals.CROSS_WALK__DATA_SOURCE);
		}
		return childrenFeatures;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

        /**
	 * This returns CrossWalk.gif.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CrossWalk"));
	}

        /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public String getText(Object object) {
		String label = ((CrossWalk)object).getCurrentUser();
		return label == null || label.length() == 0 ?
			getString("_UI_CrossWalk_type") :
			getString("_UI_CrossWalk_type") + " " + label;
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

		switch (notification.getFeatureID(CrossWalk.class)) {
			case CrosswalkPackage.CROSS_WALK__EXCEPTIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CrosswalkPackage.CROSS_WALK__WIDGETS:
			case CrosswalkPackage.CROSS_WALK__ELEMENTS:
			case CrosswalkPackage.CROSS_WALK__DATA_SOURCE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(CrosswalkPackage.Literals.MAPPING_CONTAINER__WIDGETS,
				 CrosswalkFactory.eINSTANCE.createTrimWhitespace()));

		newChildDescriptors.add
			(createChildParameter
				(CrosswalkPackage.Literals.MAPPING_CONTAINER__WIDGETS,
				 CrosswalkFactory.eINSTANCE.createCurrentUsername()));

		newChildDescriptors.add
			(createChildParameter
				(CrosswalkPackage.Literals.MAPPING_CONTAINER__WIDGETS,
				 CrosswalkFactory.eINSTANCE.createCurrentDate()));

		newChildDescriptors.add
			(createChildParameter
				(CrosswalkPackage.Literals.MAPPING_CONTAINER__WIDGETS,
				 CrosswalkFactory.eINSTANCE.createOriginalNameRecordMatcher()));

		newChildDescriptors.add
			(createChildParameter
				(CrosswalkPackage.Literals.MAPPING_CONTAINER__WIDGETS,
				 CrosswalkFactory.eINSTANCE.createDateRecognizer()));

		newChildDescriptors.add
			(createChildParameter
				(CrosswalkPackage.Literals.MAPPING_CONTAINER__WIDGETS,
				 CrosswalkFactory.eINSTANCE.createText()));

		newChildDescriptors.add
			(createChildParameter
				(CrosswalkPackage.Literals.MAPPING_CONTAINER__ELEMENTS,
				 CrosswalkFactory.eINSTANCE.createMappedElement()));

		newChildDescriptors.add
			(createChildParameter
				(CrosswalkPackage.Literals.MAPPING_CONTAINER__ELEMENTS,
				 CrosswalkFactory.eINSTANCE.createMappedAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CrosswalkPackage.Literals.MAPPING_CONTAINER__ELEMENTS,
				 CrosswalkFactory.eINSTANCE.createMetadataBlock()));

		newChildDescriptors.add
			(createChildParameter
				(CrosswalkPackage.Literals.CROSS_WALK__DATA_SOURCE,
				 CrosswalkFactory.eINSTANCE.createDelimitedFile()));
	}

}
