package com.inner;

/*	static �̳�Ŭ����
 * 
 * 		 - static �̳�Ŭ������ ��¿ �� ���� �����ϴ� ��찡 �ִµ�,
 *         ��¿ �� ���� �����ϴ� ���� �̳�Ŭ���� ���� static������ ������ �������
 *         ��¿ �� ���� �ش� �̳�Ŭ������ static���� �����ؾ� ��.
 *         
 *         �̳�Ŭ������ ������� static �� �����ؾ߸� ��.
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
 * 			Outer.Inner in = new Outer.Inner();  // new Outer.new Inner(); �̰͵� ������
 * 
 * 
 */

public class StaticInner {
	
	int a = 10; // ��������, �������
	private int b = 100;
	static int c = 200; //�ܺ�Ŭ���� ���
	
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
