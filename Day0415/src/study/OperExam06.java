package study;


//��] ���� 35�� ¦������ Ȧ������ �����ϴ� ���α׷� ����
//     ��, ���� �����ڸ� Ȱ��

public class OperExam06 {

	public static void main(String[] args) {
		
		
		//���׿�����
		int a = 20, b = 30, max;
		
		max = a>b ? ++a : ++b;
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("max : "+max);
		
		
		int i = 35;
		String j;
		
		
		j = i % 2 == 0 ? "¦��" : "Ȧ��";
		
		System.out.println("���� 35�� "+j+"�Դϴ�.");
		
		
		
		

	}

}