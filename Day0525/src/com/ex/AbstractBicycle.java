package com.ex;

public abstract class AbstractBicycle {
	
	//멤버변수
	int id;
	String brand;
	
	//추상메소드 선언(반드시 하나는 선언되어야함)
	abstract void prtInfo();
	
	//일반 메소드
	public String getBrand() {
		return brand;
	}

}
