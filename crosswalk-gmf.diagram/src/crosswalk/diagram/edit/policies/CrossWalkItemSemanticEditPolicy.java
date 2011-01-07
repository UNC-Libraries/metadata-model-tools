/*
 * copyright 2010 University of North Carolina at Chapel Hill
 */
package crosswalk.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import crosswalk.diagram.edit.commands.AbstractCreateCommand;
import crosswalk.diagram.edit.commands.AccessConditionCreateCommand;
import crosswalk.diagram.edit.commands.DateCreatedCreateCommand;
import crosswalk.diagram.edit.commands.DateRecognizerCreateCommand;
import crosswalk.diagram.edit.commands.GenreCreateCommand;
import crosswalk.diagram.edit.commands.IdentifierCreateCommand;
import crosswalk.diagram.edit.commands.LanguageCreateCommand;
import crosswalk.diagram.edit.commands.NameCreateCommand;
import crosswalk.diagram.edit.commands.OriginalNameRecordMatcherCreateCommand;
import crosswalk.diagram.edit.commands.SubjectCreateCommand;
import crosswalk.diagram.edit.commands.TabSeparatedFileCreateCommand;
import crosswalk.diagram.edit.commands.TabbedDataFieldCreateCommand;
import crosswalk.diagram.edit.commands.TextCreateCommand;
import crosswalk.diagram.edit.commands.TitleInfoCreateCommand;
import crosswalk.diagram.edit.commands.TrimWhitespaceCreateCommand;
import crosswalk.diagram.edit.commands.TypeOfResourceCreateCommand;
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
    protected Command getCreateCommand(CreateElementRequest req) {
	if (CrosswalkElementTypes.TabSeparatedFile_2001 == req.getElementType()) {
	    return getGEFWrapper(new TabSeparatedFileCreateCommand(req));
	}
	if (CrosswalkElementTypes.TitleInfo_2005 == req.getElementType()) {
	    return getGEFWrapper(new TitleInfoCreateCommand(req));
	}
	if (CrosswalkElementTypes.Abstract_2007 == req.getElementType()) {
	    return getGEFWrapper(new AbstractCreateCommand(req));
	}
	if (CrosswalkElementTypes.Genre_2008 == req.getElementType()) {
	    return getGEFWrapper(new GenreCreateCommand(req));
	}
	if (CrosswalkElementTypes.Identifier_2009 == req.getElementType()) {
	    return getGEFWrapper(new IdentifierCreateCommand(req));
	}
	if (CrosswalkElementTypes.Language_2010 == req.getElementType()) {
	    return getGEFWrapper(new LanguageCreateCommand(req));
	}
	if (CrosswalkElementTypes.Name_2011 == req.getElementType()) {
	    return getGEFWrapper(new NameCreateCommand(req));
	}
	if (CrosswalkElementTypes.Subject_2012 == req.getElementType()) {
	    return getGEFWrapper(new SubjectCreateCommand(req));
	}
	if (CrosswalkElementTypes.TypeOfResource_2013 == req.getElementType()) {
	    return getGEFWrapper(new TypeOfResourceCreateCommand(req));
	}
	if (CrosswalkElementTypes.OriginalNameRecordMatcher_2014 == req.getElementType()) {
	    return getGEFWrapper(new OriginalNameRecordMatcherCreateCommand(req));
	}
	if (CrosswalkElementTypes.DateCreated_2015 == req.getElementType()) {
	    return getGEFWrapper(new DateCreatedCreateCommand(req));
	}
	if (CrosswalkElementTypes.AccessCondition_2016 == req.getElementType()) {
	    return getGEFWrapper(new AccessConditionCreateCommand(req));
	}
	if (CrosswalkElementTypes.DateRecognizer_2017 == req.getElementType()) {
	    return getGEFWrapper(new DateRecognizerCreateCommand(req));
	}
	if (CrosswalkElementTypes.Text_2018 == req.getElementType()) {
	    return getGEFWrapper(new TextCreateCommand(req));
	}
	if (CrosswalkElementTypes.TrimWhitespace_2019 == req.getElementType()) {
	    return getGEFWrapper(new TrimWhitespaceCreateCommand(req));
	}
	return super.getCreateCommand(req);
    }

    /**
     * @generated
     */
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
