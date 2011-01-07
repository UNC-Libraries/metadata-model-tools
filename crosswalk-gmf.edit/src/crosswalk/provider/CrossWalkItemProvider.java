/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk.provider;


import crosswalk.CrossWalk;
import crosswalk.CrosswalkFactory;
import crosswalk.CrosswalkPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link crosswalk.CrossWalk} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CrossWalkItemProvider
        extends ItemProviderAdapter
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

                }
                return itemPropertyDescriptors;
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
                        childrenFeatures.add(CrosswalkPackage.Literals.CROSS_WALK__DATA_SOURCE);
                        childrenFeatures.add(CrosswalkPackage.Literals.CROSS_WALK__WIDGETS);
                        childrenFeatures.add(CrosswalkPackage.Literals.CROSS_WALK__ELEMENTS);
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
                return getString("_UI_CrossWalk_type");
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
                        case CrosswalkPackage.CROSS_WALK__DATA_SOURCE:
                        case CrosswalkPackage.CROSS_WALK__WIDGETS:
                        case CrosswalkPackage.CROSS_WALK__ELEMENTS:
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
                                (CrosswalkPackage.Literals.CROSS_WALK__DATA_SOURCE,
                                 CrosswalkFactory.eINSTANCE.createTabSeparatedFile()));

                newChildDescriptors.add
                        (createChildParameter
                                (CrosswalkPackage.Literals.CROSS_WALK__WIDGETS,
                                 CrosswalkFactory.eINSTANCE.createTrimWhitespace()));

                newChildDescriptors.add
                        (createChildParameter
                                (CrosswalkPackage.Literals.CROSS_WALK__WIDGETS,
                                 CrosswalkFactory.eINSTANCE.createOriginalNameRecordMatcher()));

                newChildDescriptors.add
                        (createChildParameter
                                (CrosswalkPackage.Literals.CROSS_WALK__WIDGETS,
                                 CrosswalkFactory.eINSTANCE.createDateRecognizer()));

                newChildDescriptors.add
                        (createChildParameter
                                (CrosswalkPackage.Literals.CROSS_WALK__WIDGETS,
                                 CrosswalkFactory.eINSTANCE.createText()));

                newChildDescriptors.add
                        (createChildParameter
                                (CrosswalkPackage.Literals.CROSS_WALK__ELEMENTS,
                                 CrosswalkFactory.eINSTANCE.createTitleInfo()));

                newChildDescriptors.add
                        (createChildParameter
                                (CrosswalkPackage.Literals.CROSS_WALK__ELEMENTS,
                                 CrosswalkFactory.eINSTANCE.createAbstract()));

                newChildDescriptors.add
                        (createChildParameter
                                (CrosswalkPackage.Literals.CROSS_WALK__ELEMENTS,
                                 CrosswalkFactory.eINSTANCE.createGenre()));

                newChildDescriptors.add
                        (createChildParameter
                                (CrosswalkPackage.Literals.CROSS_WALK__ELEMENTS,
                                 CrosswalkFactory.eINSTANCE.createIdentifier()));

                newChildDescriptors.add
                        (createChildParameter
                                (CrosswalkPackage.Literals.CROSS_WALK__ELEMENTS,
                                 CrosswalkFactory.eINSTANCE.createLanguage()));

                newChildDescriptors.add
                        (createChildParameter
                                (CrosswalkPackage.Literals.CROSS_WALK__ELEMENTS,
                                 CrosswalkFactory.eINSTANCE.createName()));

                newChildDescriptors.add
                        (createChildParameter
                                (CrosswalkPackage.Literals.CROSS_WALK__ELEMENTS,
                                 CrosswalkFactory.eINSTANCE.createSubject()));

                newChildDescriptors.add
                        (createChildParameter
                                (CrosswalkPackage.Literals.CROSS_WALK__ELEMENTS,
                                 CrosswalkFactory.eINSTANCE.createTypeOfResource()));

                newChildDescriptors.add
                        (createChildParameter
                                (CrosswalkPackage.Literals.CROSS_WALK__ELEMENTS,
                                 CrosswalkFactory.eINSTANCE.createDateCreated()));

                newChildDescriptors.add
                        (createChildParameter
                                (CrosswalkPackage.Literals.CROSS_WALK__ELEMENTS,
                                 CrosswalkFactory.eINSTANCE.createAccessCondition()));
        }

        /**
         * Return the resource locator for this item provider's resources.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public ResourceLocator getResourceLocator() {
                return CrosswalkEditPlugin.INSTANCE;
        }

}
