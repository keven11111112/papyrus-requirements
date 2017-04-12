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
package org.eclipse.papyrus.requirements.extendedsysml.advices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
//import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.papyrus.requirements.extendedsysml.commands.RequirementsIdEditCommand;
import org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.Depth;
import org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.RequirementsPackage;
import org.eclipse.papyrus.sysml14.requirements.Requirement;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;

public class AfterMovingRequirementsCommandEditHelperAdvice extends AbstractEditHelperAdvice {

	protected MoveRequest moveRequest;
	//protected SetRequest setRequest;
	protected Element targetContainerElement;
	protected RequirementsPackage targetContainerPackage;
	protected Depth targetContainerPackageDepth;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean approveRequest(IEditCommandRequest request) {
		if (request instanceof MoveRequest) {
			moveRequest = (MoveRequest) request;
			if (moveRequest.getTargetContainer() instanceof Element) {
				targetContainerElement = (Element) moveRequest.getTargetContainer();
				targetContainerPackage = ExtendedSysMLUtil.getVerifiedRequirementsPackage(targetContainerElement);
				if (null != targetContainerPackage) {
					targetContainerPackageDepth = targetContainerPackage.getIdDepth();
					return true;
				}
			}
		}
//		if (request instanceof SetRequest) {
//			setRequest = (SetRequest) request;
//			if (setRequest.getElementToEdit() instanceof Element) {
//				targetContainerElement = (Element) setRequest.getElementToEdit();
//				targetContainerPackage = ExtendedSysMLUtil.getVerifiedRequirementsPackage(targetContainerElement);
//				if (null != targetContainerPackage) {
//					targetContainerPackageDepth = targetContainerPackage.getIdDepth();
//					return true;
//				}
//			}
//		}
		return false;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected ICommand getAfterMoveCommand(MoveRequest request) {
		ICommand resultCommand = null;

		Resource resource = targetContainerElement.eResource();
		Map<?, ?> elementsToMove = moveRequest.getElementsToMove();
		List<Requirement> requirementsToEdit = new ArrayList<Requirement>();

		for (Entry<?, ?> entry : elementsToMove.entrySet()) {
			Element elementToMove = (Element) entry.getKey();
			if (null != UMLUtil.getStereotypeApplication(elementToMove, Requirement.class)) {
				requirementsToEdit.add(UMLUtil.getStereotypeApplication(elementToMove, Requirement.class));
			}
		}

		resultCommand = new RequirementsIdEditCommand(request.getEditingDomain(), Messages.EDITING_TYPE,
				Arrays.asList((WorkspaceSynchronizer.getFile(resource))), requirementsToEdit, targetContainerPackage,
				targetContainerPackageDepth);

		return resultCommand;
	}

//	/**
//	 * {@inheritDoc}
//	 */
//	@Override
//	protected ICommand getAfterSetCommand(SetRequest request) {
//		ICommand resultCommand = null;
//
//		Resource resource = targetContainerElement.eResource();
//		List<Requirement> requirementsToEdit = new ArrayList<Requirement>();
//		@SuppressWarnings("unchecked")
//		List<Element> elementsToEdit = (ArrayList<Element>) setRequest.getValue();
//
//		for (Element ele : elementsToEdit) {
//			if (null != UMLUtil.getStereotypeApplication(ele, Requirement.class)) {
//				requirementsToEdit.add(UMLUtil.getStereotypeApplication(ele, Requirement.class));
//			}
//		}
//
//		resultCommand = new RequirementsIdEditCommand(request.getEditingDomain(), Messages.EDITING_TYPE,
//				Arrays.asList((WorkspaceSynchronizer.getFile(resource))), requirementsToEdit, targetContainerPackage,
//				targetContainerPackageDepth);
//
//		return resultCommand;
//	}

}