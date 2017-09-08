package com.java.sorting;

public class BubbleSort {
	
	public void bubbleSort(int[] numbers) {
		boolean IsSwapped;
		do {
			IsSwapped = false;
			for (int i = 0; i < numbers.length - 1; i++) {
				if (numbers[i + 1] < numbers[i]) {
					int temp = numbers[i + 1];
					numbers[i + 1] = numbers[i];
					numbers[i] = temp;
					System.out.println("Swapped");
					IsSwapped = true;
				}
			}

		} while (IsSwapped);
	}

}
