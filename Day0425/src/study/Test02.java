package study;


import java.io.*;

public class Test02 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int kor, mat, soc, sci, eng, sum, avg=0;
		char hak;
		
		System.out.print("�������� : ");
		kor = Integer.parseInt(br.readLine());
		
		System.out.print("�������� : ");
		mat = Integer.parseInt(br.readLine());
		
		System.out.print("��ȸ���� : ");
		soc = Integer.parseInt(br.readLine());
		
		System.out.print("�������� : ");
		sci = Integer.parseInt(br.readLine());
	
		System.out.print("�������� : ");
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
		System.out.println("����� ����� "+avg+",\n"+"������ "+hak+"�Դϴ�.");
		
	}

}
