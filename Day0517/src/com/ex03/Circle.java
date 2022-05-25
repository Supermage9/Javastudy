package com.ex03;

public class Circle {
	
	int radius;// 원의 반지름
	String name;//원이 이름, 필드, 속성
	
	public Circle() { }
	
	
	
	
	
	public double getArea(){ //원의 면적을 구하는 메소드
		
		return radius*radius*Math.PI;
	}
	
	
}
