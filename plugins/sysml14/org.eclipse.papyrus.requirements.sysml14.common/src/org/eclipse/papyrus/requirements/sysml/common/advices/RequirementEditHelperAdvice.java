/*****************************************************************************
 * Copyright (c) 2018 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Patrick Tessier (CEA LIST) - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.requirements.sysml.common.advices;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.papyrus.infra.emf.gmf.command.EMFtoGMFCommandWrapper;
import org.eclipse.papyrus.requirements.sysml.common.command.SetRequirementIdCommand;
import org.eclipse.papyrus.requirements.sysml14.common.I_SysMLStereotype;
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
		/**
			 * @see org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice#getAfterDuplicateCommand(org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest)
			 *
			 * @param request
			 * @return
			 */
			@Override
			protected ICommand getAfterDuplicateCommand(DuplicateElementsRequest request) {
				// TODO Auto-generated method stub
				return super.getAfterDuplicateCommand(request);
			}
			/**
				 * @see org.eclipse.papyrus.uml.types.core.edithelper.DefaultUMLEditHelperAdvice#getAfterEditCommand(org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest)
				 *
				 * @param req
				 * @return
				 */
				@Override
				public ICommand getAfterEditCommand(IEditCommandRequest req) {
					if (req instanceof SetRequest) {
						Stereotype reqStereotype = ((org.eclipse.uml2.uml.Class)((SetRequest) req).getElementToEdit()).getApplicableStereotype(I_SysMLStereotype.REQUIREMENT_STEREOTYPE);
				//System.out.println(((org.eclipse.uml2.uml.Class)((SetRequest) req).getElementToEdit()).getValue(reqStereotype, I_SysMLStereotype.REQUIREMENT_ID_ATT));
				
					}
					
					// TODO Auto-generated method stub
					return super.getAfterEditCommand(req);
				}
}
