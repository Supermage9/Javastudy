package study;

/*Ŭ�������� ù ���ڴ� �빮�ڷ�.
 * �ڹ� ���α׷��� �����Ҷ� class, main()�� �⺻������ �Է�.
 * 
 * main()�޼ҵ� �ȿ� �ҽ��ڵ带 �ۼ��Ͽ� Ŭ���� �̸��� ������ ���ϸ����� ������
 * Ȯ���ڴ� ~ .java
 * 
 * 
 * 
 */

import java.util.Scanner;

public class Test001 {
//main():���� �޼ҵ�
	
	
	public static void main(String[] args) {
//�ڵ�����
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ ���� �Է� :");
		
		int c = Integer.parseInt(sc.next());
		System.out.println(c);
		
		System.out.println("���α׷� ���� �׽�Ʈ");
		System.out.print("���α׷� ���� �׽�Ʈ\n");
		System.out.print("���α׷� ���� �׽�Ʈ");
		System.out.print("���α׷� ����bbbbbbbbbbbbbbbbbbbb"
				+ "bbbbbbbbbbbbbbbbb �׽�Ʈ\n");
		
		int a=10, b=20, d=100;
		System.out.println(a+","+b);

		System.out.println(b);
		
		System.out.printf("%d,%d\n", a, b);
		
		System.out.println(d+"��");
	}
	

}
