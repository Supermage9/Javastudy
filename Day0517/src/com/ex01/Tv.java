package com.ex01;

public class Tv {
	
	// Ŭ������ ���� ���(�ʵ�(�Ӽ�,��� ����) + �޼ҵ�)
	
	//�ʵ�
	String color;
	boolean power;
	int channel;
	
	//�޼ҵ�(���). ��ȣ�� ����
	public void power() {
		power = !power;//ó��
		//����� ������
		//return;
	}
	
	public void channelUp() {}
	
	public void channelDown() {}

}
