package study;

/*
 * ������ ������ �Է¹޾� �Է¹��� ���� ¦������ �����Ͻÿ�.
 */  

import java.util.*;
public class IfExam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
//		char op;
		String s;
		
		System.out.print("ù ��° ���� �Է� :");
		a = sc.nextInt();
		
		System.out.print("������ �Է� :");
//		op = sc.next().charAt(0);// ���ڿ����� ù��° ���ڸ� ������
		
		s = sc.next();
		
		System.out.print("�� ��° ���� �Է� :");
		b = sc.nextInt();
		
		//����if��
		//String�϶��� "", %s ���, .equals()��밡��
		if(s.equals("+")) {
			System.out.printf("%d %s %d = %d\n",a,s,b,(a+b));
		}else if(s.equals("+")) {
			System.out.printf("%d %s %d = %d\n",a,s,b,(a-b));
		}else if(s.equals("+")) {
			System.out.printf("%d %s %d = %d\n",a,s,b,(a*b));
		}else if(s.equals("+")) {
			System.out.printf("%d %s %d = %d\n",a,s,b,(a/b));
		}else if(s.equals("+")) {
			System.out.printf("%d %s %d = %d\n",a,s,b,(a%b));
		}else {
			System.out.println("�����ڰ� �ƴմϴ�.");
		}
		
		sc.close();
		
	}

}
