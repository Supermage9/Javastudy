package com.inner;

public class InnerEx {

	public static void main(String[] args) {
		
		//내부클래스의 멤버변수에 접근하려면 먼저 외부 클래스의 객체를 생성
		OuterEx oe = new OuterEx();
		//외부 클래스를 통해야만 내부클래스의 객체를 생성할 수 있음.
		OuterEx.InnerEx oi = oe.new InnerEx();
		
		System.out.println("oi.x :"+oi.x);
		
		
	}

}
