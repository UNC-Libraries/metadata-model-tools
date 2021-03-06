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
package crosswalk.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crosswalk.diagram.edit.commands.DateRecognizerCreateCommand;
import crosswalk.diagram.edit.commands.DelimitedFileCreateCommand;
import crosswalk.diagram.edit.commands.MappedElementCreateCommand;
import crosswalk.diagram.edit.commands.MetadataBlock2CreateCommand;
import crosswalk.diagram.edit.commands.OriginalNameRecordMatcherCreateCommand;
import crosswalk.diagram.edit.commands.TextCreateCommand;
import crosswalk.diagram.edit.commands.TrimWhitespaceCreateCommand;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class CrossWalkModelBoxCompartmentItemSemanticEditPolicy extends
		CrosswalkBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CrossWalkModelBoxCompartmentItemSemanticEditPolicy() {
		super(CrosswalkElementTypes.CrossWalk_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrosswalkElementTypes.DelimitedFile_3001 == req.getElementType()) {
			return getGEFWrapper(new DelimitedFileCreateCommand(req));
		}
		if (CrosswalkElementTypes.OriginalNameRecordMatcher_3003 == req
				.getElementType()) {
			return getGEFWrapper(new OriginalNameRecordMatcherCreateCommand(req));
		}
		if (CrosswalkElementTypes.DateRecognizer_3004 == req.getElementType()) {
			return getGEFWrapper(new DateRecognizerCreateCommand(req));
		}
		if (CrosswalkElementTypes.Text_3005 == req.getElementType()) {
			return getGEFWrapper(new TextCreateCommand(req));
		}
		if (CrosswalkElementTypes.TrimWhitespace_3006 == req.getElementType()) {
			return getGEFWrapper(new TrimWhitespaceCreateCommand(req));
		}
		if (CrosswalkElementTypes.MappedElement_3007 == req.getElementType()) {
			return getGEFWrapper(new MappedElementCreateCommand(req));
		}
		if (CrosswalkElementTypes.MetadataBlock_3018 == req.getElementType()) {
			return getGEFWrapper(new MetadataBlock2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
