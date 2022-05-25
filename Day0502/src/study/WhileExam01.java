package study;
/*
 * 문)
 * 사용자가 입력하는 정수를 계속해서 더해 나간다.
 * 만약 0이 입력되면 지금까지 입력된 정수의 합계를 출력하고 종료하는 프로그램 구현
 * 단,while문 이용
 */

import java.util.Scanner;

public class WhileExam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i=0,sum=0;
		
		
		while(true) {
			System.out.print("정수 입력 :");
			i = sc.nextInt();
			sum+=i;
			if(i==0) {
				System.out.print("합계 :"+sum);
				break;
			}
		}
		
		
		
		
		

	}

}
