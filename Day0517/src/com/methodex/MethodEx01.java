package com.methodex;

/*	�޼ҵ�
 * 	  1. �޼ҵ�(��� �Լ�) : ��ü�� �� �� �ִ� ���۵��� ������ ��
 *                     �޼ҵ��� ������ �ΰ����� ���еȴ�
 *                     1.�ν��Ͻ� �޼ҵ�
 *                     2.static �޼ҵ�
 */

public class MethodEx01 {
	
	public int add(int i,int j){
		return i + j;
	}
	public int sub(int i,int j){
		return i - j;
	}
	public int mul(int i,int j){
		return i * j;
	}
	public int div(int i,int j){
		return i / j;
	}
	
	public static void main(String[] args) {
		
		MethodEx01 me = new MethodEx01();
		
		int e = 10;
		int f = 10;
		
		int a, b, c, d;
		a=me.add(e, f);
		b=me.sub(e, f);
		c=me.mul(e, f);
		d=me.div(e, f);
		
		
		
		System.out.println("���ϱ� �� ��� :"+a);
		System.out.println("���� �� ��� :"+b);
		System.out.println("���ϱ� �� ��� :"+c);
		System.out.println("������ �� ��� :"+d);
		
	}
	
	
	
}
