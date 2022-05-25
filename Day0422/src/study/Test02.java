package study;

/*
 * 임의의 알파벳을 입력받아 자음과 모음을 판정하는 프로그램 구현
 * 자음이면 자음으로 출력, 모음이면 모음으로 출력
 * 단, 대소문자 모두 적용하고, 알파벳이외의 문자가 입력되면 입력 오류 처리하시오.
 */
import java.io.*;
public class Test02 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char ch;//문자를 지정할 변수
		String s="";//결과를 지정할 변수
		System.out.print("알파벳 한 문자 입력 :");
		ch = (char)System.in.read();
//			System.in.read();
//			System.in.read();
//		
//			
//		if((ch >='a' && ch <= 'z') || (ch >='A' && ch <= 'Z')) {// 알파벳인지 아닌지 판정
//			if(ch == 'a' || ch == 'i' || ch == 'u' || ch == 'o' || ch == 'e' )
//				System.out.println("모음");
//			
//			else if (ch == 'A' || ch == 'I' || ch == 'U' || ch == 'O' || ch == 'E' ) {
//				System.out.println("모음");
//			}
//			
//			else {
//				System.out.println("자음");
//			}
//
//			System.out.println("알파벳 맞음");
//			
//		}
//		else {
//			System.out.println("입력 오류");
//		}
		
		s = ((ch >='a' && ch <= 'z') || (ch >='A' && ch <= 'Z')) ?
				(((ch == 'a' || ch == 'i' || ch == 'u' || ch == 'o' || ch == 'e') || 
				(ch == 'A' || ch == 'I' || ch == 'U' || ch == 'O' || ch == 'E') ) ? "모음" : "자음" ) :"입력오류";
		
		
		System.out.println(s);
	}

}
