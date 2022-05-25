package study;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		

		
//		System.out.print("숫자를 입력하세요.(예: 12345) :");
//		Scanner sc = new Scanner(System.in);
//		String tmp = sc.nextLine();
//		num = Integer.parseInt(tmp);
//		
//		while(num != 0) {
//			sum = sum + num%10;
//			System.out.printf("sum=%3d num=%d%n",sum,num);
//			
//			num = num / 10;
//			
//		}
		
		
		int sum = 0;
		int i = 0;
		
		while((sum= sum+ ++i)<=100) {
			System.out.printf("%d - %d%n",i,sum);
		}
		

	}

}
