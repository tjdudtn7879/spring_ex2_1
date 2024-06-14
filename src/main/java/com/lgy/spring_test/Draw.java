package com.lgy.spring_test;

public class Draw {
	public static void main(String[] args) {
//		Draw 클래스가 Circle 클래스에 의존
//		Circle 클래스로 객체 생성해서 값을 주입
//		의존+주입(Dependency Injection): DI
		Circle circle=new Circle();
		Rectangle rectangle=new Rectangle();
		
		circle.setRadius(10);
		rectangle.setWidth(20);
		rectangle.setHeight(30);
		
		circle.CircleArea();
		rectangle.RectangleArea();
	}
}
