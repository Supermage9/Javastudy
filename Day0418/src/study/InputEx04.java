package study;

/*
 * ���ڿ� �Է¹ޱ� 
 * BufferedReader
 * InputStreamReader
 * readLine
 * ��¹�
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
public class InputEx04 {

	public static void main(String[] args) throws IOException {
		
		String name, nai, addr, tel;
		
//		InputStreamReader is = new InputStreamReader(System.in);
//		BufferedReader bb = new BufferedReader(is);
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print("�̸� : ");
		name = br.readLine();
		
		System.out.print("���� : ");
		nai = br.readLine();
		
		System.out.print("�ּ� : ");
		addr = br.readLine();
		
		System.out.print("��ȭ��ȣ : ");
		tel = br.readLine();
		
		
		System.out.printf("�̸� : %s\n���� : %s\n�ּ� : %s\n��ȭ��ȣ : %s\n",name,nai,addr,tel);
		
		
		
	}

}
