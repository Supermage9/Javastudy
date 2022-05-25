package com.constex;

/*	this : 객체 자신을 가리키는 레퍼런스(참조)
 * 
 *		   this는 컴파일러에 의해 자동으로 관리되므로 개발자는 this를 사용하기만 하면 됨
 *		   
 */

class CircleEx001{
	
	public CircleEx001() {
		this(10); // 괄호가 들어가면 변수가 아니라 메소드.
		//생성자에서 다른 생성자를 호출할때 this 사용. 이 때 반드시 첫번째 줄에 작성하여야 함.
		//일반 인스턴스 메소드는 안됨.
	}
	
	int radius;
	public CircleEx001(int r) {
		this.radius = r;
	}
//	public int getRadius() {
		
//	}
}


public class ThisEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
