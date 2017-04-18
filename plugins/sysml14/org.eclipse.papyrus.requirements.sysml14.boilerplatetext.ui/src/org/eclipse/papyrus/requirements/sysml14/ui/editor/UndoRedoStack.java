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
 * 		CEA LIST - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.requirements.sysml14.ui.editor;

import java.util.Stack;

public class UndoRedoStack<T> {

	private Stack<T> undo;
	private Stack<T> redo;

	public UndoRedoStack() {
		undo = new Stack<T>();
		redo = new Stack<T>();
	}

	public void pushUndo(T delta) {
		undo.add(delta);
	}

	public void pushRedo(T delta) {
		redo.add(delta);
	}

	public T popUndo() {
		T res = undo.pop();
		return res;
	}

	public T popRedo() {
		T res = redo.pop();
		return res;
	}

	public void clearUndo() {
		undo.clear();
	}

	public void clearRedo() {
		redo.clear();
	}

	public boolean hasUndo() {
		return !undo.isEmpty();
	}

	public boolean hasRedo() {
		return !redo.isEmpty();
	}
}
