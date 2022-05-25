package com.star;

public abstract class Unit { //추상 클래스 : 공통적 기능만 모아서 만듬.
	
	int x,y;
	
	abstract void move(int x,int y);
	abstract void stop();
	abstract void message();
	
	
	
	
	

}
