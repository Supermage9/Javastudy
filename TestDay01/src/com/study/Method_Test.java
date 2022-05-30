package com.study;

public class Method_Test {
	
	public void showHi() {
		System.out.println("Hi ~ 여러분");
	}
	
	
	

	public static void main(String[] args) {
		
		Method_Test mt = new Method_Test();
		mt.showHi();
		
//		new Method_Test().showHi(); //같은의미

	}

}
