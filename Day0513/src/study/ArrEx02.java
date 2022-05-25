package study;

import java.io.*;

/*	문)
 *    배열을 이용하여 한명의 학생에 대한 성적처리 프로그램을 작성
 *    입력
 *    과목 수, 과목명, 이름
 *    
 *    출력
 *    이름,과목명,총점,평균,학점
 */

public class ArrEx02 {

	public static void main(String[] ar) throws IOException{
		
		/*
		for(int i=0;i<ar.length;i++)
		System.out.println(ar[i]);
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
//		if(ar.length==0) {
//			System.out.println("과목 수가 없습니다.");
//			System.exit(0);
//		}//ar.length : 과목 수
		
		
		//이름 입력 받음
		System.out.print("이름 입력 :");
		String name = br.readLine();
		String[]subject = {"국어","영어","수학"};
		
//		for(int i=0;i<ar.length;i++) {
//			subject[i]=ar[i];
//			System.out.print(subject[i]+" ");
//		}
		
		int jumsu[]=new int[subject.length+1];//총점 공간 추가
		
		for(int i=0;i<subject.length;i++) {
			System.out.print(subject[i]+"점수:");
			jumsu[i]=Integer.parseInt(br.readLine());//점수 입력받기
			//누적합
			jumsu[jumsu.length-1] += jumsu[i];
			//System.out.print("총점:"+jumsu[jumsu.length-1]);
			
		}
		
		float avg = jumsu[jumsu.length-1]/(float)(subject.length);
		
		
		avg = (int)((avg+0.005)*100)/100.f;
		
		char grade = 0;
		
		switch((int)(avg/10)){
			case 10: 
			case 9: grade='A';break;
			case 8: grade='B';break;
			case 7: grade='C';break;
			case 6: grade='D';break;
			default: grade='F';break;
				
		}
		
		System.out.println("-------------------------------");
		System.out.println("--------- "+name+"님의 성적표 ---------");
		System.out.println("-------------------------------");
		
		
		
		

	}

}
