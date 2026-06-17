package com.demo;

import java.util.stream.IntStream;

public class TestArray2D {

	public static void main(String args[])
	{
		Array2D ob=new Array2D();
		ob.acceptData();
		ob.displayData();
		System.out.println("--------------ob.displayData();-----------------");
		System.out.println("-------------------------------------");
		
		int[] arr2=ob.findSumRowWise();
		IntStream.of(arr2).forEach(System.out::println);
		System.out.println("--------------findSumRowWise-----------------");
		System.out.println("-------------------------------------");
		
		int[] arr1=ob.findSumColWise();
		IntStream.of(arr1).forEach(System.out::println);
		System.out.println("----------------findSumColWise---------------");
		System.out.println("-------------------------------------");
		System.out.println(ob.isIdentity());
		System.out.println("--------------isIdentity-----------------");
		System.out.println("-------------------------------------");
		System.out.println(ob.isSymmetric());
		System.out.println("-----------------isSymmetric--------------");
		System.out.println("-------------------------------------");
		Array2D ob1=new Array2D();
		ob1.acceptData();
		ob1.displayData();
		System.out.println("-------------------------------");
		System.out.println("-------------------------------------");
		int[][] sum=ob.add2DArray(ob1);
		Array2D ob2=new Array2D(sum);
		ob2.displayData();
		System.out.println("--------------add2DArray-----------------");
		System.out.println("-------------------------------------");
		int[][] sub=ob.sub2DArray(ob1);
		Array2D ob3=new Array2D(sub);
		ob3.displayData();
		System.out.println("--------------sub2DArray-----------------");
		System.out.println("-------------------------------------");
		int[][] mul=ob.matrixMultiplication(ob1);
		Array2D ob4=new Array2D(mul);
		ob4.displayData();
		System.out.println("--------------matrixMultiplication-----------------");
		System.out.println("-------------------------------------");
		
		ob.transpose();
		ob.displayData();
		System.out.println("------------------transpose(-------------------");
		System.out.println("-------------------------------------");
	}
}
