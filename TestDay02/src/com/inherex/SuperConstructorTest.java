package com.inherex;

class Sawon2{
	
	String name;
	String dept;
	int salary;
	
	public Sawon2() {}
	
	public Sawon2(String name,String dept,int salary) {
		super(); // ������Ʈ�� ������.
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		
	}
	
	String displayInfo() {
		return "�̸� :"+name+", �μ� :"+dept+", ���� :"+salary;
	}

}

class Sales2 extends Sawon2{
	
	int commition;
	public Sales2(String name,String dept,int salary,int commition) {
		super(name,dept,salary); // �θ��� ������ ���� ����
		this.commition = commition;
	}
	
	@Override
	String displayInfo() {
		// TODO Auto-generated method stub
		return super.displayInfo()+", ���� :"+commition;
	}
	
}





public class SuperConstructorTest {

	public static void main(String[] args) {
		
		Sales2 se = new Sales2("ȫ�浿", "���ߺ�", 100000000, 5000000);
		System.out.println(se.displayInfo());

	}

}
