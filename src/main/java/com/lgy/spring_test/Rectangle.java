package com.lgy.spring_test;

public class Rectangle {
	int width;
	int height;
	
	public void RectangleArea(){
		System.out.println("사각형의 면적은"+width*height);
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
