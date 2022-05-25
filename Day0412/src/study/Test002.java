package study;

public class Test002 {
	
	//staticint aa=0;

	
	
	public static void main(String[] args) {
		//문자열을 사용할 경우 " ":쌍따옴표, 더블쿼터    ' ' :싱글쿼터
		String str ="우리는";
		char ch ='d';
		
		//String은 문자열,대문자  char은 문자 1개,소문자
		System.out.println(str);
		System.out.println(ch);
		System.out.printf("%s\n",str);
		System.out.printf("%c\n",ch);
		System.out.printf("%s, %c\n", str, ch);
		
		//여러 문자열과 매개변수르 사용할 경우 연결 기호 (+)를 사용
		System.out.println(2.14+"는 실수입니다.");
		

		//전역변수, 지역변수  전역변수를 사용하기 위해 static 사용
		
		int a=0;
		System.out.println(a);
		
		//System.out.println(aa);
		
		//이름 고향 전공 취미 특기 전번 성별 주소 좌우명
		
		
	
	}

}
