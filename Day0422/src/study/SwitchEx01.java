package study;

import java.io.*;

public class SwitchEx01 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1, num2, tot=0;
		char op;
		System.out.print("첫번째 정수 :");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("연산자 입력 :");
		op = (char)System.in.read();
			System.in.read();
			System.in.read();
		System.out.print("두번째 정수 :");	
		num2 =Integer.parseInt(br.readLine());
		
		
		
		
		switch (op) {
		case '+':
			tot = num1 + num2;
			System.out.println(num1 +" "+op+" "+ num2 + " = " + tot);
			break;
		case '-' :
			tot = num1 - num2;
			System.out.println(num1 +" "+op+" "+ num2 + " = " + tot);
			break;
		case '*' :
			tot = num1 * num2;
			System.out.println(num1 +" "+op+" "+ num2 + " = " + tot);
			break;
		case '/' :
			tot = num1 / num2;
			System.out.println(num1 +" "+op+" "+ num2 + " = " + tot);
			break;
		case '%' :
			tot = num1 % num2;
			System.out.println(num1 +" "+op+" "+ num2 + " = " + tot);
			break;
		

		default:
			System.out.print("잘못된 연산자를 입력하셨습니다.");
			break;
		}
		
		
		
		
	}

}
