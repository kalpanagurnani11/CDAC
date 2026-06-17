package com.demo;

import java.util.Scanner;

public class Array2D {
	private int [][] arr;

	public Array2D(int[][] arr) {
		super();
		this.arr = arr;
	}

	public Array2D() {
		arr=new int[3][3];
	}
	
	public void acceptData()
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.println("enter element"+i+" "+j);
				arr[i][j]=sc.nextInt();
			}
		}
	}
	public void displayData()
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public int[] findSumRowWise()
	{
		int [] sum=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			sum[i]=0;
			for(int j=0;j<arr[0].length;j++)
			{
				sum[i]+=arr[i][j];
			}
		}
		return sum;
	}
	
	public int[] findSumColWise()
	{
		int [] sum=new int[arr[0].length];
		for(int i=0;i<arr[0].length;i++)
		{
			sum[i]=0;
			for(int j=0;j<arr.length;j++)
			{
				sum[i]+=arr[j][i];
			}
		}
		return sum;
	}
	
	public int[][] add2DArray(Array2D ob)
	{
		int [][] sum=new int[this.arr.length][this.arr[0].length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				sum[i][j]=this.arr[i][j]+ob.arr[i][j];
			}
		}
		
		return sum;
	}
	public int[][] sub2DArray(Array2D ob)
	{
		int [][] sub=new int[this.arr.length][this.arr[0].length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				sub[i][j]=this.arr[i][j]-ob.arr[i][j];
			}
		}
		
		return sub;
	}
	
	public int [][] matrixMultiplication(Array2D ob)
	{
		int[][] res=new int[this.arr.length][ob.arr[0].length];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				int sum=0;
				for(int k=0;k<this.arr[0].length;k++)
				{
					sum+=this.arr[i][k]*ob.arr[k][j];
					
				}
				res[i][j]=sum;
			}
		}
		return res;
	}
	
	public void rowRotate(boolean flag,int num)
	{
		if (flag)
		{
			
			int[] temp=new int[arr.length];
			for(int cnt=0;cnt<num;cnt++)
			{
				temp=arr[0];
				for(int i=0;i<arr.length;i++)
				{
					arr[i]=arr[i+1];
					
				}
				arr[arr.length-1]=temp;
			}
			
				
		}
		else
		{
			for(int cnt=0;cnt<num;cnt++)
			{
				int[] temp=arr[arr.length-1];
				
				for(int i=arr.length-1;i>0;i--)
				{
					arr[i]=arr[i-1];
				}
				arr[0]=temp;
			}
			
		}
	}
	
	
	
	
	
	
	public void colRotate(boolean flag,int num)
	{
		int[] temp=new int [this.arr.length] ;
		if(flag)
		{
			for(int i=0;i<arr.length;i++)
			{
				temp[i]=arr[i][arr[0].length-1];
				
				
			}
			for(int i=0;i<arr.length;i++)
			{
				for(int j=arr[0].length;j>0;j--)
				{
					arr[i][j+1]=arr[i][j];
				}
			}
			
			for(int i=0;i<this.arr.length;i++)
			{
				arr[i][0]=temp[i];
			}
		}
		
		else
		{
			for(int i=0;i<arr.length;i++)
			{
				temp[i]=arr[i][0];
			}
			
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[0].length;j++)
				{
					arr[i][j-1]=arr[i][j];
				}
			}
			for(int i=0;i<arr.length;i++)
			{
				arr[i][arr[0].length-1]=temp[i];
			}
			
		}
	}
	
	
	
	
	
	
	
	public boolean isSymmetric() {
		if(arr.length==arr[0].length)
		{
			for(int i=0;i<arr.length;i++)
			{
				for (int j=0;j<arr[0].length;j++)
				{
					if(arr[i][j]!=arr[j][i])
					{
						return  false;
					}
					
						
					
				}
			}
			return true;
		}
		return false;
	}
	public int [][] transpose()
	{
		int [][]transpose=new int[arr[0].length][arr.length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				transpose[j][i]=arr[i][j];
			}
		}
		return transpose;
	}
	
	public boolean isIdentity()
	{
		if(arr.length==arr[0].length)
		{
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[0].length;j++)
				{
					if(i==j&& arr[i][j]!=1)
					{
						return false;
					}
					else if(i!=j && arr[i][j]!=0)
					{
						return false;
					}
					
				}
			}
			return true;
		}
		return false;
	}
	
	
	
	

}
