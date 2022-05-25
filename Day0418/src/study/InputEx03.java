package study;

/*
 * 숫자 하나 입력
 * - System.in.read() - 48 or '0'
 */

import java.io.IOException;
public class InputEx03 {

	public static void main(String[] args) throws IOException{
		
		int num1;
		int num2;
		System.out.print("숫자 1:");
		num1 = System.in.read() - 48;
		System.in.read();// \r = 엔터키
		System.in.read();// \n = 줄바꿈. 규칙이기때문에 넣어주어야 함.
		
		System.out.print("숫자 2:");
		num2 = System.in.read() - 48;
		System.out.println(num1+","+num2);
	}

}
