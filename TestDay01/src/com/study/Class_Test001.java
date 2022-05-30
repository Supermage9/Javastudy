package com.study;

/*	지역변수는 초기화 과정을 거치지 않으면 사용할 수 없다.
 * 	(자동초기화를 지원하지 않는다.)
 * 
 */

public class Class_Test001 {
	
	int b; //전역변수(인스턴스변수,멤버변수) 객체 생성 후 호출가능. 
	
	//사용하는 과정에서 개발자가 수동초기화하지 않을 경우 int형 기준 0으로 자동초기화.(boolean은 false, 배열은 null로 초기화)
	public static void main(String[] args) {
		int a=10;
		System.out.println("a:"+a);
		
		Class_Test001 c1 = new Class_Test001();
		System.out.println(c1.b);
	}

}
