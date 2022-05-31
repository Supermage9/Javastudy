package com.inherex;

class OverridingParent2{
	
	int money = 20;
	void parentMethod() {
		System.out.println("parent Method");
	}
	
}

class OverridingChild2 extends OverridingParent2{
	
	String money = "20원"; // 부모클래스와 같은 이름의 변수는 숨겨지고 자료형이 바뀌며 재정의됨. (은닉)
	@Override
	void parentMethod() {
		System.out.println("overriding Method");
		
	}
}

public class OverridingTest2 {

	public static void main(String[] args) {
		
		OverridingChild2 oc2 = new OverridingChild2();
		oc2.money = "30원"; // 상속되면서 같은 이름의 변수가 자식의 자료형으로 바뀜.
		//oc2.money = 10; // 부모의 변수
 		oc2.parentMethod();
		System.out.println(oc2.money);
		
	}

}
