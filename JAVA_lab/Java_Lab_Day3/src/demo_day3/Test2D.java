package demo_day3;

public class Test2D {
	 public static void main(String[] args) {

	        int[][] a = new int[2][2];
	        int[][] b = new int[2][2];

	        System.out.println("Enter element Mat A:");
	        Array2D.acceptData(a);

	        System.out.println("Enter elements Mat B:");
	        Array2D.acceptData(b);

//	        System.out.println("Mat A:");
//	        Array2D.displayData(a);
//
//	        System.out.println("Mat B:");
//	        Array2D.displayData(b);

	        int[][] sum = Array2D.addMatrices(a, b);

	        System.out.println("Sum of Matrices:");
	        Array2D.displayData(sum);

	        int[] rowMin = Array2D.findRowwiseMin(a);
	        System.out.println("Rowwise Min of A:");
	        for (int i = 0; i < rowMin.length; i++) {
	            System.out.print(rowMin[i] + " ");
	        }

	        System.out.println();

	        int[] colMin = Array2D.findColwiseMin(a);
	        System.out.println("ColMin of A:");
	        for (int i = 0; i < colMin.length; i++) {
	            System.out.print(colMin[i] + " ");
	        }
	    }
	




}
