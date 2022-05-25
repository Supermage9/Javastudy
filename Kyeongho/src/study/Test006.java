package study;



import java.util.*;

public class Test006 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		
		
		System.out.print("숫자를 입력하세요. >");
		
		String tmp= sc.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
		
		input = Integer.parseInt(tmp); // 입력받은 문자열을 숫자로 강제변환
		
		if(input == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}
		
		if(input!=0) {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
			System.out.printf("입력하신 숫자는 %d입니다.",input);
			
		}
		
		
		
		
		
	
		
		
		
	}

}
