package com.study;

class Boiler{
	String maker; // ������
	int temp; //���� �µ�
	
	void tempUp() { //�µ����
		temp++;
	}
	void tempUp(int amount) { //�����ε�.
		temp+=amount;
	}
	
	//�µ��� 20�� ��½�Ű�� ���� �µ��� ���
}




public class OverloadingTest {
	
	public int area(int w,int h) {
		return w*h;
	}
	public double area(int r) {
		return r * r * 3.141592;
	}
	
	public void write(int result) {
		System.out.println("�簢���� ���� :"+result);
	}
	public void write(double result) {
		System.out.println("���� ���� :"+result);
	}
	
	

	public static void main(String[] args) {
		Boiler bb = new Boiler();
		System.out.println("���� �µ��� "+bb.temp+"�Դϴ�");
		bb.tempUp();
		System.out.println("���� �µ��� "+bb.temp+"�Դϴ�");
		bb.tempUp(20);
		System.out.println("���� �µ��� "+bb.temp+"�Դϴ�");
		
		OverloadingTest ot = new OverloadingTest();
		int res = ot.area(10, 5);
		double cc = ot.area(10);
		
		ot.write(res);
		ot.write(cc);
		
		
	}

}
