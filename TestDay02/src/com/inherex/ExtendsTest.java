package com.inherex;


class Parents{
	
	int parentVar = 10;
	
	
	void parentMethod() {
		System.out.println("�θ��� �޼ҵ�");
	}
	
}




class Child extends Parents{
	
	int childVar = 20;
	
	void childMethod() {
		System.out.println("�ڽ��� �޼ҵ�");
	}
	
}
















public class ExtendsTest {

	public static void main(String[] args) {
		
		Child c = new Child(); 
		System.out.println(c.parentVar);
		System.out.println(c.childVar);
		c.parentMethod();
		c.childMethod();


	}

}
