package study;


import java.io.*;

public class Test02 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int kor, mat, soc, sci, eng, sum, avg=0;
		char hak;
		
		System.out.print("국어점수 : ");
		kor = Integer.parseInt(br.readLine());
		
		System.out.print("수학점수 : ");
		mat = Integer.parseInt(br.readLine());
		
		System.out.print("사회점수 : ");
		soc = Integer.parseInt(br.readLine());
		
		System.out.print("과학점수 : ");
		sci = Integer.parseInt(br.readLine());
	
		System.out.print("영어점수 : ");
		eng = Integer.parseInt(br.readLine());
		
		sum = kor + mat + soc + sci + eng;
		avg = sum / 5 ;
		System.out.println(sum);
		
		switch (avg/10) {
		case 10:
		case 9:
			hak = 'A';
			break;
		case 8:
			hak = 'B';
			break;
		case 7:
			hak = 'C';
			break;
		case 6:
			hak = 'D';
			break;
			default :
				hak = 'F';
		}
		System.out.println("당신의 평균은 "+avg+",\n"+"학점은 "+hak+"입니다.");
		
	}

}
