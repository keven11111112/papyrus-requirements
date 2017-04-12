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

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.papyrus.requirements.extendedsysml.extendedsysmlprofile.RequirementsPackage;
import org.eclipse.swt.widgets.Display;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;

public class ExtendedSysMLUtil {

	public static RequirementsPackage getVerifiedRequirementsPackage(Element targetContainerElement) {

		if (null != UMLUtil.getStereotypeApplication(targetContainerElement, RequirementsPackage.class)) {
			RequirementsPackage targetContainerPackage = UMLUtil.getStereotypeApplication(targetContainerElement,
					RequirementsPackage.class);
			if (!targetContainerPackage.getAlias().isEmpty() && null != targetContainerPackage.getIdDepth()) {
				return targetContainerPackage;
			} else {
				MessageDialog.openWarning(Display.getCurrent().getActiveShell(),
						Messages.TITLE_PAPYRUS_FOR_REQUIREMENTS, Messages.MSG_ASK_FOR_ALIAS_AND_ID_PROPERTIES);
			}
		} else {
			MessageDialog.openWarning(Display.getCurrent().getActiveShell(), Messages.TITLE_PAPYRUS_FOR_REQUIREMENTS,
					Messages.MSG_ASK_TO_APPLY_PROFILE_AND_STEREOTYPE);
		}
		return null;
	}
}
