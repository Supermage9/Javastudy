package study;



import java.util.*;

public class Test006 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		
		
		System.out.print("���ڸ� �Է��ϼ���. >");
		
		String tmp= sc.nextLine(); // ȭ���� ���� �Է¹��� ������ tmp�� ����
		
		input = Integer.parseInt(tmp); // �Է¹��� ���ڿ��� ���ڷ� ������ȯ
		
		if(input == 0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
		}
		
		if(input!=0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.");
			System.out.printf("�Է��Ͻ� ���ڴ� %d�Դϴ�.",input);
			
		}
		
		
		
		
		
	
		
		
		
	}

}
