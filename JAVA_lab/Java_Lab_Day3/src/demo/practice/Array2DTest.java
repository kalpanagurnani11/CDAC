package demo.practice;

public class Array2DTest {
public static void main(String[] args)

{
	int[][] a=new int[3][3];
	int[][] b=new int[3][3];
	
	Array2D.acceptData(a);
	Array2D.displayData(a);

	int s=Array2D.findSum(a);
	System.out.println("sum"+s);
	int max=Array2D.findMax(a);
	System.out.println("max"+max);
	int min=Array2D.findMin(a);
	System.out.println("m"+min);
	
	
	int[] Rowmax=Array2D.findRowMax(a);
	for(int i=0;i<Rowmax.length;i++)
	{
		System.out.println("max of"+i+"------"+Rowmax[i]);
	}
	
	int[] Rowmin=Array2D.findRowMin(a);
	for(int i=0;i<Rowmin.length;i++)
	{
		System.out.println("min of"+i+"------"+Rowmin[i]);
	}
	int[] ColMin=Array2D.findColMin(a);
	for(int i=0;i<ColMin.length;i++)
	{
		System.out.println("min of"+i+"------"+ColMin[i]);
	}
	
	int[] ColMax=Array2D.findColMax(a);
	for(int i=0;i<ColMax.length;i++)
	{
		System.out.println("max of"+i+"------"+ColMax[i]);
	}
	
	
	
//	Array2D.acceptData(b);
//	Array2D.displayData(b);
//	int[][] sum=Array2D.findAddof2(a,b);
//	System.out.println("sum of 2"+sum);
//	int[][] sub=Array2D.findsubof2(a,b);
//	System.out.println("sub of 2"+sub);
	
			
}
}
