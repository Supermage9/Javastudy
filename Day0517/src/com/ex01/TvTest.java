package com.ex01;

public class TvTest extends Tv{
	
	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		super.channelUp();
	}

	public static void main(String[] args) {
		
		Tv t; // Tv �ν��Ͻ��� �����ϱ� ���� ���� t�� ����
		t= new Tv(); // �ν��Ͻ��� ����(�ν��Ͻ� = ��ü)
		t.channel = 24; //Tv��ü�� ������� ä�� ���� 24�� �����ߴ�.
		t.channelDown();//23���� ��.
		System.out.println("���� ä����"+t.channel+"�Դϴ�.");

	}

}
