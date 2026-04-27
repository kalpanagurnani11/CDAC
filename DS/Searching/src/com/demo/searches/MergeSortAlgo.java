package com.demo.searches;

import java.util.Arrays;

public class MergeSortAlgo {
	public static void mergeSort(int[] arr,int start,int end)
	{
		if(start<end)
		{
			int mid=start+end/2;
			mergeSort(arr,start,end);
			mergeSort(arr,mid+1,end);
			merge(arr,start,mid,end);
		}
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		int n1=mid-start+1;
		int n2=end-mid;
		
		int [] leftarr=new int[n1];
		int [] rightarr=new int[n2];
		
		for(int i=0;i<n1;i++)
		{
			leftarr[i]=arr[start+i];
		}
		
		for(int i=0;i<n1;i++)
		{
			rightarr[i]=arr[mid+1+i];
		}
		
		int i=0;
		int j=0;
		int k=start;
		while((i<n1)&&(j<n2))
		{
			if(leftarr[i]<rightarr[j])
			{
				arr[k]=leftarr[i];
				i++;
				k++;
			}
			else
			{
				arr[k]=rightarr[j];
				k++;
				j++;
				
			}
		}
			while(i<n1)
			{
				arr[k]=leftarr[i];
				i++;
				k++;
			
			}
			while(j<n2)
			{
				arr[k]=rightarr[i];
				j++;
				k++;
			
			}
			
			System.out.println(start+"->"+mid+"->"+end);
			System.out.println(Arrays.toString(leftarr));
			System.out.println(Arrays.toString(rightarr));
		
			
		}
		
		
		
		
	}




