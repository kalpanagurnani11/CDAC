package com.demo.test;


import com.demo.model.Rectangle;
import com.demo.model.Circle;
import com.demo.model.Shape;

public class ShapeTest {
public static void main(String args[])

{
	Shape s=null;
	s=new Circle("red",2);
	System.out.println(s);
	System.out.println(s.calculateArea());
	System.out.println(s.calculatePerimeter());
	s=new Rectangle("red",2,4);
	System.out.println(s instanceof Circle);
	System.out.println(s instanceof Rectangle);
	System.out.println(s instanceof Shape);
	System.out.println(s instanceof Circle);
	
}
}
