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

import java.util.Iterator;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.papyrus.requirements.sysml14.boilerplateText.If;
import org.eclipse.papyrus.requirements.sysml14.boilerplateText.Model;
import org.eclipse.papyrus.requirements.sysml14.boilerplateText.Predicate;
import org.eclipse.papyrus.requirements.sysml14.boilerplateText.Prefix;
import org.eclipse.papyrus.requirements.sysml14.boilerplateText.Requirement;
import org.eclipse.papyrus.requirements.sysml14.boilerplateText.Shall;
import org.eclipse.papyrus.requirements.sysml14.boilerplateText.ShallAllow;
import org.eclipse.papyrus.requirements.sysml14.boilerplateText.ShallNot;
import org.eclipse.papyrus.requirements.sysml14.boilerplateText.ShallNotAllow;
import org.eclipse.papyrus.requirements.sysml14.boilerplateText.Subject;
import org.eclipse.papyrus.requirements.sysml14.boilerplateText.While;
import org.eclipse.papyrus.requirements.sysml14.boilerplateText.util.BoilerplateTextSwitch;

public class RequirementsPrinter extends BoilerplateTextSwitch<Object> implements BoilerplateTextKeywords {

	StringBuffer sb = new StringBuffer();

	@Override
	public String caseRequirement(Requirement object) {
		return "";
	}

	@Override
	public String casePrefix(Prefix object) {
		return "";
	}

	@Override
	public String caseIf(If object) {
		StringBuffer sb = new StringBuffer();
		Iterator<String> it = object.getEvent().iterator();
		sb.append(IF);
		if (it.hasNext()) {
			sb.append(Quote(it.next()));
		}
		while (it.hasNext()) {
			sb.append(AND + Quote(it.next()));
		}
		return sb.toString() + END_OF_CONDITIONAL_CLAUSE;
	}

	@Override
	public String caseWhile(While object) {
		return WHILE + Quote(object.getState()) + END_OF_CONDITIONAL_CLAUSE;
	}

	@Override
	public String caseSubject(Subject object) {
		return Quote(object.getSystem());
	}

	@Override
	public String casePredicate(Predicate object) {
		return "";
	}

	@Override
	public String caseShallNotAllow(ShallNotAllow object) {
		StringBuffer sb = new StringBuffer();
		sb.append(SHALLNOTALLOW);
		if (null != object.getAction()) {
			sb.append(Quote(object.getAction()));
		}
		if (null != object.getEntity()) {
			sb.append(Quote(object.getEntity()) + TO + Quote(object.getActionPerformedByEntity()));
		}
		return sb.toString();
	}

	@Override
	public String caseShallAllow(ShallAllow object) {
		StringBuffer sb = new StringBuffer();
		sb.append(SHALLALLOW);
		if (null != object.getAction()) {
			sb.append(Quote(object.getAction()));
		}
		if (null != object.getEntity()) {
			sb.append(Quote(object.getEntity()) + TO + Quote(object.getActionPerformedByEntity()));
		}
		return sb.toString();
	}

	@Override
	public String caseShallNot(ShallNot object) {
		return SHALLNOT + Quote(object.getAction());
	}

	@Override
	public String caseShall(Shall object) {
		return SHALL + Quote(object.getAction());
	}

	@Override
	public String defaultCase(EObject object) {
		return "";
	}

	public String print(Model xtextModel) {
		TreeIterator<Object> it = EcoreUtil.getAllProperContents(xtextModel, false);
		while (it.hasNext()) {
			EObject token = (EObject) it.next();
			sb.append(this.doSwitch(token));
		}
		return this.sb.toString();
	}

	public static String Quote(String str) {
		return QUOTE + str + QUOTE;
	}
}
