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
package crosswalk.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;
import crosswalk.CrosswalkPackage;
import crosswalk.EditingContainer;
import crosswalk.diagram.edit.parts.CrossWalkEditPart;
import crosswalk.diagram.edit.parts.CrossWalkModelBoxCompartmentEditPart;
import crosswalk.diagram.edit.parts.CurrentDateEditPart;
import crosswalk.diagram.edit.parts.CurrentUsernameEditPart;
import crosswalk.diagram.edit.parts.DateInputFieldEditPart;
import crosswalk.diagram.edit.parts.DateInputFieldLabelEditPart;
import crosswalk.diagram.edit.parts.DateRecognizerEditPart;
import crosswalk.diagram.edit.parts.DelimitedFileDataFieldCompartmentEditPart;
import crosswalk.diagram.edit.parts.DelimitedFileEditPart;
import crosswalk.diagram.edit.parts.DelimitedFileSourceFileEditPart;
import crosswalk.diagram.edit.parts.DictionaryDescriptionEditPart;
import crosswalk.diagram.edit.parts.DictionaryEditPart;
import crosswalk.diagram.edit.parts.DictionaryModelBoxCompartmentEditPart;
import crosswalk.diagram.edit.parts.DictionaryNameEditPart;
import crosswalk.diagram.edit.parts.EditingContainerEditPart;
import crosswalk.diagram.edit.parts.FileBlockDescriptionEditPart;
import crosswalk.diagram.edit.parts.FileBlockEditPart;
import crosswalk.diagram.edit.parts.FileBlockNameEditPart;
import crosswalk.diagram.edit.parts.FormDescriptionEditPart;
import crosswalk.diagram.edit.parts.FormEditPart;
import crosswalk.diagram.edit.parts.FormModelBoxCompartmentEditPart;
import crosswalk.diagram.edit.parts.FormTitleEditPart;
import crosswalk.diagram.edit.parts.MappedAttributeEditPart;
import crosswalk.diagram.edit.parts.MappedElement2EditPart;
import crosswalk.diagram.edit.parts.MappedElementChildAttributesCompartment2EditPart;
import crosswalk.diagram.edit.parts.MappedElementChildAttributesCompartmentEditPart;
import crosswalk.diagram.edit.parts.MappedElementChildElementsCompartment2EditPart;
import crosswalk.diagram.edit.parts.MappedElementChildElementsCompartmentEditPart;
import crosswalk.diagram.edit.parts.MappedElementEditPart;
import crosswalk.diagram.edit.parts.MetadataBlock2EditPart;
import crosswalk.diagram.edit.parts.MetadataBlock3EditPart;
import crosswalk.diagram.edit.parts.MetadataBlockEditPart;
import crosswalk.diagram.edit.parts.MetadataBlockMetadataBlockInputFieldsCompartment2EditPart;
import crosswalk.diagram.edit.parts.MetadataBlockMetadataBlockInputFieldsCompartment3EditPart;
import crosswalk.diagram.edit.parts.MetadataBlockMetadataBlockInputFieldsCompartmentEditPart;
import crosswalk.diagram.edit.parts.MetadataBlockMetadataBlockMappingCompartment2EditPart;
import crosswalk.diagram.edit.parts.MetadataBlockMetadataBlockMappingCompartment3EditPart;
import crosswalk.diagram.edit.parts.MetadataBlockMetadataBlockMappingCompartmentEditPart;
import crosswalk.diagram.edit.parts.MetadataBlockName2EditPart;
import crosswalk.diagram.edit.parts.MetadataBlockName3EditPart;
import crosswalk.diagram.edit.parts.MetadataBlockNameEditPart;
import crosswalk.diagram.edit.parts.OriginalNameRecordMatcherEditPart;
import crosswalk.diagram.edit.parts.ParagraphEditPart;
import crosswalk.diagram.edit.parts.ParagraphHeadingEditPart;
import crosswalk.diagram.edit.parts.ParagraphTextEditPart;
import crosswalk.diagram.edit.parts.TabbedDataFieldEditPart;
import crosswalk.diagram.edit.parts.TabbedDataFieldLabelColumnNumberEditPart;
import crosswalk.diagram.edit.parts.TextEditPart;
import crosswalk.diagram.edit.parts.TextInputFieldEditPart;
import crosswalk.diagram.edit.parts.TextInputFieldLabelEditPart;
import crosswalk.diagram.edit.parts.TextValueEditPart;
import crosswalk.diagram.edit.parts.TrimWhitespaceEditPart;
import crosswalk.diagram.edit.parts.WrappingLabel2EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel3EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel4EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel5EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel6EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel7EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel8EditPart;
import crosswalk.diagram.edit.parts.WrappingLabel9EditPart;
import crosswalk.diagram.edit.parts.WrappingLabelEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 *
 * @generated
 */
