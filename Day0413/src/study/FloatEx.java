package study;

/*		float, double : 실수형(실수형의 기본형은 double)
 * 
 * 
 */

import java.lang.*;

public class FloatEx {

	public static void main(String[] args) {
		
//		1. 변수선언 및 초기화		
		int r=5;//반지름
		double area=0,area1 = 0;//원이 넓이, 둘레

//		2. 연산 및 처리
		area = r*r*(Math.PI);//원의 넓이
		
		area1 = 2*r*(Math.PI);//원의 둘레
		
		
//		3. 출력문
		System.out.println("원의 넓이는"+area+"입니다.");
		System.out.printf("원의 넓이는%.3f입니다.%n", area);
		
		System.out.println("원의 둘레는"+area1+"입니다.");
		System.out.printf("원의 둘레는%.3f입니다.",area);
		
		
		
		
		
		

	}

}
