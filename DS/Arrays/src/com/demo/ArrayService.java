package com.demo;

import java.util.Arrays;

public class ArrayService {
	private int[] arr;
	private int count;
	
	public ArrayService() {
		super();
		arr=new int[10];
		count=0;
	}

	public ArrayService(int size) {
		super();
		arr=new int[size];
		count=0;
	
	}

	public ArrayService(int[] arr, int count) {
		super();
		this.arr = arr;
		this.count = count;
	}
	
	public int getcapacity()
	{
		return arr.length;
	}
	public int  getCount()
	{	
		return count;
	}
	
//	add val
	
	public boolean add(int val)
	{
		if(count<arr.length)
		{
			arr[count]=val;
			count++;
			return true;
		}
		return false;
		
	}
	
//	 add at pos
	public boolean add(int val,int pos)
	{
		if(count<arr.length && pos>=0)
		{
			for(int i=count;i>=pos;i--)
			{
			arr[i]=arr[i-1];
			}
			arr[pos]=val;
			count++;
			return true;
		}
		return false;
		
	}	 
//	 search by val 
	public int searchByVal(int val)
	{
		for(int i=0;i<count;i++)
		{
			if(arr[i]==val)
			{
				return i;
			}
		}
		return -1;
	}
//	 delete by pos
	public boolean deleteByPos(int pos)
	{
		if((pos<arr.length) && (count<arr.length))
		{
		for(int i=pos+1;i<count;i++)
		{
			arr[i-1]=arr[i];
				
			
		}
		count--;
		arr[count]=0;
		return true;
		}
		return false;
		
	}
//	 delete by val
	public int deleteByVal(int val)
	{
	int pos=searchByVal(val);
	if(pos!=-1)
	{
		boolean flag=deleteByPos(pos);
			
			if (flag)
			{
				return pos;
			}
				}
	
	return -1;
	}
	
//	rotate 
	public int[] rotateArray(boolean flag,int num)
	{
		if(flag)
		{
			for(int j=0;j<num;j++)
			{
				int temp=arr[count-1];
				for(int i=count-1;i>0;i--)
				{
					arr[i]=arr[i-1];	
				}
				arr[0]=temp;
			}
			return arr;
			}
		else {
			int temp;
			for(int j=0;j<num;j++)
			{
				
			
			temp=arr[0];
			for(int i=0;i<count-1;i++)
			{
				arr[i]=arr[i+1];
				
			}
			arr[count-1]=temp;
		}
			return arr;
		}
			
		
	
	}
//reverse
	public int[] reverseArray(boolean flag)
	{
		int[]arr1=new int[count];
		if(flag)
		{
			for(int i=0,j = count-1;i<j;i++,j--)
			{
					
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					
			}
			return arr;
			
		}
		else
		{
			for(int i=count-1,j=0;i>=0;i--,j++)
			{
				arr1[j]=arr[i];
			}
			return arr1;
		}
		
	}
	
	
	public int [] exchangeIndexValue()
	{
		int maxnum=findmax();
		
		int[] arr1=new int[maxnum+1];
		
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=-1;
		}
		
		for(int i=0;i<count;i++)
		{
			int d=arr[i];
			arr1[d]=i;
		}
		
		return arr1;
	}
	
	
	private int findmax() {
		int max=arr[0];
		for(int i=1;i<count;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}

	@Override
	public String toString() {
		return "ArrayService [arr=" + Arrays.toString(arr) + ", count=" + count + "]";
	}
	
	
	
	

}
