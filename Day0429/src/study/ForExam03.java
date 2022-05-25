package study;

public class ForExam03 {

	public static void main(String[] args) {
		
		int i,j;
		
//		for(i=1;i<5;i++) {
//			for(j=4;j>0;j--) {
//				if(i<j) {
//					System.out.print(" ");
//				}else {
//				System.out.print("*");
//				}
//				}
//			System.out.println("");
//		}
//		
//		
		for( i=0;i<4;i++){
			for( j=0;j<3-i;j++){
				System.out.print(" "); 
			}
			for( j=0;j<2*i+1;j++){
				System.out.print("*"); 
			}
			System.out.println("");
		} 
		
		
	}

}
