package com.constex;

public class Circle { // Ŭ����
	
	int radius;//�Ӽ�, �������, �ʵ�
	String name;
	
	public Circle() { // ctrl+space �⺻������ ����Ʈ����.
	// ������ �޼ҵ� : �������� �̸��� Ŭ���� �̸��� ����
		
		radius = 1;
		name = "";
	
	}
	public Circle(int r,String n) { // �Ű������� Ȱ���Ͽ� �ʵ带 �ʱ�ȭ.
		//�Ű������� ���� ������
		//�����ڿ� ���� Ÿ���� ����.
		
		radius = r;
		name = n;
		
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	
	
	
	
	
	
	
	
}
