package study;

/*클래스명의 첫 글자는 대문자로.
 * 자바 프로그램을 시작할때 class, main()을 기본적으로 입력.
 * 
 * main()메소드 안에 소스코드를 작성하여 클래스 이름과 동일한 파일명으로 저장함
 * 확장자는 ~ .java
 * 
 * 
 * 
 */

import java.util.Scanner;

public class Test001 {
//main():메인 메소드
	
	
	public static void main(String[] args) {
//코딩영역
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("임의의 정수 입력 :");
		
		int c = Integer.parseInt(sc.next());
		System.out.println(c);
		
		System.out.println("프로그램 실행 테스트");
		System.out.print("프로그램 실행 테스트\n");
		System.out.print("프로그램 실행 테스트");
		System.out.print("프로그램 실행bbbbbbbbbbbbbbbbbbbb"
				+ "bbbbbbbbbbbbbbbbb 테스트\n");
		
		int a=10, b=20, d=100;
		System.out.println(a+","+b);

		System.out.println(b);
		
		System.out.printf("%d,%d\n", a, b);
		
		System.out.println(d+"원");
	}
	

}
