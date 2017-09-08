package com.java.sorting;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
	
	public static List<Integer> quicksort(List<Integer> numbers) {
		
		if (numbers.size() < 2) {
			return numbers;
		}
		final Integer pivot = numbers.get(0);
		final List<Integer> lower = new ArrayList<>();
		final List<Integer> higher = new ArrayList<>();
		for (int i = 1; i < numbers.size(); i++) {
			if (numbers.get(i) < pivot) {
				lower.add(numbers.get(i));
			} else {
				higher.add(numbers.get(i));
			}
		}
		final List<Integer> sorted = quicksort(lower);
		sorted.add(pivot);
		sorted.addAll(quicksort(higher));
		return sorted;
	}
}
