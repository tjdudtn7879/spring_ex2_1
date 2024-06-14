package com.lgy.spring_test;

public class Circle {
	int radius;

	public void CircleArea() {
		double fi=3.14;
		System.out.println("원의 면적은"+radius*radius*fi);
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
}
