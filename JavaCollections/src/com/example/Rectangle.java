package com.example;

public class Rectangle {

	private double length;
	private double breadth;
	
	public Rectangle() {
		super();
	}

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreath(double breadth) {
		this.breadth = breadth;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}
	
	public void displayRectangle(double length, double breadth) {
		if(length > 0 && length <=20.0 && breadth > 0 && breadth <= 20.0) {
		System.out.println("Length of the rectangle is : "+length);
		System.out.println("Length of the rectangle is : "+breadth);
		System.out.println("Area of rectangle : "+(length * breadth));
		System.out.println("Perimeter of rectangle : "+(2 *(length + breadth)));
		}
	}
}
