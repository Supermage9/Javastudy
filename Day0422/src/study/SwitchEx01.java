package study;

import java.io.*;

public class SwitchEx01 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1, num2, tot=0;
		char op;
		System.out.print("ù��° ���� :");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("������ �Է� :");
		op = (char)System.in.read();
			System.in.read();
			System.in.read();
		System.out.print("�ι�° ���� :");	
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
			System.out.print("�߸��� �����ڸ� �Է��ϼ̽��ϴ�.");
			break;
		}
		
		
		
		
	}

}
