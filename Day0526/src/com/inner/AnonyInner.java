package com.inner;

/*	 Anonymous(익명) dlsjzmffotm
 * 
 * 		- 익명이란?
 * 		   이름이 없는 것을 의미
 *         자바의 프로그램적인 해석인 경우 클래스의 이름이 없다.
 *         
 *         Event와 관련이 있음
 *         interface 구현이 필요없음
 *         일반 메소드 내부에서 정의부를 가질 수 있음.
 *         abstract 를 상속받을 수 있음.
 *         인터페이스를 상속받아 구현할때는 하나만 구현함.
 *         
 * 
 */


abstract class AbsExam { //추상클래스. 오버라이딩(재정의) 필요
	int data = 10000;
	public abstract void printData(); // 추상클래스이기 때문에 추상메소드 생성.
	
}


public class AnonyInner {
	
	AbsExam ae = new AbsExam() {

		@Override
		public void printData() { // 추상클래스 안의 메소드 재정의
			System.out.println(data);
		}
		
	};
	
	public static void main(String[] args) {
		
		AnonyInner ai = new AnonyInner();
		
		ai.ae.printData();

	}

}
