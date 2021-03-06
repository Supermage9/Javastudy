package com.inherex;

class Super{ // 부모클래스
	
	int a = 5; //부모클래스의 멤버변수
	public Super(int x) {
		System.out.println("부모클래스 생성자 :"+x);
	}
}

class Sub extends Super{
	
	int a = 10;
	
	public Sub() {
		super(5);
		System.out.println("자식클래스의 생성자");
	}
	
	public void test() {
		System.out.println(this.a); //자식클래스(현재클래스)의 변수 사용
		System.out.println(super.a); //부모클래스의 변수 사용
	}
}


public class SuperEx {
	public static void main(String[] args) {
		Sub a = new Sub();
		
		a.test();
		
	}

}
