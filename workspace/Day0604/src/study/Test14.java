package study;

import java.util.Scanner;

public class Test14 {
	
	public static double calculateBMI(double weight,double tall) {
		
		return weight/(tall*tall);
	}
	
	public static void printBMIClassification(double bmi) {
		
		String s;
		if(bmi<18.5&&bmi>0) {
			System.out.println("BMI :"+bmi);
			System.out.println("저체중");
		}else if(bmi<25&&bmi>=18.5) {
			System.out.println("BMI :"+bmi);
			System.out.println("정상");
		}else if(bmi>=25&&bmi<30) {
			System.out.println("BMI :"+bmi);
			System.out.println("과체중");
		}else if(bmi>=30) {
			System.out.println("BMI :"+bmi);
			System.out.println("비만");
		}else {
			System.out.println("입력오류");
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double weight = sc.nextDouble();
		double tall = sc.nextDouble();
		
		//bmi지수계산
		double bmi = calculateBMI(weight,tall);
		//bmi지수를 입력하여 비만도 결과 출력
		printBMIClassification(bmi);
		
	}

}
