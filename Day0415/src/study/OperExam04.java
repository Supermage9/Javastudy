package study;


// �������� : &&, ||, !

public class OperExam04 {

	public static void main(String[] args) {
		
		boolean a = false;
		boolean b = false;
		
		
		// or��������||�� true�̹Ƿ� ��°���, and�������� &&�� false�̹Ƿ� ��ºҰ�
		if((a = 4>3)&&(b = 5>7)) {
			System.out.println("a = "+a);
			System.out.println("b = "+b);
		}
		
		
	}

}
