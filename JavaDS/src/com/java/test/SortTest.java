package com.java.test;

import com.java.sorting.BubbleSort;

public class SortTest {
	
	
	
	public static void main(String[] args) {
		
		SortTest b = new SortTest();
		b.testBubbleSort();
		
	}
	
	public void testBubbleSort()
	{
		int bubbleSortArray[]  = {1,3,2,4,5};
		BubbleSort b = new BubbleSort();
		System.out.println(printArray(bubbleSortArray));
		b.bubbleSort(bubbleSortArray);
		System.out.println(printArray(bubbleSortArray));
		
	}
	
	private String printArray(int[] bubbleSort)
	{
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<bubbleSort.length;i++)
		{
			sb.append(bubbleSort[i]);
		}
		
		return sb.toString();
	}

}
