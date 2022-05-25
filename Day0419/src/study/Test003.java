package study;


import java.util.*;

public class Test003 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i;//사용자로부터 입력받는 정수
		String s;// 짝수인지 홀수인지 판별하는 변수
		
		//안내메세지 및 입력받은 정수 저장
		System.out.print("정수 입력 :");
		i = sc.nextInt();
		
//		s = i%2==0? "짝수":"홀수" ; // 삼항연산자
		if(i%2==0) {
			s="짝수";
		}else {
			s="홀수";
		}
		
		
		System.out.println(s);
		
		sc.close();
	}

}
