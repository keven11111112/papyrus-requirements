/*****************************************************************************
 * Copyright (c) 2016 CEA LIST.
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
package org.eclipse.papyrus.metrics.commands.helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.papyrus.metrics.commands.Activator;
import org.eclipse.papyrus.metrics.extensionpoints.helpers.Result;
import org.eclipse.papyrus.metrics.extensionpoints.interfaces.IDefaultQuerySwitch;
import org.eclipse.papyrus.metrics.extensionpoints.interfaces.IRecognizerSwitch;
import org.eclipse.papyrus.metrics.extensionpoints.interfaces.IResultsViewer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.uml2.uml.Element;
import org.omg.smm.Measure;
import org.omg.smm.Operation;
import org.omg.smm.Scope;

/**
 * Helper class for determining scopes and measures' values
 *
 */
public class MetricsCalculatorHelper {
	protected ArrayList<Measure> measures = new ArrayList<Measure>();
	protected org.eclipse.uml2.uml.Element observationScope = null;
	protected ArrayList<IResultsViewer> resultsViewers = null;
	protected ArrayList<Result> observationResults = null;
	protected HashMap<Element, ArrayList<Measure>> measurementScopes = null;
	protected IRecognizerSwitch recognizerSwitch = null;
	protected IDefaultQuerySwitch defaultQuerySwitch = null;

	public MetricsCalculatorHelper(ArrayList<Measure> measures2, Element observationScope2,
			ArrayList<IResultsViewer> viewers2, IRecognizerSwitch recognizerSwitch2,
			IDefaultQuerySwitch defaultQuerySwitch2) {
		this.measures = measures2;
		this.observationScope = observationScope2;
		this.resultsViewers = viewers2;
		this.measurementScopes = new HashMap<Element, ArrayList<Measure>>();
		this.observationResults = new ArrayList<Result>();
		this.recognizerSwitch = recognizerSwitch2;
		this.defaultQuerySwitch = defaultQuerySwitch2;
	}

	public void run() {
		calculateMeasurementScopes(this.observationScope);
		performMeasurementProcess();
		showMeasures();
	}

	/**
	 * Calculates the smmModels that apply to the model itself and its owned
	 * elements. The relationship between an element and its applicable
	 * smmMetrics is saved in
	 * {@link CalculateSmmBasedMeasuresCommand#measurementScopes}.
	 * 
	 * @param element
	 *            The Element to analyze
	 */
	public void calculateMeasurementScopes(Element element) {
		for (Measure measure : measures) {
			if (null == measure.getScope()) {
				Activator.log.warn("There are not scopes associated to the measure " + measure.getName());
				return;
			}
			Scope scope = measure.getScope();
			if (null == scope.getRecognizer()) {
				Activator.log.warn("There are not recognizers associated to the scope " + scope.getName());
				return;
			}
			Operation recognizer = scope.getRecognizer();
			if (recognizer.getLanguage().contentEquals("Java")) {
				String operationName = recognizer.getBody();
				if (recognizerSwitch.isRecognized(operationName, element)) { 
					updateMeasurementScopes(element, measure);
					if (element.allOwnedElements() != null) {
						for (Element currentElement : element.allOwnedElements()) {
							calculateMeasurementScopes(currentElement);
						}
					}
				}
			}
		}
	}

	/**
	 * Add new entries to the {@link #measurementScopes} map avoiding duplicates
	 * 
	 * @param element
	 *            that can be measured using the measure
	 * @param measure
	 *            the measure that can be calculated for the element
	 */
	protected void updateMeasurementScopes(Element element, Measure measure) {
		if (measurementScopes.containsKey(element)) {
			// avoid repeated smmModels by element
			if (!(measurementScopes.get(element)).contains(measure)) {
				measurementScopes.get(element).add(measure);
			}
		} else {
			measurementScopes.put(element, new ArrayList<Measure>());
			measurementScopes.get(element).add(measure);
		}
	}

	/**
	 * Shows the information of the smmModels using all the registered viewers
	 */
	public void showMeasures() {
		if (observationResults.isEmpty()){
			MessageDialog.openWarning(Display.getCurrent().getActiveShell(), "Information",
					"There are no measures to calculate for the selected element");
			return;
		}
		for (IResultsViewer resultsViewer : resultsViewers) {
			resultsViewer.show(observationResults);
		}
	}

	/**
	 * Updates the results of the smmMetrics measurement process.
	 * 
	 * @param measure
	 *            the measure that measures the measurand
	 * @param measurand
	 *            the element measured
	 * @param value
	 *            the value of the measure calculated on the measurand
	 */
	protected void updateOpservationResults(Measure measure, Element measurand, Object value) {
		observationResults.add(new Result(measure, measurand, value));
	}

	/**
	 * Perform a process to obtain smmModels based on the map
	 * {@link CalculateSmmBasedMeasuresCommand#measurementScopes} that contains
	 * the Measurand-Metrics tuples.
	 */
	public void performMeasurementProcess() {
		Iterator<Element> elementKeyiterator = measurementScopes.keySet().iterator();
		Object value = null;
		while (elementKeyiterator.hasNext()) {
			Element currentKey = (Element) elementKeyiterator.next();
			Iterator<Measure> measuresIterator = measurementScopes.get(currentKey).iterator();
			while (measuresIterator.hasNext()) {
				Measure measure = measuresIterator.next();
				if (null == measure.getDefaultQuery()) {
					Activator.log.warn("There are not default queries associated to the measure " + measure.getName());
					return;
				}
				Operation operation = measure.getDefaultQuery();
				if (operation.getLanguage().contentEquals("Java")) {
					String methodNameToExecute = operation.getBody();
					value = defaultQuerySwitch.calculateValue(methodNameToExecute, currentKey);
				}
				updateOpservationResults(measure, currentKey, value);
			}
		}
	}

}
