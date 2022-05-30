package com.study;

import java.util.*;

class Rect{//사각형 클래스
	
	//속성(멤버변수), 기능(멤버 메소드)
	//변수선언(가로/세로)
	//전역변수(클래스변수,인스턴스변수)
	int w,h;
	
	//메소드 선언,정의 - 구현체(기능)가 없는 것은 선언, 기능을 넣으면 정의. 오버라이딩은 재정의.
	//void 반환형 - 반환 값이 없음을 의미.(돌려줄 값이 없음)
	//반환 - 메소드 실행후 결과값을 호출한곳으로 돌려주는것.
	
	void input() {
		//인스턴스(객체,참조변수) 생성
		Scanner sc = new Scanner(System.in);//system.in - 콘솔과 키보드를 연결하는 Stream을 생성 in은 inputstream의 약자
		System.out.print("가로입력:");
		w = sc.nextInt();
		System.out.print("세로입력:");
		h = sc.nextInt();
	}
	
	/* 넓이 계산
	 * 
	 *  메소드 실행 후 결과 있는 경우(리턴형 지정)
	 *  리턴 자료형은 int형을 사용함.
	 */
	public int area() {
		
		int result = w * h;
		return result;
		/*
		 *   메소드는 리턴문을 통해서만 결과값을 반환한다.
		 */
		
	}
	
	//둘레 계산
	int length() {
		
		int result = 2 * (w+h);
		return result;
	}
	
	//출력 메소드
	void print(int a, int b) {
		
		/*
		 * 	매개변수를 통해 데이터를 넘겨 받음(갖고있지 않는 데이터)
		 *   
		 *   매개변수 ?  a = area();
		 *   인자값 ? b = length();
		 *   
		 */
		
		System.out.println("가로 :"+w);
		System.out.println("세로 :"+h);
		System.out.println("넓이 :"+a);
		System.out.println("둘레 :"+b);
		
		
	}
	
	
}



//실행클래스
public class Method_TestEx {
	
	public static void main(String[] args) {
		
		Rect r1 = new Rect(); // 객체 생성
		r1.input();//메소드 호출
		int a = r1.area(); //넓이 계산 결과를 리턴받음.
		int b = r1.length();// 둘레 계산 결과 리턴받음.
		
		r1.print(a,b);
		
		
	}

}
