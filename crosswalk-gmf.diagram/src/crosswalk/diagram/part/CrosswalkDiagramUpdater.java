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

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

import crosswalk.CrossWalk;
import crosswalk.CrosswalkPackage;
import crosswalk.DataField;
import crosswalk.DataSource;
import crosswalk.DateRecognizer;
import crosswalk.DelimitedFile;
import crosswalk.Dictionary;
import crosswalk.Editable;
import crosswalk.EditingContainer;
import crosswalk.Input;
import crosswalk.InputField;
import crosswalk.MappedAttribute;
import crosswalk.MappedElement;
import crosswalk.MetadataBlock;
import crosswalk.OriginalNameRecordMatcher;
import crosswalk.Output;
import crosswalk.OutputElement;
import crosswalk.TabbedDataField;
import crosswalk.Text;
import crosswalk.TrimWhitespace;
import crosswalk.WalkWidget;
import crosswalk.diagram.edit.parts.CrossWalk2EditPart;
import crosswalk.diagram.edit.parts.CrossWalkEditPart;
import crosswalk.diagram.edit.parts.CrossWalkModelBoxCompartmentEditPart;
import crosswalk.diagram.edit.parts.DateRecognizer2EditPart;
import crosswalk.diagram.edit.parts.DateRecognizerEditPart;
import crosswalk.diagram.edit.parts.DelimitedFileDataFieldCompartmentEditPart;
import crosswalk.diagram.edit.parts.DelimitedFileEditPart;
import crosswalk.diagram.edit.parts.DictionaryEditPart;
import crosswalk.diagram.edit.parts.DictionaryModelBoxCompartmentEditPart;
import crosswalk.diagram.edit.parts.EditingContainerEditPart;
import crosswalk.diagram.edit.parts.InputFieldEditPart;
import crosswalk.diagram.edit.parts.InputOutputEditPart;
import crosswalk.diagram.edit.parts.MappedAttribute2EditPart;
import crosswalk.diagram.edit.parts.MappedAttributeEditPart;
import crosswalk.diagram.edit.parts.MappedElement2EditPart;
import crosswalk.diagram.edit.parts.MappedElement3EditPart;
import crosswalk.diagram.edit.parts.MappedElementChildElementsCompartment2EditPart;
import crosswalk.diagram.edit.parts.MappedElementChildElementsCompartment3EditPart;
import crosswalk.diagram.edit.parts.MappedElementChildElementsCompartmentEditPart;
import crosswalk.diagram.edit.parts.MappedElementEditPart;
import crosswalk.diagram.edit.parts.MetadataBlock2EditPart;
import crosswalk.diagram.edit.parts.MetadataBlockEditPart;
import crosswalk.diagram.edit.parts.MetadataBlockMetadataBlockInputFieldsCompartment2EditPart;
import crosswalk.diagram.edit.parts.MetadataBlockMetadataBlockInputFieldsCompartmentEditPart;
import crosswalk.diagram.edit.parts.MetadataBlockMetadataBlockMappingCompartment2EditPart;
import crosswalk.diagram.edit.parts.MetadataBlockMetadataBlockMappingCompartmentEditPart;
import crosswalk.diagram.edit.parts.OriginalNameRecordMatcher2EditPart;
import crosswalk.diagram.edit.parts.OriginalNameRecordMatcherEditPart;
import crosswalk.diagram.edit.parts.TabbedDataFieldEditPart;
import crosswalk.diagram.edit.parts.Text2EditPart;
import crosswalk.diagram.edit.parts.TextEditPart;
import crosswalk.diagram.edit.parts.TrimWhitespace2EditPart;
import crosswalk.diagram.edit.parts.TrimWhitespaceEditPart;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class CrosswalkDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<CrosswalkNodeDescriptor> getSemanticChildren(View view) {
		switch (CrosswalkVisualIDRegistry.getVisualID(view)) {
			case EditingContainerEditPart.VISUAL_ID:
				return getEditingContainer_1000SemanticChildren(view);
			case CrossWalkModelBoxCompartmentEditPart.VISUAL_ID:
				return getCrossWalkModelBoxCompartment_7001SemanticChildren(view);
			case DelimitedFileDataFieldCompartmentEditPart.VISUAL_ID:
				return getDelimitedFileDataFieldCompartment_7002SemanticChildren(view);
			case MappedElementChildElementsCompartmentEditPart.VISUAL_ID:
				return getMappedElementChildElementsCompartment_7003SemanticChildren(view);
			case MappedElementChildElementsCompartment2EditPart.VISUAL_ID:
				return getMappedElementChildElementsCompartment_7004SemanticChildren(view);
			case MetadataBlockMetadataBlockInputFieldsCompartment2EditPart.VISUAL_ID:
				return getMetadataBlockMetadataBlockInputFieldsCompartment_7009SemanticChildren(view);
			case MetadataBlockMetadataBlockMappingCompartment2EditPart.VISUAL_ID:
				return getMetadataBlockMetadataBlockMappingCompartment_7010SemanticChildren(view);
			case MappedElementChildElementsCompartment3EditPart.VISUAL_ID:
				return getMappedElementChildElementsCompartment_7008SemanticChildren(view);
			case DictionaryModelBoxCompartmentEditPart.VISUAL_ID:
				return getDictionaryModelBoxCompartment_7005SemanticChildren(view);
			case MetadataBlockMetadataBlockInputFieldsCompartmentEditPart.VISUAL_ID:
				return getMetadataBlockMetadataBlockInputFieldsCompartment_7006SemanticChildren(view);
			case MetadataBlockMetadataBlockMappingCompartmentEditPart.VISUAL_ID:
				return getMetadataBlockMetadataBlockMappingCompartment_7007SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkNodeDescriptor> getEditingContainer_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		EditingContainer modelElement = (EditingContainer) view.getElement();
		LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
		{
			Editable childElement = modelElement.getModel();
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CrossWalkEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
			}
			if (visualID == DictionaryEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkNodeDescriptor> getCrossWalkModelBoxCompartment_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CrossWalk modelElement = (CrossWalk) containerView.getElement();
		LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
		{
			DataSource childElement = modelElement.getDataSource();
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DelimitedFileEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getWidgets().iterator(); it.hasNext();) {
			WalkWidget childElement = (WalkWidget) it.next();
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OriginalNameRecordMatcherEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DateRecognizerEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TextEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TrimWhitespaceEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getElements().iterator(); it.hasNext();) {
			OutputElement childElement = (OutputElement) it.next();
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MappedElementEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MetadataBlock2EditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkNodeDescriptor> getDelimitedFileDataFieldCompartment_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		DelimitedFile modelElement = (DelimitedFile) containerView.getElement();
		LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
		for (Iterator<?> it = modelElement.getFields().iterator(); it.hasNext();) {
			DataField childElement = (DataField) it.next();
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == TabbedDataFieldEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkNodeDescriptor> getMappedElementChildElementsCompartment_7003SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MappedElement modelElement = (MappedElement) containerView.getElement();
		LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildElements().iterator(); it.hasNext();) {
			MappedElement childElement = (MappedElement) it.next();
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MappedElement2EditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getAttributes().iterator(); it.hasNext();) {
			MappedAttribute childElement = (MappedAttribute) it.next();
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MappedAttributeEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkNodeDescriptor> getMappedElementChildElementsCompartment_7004SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MappedElement modelElement = (MappedElement) containerView.getElement();
		LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildElements().iterator(); it.hasNext();) {
			MappedElement childElement = (MappedElement) it.next();
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MappedElement2EditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getAttributes().iterator(); it.hasNext();) {
			MappedAttribute childElement = (MappedAttribute) it.next();
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MappedAttributeEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkNodeDescriptor> getMetadataBlockMetadataBlockInputFieldsCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MetadataBlock modelElement = (MetadataBlock) containerView.getElement();
		LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPorts().iterator(); it.hasNext();) {
			InputField childElement = (InputField) it.next();
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputFieldEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkNodeDescriptor> getMetadataBlockMetadataBlockMappingCompartment_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MetadataBlock modelElement = (MetadataBlock) containerView.getElement();
		LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
		for (Iterator<?> it = modelElement.getWidgets().iterator(); it.hasNext();) {
			WalkWidget childElement = (WalkWidget) it.next();
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OriginalNameRecordMatcher2EditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DateRecognizer2EditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Text2EditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TrimWhitespace2EditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getElements().iterator(); it.hasNext();) {
			OutputElement childElement = (OutputElement) it.next();
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MappedElement3EditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkNodeDescriptor> getDictionaryModelBoxCompartment_7005SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Dictionary modelElement = (Dictionary) containerView.getElement();
		LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
		for (Iterator<?> it = modelElement.getBlocks().iterator(); it.hasNext();) {
			MetadataBlock childElement = (MetadataBlock) it.next();
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MetadataBlockEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkNodeDescriptor> getMetadataBlockMetadataBlockInputFieldsCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MetadataBlock modelElement = (MetadataBlock) containerView.getElement();
		LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPorts().iterator(); it.hasNext();) {
			InputField childElement = (InputField) it.next();
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputFieldEditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkNodeDescriptor> getMetadataBlockMetadataBlockMappingCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MetadataBlock modelElement = (MetadataBlock) containerView.getElement();
		LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
		for (Iterator<?> it = modelElement.getWidgets().iterator(); it.hasNext();) {
			WalkWidget childElement = (WalkWidget) it.next();
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OriginalNameRecordMatcher2EditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DateRecognizer2EditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Text2EditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TrimWhitespace2EditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getElements().iterator(); it.hasNext();) {
			OutputElement childElement = (OutputElement) it.next();
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MappedElement3EditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkNodeDescriptor> getMappedElementChildElementsCompartment_7008SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MappedElement modelElement = (MappedElement) containerView.getElement();
		LinkedList<CrosswalkNodeDescriptor> result = new LinkedList<CrosswalkNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildElements().iterator(); it.hasNext();) {
			MappedElement childElement = (MappedElement) it.next();
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MappedElement2EditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getAttributes().iterator(); it.hasNext();) {
			MappedAttribute childElement = (MappedAttribute) it.next();
			int visualID = CrosswalkVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MappedAttribute2EditPart.VISUAL_ID) {
				result.add(new CrosswalkNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getContainedLinks(View view) {
		switch (CrosswalkVisualIDRegistry.getVisualID(view)) {
			case EditingContainerEditPart.VISUAL_ID:
				return getEditingContainer_1000ContainedLinks(view);
			case CrossWalkEditPart.VISUAL_ID:
				return getCrossWalk_2001ContainedLinks(view);
			case DictionaryEditPart.VISUAL_ID:
				return getDictionary_2002ContainedLinks(view);
			case DelimitedFileEditPart.VISUAL_ID:
				return getDelimitedFile_3001ContainedLinks(view);
			case TabbedDataFieldEditPart.VISUAL_ID:
				return getTabbedDataField_3002ContainedLinks(view);
			case OriginalNameRecordMatcherEditPart.VISUAL_ID:
				return getOriginalNameRecordMatcher_3003ContainedLinks(view);
			case DateRecognizerEditPart.VISUAL_ID:
				return getDateRecognizer_3004ContainedLinks(view);
			case TextEditPart.VISUAL_ID:
				return getText_3005ContainedLinks(view);
			case TrimWhitespaceEditPart.VISUAL_ID:
				return getTrimWhitespace_3006ContainedLinks(view);
			case MappedElementEditPart.VISUAL_ID:
				return getMappedElement_3007ContainedLinks(view);
			case MappedElement2EditPart.VISUAL_ID:
				return getMappedElement_3008ContainedLinks(view);
			case MappedAttributeEditPart.VISUAL_ID:
				return getMappedAttribute_3009ContainedLinks(view);
			case MetadataBlock2EditPart.VISUAL_ID:
				return getMetadataBlock_3018ContainedLinks(view);
			case OriginalNameRecordMatcher2EditPart.VISUAL_ID:
				return getOriginalNameRecordMatcher_3011ContainedLinks(view);
			case DateRecognizer2EditPart.VISUAL_ID:
				return getDateRecognizer_3012ContainedLinks(view);
			case Text2EditPart.VISUAL_ID:
				return getText_3013ContainedLinks(view);
			case TrimWhitespace2EditPart.VISUAL_ID:
				return getTrimWhitespace_3014ContainedLinks(view);
			case MappedElement3EditPart.VISUAL_ID:
				return getMappedElement_3015ContainedLinks(view);
			case MappedAttribute2EditPart.VISUAL_ID:
				return getMappedAttribute_3016ContainedLinks(view);
			case InputFieldEditPart.VISUAL_ID:
				return getInputField_3017ContainedLinks(view);
			case MetadataBlockEditPart.VISUAL_ID:
				return getMetadataBlock_3010ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getIncomingLinks(View view) {
		switch (CrosswalkVisualIDRegistry.getVisualID(view)) {
			case CrossWalkEditPart.VISUAL_ID:
				return getCrossWalk_2001IncomingLinks(view);
			case DictionaryEditPart.VISUAL_ID:
				return getDictionary_2002IncomingLinks(view);
			case DelimitedFileEditPart.VISUAL_ID:
				return getDelimitedFile_3001IncomingLinks(view);
			case TabbedDataFieldEditPart.VISUAL_ID:
				return getTabbedDataField_3002IncomingLinks(view);
			case OriginalNameRecordMatcherEditPart.VISUAL_ID:
				return getOriginalNameRecordMatcher_3003IncomingLinks(view);
			case DateRecognizerEditPart.VISUAL_ID:
				return getDateRecognizer_3004IncomingLinks(view);
			case TextEditPart.VISUAL_ID:
				return getText_3005IncomingLinks(view);
			case TrimWhitespaceEditPart.VISUAL_ID:
				return getTrimWhitespace_3006IncomingLinks(view);
			case MappedElementEditPart.VISUAL_ID:
				return getMappedElement_3007IncomingLinks(view);
			case MappedElement2EditPart.VISUAL_ID:
				return getMappedElement_3008IncomingLinks(view);
			case MappedAttributeEditPart.VISUAL_ID:
				return getMappedAttribute_3009IncomingLinks(view);
			case MetadataBlock2EditPart.VISUAL_ID:
				return getMetadataBlock_3018IncomingLinks(view);
			case OriginalNameRecordMatcher2EditPart.VISUAL_ID:
				return getOriginalNameRecordMatcher_3011IncomingLinks(view);
			case DateRecognizer2EditPart.VISUAL_ID:
				return getDateRecognizer_3012IncomingLinks(view);
			case Text2EditPart.VISUAL_ID:
				return getText_3013IncomingLinks(view);
			case TrimWhitespace2EditPart.VISUAL_ID:
				return getTrimWhitespace_3014IncomingLinks(view);
			case MappedElement3EditPart.VISUAL_ID:
				return getMappedElement_3015IncomingLinks(view);
			case MappedAttribute2EditPart.VISUAL_ID:
				return getMappedAttribute_3016IncomingLinks(view);
			case InputFieldEditPart.VISUAL_ID:
				return getInputField_3017IncomingLinks(view);
			case MetadataBlockEditPart.VISUAL_ID:
				return getMetadataBlock_3010IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getOutgoingLinks(View view) {
		switch (CrosswalkVisualIDRegistry.getVisualID(view)) {
			case CrossWalkEditPart.VISUAL_ID:
				return getCrossWalk_2001OutgoingLinks(view);
			case DictionaryEditPart.VISUAL_ID:
				return getDictionary_2002OutgoingLinks(view);
			case DelimitedFileEditPart.VISUAL_ID:
				return getDelimitedFile_3001OutgoingLinks(view);
			case TabbedDataFieldEditPart.VISUAL_ID:
				return getTabbedDataField_3002OutgoingLinks(view);
			case OriginalNameRecordMatcherEditPart.VISUAL_ID:
				return getOriginalNameRecordMatcher_3003OutgoingLinks(view);
			case DateRecognizerEditPart.VISUAL_ID:
				return getDateRecognizer_3004OutgoingLinks(view);
			case TextEditPart.VISUAL_ID:
				return getText_3005OutgoingLinks(view);
			case TrimWhitespaceEditPart.VISUAL_ID:
				return getTrimWhitespace_3006OutgoingLinks(view);
			case MappedElementEditPart.VISUAL_ID:
				return getMappedElement_3007OutgoingLinks(view);
			case MappedElement2EditPart.VISUAL_ID:
				return getMappedElement_3008OutgoingLinks(view);
			case MappedAttributeEditPart.VISUAL_ID:
				return getMappedAttribute_3009OutgoingLinks(view);
			case MetadataBlock2EditPart.VISUAL_ID:
				return getMetadataBlock_3018OutgoingLinks(view);
			case OriginalNameRecordMatcher2EditPart.VISUAL_ID:
				return getOriginalNameRecordMatcher_3011OutgoingLinks(view);
			case DateRecognizer2EditPart.VISUAL_ID:
				return getDateRecognizer_3012OutgoingLinks(view);
			case Text2EditPart.VISUAL_ID:
				return getText_3013OutgoingLinks(view);
			case TrimWhitespace2EditPart.VISUAL_ID:
				return getTrimWhitespace_3014OutgoingLinks(view);
			case MappedElement3EditPart.VISUAL_ID:
				return getMappedElement_3015OutgoingLinks(view);
			case MappedAttribute2EditPart.VISUAL_ID:
				return getMappedAttribute_3016OutgoingLinks(view);
			case InputFieldEditPart.VISUAL_ID:
				return getInputField_3017OutgoingLinks(view);
			case MetadataBlockEditPart.VISUAL_ID:
				return getMetadataBlock_3010OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getEditingContainer_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getCrossWalk_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getDictionary_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getDelimitedFile_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getTabbedDataField_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getOriginalNameRecordMatcher_3003ContainedLinks(View view) {
		OriginalNameRecordMatcher modelElement = (OriginalNameRecordMatcher) view.getElement();
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Input_Output_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getDateRecognizer_3004ContainedLinks(View view) {
		DateRecognizer modelElement = (DateRecognizer) view.getElement();
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Input_Output_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getText_3005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getTrimWhitespace_3006ContainedLinks(View view) {
		TrimWhitespace modelElement = (TrimWhitespace) view.getElement();
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Input_Output_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMappedElement_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMappedElement_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMappedAttribute_3009ContainedLinks(View view) {
		MappedAttribute modelElement = (MappedAttribute) view.getElement();
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Input_Output_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMetadataBlock_3018ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMetadataBlock_3010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getOriginalNameRecordMatcher_3011ContainedLinks(View view) {
		OriginalNameRecordMatcher modelElement = (OriginalNameRecordMatcher) view.getElement();
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Input_Output_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getDateRecognizer_3012ContainedLinks(View view) {
		DateRecognizer modelElement = (DateRecognizer) view.getElement();
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Input_Output_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getText_3013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getTrimWhitespace_3014ContainedLinks(View view) {
		TrimWhitespace modelElement = (TrimWhitespace) view.getElement();
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Input_Output_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMappedElement_3015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMappedAttribute_3016ContainedLinks(View view) {
		MappedAttribute modelElement = (MappedAttribute) view.getElement();
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Input_Output_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getInputField_3017ContainedLinks(View view) {
		InputField modelElement = (InputField) view.getElement();
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Input_Output_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getCrossWalk_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getDictionary_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getDelimitedFile_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getTabbedDataField_3002IncomingLinks(View view) {
		TabbedDataField modelElement = (TabbedDataField) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view
				.eResource().getResourceSet().getResources());
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Input_Output_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getOriginalNameRecordMatcher_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getDateRecognizer_3004IncomingLinks(View view) {
		DateRecognizer modelElement = (DateRecognizer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view
				.eResource().getResourceSet().getResources());
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Input_Output_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getText_3005IncomingLinks(View view) {
		Text modelElement = (Text) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view
				.eResource().getResourceSet().getResources());
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Input_Output_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getTrimWhitespace_3006IncomingLinks(View view) {
		TrimWhitespace modelElement = (TrimWhitespace) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view
				.eResource().getResourceSet().getResources());
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Input_Output_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMappedElement_3007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMappedElement_3008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMappedAttribute_3009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMetadataBlock_3018IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMetadataBlock_3010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getOriginalNameRecordMatcher_3011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getDateRecognizer_3012IncomingLinks(View view) {
		DateRecognizer modelElement = (DateRecognizer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view
				.eResource().getResourceSet().getResources());
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Input_Output_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getText_3013IncomingLinks(View view) {
		Text modelElement = (Text) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view
				.eResource().getResourceSet().getResources());
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Input_Output_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getTrimWhitespace_3014IncomingLinks(View view) {
		TrimWhitespace modelElement = (TrimWhitespace) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view
				.eResource().getResourceSet().getResources());
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Input_Output_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMappedElement_3015IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMappedAttribute_3016IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getInputField_3017IncomingLinks(View view) {
		InputField modelElement = (InputField) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view
				.eResource().getResourceSet().getResources());
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Input_Output_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getCrossWalk_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getDictionary_2002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getDelimitedFile_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getTabbedDataField_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getOriginalNameRecordMatcher_3003OutgoingLinks(View view) {
		OriginalNameRecordMatcher modelElement = (OriginalNameRecordMatcher) view.getElement();
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Input_Output_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getDateRecognizer_3004OutgoingLinks(View view) {
		DateRecognizer modelElement = (DateRecognizer) view.getElement();
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Input_Output_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getText_3005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getTrimWhitespace_3006OutgoingLinks(View view) {
		TrimWhitespace modelElement = (TrimWhitespace) view.getElement();
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Input_Output_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMappedElement_3007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMappedElement_3008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMappedAttribute_3009OutgoingLinks(View view) {
		MappedAttribute modelElement = (MappedAttribute) view.getElement();
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Input_Output_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMetadataBlock_3018OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMetadataBlock_3010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getOriginalNameRecordMatcher_3011OutgoingLinks(View view) {
		OriginalNameRecordMatcher modelElement = (OriginalNameRecordMatcher) view.getElement();
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Input_Output_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getDateRecognizer_3012OutgoingLinks(View view) {
		DateRecognizer modelElement = (DateRecognizer) view.getElement();
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Input_Output_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getText_3013OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getTrimWhitespace_3014OutgoingLinks(View view) {
		TrimWhitespace modelElement = (TrimWhitespace) view.getElement();
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Input_Output_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMappedElement_3015OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getMappedAttribute_3016OutgoingLinks(View view) {
		MappedAttribute modelElement = (MappedAttribute) view.getElement();
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Input_Output_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CrosswalkLinkDescriptor> getInputField_3017OutgoingLinks(View view) {
		InputField modelElement = (InputField) view.getElement();
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Input_Output_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CrosswalkLinkDescriptor> getIncomingFeatureModelFacetLinks_Input_Output_4001(
			Output target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CrosswalkPackage.eINSTANCE.getInput_Output()) {
				result.add(new CrosswalkLinkDescriptor(setting.getEObject(), target,
						CrosswalkElementTypes.InputOutput_4001, InputOutputEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CrosswalkLinkDescriptor> getOutgoingFeatureModelFacetLinks_Input_Output_4001(Input source) {
		LinkedList<CrosswalkLinkDescriptor> result = new LinkedList<CrosswalkLinkDescriptor>();
		Output destination = source.getOutput();
		if (destination == null) {
			return result;
		}
		result.add(new CrosswalkLinkDescriptor(source, destination, CrosswalkElementTypes.InputOutput_4001,
				InputOutputEditPart.VISUAL_ID));
		return result;
	}

}
