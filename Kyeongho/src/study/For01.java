package study;

import java.util.Scanner;

public class For01 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String tmp;
		int num=0;
		System.out.print("출력할 라인의 수를 입력 :");
		tmp = sc.nextLine();
		num = Integer.parseInt(tmp);
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}
