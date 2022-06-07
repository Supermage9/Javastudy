package study;

import java.util.Scanner;
public class Test06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시급 :");
		int money = sc.nextInt();
		System.out.println("일한 시간 :");
		int time = sc.nextInt();
		
		System.out.println(money*time);
		
	}

}
