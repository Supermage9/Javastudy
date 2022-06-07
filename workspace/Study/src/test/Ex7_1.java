package test;


class Parent{
	int age;
	public Parent() { //기본생성자
	}
	int add(int a,int b){ //인스턴스 메소드
		return a+b;
	}
		
	
}

class Child extends Parent{
	
	void play() {
		
	}
}
class Tv{
	boolean power;
	int channel;
	
	void power()		{power = !power;}
	void channelUp()	{++channel;}
	void channelDown()	{--channel;}
}
 
class SmartTv extends Tv{
	boolean caption;
	void dispCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}

class Ex7_1{
	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel = 10;
		stv.channelUp();
		System.out.println(stv.channel);
		stv.dispCaption("Hello, World");
		stv.caption = true;
		stv.dispCaption("Hello, world");
		
		
	}
}























