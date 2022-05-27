package com.inner;

/*	Member Inner Class
 * 	  -��ü�� �����ؾ߸� ����� �� �ִ� ������ ���� ��ġ�� ���ǵǴ� Ŭ����
 *     �̳�Ŭ������ ��ü�� �����Ϸ��� �ܺ� Ŭ������ ��ü�� ������ �� ������ �� �ִ�.
 *     
 *     �̳�Ŭ���� ���ο��� static�� ������ �� ����.
 */

public class MemberInner {
	
	int a = 10;
	private int b = 20;
	static int c = 30;
	
	class Inner {
		// ����Ŭ�������� static ��������� ����Ҽ� ����. ����Ϸ��� ����Ŭ������ static���� �ٲ����.
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