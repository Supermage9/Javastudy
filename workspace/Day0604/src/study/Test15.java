package study;

public class Test15 {
	
	public static void printPay(double basePay,int hours) {
		double d = basePay*hours;
		
		if(hours>40) {
			d = d+(hours-40)*basePay*1.5;
			if(hours>60) {
				System.out.println("근무시간초과");
			}else {
				System.out.println(d);
			}
		}else if(basePay<8.00) {
			System.out.println("최저시급 불이행");
		}
		
	}
	
	public static void main(String[] args) {
		printPay(7.50, 35);
		printPay(8.20, 47);
		printPay(10.00, 73);
		
	}

}
