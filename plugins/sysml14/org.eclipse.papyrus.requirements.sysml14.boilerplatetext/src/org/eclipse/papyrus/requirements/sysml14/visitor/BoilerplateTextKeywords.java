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

package org.eclipse.papyrus.requirements.sysml14.visitor;

public interface BoilerplateTextKeywords {
	static final String WHILE = " while ";
	static final String IF ="if ";
	static final String AND = " and ";
	static final String SHALLNOTALLOW = " shall not allow ";
	static final String SHALLALLOW = " shall allow ";
	static final String SHALLNOT = " shall not ";
	static final String SHALL = " shall ";
	static final String TO = " to ";
	static final String QUOTE = "\"";
	static final String END_OF_CONDITIONAL_CLAUSE = ", ";
}