package com.alexander.thesis.tool;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;
import java.util.Locale;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Class;

public class CSVWriter {
	RandomAccessFile writer;
	long nrWrites = 0;

	CSVWriter(String fileName) throws IOException {
		writer = new RandomAccessFile(fileName, "rw");
	}

	public void close() throws IOException {
		writer.close();
	}

	/**
	 * Writes all variability points choices to a CSV file chosen at the creation of
	 * the object. Writes all properties of the stereotype Choice, except Selected.
	 * 
	 * @param variabilityPoints The variability points choices to write to a CSV file.
	 * @throws IOException throws if the file is open or is unable to be opened.
	 */
	public void writeSelectedToCSV(EList<Class> variabilityPoints) throws IOException {
		long endOfFile = writer.length();

		// Gets all the selected choices
		EList<Class> totalSelectedChoices = VariabilityPoint.getAllSelectedChoices(variabilityPoints);

		// Gets all quantityCosts for all selected choices
		List<QuantityCost> totalQuantityCosts = QuantityCost.getSum(Choice.getCosts(totalSelectedChoices));

		// Sorts the list in ascending order using the quantity value as axis
		QuantityCost.sort(totalQuantityCosts);

		// Go to end of file
		if (endOfFile > 2) {
			writer.seek(endOfFile);
			writer.writeChars("\r\n;\r\n");
		}
		// Write table header
		writer.writeChars("Variability Point;Choice;Performance;Performance Type;Power;Multiplicity;Quantity:;");

		// Write in the quantities one the same line as the header
		for (QuantityCost totalQuantityCost : totalQuantityCosts)
			writer.writeChars(String.format(Locale.GERMAN, "%d;", totalQuantityCost.quantity));

		// Write out each variability point
		for (Class variabilityPoint : variabilityPoints) {

			EList<Class> selectedChoices = VariabilityPoint.getSelectedChoices(variabilityPoint);

			// For each selected choice under the variability point write in its choice
			// properties
			for (Class choice : selectedChoices) {
				double performance = Choice.getPerformance(choice);
				String performanceType = Choice.getPerformanceType(choice);
				double power = Choice.getPower(choice);
				int multiplicity = Choice.getMultiplicity(choice);

				writer.writeChars(String.format(Locale.GERMAN, "\r\n%s;%s;%f;%s;%f;%01d;Costs:;", variabilityPoint.getName(),
						choice.getName(), performance, performanceType, power, multiplicity));

				// Get the costs of the current processed choice
				List<QuantityCost> choiceQuantityCosts = Choice.getCosts(choice);
				QuantityCost.sort(choiceQuantityCosts);

				for (QuantityCost totalQuantityCost : totalQuantityCosts) {
					boolean found = false;

					for (QuantityCost choiceQuantityCost : choiceQuantityCosts) {
						if (choiceQuantityCost.quantity == 0) {
							writer.writeChars(String.format(Locale.GERMAN, "%f;", choiceQuantityCost.cost));
							found = true;
							break;
						}

						if (choiceQuantityCost.quantity != totalQuantityCost.quantity)
							continue;

						found = true;
						writer.writeChars(String.format(Locale.GERMAN, "%f;", choiceQuantityCost.cost));
					}

					if (found)
						continue;

					writer.writeChars("0,0;");

				}

			}

			nrWrites++;
		}

		writer.writeChars(
				String.format(Locale.GERMAN, "\r\n;;;Total:;%f;;Total:;", Choice.getTotalPower(totalSelectedChoices)));

		for (QuantityCost totalQuantityCost : totalQuantityCosts) {
			writer.writeChars(String.format(Locale.GERMAN, "%f;", totalQuantityCost.cost));
		}

	}

}