package com.demo.test;

import com.demo.searches.SerachingService;

public class TestSearching {
	public static void main(String [] args)
	{
		int [] arr= {2,3,4,5,6,7,8,9};
		int pos=SerachingService.sequentialSearch(arr, 8);
		if(pos!=-1)
		{
			System.out.println("found"+pos);
			
		}
		else {
			System.out.println("not found");
		}	
		 pos=SerachingService.binarySearch(arr, 8);
		if(pos!=-1)
		{
			System.out.println("found"+pos);
			
		}
		else {
			System.out.println("not found");
		}
		 pos=SerachingService.binaryRecursiveSearch(arr, 8, 0, 7);
			if(pos!=-1)
			{
				System.out.println("found"+pos);
				
			}
			else {
				System.out.println("not found");
			}
		
	}
	

}
