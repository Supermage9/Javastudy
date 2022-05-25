package study;
/*
 * 문자 하나 입력받기
 */

import java.io.IOException;
public class InputEx02 {

	public static void main(String[] args) throws IOException{
		
		System.out.print("문자 하나 입력 :");
		char ch = (char)System.in.read();
		System.out.println("입력받은 문자 :"+ch);


	}

}
