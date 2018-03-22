/*****************************************************************************
 * Copyright (c) 2018 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.requirements.sysml.common.advices;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.papyrus.infra.emf.gmf.command.EMFtoGMFCommandWrapper;
import org.eclipse.papyrus.requirements.sysml.common.command.SetRequirementIdCommand;
import org.eclipse.papyrus.requirements.sysml14.common.Utils;
import org.eclipse.papyrus.uml.types.core.requests.ApplyStereotypeRequest;
import org.eclipse.uml2.uml.Stereotype;

/**
 * This advice has in charge to update the id of the requirement.
 *
 */
public class RequirementEditHelperAdvice extends org.eclipse.papyrus.uml.types.core.edithelper.DefaultUMLEditHelperAdvice{// org.eclipse.papyrus.uml.types.core.edithelper.DefaultUMLEditHelperAdvice{//org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice{//

		/**
		 * @see org.eclipse.papyrus.uml.types.core.edithelper.DefaultUMLEditHelperAdvice#getAfterApplyStereotypeCommand(org.eclipse.papyrus.uml.types.core.requests.ApplyStereotypeRequest)
		 *
		 * @param req
		 * @return
		 */
		@Override
		protected ICommand getAfterApplyStereotypeCommand(ApplyStereotypeRequest req) {
			 Stereotype appliedStereotype=req.getStereotype();
			 if(Utils.isRequirementStereotype(appliedStereotype)) {
		            return new EMFtoGMFCommandWrapper(new SetRequirementIdCommand(req.getEditingDomain(),  req.getUmlElement()));
		        }
		        return super.getAfterApplyStereotypeCommand(req);
		}
}
