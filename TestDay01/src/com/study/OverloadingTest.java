package com.study;

class Boiler{
	String maker; // 제조사
	int temp; //현재 온도
	
	void tempUp() { //온도상승
		temp++;
	}
	void tempUp(int amount) { //오버로딩.
		temp+=amount;
	}
	
	//온도를 20도 상승시키고 현재 온도를 출력
}




public class OverloadingTest {
	
	public int area(int w,int h) {
		return w*h;
	}
	public double area(int r) {
		return r * r * 3.141592;
	}
	
	public void write(int result) {
		System.out.println("사각형의 넓이 :"+result);
	}
	public void write(double result) {
		System.out.println("원의 넓이 :"+result);
	}
	
	

	public static void main(String[] args) {
		Boiler bb = new Boiler();
		System.out.println("현재 온도는 "+bb.temp+"입니다");
		bb.tempUp();
		System.out.println("현재 온도는 "+bb.temp+"입니다");
		bb.tempUp(20);
		System.out.println("현재 온도는 "+bb.temp+"입니다");
		
		OverloadingTest ot = new OverloadingTest();
		int res = ot.area(10, 5);
		double cc = ot.area(10);
		
		ot.write(res);
		ot.write(cc);
		
		
	}

}
