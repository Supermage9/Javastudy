package study;

/*
 * 임의의 정수를 입력받아 입력받은 수가 짝수인지 판정하시오.
 */  

import java.util.*;
public class IfExam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
//		char op;
		String s;
		
		System.out.print("첫 번째 정수 입력 :");
		a = sc.nextInt();
		
		System.out.print("연산자 입력 :");
//		op = sc.next().charAt(0);// 문자열에서 첫번째 문자만 가져옴
		
		s = sc.next();
		
		System.out.print("두 번째 정수 입력 :");
		b = sc.nextInt();
		
		//다중if문
		//String일때는 "", %s 사용, .equals()사용가능
		if(s.equals("+")) {
			System.out.printf("%d %s %d = %d\n",a,s,b,(a+b));
		}else if(s.equals("+")) {
			System.out.printf("%d %s %d = %d\n",a,s,b,(a-b));
		}else if(s.equals("+")) {
			System.out.printf("%d %s %d = %d\n",a,s,b,(a*b));
		}else if(s.equals("+")) {
			System.out.printf("%d %s %d = %d\n",a,s,b,(a/b));
		}else if(s.equals("+")) {
			System.out.printf("%d %s %d = %d\n",a,s,b,(a%b));
		}else {
			System.out.println("연산자가 아닙니다.");
		}
		
		sc.close();
		
	}

}
