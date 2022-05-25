package com.methodex;

/*	메소드
 * 	  1. 메소드(멤버 함수) : 객체가 할 수 있는 동작들을 정의한 것
 *                     메소드의 종류는 두가지로 구분된다
 *                     1.인스턴스 메소드
 *                     2.static 메소드
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
		
		
		
		System.out.println("더하기 한 결과 :"+a);
		System.out.println("빼기 한 결과 :"+b);
		System.out.println("곱하기 한 결과 :"+c);
		System.out.println("나누기 한 결과 :"+d);
		
	}
	
	
	
}
