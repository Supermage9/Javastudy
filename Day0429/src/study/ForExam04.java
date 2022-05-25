package study;

import java.util.Scanner;

/*Scanner
 * 		소문자 알파벳을 하나 입력 받고
 * 		다음과 같이 출력하는 프로그램을 작성
 * 		알파벳 입력 : e
 * 
 * 		abcde
 * 		abcd
 * 		abc
 * 		ab
 * 		a
 * 
 */

public class ForExam04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1;i<=5;i++) {
			for(int j = 1;j<=5;j++) {
				System.out.print(i*j);
			}
		System.out.println();
		}
		
		
		
		
	
	}

}
