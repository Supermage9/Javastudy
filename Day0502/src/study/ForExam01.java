package study;

/* 문)
 * 1 ~ 100 까지의 정수중에서 2,3,5,7의 배수를 제외한 수를 한행에
 * 10개씩 출력하는 프로그램 작성, for문 작성 후 조건삼항으로 변환
 * 
 */

public class ForExam01 {

	public static void main(String[] args) {
		
		int cnt=1;
		
		for(int i=1;i<=100;i++) {
			 
			if(i%2!=0&&i%3!=0&&i%5!=0&&i%7!=0) {
				System.out.printf("%3d%s",i,(cnt++%10!=0)?" ":"\n");
				
			}
			
		}
		
	}

}
