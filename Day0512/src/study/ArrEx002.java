package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrEx002 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int kor=0,eng=0,mat=0,sum=0;
		float avg = 0.0f;
		
		
		do {
			System.out.print("국어점수 :");
			kor = Integer.parseInt(br.readLine());
		}while(kor<0||kor>100);
		
		do {
			System.out.print("영어점수 :");
			eng = Integer.parseInt(br.readLine());
		}while(eng<0||eng>100);
		
		do {
			System.out.print("수학점수 :");
			mat = Integer.parseInt(br.readLine());
		}while(mat<0||mat>100);
		
		sum = kor + eng + mat;
		avg = sum/3.f;
		
		System.out.println();
		System.out.println("총점:"+sum);
		System.out.println("평균:"+avg);
	}

}
