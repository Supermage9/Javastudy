package study;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����, �޷� �� �Է� :");
		int euro = sc.nextInt();
		int dollor = sc.nextInt();
		
		double eurate = 1320.48026;
		double dolrate= 1063.82979;
		
		int won = (int)(euro*eurate + dollor*dolrate);
		
//		System.out.printf("%d���� + %d�޷� = %d��",euro,dollor,((euro*1320)+(dollor*1063)));
		System.out.printf("%d���� + %d�޷� = %d��",euro,dollor,won);
	}

}
