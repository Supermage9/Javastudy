package com.hw.two;

public class RFMouse extends Mouse implements IRF {

	@Override
	public void wconnect() { //�������̽��� �޼ҵ� ������
		System.out.println("���콺 ���� �����");
	}

	@Override
	public void wdisconnect() {// �������̽��� �޼ҵ� ������
		System.out.println("���콺 ���� ���� ����");
	}

	
	@Override
	void move() {
		System.out.println("���콺 ������");
	}

	@Override
	void scroll() {
		System.out.println("���콺 ����");
	}
	
	
	public static void main(String[] args) {
		
		RFMouse rfm = new RFMouse();
		System.out.println("�������"+IRF.RF_Type_BT);
		rfm.wconnect();
		rfm.move();
		rfm.scroll();
		rfm.wdisconnect();
		

	}


}
