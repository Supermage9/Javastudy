package study;

public class WhileExam02 {

	public static void main(String[] args) {
		
		int i=2,j=1;
		
		while(i<=9) {
			while(j<=9) {
			System.out.printf("%d x %d = %d ",i,j,(i*j));
			j++;
			}
			j=1;
		
		
			System.out.println();
			i++;
		}
		
		
	}

}
