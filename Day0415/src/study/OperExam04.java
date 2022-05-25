package study;


// 논리연산자 : &&, ||, !

public class OperExam04 {

	public static void main(String[] args) {
		
		boolean a = false;
		boolean b = false;
		
		
		// or논리연산자||는 true이므로 출력가능, and논리연산자 &&는 false이므로 출력불가
		if((a = 4>3)&&(b = 5>7)) {
			System.out.println("a = "+a);
			System.out.println("b = "+b);
		}
		
		
	}

}
