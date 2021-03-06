/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.requirements.reqif.integration.assistant;

import java.util.Collection;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.papyrus.uml.profile.ui.dialogs.ChooseSetAssistedDialog;
import org.eclipse.rmf.reqif10.SpecType;
import org.eclipse.rmf.reqif10.provider.ReqIF10ItemProviderAdapterFactory;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;

/**
 * Dialog in order to select Type from a ReqIF File 
 *
 */
public class ChooseReqIFTypeDialog extends ChooseSetAssistedDialog {

	/**
	 * 
	 * Constructor.
	 *
	 * @param parentShell a shell in order to launch the dialog
	 * @param spectObjectTypes a list of SpecObjectTypes
	 */
	public ChooseReqIFTypeDialog(Shell parentShell,Collection<SpecType> spectObjectTypes) {
		super(parentShell, "ReqIF type available", "Selected ReqIF Types to import");
		for(SpecType specObjectType : spectObjectTypes) {
			possibleElementList.addElement(specObjectType);
		}
	
		ReqIF10ItemProviderAdapterFactory adapterFactory= new ReqIF10ItemProviderAdapterFactory();
		final AdapterFactoryLabelProvider factoryLabelProvider=new AdapterFactoryLabelProvider(adapterFactory); 
		  labelProvider= new LabelProvider(){
			@Override
			public Image getImage(Object element) {
				return factoryLabelProvider.getImage(element);
			}  
			@Override
			public String getText(Object element) {
				return factoryLabelProvider.getText(element);
			}
		  };
			  
			  
		
	}
	
}
