package study;



import java.util.*;
public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int op1,op2, res = 0;
		String s;
		System.out.print("���� �Է� :");
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
//			System.out.println("0���� ���� �� �����ϴ�.");
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
			System.out.println("0���� ���� �� �����ϴ�.");
			return;
		}res = op1 / op2;
		break;
		default:
		System.out.println("������ �Է¿���");
		break;
		
	}
		System.out.println(op1+s+op2+"="+res);
	}
}
