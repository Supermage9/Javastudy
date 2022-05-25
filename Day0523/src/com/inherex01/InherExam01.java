package com.inherex01;

/*	상속시 주의사항
 * 
 *   - 상위 클래스에서 선언된 멤버변수와 하위 클래스에서 선언한 멤버 변수가 같으면
 *     상위 클래스의 멤버 변수가 무시됨.
 *     이 때, 상위 클래스의 멤버변수를 사용하기 위해서는 super라는 키워드를 사용함
 *     
 *   - 동일한 이름의 멤버변수나 동일한 이름의 메소드가 한 클래스 안에 정의되는 경우는 에러발생. 
 * 
 */

//부모 클래스
class SuperTest{
	
	protected double area;
	private String title;
	
	public SuperTest() {
		
		System.out.println("SuperTest()...인자가 없는 생성자...");
		
	}
	
	public SuperTest(String title) {
		
		this.title = title;
	}
	
	public void write() {
		System.out.println(title+""+area);
	}
	
	
	
}

//자식 클래스
class Rect extends SuperTest{
	
	
	private int w,h;
	
	public Rect() {
		super();
	}
	
	
	//연산메소드
	public void calc(int w, int h) {
		this.w = w;
		this.h = h;
		area = (double)this.w * this.h;
		
		write();
	}
	
	
	@Override
	public void write() {
		
		System.out.println("w :"+w+",h :"+h);
		System.out.println("사각형의 넓이는 "+area);
		
		
	}
	
	/*	 메소드 오버라이딩
	 * 
	 * 	 상위 클래스를 상속받은 하위 클래스에서
	 *   상위 클래스에 정의된 메소드를 재정의하는 것을 의미함.
	 *   객체지향 프로그램의 특징인 다형성을 나타냄.
	 * 	 
	 *   재정의 
	 *     반드시 상속관계에 있어야 하며
	 *     메소드 이름, 리턴타입, 매개변수의 개수나 타입이 완전히 일치해야함.
	 */
	
	
}

class Circle extends SuperTest{
	
	public Circle(String title) {
		super(title);
	}
	
	public void calc(int r) {
		area = r*r*3.141592;
		write();
	}
	
}







public class InherExam01 {

	
	public static void main(String[] args) {
		Rect r = new Rect();
		Circle c = new Circle("원의 넓이 :");
		
		
		

	}

}


class A_class{
	
	public A_class(int n) {
		// TODO Auto-generated constructor stub
	}
}


class B_class extends A_class{
	public B_class() {
		super(10);
		
	}
}

/*
 * ============================================================================
 *  상위 클래스 			ㅣ	하위 클래스				ㅣ			결과
 * ============================================================================
 *  생성자를 정의하지 않음	ㅣ	생성자 정의 안함			ㅣ			가능
 *  					ㅣ	인자가 없는 생성자			ㅣ			가능
 *  					ㅣ	인수가 있는 생성자			ㅣ			가능
 * ============================================================================
 *  인수가 없는 생성자 정의	ㅣ	생성자 정의 안함			ㅣ			가능
 *  					ㅣ	인수가 없는 생성자			ㅣ			가능
 *  					ㅣ	인수가 있는 생성자			ㅣ			가능
 * ============================================================================
 *  인수가 있는 생성자 정의	ㅣ 	생성자 정의 안함			ㅣ		   에러발생
 *  					ㅣ	인수가 없는 생성자			ㅣ  상위 클래스의 해당 생성자를 
 *  					ㅣ							ㅣ	호출하지 않으면 에러 발생
 *						ㅣ							ㅣ -----------------------
 * 						ㅣ	인수가 있는 생성자			ㅣ	상위클래스의 해당 생성자를
 * 						ㅣ							ㅣ	호출하지 않으면 에러발생
 *  					
 */




















