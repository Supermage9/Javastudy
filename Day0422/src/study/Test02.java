package study;

/*
 * ������ ���ĺ��� �Է¹޾� ������ ������ �����ϴ� ���α׷� ����
 * �����̸� �������� ���, �����̸� �������� ���
 * ��, ��ҹ��� ��� �����ϰ�, ���ĺ��̿��� ���ڰ� �ԷµǸ� �Է� ���� ó���Ͻÿ�.
 */
import java.io.*;
public class Test02 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char ch;//���ڸ� ������ ����
		String s="";//����� ������ ����
		System.out.print("���ĺ� �� ���� �Է� :");
		ch = (char)System.in.read();
//			System.in.read();
//			System.in.read();
//		
//			
//		if((ch >='a' && ch <= 'z') || (ch >='A' && ch <= 'Z')) {// ���ĺ����� �ƴ��� ����
//			if(ch == 'a' || ch == 'i' || ch == 'u' || ch == 'o' || ch == 'e' )
//				System.out.println("����");
//			
//			else if (ch == 'A' || ch == 'I' || ch == 'U' || ch == 'O' || ch == 'E' ) {
//				System.out.println("����");
//			}
//			
//			else {
//				System.out.println("����");
//			}
//
//			System.out.println("���ĺ� ����");
//			
//		}
//		else {
//			System.out.println("�Է� ����");
//		}
		
		s = ((ch >='a' && ch <= 'z') || (ch >='A' && ch <= 'Z')) ?
				(((ch == 'a' || ch == 'i' || ch == 'u' || ch == 'o' || ch == 'e') || 
				(ch == 'A' || ch == 'I' || ch == 'U' || ch == 'O' || ch == 'E') ) ? "����" : "����" ) :"�Է¿���";
		
		
		System.out.println(s);
	}

}
