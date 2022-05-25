package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrEx03 {

	public static void main(String[] ar) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("학생 수 입력 :");
		int human = Integer.parseInt(br.readLine()); //사람수 구하기
		
		
		String[]name = new String[human];
		String[]subject = {"국어","영어","수학"};//과목명 초기화
		//점수와 총점 처리 배열선언
		int[][]jumsu = new int[human][subject.length];
		float[]avg = new float[human];
		char[]grade = new char[human];
		int[]rank = new int[human];
		
		
		/*
		for(int i=0;i<subject.length;i++) {
			System.out.println(subject[i]);
		}
		*/
		
		for(int i=0;i<human;i++) {//사람 수만큼 반복
			System.out.print((i+1)+"번째 학생 이름:");
			name[i]=br.readLine();
			System.out.print(name[i]+"학생 점수 입력:");
			
			for(int j=0;j<subject.length;j++) {
				System.out.print(subject[j]+"점수:");
				jumsu[i][j]=Integer.parseInt(br.readLine());
			}
			
			
		}
		
		
		
		

	}

}
