package com.ex03;

public class CircleEx {

	public static void main(String[] args) {
		Circle pizza;//���۷��� ��������
		pizza = new Circle();//�ν��Ͻ� ����
		
		pizza.radius=10;
		pizza.name="�ڹ�����";
		
		
		double area = pizza.getArea();
		System.out.println(pizza.name+"�� ������ "+area);
		
		
		Circle donut = new Circle();
		donut.radius = 2;//������ �������� 2�� ����
		donut.name = "�ڹٵ���";
		area = donut.getArea();
		System.out.println(donut.name+"�� ������ "+area);
		
		
		
		
		
	}

}