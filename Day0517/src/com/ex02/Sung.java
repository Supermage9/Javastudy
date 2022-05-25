package com.ex02;

/*
 * Sung Ŭ����
 *   - �ο����� �Է¹޾� �Է¹��� �ο� �� ��ŭ �̸�, ����, ����, ���������� �Է¹ް�
 *     ������ ���, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *     
 *     (Ŭ���� ����)
 *     
 *     �Ӽ� : �ο���, Record �迭
 *     ��� : 
 *          1.�ο��� �Է��ϴ� ���
 *          2. �� ������ �Է��ϴ� ���
 *          3. ���� ó���ϴ� ���
 *          4. ����� ����ϴ� ���
 *     
 */
import java.util.*;

public class Sung {
	
	// �ֿ� ������ ����(�Ӽ�)
	int inwon; //�ο���
	Record[] rec; //Record[]�迭
	
	// �޼ҵ�(���) ����
	// 1. �ο��� �Է�
	public void set() {
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("�ο��� �Է�(1~100):");
			inwon = sc.nextInt();
		}while(inwon<1||inwon>100);
			
		
		//Record Ŭ������ �迭 ������ inwon ��ŭ ����
		//Record Ŭ������ �ν��Ͻ��� ������ ���� �ƴ�.
		rec = new Record[inwon];	
		
		
	}
	
	//2. �� ������ �Է� �� ���� ó���ϴ� ���
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		String[] title = {"�������� :","�������� :","�������� :"};
		
		for(int i = 0; i<inwon;i++) {
			
			//�ν��Ͻ� ����(*****)
			rec[i] = new Record();
			
			System.out.print((i+1)+"��° �̸� �Է�:");
			rec[i].name=sc.next();//next()�� ���(�� �ܾ�. ������(/,-,����)�� ����), nextLine()�� ����(��ü ���� ����) 
			
			for(int j=0;j<title.length;j++) {
				//�ȳ��޼��� ���
				System.out.print(title[j]);
				
				//�Է¹��� ������ score �迭�� �����Ѵ�.
				rec[i].score[j] =sc.nextInt();
				
				//������ �ݺ������� �Է¹޾� �������� ������ ���Ѵ�.
				rec[i].tot += rec[i].score[j];
			
			}
			rec[i].avg = rec[i].tot/3.0;
			
		}
		
	}
	
	public void display() {
		ranking();
		System.out.println("==================  �л� ����ǥ  ====================");
		for(int i=0;i<inwon;i++) {
			//�̸� ���
			System.out.printf("%8s",rec[i].name);
			
			//����, ����, �������� �ݺ� ���
			for(int j=0;j<3;j++) {
				System.out.printf("%5d",rec[i].score[j]);
			}	//����, ��� ���
				System.out.printf("%7d, %10.2f%5d",rec[i].tot,rec[i].avg,rec[i].rank);
				System.out.println();
				
			
				System.out.println("==============================================");
		}
		
	}
	
	
	
	
	
	//���� ��� �޼ҵ� �߰�
	public void ranking() {
		
		int i,j;
		//��� �л��� ����� 1�� �ʱ�ȭ
		for(i=0;i<inwon;i++) {
			rec[i].rank=1;
		}
		
		//��� ��� (��)
		for(i=0;i<inwon-1;i++) {// 0 , 1
			for(j=i+1;j<inwon;j++) {// 1 , 2
				if(rec[i].avg > rec[j].avg)
					rec[j].rank++;
				else if(rec[i].avg > rec[j].avg)
					rec[i].rank++;
			}
			
		}
		
		
		
	}
	
	

}
