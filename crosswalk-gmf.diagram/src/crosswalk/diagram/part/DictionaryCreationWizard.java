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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class DictionaryCreationWizard extends Wizard implements INewWizard {
	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated
	 */
	protected CrosswalkCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected Resource diagram;

	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	protected String dictionaryName;

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated NOT
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(Messages.CrosswalkCreationWizardTitle);
		setDefaultPageImageDescriptor(CrosswalkDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewCrosswalkWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated NOT
	 */
	@Override
	public void addPages() {
		this.diagramModelFilePage = new CrosswalkCreationWizardPage("Create Dictionary", selection, "dictionary");
		this.addPage(diagramModelFilePage);
	}

	/**
	 * @generated NOT
	 */
	@Override
	public boolean performFinish() {
		final URI uri = this.diagramModelFilePage.getURI();
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {
			@Override
			protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
				diagram = CrosswalkDiagramEditorUtil.createDictionaryDiagram(uri, monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						CrosswalkDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(), Messages.CrosswalkCreationWizardOpenEditorError,
								null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(), Messages.CrosswalkCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				CrosswalkDiagramEditorPlugin.getInstance().logError("Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}

	@Override
	public boolean canFinish() {
		return this.diagramModelFilePage.isPageComplete();
	}
}
