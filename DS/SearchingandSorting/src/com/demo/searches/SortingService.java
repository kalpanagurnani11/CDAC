package com.demo.searches;

import java.util.Arrays;

public class SortingService {
	
	public static void bubbleSort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length-i;j++)
			{
				if(arr[j-1]>arr[j])
			{
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					
					
			}
			}
				
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void bubbleDescendingSort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length-i;j++)
			{
				if(arr[j-1]<arr[j])
			{
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					
					
			}
			}
				
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void bubbleModifiedSort(int[] arr)
	{
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length-i;j++)
			{
				if(arr[j-1]>arr[j])
			{		
					flag =true;
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					
					
			}
			}
				
		
		System.out.println(Arrays.toString(arr));
		
		if(!flag)
		{
			break;
		}
		}
		
	}
	public static int minIndex(int [] arr,int j)
	{
		int min=j;
		for(int i=j;i<arr.length;i++)
		{
			if(arr[i]<arr[min])
			{
				min=i;
			}
		}
		return min;
	}
	
	
	public static void SelectionSort(int [] arr)
	{
		int minIn=0;
		for(int i=0;i<arr.length;i++)
		{
			
			minIn=minIndex(arr,i);
//			if(minIn!=i)
			swap(arr,i,minIn);
			
			
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void swap(int[]arr,int first,int minIn)
	{
//		for(int i=first;i<=minIn;i++)
//		{
		int temp=arr[first];
		arr[first]=arr[minIn];
		arr[minIn]=temp;
//		}
		
		
		
		
	}
	

}
