package com.demo.model;

public class Triangle extends Shape {
	private int height;
	private int base;
	private int s1;
	private int s2;
	public Triangle() {
		super();
	}
	public Triangle(String color, int height, int base, int s1, int s2) {
		super(color);
		this.height = height;
		this.base = base;
		this.s1 = s1;
		this.s2 = s2;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getS1() {
		return s1;
	}
	public void setS1(int s1) {
		this.s1 = s1;
	}
	public int getS2() {
		return s2;
	}
	public void setS2(int s2) {
		this.s2 = s2;
	}
	
	public String toString() {
		return super.toString()+"Triangle [height=" + height + ", base=" + base + ", s1=" + s1 + ", s2=" + s2 + "]";
	}

	public float calculateArea() {
		
		return 0.5f*height*base;
	}

	public float calculatePerimeter() {
		
		return s1+s2+base;
	}
	

}
