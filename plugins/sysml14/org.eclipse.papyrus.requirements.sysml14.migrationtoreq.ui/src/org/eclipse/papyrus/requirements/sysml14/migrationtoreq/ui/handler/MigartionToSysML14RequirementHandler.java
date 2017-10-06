package org.eclipse.papyrus.requirements.sysml14.migrationtoreq.ui.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;

public abstract class MigartionToSysML14RequirementHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * Get top owner element of the given element.
	 *
	 * @param element
	 *            Starting point of the search
	 * @return Top model found
	 */
	protected static Element getTopElement(final Element element) {

		if (element.getOwner() != null) {
			return getTopElement(element.getOwner());
		} else {
			return element;
		}

	}

	/**
	 * Get the selected EObject from Model Explorer.
	 * 
	 * @return
	 */
	protected static EObject getEObjectOfSelection() {
		IStructuredSelection selection = (IStructuredSelection) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().getSelection();
		EObject selectedEObject = null;

		if (selection != null) {
			selectedEObject = EMFHelper.getEObject(selection.getFirstElement());
		}

		return selectedEObject;
	}

	/**
	 * The handler is capable of executing at this time if the selected element is a UML Class.
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public boolean isEnabled() {
		if (getEObjectOfSelection() instanceof Package) {
			return true;
		}
		return super.isEnabled();
	}

}
