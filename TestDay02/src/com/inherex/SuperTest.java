package com.inherex;

class Sawon {
	
	String name;
	String dept;
	int salary;
	
	String displayInfo() {
		return "�̸� :"+name+",�μ� :"+dept+",���� :"+salary;
	}
	
	
}

class Sales extends Sawon{
	
	int commition;
	@Override
	String displayInfo() {
		
		return super.displayInfo()+",���� :"+commition;
	}
}

public class SuperTest{
	
	public static void main(String[] args) {
		Sales s = new Sales();
		System.out.println(s.displayInfo());
	}
	
}