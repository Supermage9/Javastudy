package study;

/*		float, double : �Ǽ���(�Ǽ����� �⺻���� double)
 * 
 * 
 */

import java.lang.*;

public class FloatEx {

	public static void main(String[] args) {
		
//		1. �������� �� �ʱ�ȭ		
		int r=5;//������
		double area=0,area1 = 0;//���� ����, �ѷ�

//		2. ���� �� ó��
		area = r*r*(Math.PI);//���� ����
		
		area1 = 2*r*(Math.PI);//���� �ѷ�
		
		
//		3. ��¹�
		System.out.println("���� ���̴�"+area+"�Դϴ�.");
		System.out.printf("���� ���̴�%.3f�Դϴ�.%n", area);
		
		System.out.println("���� �ѷ���"+area1+"�Դϴ�.");
		System.out.printf("���� �ѷ���%.3f�Դϴ�.",area);
		
		
		
		
		
		

	}

}
