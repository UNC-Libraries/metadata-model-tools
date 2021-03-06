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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.Request;
import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeRequest;
import org.eclipse.gmf.runtime.diagram.ui.tools.CreationTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import crosswalk.Dictionary;
import crosswalk.MetadataBlock;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class CrosswalkPaletteFactory {

	/**
	 * @generated NOT
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		for (PaletteContainer p : createDictionaryContentsGroups()) {
			paletteRoot.add(p);
		}
		paletteRoot.add(createMetadataMapping1Group());
		paletteRoot.add(createFormandDictionary2Group());
	}

	/**
	 * Creates "Metadata Mapping" palette tool group
	 * 
	 * @generated
	 */
	private PaletteContainer createMetadataMapping1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.MetadataMapping1Group_title);
		paletteContainer.setId("createMetadataMapping1Group"); //$NON-NLS-1$
		paletteContainer.add(createXMLElement1CreationTool());
		paletteContainer.add(createXMLAttribute2CreationTool());
		paletteContainer.add(createInputConnector3CreationTool());
		paletteContainer.add(createOriginalNameMatcher4CreationTool());
		paletteContainer.add(createDateMaker5CreationTool());
		paletteContainer.add(createFixedText6CreationTool());
		paletteContainer.add(createTrimSpaces7CreationTool());
		paletteContainer.add(createCurrentUsername8CreationTool());
		paletteContainer.add(createCurrentDateTime9CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Form and Dictionary" palette tool group
	 * @generated
	 */
	private PaletteContainer createFormandDictionary2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.FormandDictionary2Group_title);
		paletteContainer.setId("createFormandDictionary2Group"); //$NON-NLS-1$
		paletteContainer.add(createMetadataBlock1CreationTool());
		paletteContainer.add(createTextField2CreationTool());
		paletteContainer.add(createDateField3CreationTool());
		paletteContainer.add(createParagraph4CreationTool());
		paletteContainer.add(createFileBlock5CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates custom "Dictionary" entry palette tool group
	 */
	private List<PaletteContainer> createDictionaryContentsGroups() {
		List<PaletteContainer> result = new ArrayList<PaletteContainer>();
		for (Dictionary dict : CrosswalkDiagramEditorPlugin.getInstance()
				.getDictionaries()) {
			PaletteDrawer paletteContainer = new PaletteDrawer(dict.getName());
			paletteContainer.setDescription(dict.getDescription());
			paletteContainer.setId("createCustomDictionary2Group"); //$NON-NLS-1$
			for (MetadataBlock mb : dict.getBlocks()) {
				paletteContainer.add(createMetadataBlockCopyTool(mb));
			}
			result.add(paletteContainer);
		}
		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createXMLElement1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(CrosswalkElementTypes.MappedElement_3007);
		types.add(CrosswalkElementTypes.MappedElement_3008);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.XMLElement1CreationTool_title,
				Messages.XMLElement1CreationTool_desc, types);
		entry.setId("createXMLElement1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrosswalkElementTypes
				.getImageDescriptor(CrosswalkElementTypes.MappedElement_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createXMLAttribute2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.XMLAttribute2CreationTool_title,
				Messages.XMLAttribute2CreationTool_desc,
				Collections
						.singletonList(CrosswalkElementTypes.MappedAttribute_3009));
		entry.setId("createXMLAttribute2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrosswalkElementTypes
				.getImageDescriptor(CrosswalkElementTypes.MappedAttribute_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInputConnector3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.InputConnector3CreationTool_title,
				Messages.InputConnector3CreationTool_desc,
				Collections
						.singletonList(CrosswalkElementTypes.InputOutput_4001));
		entry.setId("createInputConnector3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrosswalkElementTypes
				.getImageDescriptor(CrosswalkElementTypes.InputOutput_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOriginalNameMatcher4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.OriginalNameMatcher4CreationTool_title,
				Messages.OriginalNameMatcher4CreationTool_desc,
				Collections
						.singletonList(CrosswalkElementTypes.OriginalNameRecordMatcher_3003));
		entry.setId("createOriginalNameMatcher4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrosswalkElementTypes
				.getImageDescriptor(CrosswalkElementTypes.OriginalNameRecordMatcher_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDateMaker5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DateMaker5CreationTool_title,
				Messages.DateMaker5CreationTool_desc,
				Collections
						.singletonList(CrosswalkElementTypes.DateRecognizer_3004));
		entry.setId("createDateMaker5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrosswalkElementTypes
				.getImageDescriptor(CrosswalkElementTypes.DateRecognizer_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFixedText6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.FixedText6CreationTool_title,
				Messages.FixedText6CreationTool_desc,
				Collections.singletonList(CrosswalkElementTypes.Text_3005));
		entry.setId("createFixedText6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrosswalkElementTypes
				.getImageDescriptor(CrosswalkElementTypes.Text_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTrimSpaces7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.TrimSpaces7CreationTool_title,
				Messages.TrimSpaces7CreationTool_desc,
				Collections
						.singletonList(CrosswalkElementTypes.TrimWhitespace_3006));
		entry.setId("createTrimSpaces7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrosswalkElementTypes
				.getImageDescriptor(CrosswalkElementTypes.TrimWhitespace_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCurrentUsername8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CurrentUsername8CreationTool_title,
				Messages.CurrentUsername8CreationTool_desc,
				Collections
						.singletonList(CrosswalkElementTypes.CurrentUsername_3022));
		entry.setId("createCurrentUsername8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrosswalkElementTypes
				.getImageDescriptor(CrosswalkElementTypes.CurrentUsername_3022));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCurrentDateTime9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CurrentDateTime9CreationTool_title,
				Messages.CurrentDateTime9CreationTool_desc,
				Collections
						.singletonList(CrosswalkElementTypes.CurrentDate_3021));
		entry.setId("createCurrentDateTime9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrosswalkElementTypes
				.getImageDescriptor(CrosswalkElementTypes.CurrentDate_3021));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMetadataBlock1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(CrosswalkElementTypes.MetadataBlock_3018);
		types.add(CrosswalkElementTypes.MetadataBlock_3010);
		types.add(CrosswalkElementTypes.MetadataBlock_3019);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MetadataBlock1CreationTool_title,
				Messages.MetadataBlock1CreationTool_desc, types);
		entry.setId("createMetadataBlock1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrosswalkElementTypes
				.getImageDescriptor(CrosswalkElementTypes.MetadataBlock_3018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTextField2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.TextField2CreationTool_title,
				Messages.TextField2CreationTool_desc,
				Collections
						.singletonList(CrosswalkElementTypes.TextInputField_3023));
		entry.setId("createTextField2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrosswalkElementTypes
				.getImageDescriptor(CrosswalkElementTypes.TextInputField_3023));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDateField3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DateField3CreationTool_title,
				Messages.DateField3CreationTool_desc,
				Collections
						.singletonList(CrosswalkElementTypes.DateInputField_3024));
		entry.setId("createDateField3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrosswalkElementTypes
				.getImageDescriptor(CrosswalkElementTypes.DateInputField_3024));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createParagraph4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Paragraph4CreationTool_title,
				Messages.Paragraph4CreationTool_desc,
				Collections.singletonList(CrosswalkElementTypes.Paragraph_3020));
		entry.setId("createParagraph4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrosswalkElementTypes
				.getImageDescriptor(CrosswalkElementTypes.Paragraph_3020));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFileBlock5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.FileBlock5CreationTool_title,
				Messages.FileBlock5CreationTool_desc,
				Collections.singletonList(CrosswalkElementTypes.FileBlock_3025));
		entry.setId("createFileBlock5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CrosswalkElementTypes
				.getImageDescriptor(CrosswalkElementTypes.FileBlock_3025));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @param mb2 
	 * @generated NOT
	 */
	private ToolEntry createMetadataBlockCopyTool(MetadataBlock mb) {
		TemplateObjectToolEntry entry = new TemplateObjectToolEntry(
				mb.getName(), mb.getDescription(), mb);
		entry.setId(null); //$NON-NLS-1$
		entry.setSmallIcon(CrosswalkElementTypes
				.getImageDescriptor(CrosswalkElementTypes.MetadataBlock_3018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		@Override
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated NOT
	 */
	private static class TemplateObjectToolEntry extends ToolEntry {

		/**
		 * @generated NOT
		 */
		private final EObject object;

		/**
		 * @generated NOT
		 */
		private TemplateObjectToolEntry(String title, String description,
				EObject object) {
			super(title, description, null, null);
			this.object = object;
		}

		/**
		 * @generated NOT
		 */
		public Tool createTool() {
			Tool tool = new TemplateObjectCreationTool(object);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	public static class TemplateObjectCreationTool extends CreationTool {

		/**
		 * List of objects which will be dropped.
		 */
		private final EObject object;

		/**
		 * Creates a new instance with a list of possible element types.
		 * 
		 * @param elementTypes
		 *           List of element types of which one will be created (of type <code>IElementType</code>).
		 */
		public TemplateObjectCreationTool(EObject object) {
			super();
			this.object = object;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.gef.tools.TargetingTool#createTargetRequest()
		 */
		protected Request createTargetRequest() {
			//return new TemplateObjectCreateRequest(CrosswalkElementTypes.MetadataBlock_3018, object, getPreferencesHint());
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(CrosswalkElementTypes.MetadataBlock_3010);
			types.add(CrosswalkElementTypes.MetadataBlock_3018);
			types.add(CrosswalkElementTypes.MetadataBlock_3019);

			CreateUnspecifiedTypeRequest result = new CreateUnspecifiedTypeRequest(
					types, getPreferencesHint());
			result.getExtendedData().put("templateElement", object);
			//CreateViewRequest req = CreateViewRequestFactory.getCreateShapeRequest(
			//	CrosswalkElementTypes.MetadataBlock_3018, getPreferencesHint());
			//req.getExtendedData().put("templateElement", object);
			return result;
			//DropObjectsRequest drop = new DropObjectsRequest();
			//drop.setObjects(Collections.singletonList(EcoreUtil.copy(this.object)));
			//return drop;
		}

		@Override
		protected String getCommandName() {
			return "drop: " + object.toString();
		}
	}
}
