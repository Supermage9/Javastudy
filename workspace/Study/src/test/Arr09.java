package test;

import java.util.Scanner;

public class Arr09 {

	public static void main(String[] args) {
		
		String[][] words = {
				{"chair","����"},
				{"computer","��ǻ��"},
				{"integer","����"}
		};
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<words.length;i++) {
			System.out.printf("%s�� ����?%n",words[i][0]);
			String ans= sc.next();
			
			if(ans.equals(words[i][1])) {
				System.out.println("�����Դϴ�!\n\n");
			}else {
				System.out.printf("Ʋ�Ƚ��ϴ�. ������ %s�Դϴ�.%n%n",words[i][1]);
			}
			
		}
		
		
		
		
		
	}

}
