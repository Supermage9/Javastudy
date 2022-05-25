package study;


import java.io.*;

public class InputEx06 {

	public static void main(String[] args) throws IOException{
		
		int num1,num2;
		
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		
		System.out.print("첫번째 정수 :");
		num1 = Integer.parseInt(br.readLine());
		
		System.out.print("연산자 :");
		char ch = (char)System.in.read();
		System.in.read();
		System.in.read();
		
		System.out.print("두번째 정수 :");
		num2 = Integer.parseInt(br.readLine());
		
		
		
		System.out.printf("%d %c %d = %d\n",num1,ch,num2,(num1+num2));
				
		


	}

}
