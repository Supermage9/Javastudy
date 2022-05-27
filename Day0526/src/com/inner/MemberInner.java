package com.inner;

/*	Member Inner Class
 * 	  -객체를 생성해야만 사용할 수 있는 멤버들과 같은 위치에 정의되는 클래스
 *     이너클래스의 객체를 생성하려면 외부 클래스의 객체를 생성한 후 생성할 수 있다.
 *     
 *     이너클래스 내부에는 static이 존재할 수 없음.
 */

public class MemberInner {
	
	int a = 10;
	private int b = 20;
	static int c = 30;
	
	class Inner {
		// 내부클래스에는 static 멤버변수를 사용할수 없음. 사용하려면 내부클래스를 static으로 바꿔야함.
//		static int d = 30;
		
		
		
		public void prt() {
			System.out.println("a:"+a);
			System.out.println("b:"+b);
			System.out.println("c:"+c);
			
		}
	}
	
	public static void main(String[] args) {
		
//		MemberInner mi = new MemberInner();
//		MemberInner.Inner mii = mi.new Inner();
		
		MemberInner.Inner mii = new MemberInner().new Inner();
		mii.prt();
		
		
	}

}
