package com.hw;
//�߻�Ŭ������ ��ӹ޾� �����ϴ� ����ü(����Ŭ����)
public class Piano extends Instrument{

	public static void main(String[] args) {
		
		Piano p = new Piano(); // Piano Ŭ������ �ν��Ͻ� ����
		p.play(); //�ν��Ͻ� �޼ҵ� ȣ��
		p.volumeup();
		p.volumedown();
		
		
	}

	@Override //�������̵� �� �޼ҵ�
	void play() { //�ν��Ͻ� �޼ҵ�
		System.out.println("Piano : Play() ȣ���");
	}

	@Override
	void volumeup() {
		System.out.println("Piano : volumeUp() ȣ���");
	}

	@Override
	void volumedown() {
		System.out.println("Piano : volumeDown() ȣ���");
	}

}
