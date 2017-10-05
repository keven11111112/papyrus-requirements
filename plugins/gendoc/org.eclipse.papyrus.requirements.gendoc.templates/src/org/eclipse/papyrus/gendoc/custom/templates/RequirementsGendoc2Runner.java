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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.eclipse.gendoc.bundle.acceleo.papyrus.utils.OneFileUMLSelectionConverter;
import org.eclipse.gendoc.wizard.IGendocSelectionConverterRunner;
import org.eclipse.gendoc.wizard.IGendocTemplate;
import org.eclipse.gendoc.wizard.ISelectionConverter;

public class RequirementsGendoc2Runner implements IGendocSelectionConverterRunner {
	List<IGendocTemplate> templates = new ArrayList<IGendocTemplate>();

	public RequirementsGendoc2Runner() {
		templates.add(new Gendoc2RunnerDocxRequirements());
	}

	/**
	 * @return specify all extension of model that papyrusGendoc2Runner can generate the documentation
	 */
	public Pattern getPattern() {
		return Pattern.compile(".*\\.uml");
	}

	public ISelectionConverter getSelectionConverter() {
		return new OneFileUMLSelectionConverter();
	}


	/**
	 * @return all the template format associated to this Papyrus runner
	 */
	public List<IGendocTemplate> getGendoc2Templates() {
		return templates;
	}

	public String getLabel() {
		return "Requirements Document Generation";
	}

	@Override
	public Map<String, String> getAdditionnalParameters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IGendocTemplate> getGendocTemplates() {
		// TODO Auto-generated method stub
		return templates;
	}


}

