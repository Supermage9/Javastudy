package com.methodex;

public class MethodEx02_1 {
	
	public static void X() {
		for(int a=0;a<5;a++) {
			System.out.print("*");
		}
		return;//����� return ���� void�� ��� return ���� ���� ����
	}

	public static void main(String[] args) {
		
		//�޼ҵ� ȣ��
		X();
		System.out.println("\nHello");
		
		X();
		System.out.println("\nJava");
		
		X();
		System.out.println("\n!!!!");
		
		
	}

}
