package com.demo.model;

public abstract class Shape {
	private String color;
	abstract public float calculateArea();
	abstract public float calculatePerimeter();

	public Shape() {
		super();
	}

	public Shape(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	public String toString() {
		return "Shape [color=" + color + "]";
	}
	

}
