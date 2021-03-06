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

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.graphics.Color;

import crosswalk.diagram.edit.policies.MappedElement2ItemSemanticEditPolicy;
import crosswalk.diagram.part.CrosswalkVisualIDRegistry;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @generated
 */
public class MappedElement2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3008;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public MappedElement2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						CrosswalkVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new MappedElement2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new MappedElementFigure();
	}

	/**
	 * @generated
	 */
	public MappedElementFigure getPrimaryShape() {
		return (MappedElementFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel6EditPart) {
			((WrappingLabel6EditPart) childEditPart).setLabel(getPrimaryShape()
					.getLabel());
			return true;
		}
		if (childEditPart instanceof MappedElementChildElementsCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getFigureElementPane();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((MappedElementChildElementsCompartment2EditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof MappedElementChildAttributesCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getChildPane();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((MappedElementChildAttributesCompartment2EditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel6EditPart) {
			return true;
		}
		if (childEditPart instanceof MappedElementChildElementsCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getFigureElementPane();
			pane.remove(((MappedElementChildElementsCompartment2EditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof MappedElementChildAttributesCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getChildPane();
			pane.remove(((MappedElementChildAttributesCompartment2EditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof MappedElementChildElementsCompartment2EditPart) {
			return getPrimaryShape().getFigureElementPane();
		}
		if (editPart instanceof MappedElementChildAttributesCompartment2EditPart) {
			return getPrimaryShape().getChildPane();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(CrosswalkVisualIDRegistry
				.getType(WrappingLabel6EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == CrosswalkElementTypes.MappedElement_3008) {
				return getChildBySemanticHint(CrosswalkVisualIDRegistry
						.getType(MappedElementChildElementsCompartment2EditPart.VISUAL_ID));
			}
			if (type == CrosswalkElementTypes.MappedAttribute_3009) {
				return getChildBySemanticHint(CrosswalkVisualIDRegistry
						.getType(MappedElementChildAttributesCompartment2EditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class MappedElementFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private RectangleFigure fChildPane;
		/**
		 * @generated
		 */
		private WrappingLabel fLabel;

		/**
		 * @generated
		 */
		private RectangleFigure fFigureElementPane;

		/**
		 * @generated
		 */
		public MappedElementFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(20),
					getMapMode().DPtoLP(20)));

			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fLabel = new WrappingLabel();

			fLabel.setText("Unknown MODS Element");

			GridData constraintFLabel = new GridData();
			constraintFLabel.verticalAlignment = GridData.BEGINNING;
			constraintFLabel.horizontalAlignment = GridData.BEGINNING;
			constraintFLabel.horizontalIndent = 5;
			constraintFLabel.horizontalSpan = 1;
			constraintFLabel.verticalSpan = 1;
			constraintFLabel.grabExcessHorizontalSpace = false;
			constraintFLabel.grabExcessVerticalSpace = false;
			this.add(fLabel, constraintFLabel);

			fChildPane = new RectangleFigure();

			fChildPane.setOutline(false);

			GridData constraintFChildPane = new GridData();
			constraintFChildPane.verticalAlignment = GridData.FILL;
			constraintFChildPane.horizontalAlignment = GridData.FILL;
			constraintFChildPane.horizontalIndent = 10;
			constraintFChildPane.horizontalSpan = 1;
			constraintFChildPane.verticalSpan = 1;
			constraintFChildPane.grabExcessHorizontalSpace = true;
			constraintFChildPane.grabExcessVerticalSpace = true;
			this.add(fChildPane, constraintFChildPane);

			ToolbarLayout layoutFChildPane = new ToolbarLayout();
			layoutFChildPane.setStretchMinorAxis(false);
			layoutFChildPane.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

			layoutFChildPane.setSpacing(3);
			layoutFChildPane.setVertical(true);

			fChildPane.setLayoutManager(layoutFChildPane);

			fFigureElementPane = new RectangleFigure();

			fFigureElementPane.setOutline(false);

			GridData constraintFFigureElementPane = new GridData();
			constraintFFigureElementPane.verticalAlignment = GridData.FILL;
			constraintFFigureElementPane.horizontalAlignment = GridData.FILL;
			constraintFFigureElementPane.horizontalIndent = 10;
			constraintFFigureElementPane.horizontalSpan = 1;
			constraintFFigureElementPane.verticalSpan = 1;
			constraintFFigureElementPane.grabExcessHorizontalSpace = true;
			constraintFFigureElementPane.grabExcessVerticalSpace = true;
			this.add(fFigureElementPane, constraintFFigureElementPane);

			ToolbarLayout layoutFFigureElementPane = new ToolbarLayout();
			layoutFFigureElementPane.setStretchMinorAxis(false);
			layoutFFigureElementPane
					.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

			layoutFFigureElementPane.setSpacing(3);
			layoutFFigureElementPane.setVertical(true);

			fFigureElementPane.setLayoutManager(layoutFFigureElementPane);

		}

		/**
		 * @generated
		 */
		public RectangleFigure getChildPane() {
			return fChildPane;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getLabel() {
			return fLabel;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureElementPane() {
			return fFigureElementPane;
		}

	}

}
