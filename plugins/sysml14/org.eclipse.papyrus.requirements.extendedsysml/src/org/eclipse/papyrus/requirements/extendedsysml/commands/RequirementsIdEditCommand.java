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
package org.eclipse.papyrus.requirements.extendedsysml.commands;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.window.Window;
import org.eclipse.papyrus.requirements.extendedsysml.advices.Messages;
import org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.Depth;
import org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.RequirementsPackage;
import org.eclipse.papyrus.requirements.sysml14.preferences.PreferenceConstants;
import org.eclipse.papyrus.sysml14.requirements.Requirement;
import org.eclipse.swt.widgets.Display;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.util.UMLUtil;

public class RequirementsIdEditCommand extends AbstractTransactionalCommand {
	protected final IPreferenceStore store = org.eclipse.papyrus.requirements.sysml14.preferences.Activator.getDefault()
			.getPreferenceStore();
	protected RequirementsPackage targetContainerPackage;
	protected Depth targetContainerPackageDepth;
	protected List<Requirement> requirementsToEdit = new ArrayList<Requirement>();

	public RequirementsIdEditCommand(TransactionalEditingDomain editingDomain, String label, List<IFile> affectedFiles,
			List<Requirement> requirementsToEdit, RequirementsPackage targetContainerPackage,
			Depth targetContainerPackageDepth) {
		super(editingDomain, label, affectedFiles);
		this.requirementsToEdit = requirementsToEdit;
		this.targetContainerPackage = targetContainerPackage;
		this.targetContainerPackageDepth = targetContainerPackageDepth;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmf.runtime.emf.commands.core.command.
	 * AbstractTransactionalCommand#doExecuteWithResult(org.eclipse.core.
	 * runtime.IProgressMonitor, org.eclipse.core.runtime.IAdaptable)
	 */
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		List<RequirementsPackage> allUpperLevelRequirementsPackages = new BasicEList<RequirementsPackage>();

		String oldIdWithoutPrefix = ""; //$NON-NLS-1$
		String newId = ""; //$NON-NLS-1$
		if (!userConfirmsModifications()) {
			return CommandResult.newOKCommandResult(requirementsToEdit);
		}
		String leftMarginText = getLeftMarginText(store.getString(PreferenceConstants.REQUIREMENT_ID_PREFIX));
		String separator = getSeparator(store.getString(PreferenceConstants.CHILD_REQUIREMENTS_SEPARATOR));
		if (allUpperLevelRequirementsPackages.isEmpty()) {
			allUpperLevelRequirementsPackages = getAllUpperLevelsPackagesWithStereotype(targetContainerPackage);
		}
		for (Requirement requirementToEdit : requirementsToEdit) {
			oldIdWithoutPrefix = eraseTextUntilLeftMarginText(requirementToEdit.getId(), leftMarginText,
					requirementToEdit);
			newId = buildNewIdPrefix(allUpperLevelRequirementsPackages, targetContainerPackageDepth, separator)
					+ oldIdWithoutPrefix;
			if (!newId.isEmpty()) {
				requirementToEdit.setId(newId);
			}
		}
		return CommandResult.newOKCommandResult(requirementsToEdit);
	}

	/**
	 * Trims a text on the left side
	 * 
	 * @param textToClean
	 *            String to examine
	 * @param leftMarginText
	 *            Only this text and the text after it will remain in the
	 *            resulting substring
	 * @param requirementToMove
	 * @return text trimmed on the left side of the left margin
	 */
	protected String eraseTextUntilLeftMarginText(String textToClean, String leftMarginText,
			Requirement requirementToMove) {
		// if leftMarginText prefix does not exist in oldId or is empty,
		// leave the olId intact
		int lastIndexOfLeftMarginText = textToClean.lastIndexOf(leftMarginText);
		if (lastIndexOfLeftMarginText < 0) {
			MessageDialog.openInformation(Display.getCurrent().getActiveShell(),
					Messages.TITLE_PAPYRUS_FOR_REQUIREMENTS, Messages.MSG_INF_PREFIX_NOT_FOUND);
		}
		return lastIndexOfLeftMarginText > 0 ? textToClean.substring(lastIndexOfLeftMarginText) : textToClean;
	}

	protected boolean userConfirmsModifications() {
		return MessageDialog.openConfirm(Display.getCurrent().getActiveShell(), Messages.TITLE_PAPYRUS_FOR_REQUIREMENTS,
				Messages.MSG_ASK_TO_CONFIRM_ID_MODIFICATIONS);
	}

	protected String getLeftMarginText(String defaultLeftMarginText) {
		InputDialog dialog = new InputDialog(Display.getCurrent().getActiveShell(),
				Messages.TITLE_PAPYRUS_FOR_REQUIREMENTS, Messages.MSG_GET_LEFT_MARGIN_TEXT, defaultLeftMarginText,
				null);
		return dialog.open() == Window.OK ? dialog.getValue() : defaultLeftMarginText;
	}

	protected String getSeparator(String defaultSeparator) {
		InputDialog dialog = new InputDialog(Display.getCurrent().getActiveShell(),
				Messages.TITLE_PAPYRUS_FOR_REQUIREMENTS, Messages.MSG_GET_SEPARATOR, defaultSeparator, null);
		return dialog.open() == Window.OK ? dialog.getValue() : defaultSeparator;
	}

	/**
	 * Returns all top-level requirement packages of the element
	 *
	 * @param targetContainerPackage
	 *            a SysML Requirement
	 * @return the list of top-level requirements packages working outwards
	 */
	public List<RequirementsPackage> getAllUpperLevelsPackagesWithStereotype(RequirementsPackage containerPackage) {
		List<RequirementsPackage> allUpperLevelRequirementsPackages = new BasicEList<RequirementsPackage>();
		allUpperLevelRequirementsPackages.add(containerPackage);
		for (Package owningPackage : containerPackage.getBase_Package().allOwningPackages()) {
			if (null != UMLUtil.getStereotypeApplication(owningPackage, RequirementsPackage.class)) {
				allUpperLevelRequirementsPackages
						.add(UMLUtil.getStereotypeApplication(owningPackage, RequirementsPackage.class));
			}
		}
		Collections.reverse(allUpperLevelRequirementsPackages);
		return allUpperLevelRequirementsPackages;
	}

	/**
	 * Builds an ID prefix based on the aliases of each one of the Requirements
	 * Packages that contain the requirements that are being moved.
	 * 
	 * @param topLevelRequirementsPackages
	 *            List of UML packages that applied the RequirementsPackage
	 *            stereotype. Each one has a text Alias that will be used to
	 *            create a new ID prefix.
	 * @param depth
	 *            An enumeration literal that reveals if the new id prefix will
	 *            be created based on either all the
	 *            topLevelRequirementsPackages or a specific number of levels of
	 *            packages.
	 * @param separator
	 *            Default separator between aliases obtained from the elements
	 *            in the topLevelRequirementsPackages list
	 * @return a new Id prefix
	 */
	protected StringBuffer buildNewIdPrefix(List<RequirementsPackage> topLevelRequirementsPackages, Depth depth,
			String separator) {
		StringBuffer aliases = new StringBuffer();
		ListIterator<RequirementsPackage> lit = topLevelRequirementsPackages.listIterator();
		switch (depth) {
		case ALL_LEVELS:
			while (lit.hasNext()) {
				aliases.append(lit.next().getAlias() + separator);
			}
		default:
			int depthCounter = 0;
			while (lit.hasNext() && depthCounter < depth.getValue()) {
				aliases.append(lit.next().getAlias() + separator);
				depthCounter++;
			}
		}
		return aliases;
	}
}