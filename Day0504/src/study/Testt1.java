package study;

import java.util.Random;
import java.util.Scanner;

public class Testt1 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int low,high,card;
		
		while(true) {
			int i=0;//������� ���� Ƚ��
			low=0;// �ּ� ����
			high=99;// �ִ� ����
			
			//0�� 99 ������ ����(����)���� ����(���谪)
			card = r.nextInt(100);
			System.out.println("������ ī�� ���� ���� ������");
			while(true) {
				System.out.println("�Է��Ͻ� �� �ִ� ���� ����"+low+"~~"+high+"�Դϴ�.");
				int n=0;
				n=sc.nextInt();//���� �Է¹���
				//�Է��� ���� ������ ��� ���� �������� ��� ����
				if(n>high||n<low) {
					System.out.println("������ �ʰ��Ͽ����ϴ�.");
				}else {
					if(n==card) {
						System.out.println("�����Դϴ�.");
						break;
					}else if(n>card) {//�Էµ� ���� ������ ī�尪���� ū ���
						System.out.println("�� ���� ���� �Է��Ͻÿ�.");
						high = n;
					}else {//�Էµ� ���� ������ ī�尪���� ���� ���
						System.out.println("�� ū ���� �Է��Ͻÿ�.");
						low = n;
					}
				}
				i++;
				
			}//���� end while
		    System.out.println("��� ������ �����Ͻðڽ��ϱ�?(y/n)");
		    if(sc.next().equals("n"))
		    	break;
			
			
			
			
		}
		
		
		
		
		
		
	}

}
