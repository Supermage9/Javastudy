package study;

/*		정수 두개를 입력받아 두 수 사이의 수들의 합계를 구하는 프로그램을 작성하시오
 * 
 */

import java.util.*;
public class ForExam02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1,num2,sum=0,i;
		System.out.print("첫번째 정수 입력 :");
		num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 :");
		num2 = sc.nextInt();
		if(num1>num2) {
			num1 = num1 ^ num2;
			num2 = num2 ^ num1;
			num1 = num1 ^ num2;
		}
		
		for (i=num1;i<=num2;i++) {
		
		sum = sum + i;
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
	}

}
