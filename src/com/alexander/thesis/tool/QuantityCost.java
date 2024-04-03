package com.alexander.thesis.tool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class QuantityCost {
	int quantity;
	double cost;

	public QuantityCost(int quantity, double cost) {
		this.quantity = quantity;
		this.cost = cost;
	}

	/**
	 * Sorts the quantity list supplied by quantity in ascending order
	 * 
	 * @param quantityCosts A list of QuantityCost objects
	 */
	public static void sort(List<QuantityCost> quantityCosts) {
		quantityCosts.sort((q1, q2) -> {
			if (q1.quantity == q2.quantity)
				return 0;
			return q1.quantity > q2.quantity ? 1 : -1;
		});
	}

	public String toString() {
		return "Quantity: " + this.quantity + " Cost: " + this.cost;
	}

	/**
	 * Sums the costs of each quantity which are the same and saves it in a list of
	 * QuantityCosts
	 * 
	 * @param quantityCosts A list of QuantityCost to be summed
	 * @return A list of summed QuantityCosts
	 */
	public static List<QuantityCost> getSum(List<QuantityCost> quantityCosts) {
		HashMap<Integer, Double> table = new HashMap<Integer, Double>();
		List<QuantityCost> summedCosts = new ArrayList<QuantityCost>();

		double cost_applied_to_all = 0;

		// Sum costs using quantity as an identifier
		for (QuantityCost quantitycost : quantityCosts) {
			int key = quantitycost.quantity;
			double value = quantitycost.cost;

			// If zero the value should be added to all quantities equally
			if (key == 0) {
				cost_applied_to_all += value;
				continue;
			}

			// Add value if quantity already exists
			if (table.containsKey(key)) {
				double updatedValue = table.get(key) + value;
				table.replace(key, updatedValue);

				// Put value if it does not exist
			} else {
				table.put(key, value);
			}
		}

		// For each entry in the hash table convert the key and value to a QuantityCost
		// object and add the costs applied to all quantities.
		for (Entry<Integer, Double> entry : table.entrySet()) {
			summedCosts.add(new QuantityCost(entry.getKey(), entry.getValue() + cost_applied_to_all));
		}

		return summedCosts;
	}

}
