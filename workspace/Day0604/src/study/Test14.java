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
			System.out.println("��ü��");
		}else if(bmi<25&&bmi>=18.5) {
			System.out.println("BMI :"+bmi);
			System.out.println("����");
		}else if(bmi>=25&&bmi<30) {
			System.out.println("BMI :"+bmi);
			System.out.println("��ü��");
		}else if(bmi>=30) {
			System.out.println("BMI :"+bmi);
			System.out.println("��");
		}else {
			System.out.println("�Է¿���");
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double weight = sc.nextDouble();
		double tall = sc.nextDouble();
		
		//bmi�������
		double bmi = calculateBMI(weight,tall);
		//bmi������ �Է��Ͽ� �񸸵� ��� ���
		printBMIClassification(bmi);
		
	}

}
