package com.inherex;


class Parents{
	
	int parentVar = 10;
	
	
	void parentMethod() {
		System.out.println("부모의 메소드");
	}
	
}




class Child extends Parents{
	
	int childVar = 20;
	
	void childMethod() {
		System.out.println("자식의 메소드");
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
