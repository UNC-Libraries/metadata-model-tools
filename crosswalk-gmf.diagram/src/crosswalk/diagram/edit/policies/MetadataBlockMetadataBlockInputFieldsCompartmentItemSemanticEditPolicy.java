package crosswalk.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import crosswalk.diagram.edit.commands.DateInputFieldCreateCommand;
import crosswalk.diagram.edit.commands.TextInputFieldCreateCommand;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class MetadataBlockMetadataBlockInputFieldsCompartmentItemSemanticEditPolicy extends
		CrosswalkBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MetadataBlockMetadataBlockInputFieldsCompartmentItemSemanticEditPolicy() {
		super(CrosswalkElementTypes.MetadataBlock_3010);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CrosswalkElementTypes.TextInputField_3023 == req.getElementType()) {
			return getGEFWrapper(new TextInputFieldCreateCommand(req));
		}
		if (CrosswalkElementTypes.DateInputField_3024 == req.getElementType()) {
			return getGEFWrapper(new DateInputFieldCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}