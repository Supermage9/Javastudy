package study;


//문] 정수 35가 짝수인지 홀수인지 판정하는 프로그램 구현
//     단, 삼항 연산자를 활용

public class OperExam06 {

	public static void main(String[] args) {
		
		
		//삼항연산자
		int a = 20, b = 30, max;
		
		max = a>b ? ++a : ++b;
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("max : "+max);
		
		
		int i = 35;
		String j;
		
		
		j = i % 2 == 0 ? "짝수" : "홀수";
		
		System.out.println("정수 35는 "+j+"입니다.");
		
		
		
		

	}

}
