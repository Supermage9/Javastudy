package study;


//�Է±ݾ� : 65376

import java.util.*;

public class Test004 {
	final static int oman = 50000;
	final static int man = 10000;
	final static int cheon = 1000;
	final static int obak = 500;
	final static int bak = 100;
	final static int osip = 50;
	final static int sip = 10;
	final static int il = 1;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int money, res;
		
		
		System.out.print("�ݾ��� �Է��Ͻÿ� :");
		money = sc.nextInt();

		res = money / oman ; // ���� ���
		money = money % oman ; // �������ݾ����� money ����
		if(res > 0) {
			System.out.println("������"+res+"��");
		}
		
		res = money / man ;
		money = money % man ;
		if(res > 0) {
			System.out.println("����"+res+"��");
		}

		res = money / cheon ;
		money = money % cheon ;
		if(res > 0) {
			System.out.println("õ��"+res+"��");
		}

		res = money / obak ;
		money = money % obak ;
		if(res > 0) {
			System.out.println("�����"+res+"��");
		}

		res = money / bak ;
		money = money % bak ;
		if(res > 0) {
			System.out.println("���"+res+"��");
		}

		res = money / osip ;
		money = money % osip ;
		if(res > 0) {
			System.out.println("���ʿ�"+res+"��");
		}

		res = money / sip ;
		money = money % sip ;
		if(res > 0) {
			System.out.println("�ʿ�"+res+"��");
		}

		res = money / il ;
		money = money % il ;
		if(res > 0) {
			System.out.println("�Ͽ�"+res+"��");
		}

//		m_50000 = money / 50000;
//		m_10000 = (money%50000) / 10000;
//		m_1000 = (money % 10000) / 1000;
//		m_500 = (money % 1000) / 500;
//		m_100 = (money % 500) / 100;
//		m_50 = (money % 100) / 50;
//		m_10 = (money % 50) / 10;
//		m_1 = (money % 10) / 1;
//		
//		System.out.print("�������� :"+m_50000+"\n������ :"+m_10000+"\nõ���� :"+m_1000+"\n����� :"+m_500+"\n���"
//				+m_100+"\n���ʿ� :"+m_50+"\n�ʿ� :"+m_10+"\n�Ͽ� :"+m_1);

		
		sc.close();
		
		
	}

}
