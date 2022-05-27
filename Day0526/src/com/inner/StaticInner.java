package com.inner;

/*	static 이너클래스
 * 
 * 		 - static 이너클래스로 어쩔 수 없이 정의하는 경우가 있는데,
 *         어쩔 수 없이 정의하는 경우란 이너클래스 내에 static변수를 가지고 있을경우
 *         어쩔 수 없이 해당 이너클래스는 static으로 선언해야 함.
 *         
 *         이너클래스의 지정어로 static 을 기재해야만 함.
 *         
 *         
 *         ex)
 *         
 *         class Outer{
 *         
 *         		int aa;
 *         
 *         		static class Inner{
 *         
 * 					static int bb;
 * 
 * 				}
 * 
 * 			}
 * 
 * 			Outer.Inner in = new Outer.Inner();  // new Outer.new Inner(); 이것도 가능함
 * 
 * 
 */

public class StaticInner {
	
	int a = 10; // 전역변수, 멤버변수
	private int b = 100;
	static int c = 200; //외부클래스 멤버
	
	static class Inner {
		static int d = 1000;
		
		public void printData() {
//			System.out.println("int a = "+a);
//			System.out.println("private int b = "+b);
			System.out.println("static int c = "+c);
			System.out.println("static int d = "+d);
		}
	}
	
	

	public static void main(String[] args) {
		
		StaticInner.Inner in = new StaticInner.Inner();
		
		in.printData();
		
	}

}
