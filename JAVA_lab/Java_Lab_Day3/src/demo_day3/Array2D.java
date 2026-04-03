package demo_day3;
import java.util.Scanner;

public class Array2D {
	
	    public static void acceptData(int[][] arr) {
	        Scanner sc = new Scanner(System.in);

	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr[i].length; j++) {
	                System.out.println("Enter data for r " + i + " and c " + j);
	                arr[i][j] = sc.nextInt();
	            }
	        }
	    }

	    public static void displayData(int[][] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr[i].length; j++) {
	                System.out.print(arr[i][j] + "\t");
	            }
	            System.out.println();
	        }
	    }
	    public static int findSum(int[][] arr)
			{
	    	int sum=0;
	    	for(int i=0;i<arr.length;i++)
	    		for(int j=0;j<arr[i].length;j++)
	    		{
	    			sum+=arr[i][j];
	    		}
				return sum;
			}
	    public static int[][] addMatrices(int[][] a, int[][] b) {
	        int[][] sum = new int[a.length][a[0].length];

	        for (int i = 0; i < a.length; i++) {
	            for (int j = 0; j < a[i].length; j++) {
	                sum[i][j] = a[i][j] + b[i][j];
	            }
	        }

	        return sum;
	    }
	    public static int[][] subMatrices(int[][] a, int[][] b) {
	        int[][] sub = new int[a.length][a[0].length];

	        for (int i = 0; i < a.length; i++) {
	            for (int j = 0; j < a[i].length; j++) {
	                sub[i][j] = a[i][j] - b[i][j];
	            }
	        }

	        return sub;
	    }


	    public static int[] findRowwiseMax(int[][] arr) {
	        int[] max = new int[arr.length];

	        for (int i = 0; i < arr.length; i++) {
	            max[i] = arr[i][0];

	            for (int j = 0; j < arr[i].length; j++) {
	                if (arr[i][j] > max[i]) {
	                    max[i] = arr[i][j];
	                }
	            }
	        }

	        return max;
	    }
	    public static int[] findRowwiseMin(int[][] arr) {
	        int[] min = new int[arr.length];

	        for (int i = 0; i < arr.length; i++) {
	            min[i] = arr[i][0];

	            for (int j = 0; j < arr[i].length; j++) {
	                if (arr[i][j] < min[i]) {
	                    min[i] = arr[i][j];
	                }
	            }
	        }

	        return min;
	    }
	    public static int[] findColwiseMax(int[][] arr) {
	        int[] max = new int[arr[0].length];

	        for (int i = 0; i < arr[0].length; i++) {
	            max[i] = arr[0][i];

	            for (int j = 0; j < arr.length; j++) {
	                if (arr[j][i] > max[i]) {
	                    max[i] = arr[j][i];
	                }
	            }
	        }

	        return max;
	    }

	    public static int[] findColwiseMin(int[][] arr) {
	        int[] min = new int[arr[0].length];

	        for (int i = 0; i < arr[0].length; i++) {
	            min[i] = arr[0][i];

	            for (int j = 0; j < arr.length; j++) {
	                if (arr[j][i] < min[i]) {
	                    min[i] = arr[j][i];
	                }
	            }
	        }

	        return min;
	    }

}