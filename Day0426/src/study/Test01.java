package study;



import java.util.*;
public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int op1,op2, res = 0;
		String s;
		System.out.print("연산 입력 :");
	    op1 = sc.nextInt();
		s = sc.next();
		op2 = sc.nextInt();
		
//		if(s.equals("+")) {
//			res = op1 + op2;
//		}else if (s.equals("-")){
//			res = op1 - op2;
//		}else if (s.equals("*")) {
//			res = op1 * op2;
//		}else if (s.equals("/")) {
//			res = op1 / op2;
//		if(op2==0) {
//			System.out.println("0으로 나눌 수 없습니다.");
//		}
//		}
		
		
		
		switch (s) {
		case "+":
			res = op1 + op2;
			break;
		case "-":
			res = op1 - op2;
			break;
		case "*":
			res = op1 * op2;
			break;
		case "/":
		if(op2==0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		}res = op1 / op2;
		break;
		default:
		System.out.println("연산자 입력오류");
		break;
		
	}
		System.out.println(op1+s+op2+"="+res);
	}
}
