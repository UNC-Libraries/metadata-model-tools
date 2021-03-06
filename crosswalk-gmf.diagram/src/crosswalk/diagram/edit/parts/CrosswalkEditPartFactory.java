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
package crosswalk.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

import crosswalk.diagram.part.CrosswalkVisualIDRegistry;

/**
 * @generated
 */
public class CrosswalkEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (CrosswalkVisualIDRegistry.getVisualID(view)) {

			case EditingContainerEditPart.VISUAL_ID:
				return new EditingContainerEditPart(view);

			case CrossWalkEditPart.VISUAL_ID:
				return new CrossWalkEditPart(view);

			case DictionaryEditPart.VISUAL_ID:
				return new DictionaryEditPart(view);

			case DictionaryNameEditPart.VISUAL_ID:
				return new DictionaryNameEditPart(view);

			case DictionaryDescriptionEditPart.VISUAL_ID:
				return new DictionaryDescriptionEditPart(view);

			case FormEditPart.VISUAL_ID:
				return new FormEditPart(view);

			case FormTitleEditPart.VISUAL_ID:
				return new FormTitleEditPart(view);

			case FormDescriptionEditPart.VISUAL_ID:
				return new FormDescriptionEditPart(view);

			case DelimitedFileEditPart.VISUAL_ID:
				return new DelimitedFileEditPart(view);

			case DelimitedFileSourceFileEditPart.VISUAL_ID:
				return new DelimitedFileSourceFileEditPart(view);

			case TabbedDataFieldEditPart.VISUAL_ID:
				return new TabbedDataFieldEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case TabbedDataFieldLabelColumnNumberEditPart.VISUAL_ID:
				return new TabbedDataFieldLabelColumnNumberEditPart(view);

			case OriginalNameRecordMatcherEditPart.VISUAL_ID:
				return new OriginalNameRecordMatcherEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case DateRecognizerEditPart.VISUAL_ID:
				return new DateRecognizerEditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case TextEditPart.VISUAL_ID:
				return new TextEditPart(view);

			case TextValueEditPart.VISUAL_ID:
				return new TextValueEditPart(view);

			case TrimWhitespaceEditPart.VISUAL_ID:
				return new TrimWhitespaceEditPart(view);

			case WrappingLabel4EditPart.VISUAL_ID:
				return new WrappingLabel4EditPart(view);

			case MappedElementEditPart.VISUAL_ID:
				return new MappedElementEditPart(view);

			case WrappingLabel5EditPart.VISUAL_ID:
				return new WrappingLabel5EditPart(view);

			case MappedElement2EditPart.VISUAL_ID:
				return new MappedElement2EditPart(view);

			case WrappingLabel6EditPart.VISUAL_ID:
				return new WrappingLabel6EditPart(view);

			case MappedAttributeEditPart.VISUAL_ID:
				return new MappedAttributeEditPart(view);

			case WrappingLabel7EditPart.VISUAL_ID:
				return new WrappingLabel7EditPart(view);

			case MetadataBlock2EditPart.VISUAL_ID:
				return new MetadataBlock2EditPart(view);

			case MetadataBlockName2EditPart.VISUAL_ID:
				return new MetadataBlockName2EditPart(view);

			case TextInputFieldEditPart.VISUAL_ID:
				return new TextInputFieldEditPart(view);

			case TextInputFieldLabelEditPart.VISUAL_ID:
				return new TextInputFieldLabelEditPart(view);

			case CurrentDateEditPart.VISUAL_ID:
				return new CurrentDateEditPart(view);

			case WrappingLabel8EditPart.VISUAL_ID:
				return new WrappingLabel8EditPart(view);

			case CurrentUsernameEditPart.VISUAL_ID:
				return new CurrentUsernameEditPart(view);

			case WrappingLabel9EditPart.VISUAL_ID:
				return new WrappingLabel9EditPart(view);

			case DateInputFieldEditPart.VISUAL_ID:
				return new DateInputFieldEditPart(view);

			case DateInputFieldLabelEditPart.VISUAL_ID:
				return new DateInputFieldLabelEditPart(view);

			case MetadataBlockEditPart.VISUAL_ID:
				return new MetadataBlockEditPart(view);

			case MetadataBlockNameEditPart.VISUAL_ID:
				return new MetadataBlockNameEditPart(view);

			case MetadataBlock3EditPart.VISUAL_ID:
				return new MetadataBlock3EditPart(view);

			case MetadataBlockName3EditPart.VISUAL_ID:
				return new MetadataBlockName3EditPart(view);

			case ParagraphEditPart.VISUAL_ID:
				return new ParagraphEditPart(view);

			case ParagraphHeadingEditPart.VISUAL_ID:
				return new ParagraphHeadingEditPart(view);

			case ParagraphTextEditPart.VISUAL_ID:
				return new ParagraphTextEditPart(view);

			case FileBlockEditPart.VISUAL_ID:
				return new FileBlockEditPart(view);

			case FileBlockNameEditPart.VISUAL_ID:
				return new FileBlockNameEditPart(view);

			case FileBlockDescriptionEditPart.VISUAL_ID:
				return new FileBlockDescriptionEditPart(view);

			case CrossWalkModelBoxCompartmentEditPart.VISUAL_ID:
				return new CrossWalkModelBoxCompartmentEditPart(view);

			case DelimitedFileDataFieldCompartmentEditPart.VISUAL_ID:
				return new DelimitedFileDataFieldCompartmentEditPart(view);

			case MappedElementChildElementsCompartmentEditPart.VISUAL_ID:
				return new MappedElementChildElementsCompartmentEditPart(view);

			case MappedElementChildAttributesCompartmentEditPart.VISUAL_ID:
				return new MappedElementChildAttributesCompartmentEditPart(view);

			case MappedElementChildElementsCompartment2EditPart.VISUAL_ID:
				return new MappedElementChildElementsCompartment2EditPart(view);

			case MappedElementChildAttributesCompartment2EditPart.VISUAL_ID:
				return new MappedElementChildAttributesCompartment2EditPart(
						view);

			case MetadataBlockMetadataBlockInputFieldsCompartment2EditPart.VISUAL_ID:
				return new MetadataBlockMetadataBlockInputFieldsCompartment2EditPart(
						view);

			case MetadataBlockMetadataBlockMappingCompartment2EditPart.VISUAL_ID:
				return new MetadataBlockMetadataBlockMappingCompartment2EditPart(
						view);

			case DictionaryModelBoxCompartmentEditPart.VISUAL_ID:
				return new DictionaryModelBoxCompartmentEditPart(view);

			case MetadataBlockMetadataBlockInputFieldsCompartmentEditPart.VISUAL_ID:
				return new MetadataBlockMetadataBlockInputFieldsCompartmentEditPart(
						view);

			case MetadataBlockMetadataBlockMappingCompartmentEditPart.VISUAL_ID:
				return new MetadataBlockMetadataBlockMappingCompartmentEditPart(
						view);

			case FormModelBoxCompartmentEditPart.VISUAL_ID:
				return new FormModelBoxCompartmentEditPart(view);

			case MetadataBlockMetadataBlockInputFieldsCompartment3EditPart.VISUAL_ID:
				return new MetadataBlockMetadataBlockInputFieldsCompartment3EditPart(
						view);

			case MetadataBlockMetadataBlockMappingCompartment3EditPart.VISUAL_ID:
				return new MetadataBlockMetadataBlockMappingCompartment3EditPart(
						view);

			case InputOutputEditPart.VISUAL_ID:
				return new InputOutputEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}
}
