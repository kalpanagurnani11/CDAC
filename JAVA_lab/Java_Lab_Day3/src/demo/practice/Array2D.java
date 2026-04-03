package demo.practice;
import java.util.Scanner;

public class Array2D {
public static void acceptData(int[][]arr)
{
	Scanner sc=new Scanner(System.in);
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			System.out.println("enter elements"+i+j);
			arr[i][j]=sc.nextInt();
			
			
		}
	}
	
}
public static void displayData(int[][]arr)
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

public static int findMin(int[][] a) {
	int min=a[0][0];
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			if (a[i][j]<min)
			{
			min=a[i][j];
			}
		}
	}
	return min;
}
public static int findMax(int[][] a) {
	int max=a[0][0];
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			if (a[i][j]>max)
			{
			max=a[i][j];
			}
		}
	}
	return max;
}
public static int findSum(int[][] a) {
	
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			sum+=a[i][j];
		}
	}
	return sum;
}
public static int[][] findAddof2(int[][] a, int[][] b) {
	int[][] add=new int[a.length][a[0].length];
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			add[i][j]=a[i][j]+b[i][j];
		}
	}
	
	return add;
}
public static int[][] findsubof2(int[][] a, int[][] b) {
	int[][] sub=new int[a.length][a[0].length];
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			sub[i][j]=a[i][j]-b[i][j];
		}
	}
	
	return sub;
	
}
public static int[] findRowSum(int[][] a) {
	int[] sum=new int[a.length];
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			sum[i]+=a[i][j];
		}
	}
	return sum;
}
public static int[] findRowMax(int[][] a) {
	int[] max=new int[a.length];
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			if(max[i]<a[i][j])
			{
				max[i]=a[i][j];
			}
		}
	}
	return max;
}
public static int[] findRowMin(int[][] a) {
	int[] min=new int[a.length];
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			if(min[i]>a[i][j])
			{
				min[i]=a[i][j];
			}
		}
	}
	return min;
}
public static int[] findColMin(int[][] a) {
	int[] min=new int [a[0].length];
	for(int i=0;i<a.length;i++)
	{
		min[i]=a[0][i];
		
		for(int j=0;j<a[i].length;j++)
		{
			if(min[i]>a[i][j])
			{
				min[i]=a[i][j];
			}
		}
	}
	
	return min;
}
public static int[] findColMax(int[][] a) {
	int[] max=new int [a[0].length];
	for(int i=0;i<a.length;i++)
	{
		max[i]=a[0][i];
		
		for(int j=0;j<a[i].length;j++)
		{
			if(max[i]<a[i][j])
			{
				max[i]=a[i][j];
			}
		}
	}
	
	return max;
}
}
