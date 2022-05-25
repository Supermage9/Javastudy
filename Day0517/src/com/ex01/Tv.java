package com.ex01;

public class Tv {
	
	// 클래스의 구성 요소(필드(속성,멤버 변수) + 메소드)
	
	//필드
	String color;
	boolean power;
	int channel;
	
	//메소드(기능). 괄호가 붙음
	public void power() {
		power = !power;//처리
		//결과를 리턴함
		//return;
	}
	
	public void channelUp() {}
	
	public void channelDown() {}

}
