package com.star;

public class SiegeTank extends Unit{

	@Override
	void move(int x, int y) {
		System.out.println("Move it! Move it! SiegeTank ==> x:"+x+",y:"+y);
	}

	@Override
	void stop() {
		
	}

	@Override
	void message() {
		System.out.println("Message :: Go, Siege!!!");
	}
	
	void changemode() {
		System.out.println("Yes,Sir!!!");
	}
	
	

}
