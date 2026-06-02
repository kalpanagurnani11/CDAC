package com.demo.searches;

public class countingSort {
	
	public static countingSort(int[] arr)
	{
	//find max
	int max=findMax(arr);
	
	//create a array of size max+1
	int[] newarr=new int[max+1];
	
	//initialize the array to 0
	
	for(int i=0;i<newarr.length;i++)
	{
		newarr[i]=0;
	}
	
	//find number of occurrences for each distinct number
	for(int i=0;i<arr.length;i++)
	{
		int pos=arr[i];
		newarr[pos]++;
	}
	
	
	}

	private static int findMax(int[] arr) {
		
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
		
	}	
}
