package study;


//입력금액 : 65376

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
		
		
		System.out.print("금액을 입력하시오 :");
		money = sc.nextInt();

		res = money / oman ; // 개수 계산
		money = money % oman ; // 나머지금액으로 money 갱신
		if(res > 0) {
			System.out.println("오만원"+res+"개");
		}
		
		res = money / man ;
		money = money % man ;
		if(res > 0) {
			System.out.println("만원"+res+"개");
		}

		res = money / cheon ;
		money = money % cheon ;
		if(res > 0) {
			System.out.println("천원"+res+"개");
		}

		res = money / obak ;
		money = money % obak ;
		if(res > 0) {
			System.out.println("오백원"+res+"개");
		}

		res = money / bak ;
		money = money % bak ;
		if(res > 0) {
			System.out.println("백원"+res+"개");
		}

		res = money / osip ;
		money = money % osip ;
		if(res > 0) {
			System.out.println("오십원"+res+"개");
		}

		res = money / sip ;
		money = money % sip ;
		if(res > 0) {
			System.out.println("십원"+res+"개");
		}

		res = money / il ;
		money = money % il ;
		if(res > 0) {
			System.out.println("일원"+res+"개");
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
//		System.out.print("오만원권 :"+m_50000+"\n만원권 :"+m_10000+"\n천원권 :"+m_1000+"\n오백원 :"+m_500+"\n백원"
//				+m_100+"\n오십원 :"+m_50+"\n십원 :"+m_10+"\n일원 :"+m_1);

		
		sc.close();
		
		
	}

}
