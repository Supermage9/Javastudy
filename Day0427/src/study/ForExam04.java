package study;

import java.util.Scanner;

/*
 * 양의 실수만 입력받아 입력받은 합의 평균을 구하는
      프로그램 구현. 단, 음의 정수가 입력되면 계속하시오.
 */


public class ForExam04 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		float a=0.0f,sum=0.0f,avg=0.0f, i=0.0f;
		
		for (a=1;;a++) {
		System.out.print("양의 실수를 입력하세요 :");
		i = sc.nextFloat();
		if(i>0)
		sum = sum + i;
		if(i<0) { 
			break;}
		
		}
		avg=sum/a; 
		System.out.printf("지금까지의 평균 : %.2f",avg);
		
		
		
	}

}
