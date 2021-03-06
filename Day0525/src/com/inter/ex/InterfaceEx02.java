package com.inter.ex;

public class InterfaceEx02 implements Inter3 {
	
	int a = 100;

	@Override
	public int getA() {
		return a;
	}

	@Override
	public int getData() {
		return a+10;
	}

	public static void main(String[] args) {
		InterfaceEx02 it = new InterfaceEx02();
		Inter1 it1 = it;
		Inter2 it2 = it;
		Inter3 it3 = it;
		
		System.out.println(it1.getA());
		System.out.println(it2.getA());
		System.out.println(it3.getData());
		
		System.out.println(it instanceof Object);
		System.out.println(it instanceof InterfaceEx02);
		System.out.println(it instanceof Inter1);
		System.out.println(it instanceof Inter2);
		System.out.println(it instanceof Inter3);
	}

}
