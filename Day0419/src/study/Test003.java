package study;


import java.util.*;

public class Test003 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i;//����ڷκ��� �Է¹޴� ����
		String s;// ¦������ Ȧ������ �Ǻ��ϴ� ����
		
		//�ȳ��޼��� �� �Է¹��� ���� ����
		System.out.print("���� �Է� :");
		i = sc.nextInt();
		
//		s = i%2==0? "¦��":"Ȧ��" ; // ���׿�����
		if(i%2==0) {
			s="¦��";
		}else {
			s="Ȧ��";
		}
		
		
		System.out.println(s);
		
		sc.close();
	}

}
