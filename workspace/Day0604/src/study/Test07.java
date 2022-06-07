package study;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("유로, 달러 순 입력 :");
		int euro = sc.nextInt();
		int dollor = sc.nextInt();
		
		double eurate = 1320.48026;
		double dolrate= 1063.82979;
		
		int won = (int)(euro*eurate + dollor*dolrate);
		
//		System.out.printf("%d유로 + %d달러 = %d원",euro,dollor,((euro*1320)+(dollor*1063)));
		System.out.printf("%d유로 + %d달러 = %d원",euro,dollor,won);
	}

}
