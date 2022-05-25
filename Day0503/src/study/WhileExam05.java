package study;


/*
 * -50에서 1까지의 수를 출력하는 프로그램
 * 단, 한줄에 5개씩만 출력하고, 이 수들 사이를 탭 간격으로 띄우시오
 * 
 * while문사용
 */


public class WhileExam05 {

	public static void main(String[] args) {
		
		int i=-51,cnt=0;
		
		while(i<1) {
			
			i++;
			System.out.printf("%d\t",i);
			cnt++;
			if(cnt%5==0) {
				System.out.println();
			}
				
			
			
			
			
		
		}
		
		
		
		
		
		

	}

}
