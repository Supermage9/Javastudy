package com.exception1;

public class Except03 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		try {
		System.out.println(3);
		System.out.println(0/0);
		System.out.println(4);
		}catch(ArithmeticException ae) {
			
			if(ae instanceof ArithmeticException) { 
				System.out.println("true");
			}else
			System.out.println("ArithmeticException");
			
			
		}catch(Exception e) {
			System.out.println("Exception");
		}finally {
		System.out.println(5);
		}
		System.out.println(6);

	}

}
