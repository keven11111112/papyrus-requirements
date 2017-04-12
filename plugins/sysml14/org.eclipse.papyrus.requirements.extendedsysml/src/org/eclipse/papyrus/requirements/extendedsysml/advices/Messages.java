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

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.papyrus.requirements.extendedsysml.advices.messages"; //$NON-NLS-1$
	public static String MSG_INF_PREFIX_NOT_FOUND;
	public static String EDITING_TYPE;
	public static String MSG_ASK_FOR_ALIAS_AND_ID_PROPERTIES;
	public static String MSG_ASK_TO_APPLY_PROFILE_AND_STEREOTYPE;
	public static String MSG_GET_LEFT_MARGIN_TEXT;
	public static String MSG_GET_SEPARATOR;
	public static String TITLE_PAPYRUS_FOR_REQUIREMENTS;
	public static String UNDERLINE;
	public static String MSG_ASK_TO_CONFIRM_ID_MODIFICATIONS;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
