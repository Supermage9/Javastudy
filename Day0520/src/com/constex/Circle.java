package com.constex;

public class Circle { // 클래스
	
	int radius;//속성, 멤버변수, 필드
	String name;
	
	public Circle() { // ctrl+space 기본생성자 컨스트럭터.
	// 생성자 메소드 : 생성자의 이름은 클래스 이름과 같다
		
		radius = 1;
		name = "";
	
	}
	public Circle(int r,String n) { // 매개변수를 활용하여 필드를 초기화.
		//매개변수를 가진 생성자
		//생성자에 리턴 타입은 없음.
		
		radius = r;
		name = n;
		
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	
	
	
	
	
	
	
	
}
