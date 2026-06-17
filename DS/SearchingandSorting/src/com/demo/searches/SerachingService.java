package com.demo.searches;

public class SerachingService {
	public static int sequentialSearch(int []arr ,int searchnum)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==searchnum)
			{
				return i;
			}
		}
		return -1;
		
		
		
	}
	public static int binarySearch(int []arr,int searchnum)
	{
		int low=0;
		int high=arr.length-1;
		int cnt=0;
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			cnt++;
			if(arr[mid]==searchnum)
			{	System.out.println("no.of comp"+cnt);
				return mid;
			}
			else if(searchnum<arr[mid])
			{
				high=mid-1;
				
			}
			else
			{
				low=mid+1;
			}
			
		}
		System.out.println("no.of comp"+cnt);	
		
		return -1;
		
	}
	
	public static int binaryRecursiveSearch(int []arr,int searchnum,int low,int high)
	{
		
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			
			if(arr[mid]==searchnum)
			{	
				return mid;
			}
			else if(searchnum<arr[mid])
			{
				return binaryRecursiveSearch(arr,searchnum,low,high=mid-1);
				
			}
			else
			{
				return binaryRecursiveSearch(arr,searchnum,low=mid+1,high);
				
			}
			
		}
			
		
		return -1;
		
	}


}
