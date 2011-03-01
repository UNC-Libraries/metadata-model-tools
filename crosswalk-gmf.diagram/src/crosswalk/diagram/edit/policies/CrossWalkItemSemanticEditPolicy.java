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

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import crosswalk.diagram.edit.commands.DateRecognizerCreateCommand;
import crosswalk.diagram.edit.commands.DelimitedFileCreateCommand;
import crosswalk.diagram.edit.commands.MappedElementCreateCommand;
import crosswalk.diagram.edit.commands.OriginalNameRecordMatcherCreateCommand;
import crosswalk.diagram.edit.commands.TextCreateCommand;
import crosswalk.diagram.edit.commands.TrimWhitespaceCreateCommand;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class CrossWalkItemSemanticEditPolicy extends CrosswalkBaseItemSemanticEditPolicy {

    /**
     * @generated
     */
    public CrossWalkItemSemanticEditPolicy() {
	super(CrosswalkElementTypes.CrossWalk_1000);
    }

    /**
     * @generated
     */
    @Override
    protected Command getCreateCommand(CreateElementRequest req) {
	if (CrosswalkElementTypes.DelimitedFile_2001 == req.getElementType()) {
	    return getGEFWrapper(new DelimitedFileCreateCommand(req));
	}
	if (CrosswalkElementTypes.OriginalNameRecordMatcher_2010 == req.getElementType()) {
	    return getGEFWrapper(new OriginalNameRecordMatcherCreateCommand(req));
	}
	if (CrosswalkElementTypes.DateRecognizer_2013 == req.getElementType()) {
	    return getGEFWrapper(new DateRecognizerCreateCommand(req));
	}
	if (CrosswalkElementTypes.Text_2014 == req.getElementType()) {
	    return getGEFWrapper(new TextCreateCommand(req));
	}
	if (CrosswalkElementTypes.TrimWhitespace_2015 == req.getElementType()) {
	    return getGEFWrapper(new TrimWhitespaceCreateCommand(req));
	}
	if (CrosswalkElementTypes.MappedElement_2016 == req.getElementType()) {
	    return getGEFWrapper(new MappedElementCreateCommand(req));
	}
	return super.getCreateCommand(req);
    }

    /**
     * @generated
     */
    @Override
    protected Command getDuplicateCommand(DuplicateElementsRequest req) {
	TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
	return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
    }

    /**
     * @generated
     */
    private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

	/**
	 * @generated
	 */
	public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
	    super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
	}

    }

}
