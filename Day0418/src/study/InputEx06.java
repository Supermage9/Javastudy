package study;


import java.io.*;

public class InputEx06 {

	public static void main(String[] args) throws IOException{
		
		int num1,num2;
		
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		
		System.out.print("ù��° ���� :");
		num1 = Integer.parseInt(br.readLine());
		
		System.out.print("������ :");
		char ch = (char)System.in.read();
		System.in.read();
		System.in.read();
		
		System.out.print("�ι�° ���� :");
		num2 = Integer.parseInt(br.readLine());
		
		
		
		System.out.printf("%d %c %d = %d\n",num1,ch,num2,(num1+num2));
				
		


	}

}
