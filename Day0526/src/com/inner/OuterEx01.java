package com.inner;

public class OuterEx01 {
	

	
	public static class InnerEx01{

		static int x = 10;
		
		public static void main(String[] args) {  // 실행메소드를 이너클래스 안에 둠
			
			OuterEx01.InnerEx01 oi = new OuterEx01.InnerEx01();
			
			System.out.println("oi :"+oi.x);
			System.out.println("oi :"+OuterEx01.InnerEx01.x);
			

		}
	
	}
	
	

}
