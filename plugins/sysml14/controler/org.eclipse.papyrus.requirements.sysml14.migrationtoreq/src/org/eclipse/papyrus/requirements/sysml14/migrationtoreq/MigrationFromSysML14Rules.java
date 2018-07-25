/*******************************************************************************
 * Copyright (c) 2017 CEA LIST.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Yupanqui Munoz Julho (CEA LIST) <yupanqui.munozjulho@cea.fr> - initial API and implementation
 *******************************************************************************/
package org.eclipse.papyrus.requirements.sysml14.migrationtoreq;

import org.eclipse.uml2.uml.Element;

/**
 * Interface to define the migration rules from SysML 1.4 model to a target domain model. 
 *
 */
public interface MigrationFromSysML14Rules {

	/**
	 * Set migration of a requirement (SysML 1.4) to another element from target domain model.
	 * 
	 * @param element
	 * @param sysmlRequirement
	 */
	public void setRequirement(Element element, org.eclipse.papyrus.sysml14.requirements.Requirement sysmlRequirement);

}