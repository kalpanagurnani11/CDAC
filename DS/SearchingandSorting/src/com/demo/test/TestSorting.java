package com.demo.test;

import com.demo.searches.SortingService;

public class TestSorting {
	public static void main(String [] args)
	{
		int []arr= {21,3,7,4,3,56,89};
		SortingService.bubbleSort(arr);
		SortingService.bubbleModifiedSort(arr);
		
		SortingService.bubbleDescendingSort(arr);
		SortingService.SelectionSort(arr);
	}

}
