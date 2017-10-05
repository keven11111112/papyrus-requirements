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
 * 		Patrick Tessier (Patrick.tessier@cea.fr) CEA LIST - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.gendoc.custom.templates;

import java.net.URL;

import org.eclipse.gendoc.wizard.IGendocTemplate;

public class Gendoc2RunnerDocxRequirements implements IGendocTemplate {

	private String description = "Requirements MS Word 2010 generation template";

	@Override
	public String getOutPutExtension() {
		return "docx";
	}

	public URL getTemplate() {
		return Activator.getDefault().getBundle().getEntry("/resources/RequirementDoc.docx");
	}

	public String getModelKey() {
		return "generic_generation_model";
	}

	public String getOutputKey() {
		return "generic_generation_output";
	}

	public String getDescription() {
		return description;
	}

	public String getName() {
		return "Requirements";
	}

	@Override
	public boolean isSavable() {
		// TODO Auto-generated method stub
		return false;
	}

}
