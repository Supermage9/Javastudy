package study;

import java.io.*;

public class Test01 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		char ch, s;
	
		
		
		System.out.print("알파벳 문자입력 :");
		ch = (char)System.in.read();
		
		if (ch >= 'a' &&ch <= 'z') {
			s = (char)(ch - 32);
			System.out.println(s);	
		}else if (ch >= 'A' &&ch <= 'Z') {
			s = (char)(ch + 32);
			System.out.println(s);
		}else {
			System.out.println("입력오류");
		}

		
		
		
	}

}
