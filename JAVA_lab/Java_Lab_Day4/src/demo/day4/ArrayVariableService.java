package demo.day4;

import java.util.Scanner;

public class ArrayVariableService {
	int[][] arr=new int[3][];
	public static void acceptData(int[][] arr)
	
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter no.od cols");
			
				int col=sc.nextInt();
				arr[i]=new int[col];
				for(int j=0;j<arr[i].length;j++)
				{
					System.out.println("enter numr "+i+" : "+j);
					arr[i][j]=sc.nextInt();
				}
					
				}
		
	}
	public static void displayData(int[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

	public static int[] findRowWiseMin(int[][] arr) {
		int [] min=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			min[i]=arr[i][0];
			for(int j=1;j<arr[i].length;j++)
			{
				if (arr[i][j]<min[i])
				{
					min[i]=arr[i][j];
				}
			}
			
		}
		return min;
			
	}
	}
