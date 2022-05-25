package com.ex01;

public class TvTest extends Tv{
	
	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		super.channelUp();
	}

	public static void main(String[] args) {
		
		Tv t; // Tv 인스턴스를 참조하기 위한 변수 t를 선언
		t= new Tv(); // 인스턴스를 생성(인스턴스 = 객체)
		t.channel = 24; //Tv객체의 멤버변수 채널 값을 24로 지정했다.
		t.channelDown();//23번이 됨.
		System.out.println("현재 채널은"+t.channel+"입니다.");

	}

}
