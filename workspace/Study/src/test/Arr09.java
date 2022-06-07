package test;

import java.util.Scanner;

public class Arr09 {

	public static void main(String[] args) {
		
		String[][] words = {
				{"chair","의자"},
				{"computer","컴퓨터"},
				{"integer","정수"}
		};
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<words.length;i++) {
			System.out.printf("%s의 뜻은?%n",words[i][0]);
			String ans= sc.next();
			
			if(ans.equals(words[i][1])) {
				System.out.println("정답입니다!\n\n");
			}else {
				System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n",words[i][1]);
			}
			
		}
		
		
		
		
		
	}

}
