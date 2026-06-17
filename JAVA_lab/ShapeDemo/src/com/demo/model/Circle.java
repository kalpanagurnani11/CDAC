package com.demo.model;

public class Circle extends Shape{
	private int radius;

	public Circle() {
		super();
	}

	public Circle(String color,int radius) {
		super(color);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	public String toString() {
		return super.toString()+"Circle [radius=" + radius + "]";
	}

	
	public float calculateArea() {
		
		return 3.14f*radius*radius;
	}


	public float calculatePerimeter() {
		
		return 2*3.14f*radius;
	}

}
