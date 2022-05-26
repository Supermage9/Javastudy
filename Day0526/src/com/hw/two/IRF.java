package com.hw.two;

public interface IRF {
	
	String RF_Type_IR = "적외선"; // 인터페이스 안에 정의된 상수
	String RF_Type_BT = "블루투스";
	
	//메소드
	void wconnect();
	void wdisconnect();
	

}
