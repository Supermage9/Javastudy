package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrEx03 {

	public static void main(String[] ar) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�л� �� �Է� :");
		int human = Integer.parseInt(br.readLine()); //����� ���ϱ�
		
		
		String[]name = new String[human];
		String[]subject = {"����","����","����"};//����� �ʱ�ȭ
		//������ ���� ó�� �迭����
		int[][]jumsu = new int[human][subject.length];
		float[]avg = new float[human];
		char[]grade = new char[human];
		int[]rank = new int[human];
		
		
		/*
		for(int i=0;i<subject.length;i++) {
			System.out.println(subject[i]);
		}
		*/
		
		for(int i=0;i<human;i++) {//��� ����ŭ �ݺ�
			System.out.print((i+1)+"��° �л� �̸�:");
			name[i]=br.readLine();
			System.out.print(name[i]+"�л� ���� �Է�:");
			
			for(int j=0;j<subject.length;j++) {
				System.out.print(subject[j]+"����:");
				jumsu[i][j]=Integer.parseInt(br.readLine());
			}
			
			
		}
		
		
		
		

	}

}
