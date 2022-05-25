package study;

public class ForExam01 {

	public static void main(String[] args) {
		
		//1부터 10까지 반복 처리하는 변수
		int i=1;
		
		int even=0, odd = 0;
		// 반복 처리하면서 누적합계를 저장하는 변수
		int sum = 0;//누적합계는 초기화를 해주는 것이 원칙
//		/*
//		for (i=1;i<=10;i++) {
//		sum = sum + i;
//		System.out.println(i+","+sum);
//		}
//		*/
//
////		while (i <= 10) {//while문은 초기값을 밖에서 지정해줌
////					
////		sum = sum + i;
////		System.out.println(i+","+sum);
////		i++;
////		}
//				
//		do{
//		sum = sum + i;
//		System.out.println(i+","+sum);
//		i++;
//		}
//		while (i<=10);{
//		}
//				
		for(i=1;i<=10;i++) {
			if(i%2==0) {
				even= even+i;
				
			}else {
				odd= odd+i;
			}
		sum = sum + i;
		}
		
		
		System.out.print("짝수의 합계 :"+even+"\n홀수의 합계 :"+odd+"\n전체 합계 :"+sum);
		
		
	 }


}