public class CrosswalkVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "crosswalk-gmf.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (EditingContainerEditPart.MODEL_ID.equals(view.getType())) {
				return EditingContainerEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return crosswalk.diagram.part.CrosswalkVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				CrosswalkDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (CrosswalkPackage.eINSTANCE.getEditingContainer().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((EditingContainer) domainElement)) {
			return EditingContainerEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = crosswalk.diagram.part.CrosswalkVisualIDRegistry
				.getModelID(containerView);
		if (!EditingContainerEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (EditingContainerEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = crosswalk.diagram.part.CrosswalkVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = EditingContainerEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case EditingContainerEditPart.VISUAL_ID:
			if (CrosswalkPackage.eINSTANCE.getCrossWalk().isSuperTypeOf(
					domainElement.eClass())) {
				return CrossWalkEditPart.VISUAL_ID;
			}
			if (CrosswalkPackage.eINSTANCE.getDictionary().isSuperTypeOf(
					domainElement.eClass())) {
				return DictionaryEditPart.VISUAL_ID;
			}
			if (CrosswalkPackage.eINSTANCE.getForm().isSuperTypeOf(
					domainElement.eClass())) {
				return FormEditPart.VISUAL_ID;
			}
			break;
		case CrossWalkEditPart.VISUAL_ID:
			if (CrosswalkPackage.eINSTANCE.getCurrentDate().isSuperTypeOf(
					domainElement.eClass())) {
				return CurrentDateEditPart.VISUAL_ID;
			}
			if (CrosswalkPackage.eINSTANCE.getCurrentUsername().isSuperTypeOf(
					domainElement.eClass())) {
				return CurrentUsernameEditPart.VISUAL_ID;
			}
			break;
		case CrossWalkModelBoxCompartmentEditPart.VISUAL_ID:
			if (CrosswalkPackage.eINSTANCE.getDelimitedFile().isSuperTypeOf(
					domainElement.eClass())) {
				return DelimitedFileEditPart.VISUAL_ID;
			}
			if (CrosswalkPackage.eINSTANCE.getOriginalNameRecordMatcher()
					.isSuperTypeOf(domainElement.eClass())) {
				return OriginalNameRecordMatcherEditPart.VISUAL_ID;
			}
			if (CrosswalkPackage.eINSTANCE.getDateRecognizer().isSuperTypeOf(
					domainElement.eClass())) {
				return DateRecognizerEditPart.VISUAL_ID;
			}
			if (CrosswalkPackage.eINSTANCE.getText().isSuperTypeOf(
					domainElement.eClass())) {
				return TextEditPart.VISUAL_ID;
			}
			if (CrosswalkPackage.eINSTANCE.getTrimWhitespace().isSuperTypeOf(
					domainElement.eClass())) {
				return TrimWhitespaceEditPart.VISUAL_ID;
			}
			if (CrosswalkPackage.eINSTANCE.getMappedElement().isSuperTypeOf(
					domainElement.eClass())) {
				return MappedElementEditPart.VISUAL_ID;
			}
			if (CrosswalkPackage.eINSTANCE.getMetadataBlock().isSuperTypeOf(
					domainElement.eClass())) {
				return MetadataBlock2EditPart.VISUAL_ID;
			}
			break;
		case DelimitedFileDataFieldCompartmentEditPart.VISUAL_ID:
			if (CrosswalkPackage.eINSTANCE.getTabbedDataField().isSuperTypeOf(
					domainElement.eClass())) {
				return TabbedDataFieldEditPart.VISUAL_ID;
			}
			break;
		case MappedElementChildElementsCompartmentEditPart.VISUAL_ID:
			if (CrosswalkPackage.eINSTANCE.getMappedElement().isSuperTypeOf(
					domainElement.eClass())) {
				return MappedElement2EditPart.VISUAL_ID;
			}
			break;
		case MappedElementChildAttributesCompartmentEditPart.VISUAL_ID:
			if (CrosswalkPackage.eINSTANCE.getMappedAttribute().isSuperTypeOf(
					domainElement.eClass())) {
				return MappedAttributeEditPart.VISUAL_ID;
			}
			break;
		case MappedElementChildElementsCompartment2EditPart.VISUAL_ID:
			if (CrosswalkPackage.eINSTANCE.getMappedElement().isSuperTypeOf(
					domainElement.eClass())) {
				return MappedElement2EditPart.VISUAL_ID;
			}
			break;
		case MappedElementChildAttributesCompartment2EditPart.VISUAL_ID:
			if (CrosswalkPackage.eINSTANCE.getMappedAttribute().isSuperTypeOf(
					domainElement.eClass())) {
				return MappedAttributeEditPart.VISUAL_ID;
			}
			break;
		case MetadataBlockMetadataBlockInputFieldsCompartment2EditPart.VISUAL_ID:
			if (CrosswalkPackage.eINSTANCE.getTextInputField().isSuperTypeOf(
					domainElement.eClass())) {
				return TextInputFieldEditPart.VISUAL_ID;
			}
			if (CrosswalkPackage.eINSTANCE.getDateInputField().isSuperTypeOf(
					domainElement.eClass())) {
				return DateInputFieldEditPart.VISUAL_ID;
			}
			break;
		case MetadataBlockMetadataBlockMappingCompartment2EditPart.VISUAL_ID:
			if (CrosswalkPackage.eINSTANCE.getDateRecognizer().isSuperTypeOf(
					domainElement.eClass())) {
				return DateRecognizerEditPart.VISUAL_ID;
			}
			if (CrosswalkPackage.eINSTANCE.getText().isSuperTypeOf(
					domainElement.eClass())) {
				return TextEditPart.VISUAL_ID;
			}
			if (CrosswalkPackage.eINSTANCE.getTrimWhitespace().isSuperTypeOf(
					domainElement.eClass())) {
				return TrimWhitespaceEditPart.VISUAL_ID;
			}
			if (CrosswalkPackage.eINSTANCE.getMappedElement().isSuperTypeOf(
					domainElement.eClass())) {
				return MappedElementEditPart.VISUAL_ID;
			}
			if (CrosswalkPackage.eINSTANCE.getCurrentDate().isSuperTypeOf(
					domainElement.eClass())) {
				return CurrentDateEditPart.VISUAL_ID;
			}
			if (CrosswalkPackage.eINSTANCE.getCurrentUsername().isSuperTypeOf(
					domainElement.eClass())) {
				return CurrentUsernameEditPart.VISUAL_ID;
			}
			break;
		case DictionaryModelBoxCompartmentEditPart.VISUAL_ID:
			if (CrosswalkPackage.eINSTANCE.getMetadataBlock().isSuperTypeOf(
					domainElement.eClass())) {
				return MetadataBlockEditPart.VISUAL_ID;
			}
			break;
		case MetadataBlockMetadataBlockInputFieldsCompartmentEditPart.VISUAL_ID:
			if (CrosswalkPackage.eINSTANCE.getTextInputField().isSuperTypeOf(
					domainElement.eClass())) {
				return TextInputFieldEditPart.VISUAL_ID;
			}
			if (CrosswalkPackage.eINSTANCE.getDateInputField().isSuperTypeOf(
					domainElement.eClass())) {
				return DateInputFieldEditPart.VISUAL_ID;
			}
			break;
		case MetadataBlockMetadataBlockMappingCompartmentEditPart.VISUAL_ID:
			if (CrosswalkPackage.eINSTANCE.getDateRecognizer().isSuperTypeOf(
					domainElement.eClass())) {
				return DateRecognizerEditPart.VISUAL_ID;
			}
			if (CrosswalkPackage.eINSTANCE.getText().isSuperTypeOf(
					domainElement.eClass())) {
				return TextEditPart.VISUAL_ID;
			}
			if (CrosswalkPackage.eINSTANCE.getTrimWhitespace().isSuperTypeOf(
					domainElement.eClass())) {
				return TrimWhitespaceEditPart.VISUAL_ID;
			}
			if (CrosswalkPackage.eINSTANCE.getMappedElement().isSuperTypeOf(
					domainElement.eClass())) {
				return MappedElementEditPart.VISUAL_ID;
			}
			if (CrosswalkPackage.eINSTANCE.getCurrentDate().isSuperTypeOf(
					domainElement.eClass())) {
				return CurrentDateEditPart.VISUAL_ID;
			}
			if (CrosswalkPackage.eINSTANCE.getCurrentUsername().isSuperTypeOf(
					domainElement.eClass())) {
				return CurrentUsernameEditPart.VISUAL_ID;
			}
			break;
		case FormModelBoxCompartmentEditPart.VISUAL_ID:
			if (CrosswalkPackage.eINSTANCE.getMetadataBlock().isSuperTypeOf(
					domainElement.eClass())) {
				return MetadataBlock3EditPart.VISUAL_ID;
			}
			if (CrosswalkPackage.eINSTANCE.getParagraph().isSuperTypeOf(
					domainElement.eClass())) {
				return ParagraphEditPart.VISUAL_ID;
			}
			if (CrosswalkPackage.eINSTANCE.getFileBlock().isSuperTypeOf(
					domainElement.eClass())) {
				return FileBlockEditPart.VISUAL_ID;
			}
			break;
		case MetadataBlockMetadataBlockInputFieldsCompartment3EditPart.VISUAL_ID:
			if (CrosswalkPackage.eINSTANCE.getTextInputField().isSuperTypeOf(
					domainElement.eClass())) {
				return TextInputFieldEditPart.VISUAL_ID;
			}
			if (CrosswalkPackage.eINSTANCE.getDateInputField().isSuperTypeOf(
					domainElement.eClass())) {
				return DateInputFieldEditPart.VISUAL_ID;
			}
			break;
		case MetadataBlockMetadataBlockMappingCompartment3EditPart.VISUAL_ID:
			if (CrosswalkPackage.eINSTANCE.getDateRecognizer().isSuperTypeOf(
					domainElement.eClass())) {
				return DateRecognizerEditPart.VISUAL_ID;
			}
			if (CrosswalkPackage.eINSTANCE.getText().isSuperTypeOf(
					domainElement.eClass())) {
				return TextEditPart.VISUAL_ID;
			}
			if (CrosswalkPackage.eINSTANCE.getTrimWhitespace().isSuperTypeOf(
					domainElement.eClass())) {
				return TrimWhitespaceEditPart.VISUAL_ID;
			}
			if (CrosswalkPackage.eINSTANCE.getMappedElement().isSuperTypeOf(
					domainElement.eClass())) {
				return MappedElementEditPart.VISUAL_ID;
			}
			if (CrosswalkPackage.eINSTANCE.getCurrentDate().isSuperTypeOf(
					domainElement.eClass())) {
				return CurrentDateEditPart.VISUAL_ID;
			}
			if (CrosswalkPackage.eINSTANCE.getCurrentUsername().isSuperTypeOf(
					domainElement.eClass())) {
				return CurrentUsernameEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = crosswalk.diagram.part.CrosswalkVisualIDRegistry
				.getModelID(containerView);
		if (!EditingContainerEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (EditingContainerEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = crosswalk.diagram.part.CrosswalkVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = EditingContainerEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case EditingContainerEditPart.VISUAL_ID:
			if (CrossWalkEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DictionaryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FormEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CrossWalkEditPart.VISUAL_ID:
			if (CrossWalkModelBoxCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CurrentDateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CurrentUsernameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DictionaryEditPart.VISUAL_ID:
			if (DictionaryNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DictionaryDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DictionaryModelBoxCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FormEditPart.VISUAL_ID:
			if (FormTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FormDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FormModelBoxCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DelimitedFileEditPart.VISUAL_ID:
			if (DelimitedFileSourceFileEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DelimitedFileDataFieldCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TabbedDataFieldEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TabbedDataFieldLabelColumnNumberEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OriginalNameRecordMatcherEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DateRecognizerEditPart.VISUAL_ID:
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TextEditPart.VISUAL_ID:
			if (TextValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TrimWhitespaceEditPart.VISUAL_ID:
			if (WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MappedElementEditPart.VISUAL_ID:
			if (WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MappedElementChildElementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MappedElementChildAttributesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MappedElement2EditPart.VISUAL_ID:
			if (WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MappedElementChildElementsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MappedElementChildAttributesCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MappedAttributeEditPart.VISUAL_ID:
			if (WrappingLabel7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MetadataBlock2EditPart.VISUAL_ID:
			if (MetadataBlockName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MetadataBlockMetadataBlockInputFieldsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MetadataBlockMetadataBlockMappingCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TextInputFieldEditPart.VISUAL_ID:
			if (TextInputFieldLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CurrentDateEditPart.VISUAL_ID:
			if (WrappingLabel8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CurrentUsernameEditPart.VISUAL_ID:
			if (WrappingLabel9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DateInputFieldEditPart.VISUAL_ID:
			if (DateInputFieldLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MetadataBlockEditPart.VISUAL_ID:
			if (MetadataBlockNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MetadataBlockMetadataBlockInputFieldsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MetadataBlockMetadataBlockMappingCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MetadataBlock3EditPart.VISUAL_ID:
			if (MetadataBlockName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MetadataBlockMetadataBlockInputFieldsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MetadataBlockMetadataBlockMappingCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParagraphEditPart.VISUAL_ID:
			if (ParagraphHeadingEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParagraphTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FileBlockEditPart.VISUAL_ID:
			if (FileBlockNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FileBlockDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CrossWalkModelBoxCompartmentEditPart.VISUAL_ID:
			if (DelimitedFileEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OriginalNameRecordMatcherEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DateRecognizerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TrimWhitespaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MappedElementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MetadataBlock2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DelimitedFileDataFieldCompartmentEditPart.VISUAL_ID:
			if (TabbedDataFieldEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MappedElementChildElementsCompartmentEditPart.VISUAL_ID:
			if (MappedElement2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MappedElementChildAttributesCompartmentEditPart.VISUAL_ID:
			if (MappedAttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MappedElementChildElementsCompartment2EditPart.VISUAL_ID:
			if (MappedElement2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MappedElementChildAttributesCompartment2EditPart.VISUAL_ID:
			if (MappedAttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MetadataBlockMetadataBlockInputFieldsCompartment2EditPart.VISUAL_ID:
			if (TextInputFieldEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DateInputFieldEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MetadataBlockMetadataBlockMappingCompartment2EditPart.VISUAL_ID:
			if (DateRecognizerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TrimWhitespaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MappedElementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CurrentDateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CurrentUsernameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DictionaryModelBoxCompartmentEditPart.VISUAL_ID:
			if (MetadataBlockEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MetadataBlockMetadataBlockInputFieldsCompartmentEditPart.VISUAL_ID:
			if (TextInputFieldEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DateInputFieldEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MetadataBlockMetadataBlockMappingCompartmentEditPart.VISUAL_ID:
			if (DateRecognizerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TrimWhitespaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MappedElementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CurrentDateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CurrentUsernameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FormModelBoxCompartmentEditPart.VISUAL_ID:
			if (MetadataBlock3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParagraphEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FileBlockEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MetadataBlockMetadataBlockInputFieldsCompartment3EditPart.VISUAL_ID:
			if (TextInputFieldEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DateInputFieldEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MetadataBlockMetadataBlockMappingCompartment3EditPart.VISUAL_ID:
			if (DateRecognizerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TrimWhitespaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MappedElementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CurrentDateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CurrentUsernameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(EditingContainer element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case CrossWalkModelBoxCompartmentEditPart.VISUAL_ID:
		case DelimitedFileDataFieldCompartmentEditPart.VISUAL_ID:
		case MappedElementChildElementsCompartmentEditPart.VISUAL_ID:
		case MappedElementChildAttributesCompartmentEditPart.VISUAL_ID:
		case MappedElementChildElementsCompartment2EditPart.VISUAL_ID:
		case MappedElementChildAttributesCompartment2EditPart.VISUAL_ID:
		case MetadataBlockMetadataBlockInputFieldsCompartment2EditPart.VISUAL_ID:
		case MetadataBlockMetadataBlockMappingCompartment2EditPart.VISUAL_ID:
		case DictionaryModelBoxCompartmentEditPart.VISUAL_ID:
		case MetadataBlockMetadataBlockInputFieldsCompartmentEditPart.VISUAL_ID:
		case MetadataBlockMetadataBlockMappingCompartmentEditPart.VISUAL_ID:
		case FormModelBoxCompartmentEditPart.VISUAL_ID:
		case MetadataBlockMetadataBlockInputFieldsCompartment3EditPart.VISUAL_ID:
		case MetadataBlockMetadataBlockMappingCompartment3EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case EditingContainerEditPart.VISUAL_ID:
			return false;
		case TabbedDataFieldEditPart.VISUAL_ID:
		case OriginalNameRecordMatcherEditPart.VISUAL_ID:
		case DateRecognizerEditPart.VISUAL_ID:
		case TextEditPart.VISUAL_ID:
		case TrimWhitespaceEditPart.VISUAL_ID:
		case MappedAttributeEditPart.VISUAL_ID:
		case ParagraphEditPart.VISUAL_ID:
		case CurrentDateEditPart.VISUAL_ID:
		case CurrentUsernameEditPart.VISUAL_ID:
		case TextInputFieldEditPart.VISUAL_ID:
		case DateInputFieldEditPart.VISUAL_ID:
		case FileBlockEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return crosswalk.diagram.part.CrosswalkVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return crosswalk.diagram.part.CrosswalkVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return crosswalk.diagram.part.CrosswalkVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return crosswalk.diagram.part.CrosswalkVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return crosswalk.diagram.part.CrosswalkVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return crosswalk.diagram.part.CrosswalkVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
