package demo.day4;

public class TestArrayVariable {
	public static void main(String args[])
	{
		int[][] arr=new int[3][];
		ArrayVariableService.acceptData(arr);
		ArrayVariableService.displayData(arr);
		int[] rowwiseMin=ArrayVariableService.findRowWiseMin(arr);
		for(int i=0;i<rowwiseMin.length;i++)
		{
			System.out.println("row wise min"+i+"----->"+rowwiseMin[i]);	
		}
	}

}
