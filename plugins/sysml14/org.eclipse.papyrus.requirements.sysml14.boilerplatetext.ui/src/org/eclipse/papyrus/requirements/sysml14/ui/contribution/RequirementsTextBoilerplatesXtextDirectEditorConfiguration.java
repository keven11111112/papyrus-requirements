/*****************************************************************************
 * Copyright (c) 2017 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 
 * 		Mauricio Alferez (mauricio.alferez@cea.fr) CEA LIST - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.requirements.sysml14.ui.contribution;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.papyrus.extensionpoints.editors.configuration.IPopupEditorConfiguration;
import org.eclipse.papyrus.extensionpoints.editors.ui.IPopupEditorHelper;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.emf.Activator;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForEObject;
import org.eclipse.papyrus.requirements.sysml14.boilerplatetext.ui.internal.BoilerplatetextActivator;
import org.eclipse.papyrus.requirements.sysml14.visitor.RequirementsPrinter;
import org.eclipse.papyrus.sysml14.requirements.Requirement;
import org.eclipse.papyrus.uml.xtext.integration.DefaultXtextDirectEditorConfiguration;
import org.eclipse.swt.SWT;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.papyrus.requirements.sysml14.boilerplateText.Model;

import com.google.inject.Injector;

public class RequirementsTextBoilerplatesXtextDirectEditorConfiguration extends DefaultXtextDirectEditorConfiguration implements IPopupEditorConfiguration  {

	public static final String REQ_TEXT_BOILERPLATES_LANGUAGE_NAME = "Text boilerplates";
	
	public RequirementsTextBoilerplatesXtextDirectEditorConfiguration() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Injector getInjector() {
		return BoilerplatetextActivator.getInstance().getInjector(BoilerplatetextActivator.ORG_ECLIPSE_PAPYRUS_REQUIREMENTS_SYSML14_BOILERPLATETEXT);
	}

	@Override
	public int getStyle() {
		return SWT.MULTI;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.infra.gmfdiag.xtext.glue.PopupEditorConfiguration#getTextToEdit(java.lang.Object)
	 */
	@SuppressWarnings("nls")
	@Override
	public String getTextToEdit(Object editedObject) {
		if (editedObject instanceof Class) {
			Class c = (Class)editedObject ;
			if (null != UMLUtil.getStereotypeApplication(c, Requirement.class)){
				Requirement req = UMLUtil.getStereotypeApplication(c, Requirement.class);
				return req.getText();				
			}else 
				return "Not a Requirement";
		}
		return "Not a class";
	}
	@Override
	public IInputValidator getInputValidator() {
		return super.getInputValidator();
	}
	
	@Override
	protected String getTextToEditInternal(EObject semanticObject) {
		return super.getTextToEditInternal(semanticObject);
	}
	
	/**
	 * @author CEA LIST
	 *
	 *         A command for updating the context UML model
	 */
	protected class UpdateSysMLReqTextActionCommand extends AbstractTransactionalCommand {

		private final Requirement requirement;
		
		private EObject xtextObject;

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand#doExecuteWithResult(org.eclipse.core.runtime.IProgressMonitor
		 * , org.eclipse.core.runtime.IAdaptable)
		 */
		@Override
		protected CommandResult doExecuteWithResult(IProgressMonitor arg0, IAdaptable arg1) throws ExecutionException {
			boolean result = updateTextValue(requirement, xtextObject);
			return result ? CommandResult.newOKCommandResult(requirement) : CommandResult.newErrorCommandResult("Value error");
		}
		
		private boolean updateTextValue(Requirement requirement2, EObject xtextObject2) {
			if (xtextObject2 instanceof Model){
				Model xtextModel = (Model) xtextObject2;
				
				String xtextReqString = new RequirementsPrinter().print(xtextModel);
				requirement2.setText (xtextReqString);
				return true;
			}
			return false;
		}
		
		public UpdateSysMLReqTextActionCommand(TransactionalEditingDomain domain, Requirement requirement, final EObject xtextObject) {
			super(domain, "Transition Update", getWorkspaceFiles(requirement)); //$NON-NLS-1$
			this.requirement = requirement;
			this.xtextObject = xtextObject;
		}
	}
	
	@Override
	protected ICommand getParseCommand(EObject modelObject, EObject xtextObject) {
		
		if (!(modelObject instanceof Class)) {
			return null;
		}
		if (null == UMLUtil.getStereotypeApplication((Class)modelObject, Requirement.class)){
			return null;
		}
		Requirement req = UMLUtil.getStereotypeApplication((Class)modelObject, Requirement.class);

		// transitionRuleObject may be null, if we have no input left

		// Creates and executes the update command
		try {
			TransactionalEditingDomain dom = ServiceUtilsForEObject.getInstance().getTransactionalEditingDomain(req);
			UpdateSysMLReqTextActionCommand updateCommand = new UpdateSysMLReqTextActionCommand(dom, req, xtextObject);
			return updateCommand;
		} catch (ServiceException ex) {
			Activator.log.error(ex);
			return null;
		}
	}

	@Override
	public IPopupEditorHelper createPopupEditorHelper(Object editPart) {
		return null;
	}

}
