package study;

import java.util.Scanner;

public class Testt3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str="";
		int n=1;
		
		while(n!=0) {
			System.out.print("1.�ݶ� 2.���̴� 3.����ƾ�� 4.���ڼ��� 5.���̽� 6.���Ͻ� 0.����");
			n= sc.nextInt();
			switch(n) {
			case 1:
				str="�ݶ�";
				break;
			case 2:
				str="���̴�";
				break;
			case 3:
				str="����ƾ��";
				break;
			case 4:
				str="���ڼ���";
				break;
			case 5:
				str="���̽�";
				break;
			case 6:
				str="���Ͻ�";
				break;
			default:
				str="�����Ͻ� ��ǰ�� �����ϴ�";
			}
			System.out.println(str);
		}
		
		
		
		
		
		
		
		
		
	}

}
