package study;

public class ForExam01 {

	public static void main(String[] args) {
		
		//변수 선언
		int i,j;//i는 단수,j는 내부에서 1~9까지 반복처리
		
		for(i=2;i<=9;i++) {
			for(j=1;j<=9;j++) {
				System.out.printf("%d x %d = %d",i,j,(i*j));
				System.out.println();
			}
			System.out.println();
		}
		
		
		
	}

}
