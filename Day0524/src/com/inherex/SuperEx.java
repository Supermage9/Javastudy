package com.inherex;

class Super{ // �θ�Ŭ����
	
	int a = 5; //�θ�Ŭ������ �������
	public Super(int x) {
		System.out.println("�θ�Ŭ���� ������ :"+x);
	}
}

class Sub extends Super{
	
	int a = 10;
	
	public Sub() {
		super(5);
		System.out.println("�ڽ�Ŭ������ ������");
	}
	
	public void test() {
		System.out.println(this.a); //�ڽ�Ŭ����(����Ŭ����)�� ���� ���
		System.out.println(super.a); //�θ�Ŭ������ ���� ���
	}
}


public class SuperEx {
	public static void main(String[] args) {
		Sub a = new Sub();
		
		a.test();
		
	}

}