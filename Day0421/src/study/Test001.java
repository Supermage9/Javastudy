package study;

import java.io.*;


public class Test001 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
	
		int i;
		
		
		System.out.print("정수 입력:");
		i = Integer.parseInt(br.readLine());
				
				
				
		if (i==0) {
			System.out.print("0입니다.");
		}else if (i%2==0) {
			System.out.print("짝수입니다.");
		}else if (i%2==1) {
			System.out.print("홀수입니다.");
		}else {
			System.out.println("판정 불가.");
		}
		
		
		
	}

}
