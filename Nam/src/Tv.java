/*
 * 다형성 
 * 
 * 	조상타입의 참조변수로 자손타입 인스턴스 참조
 *  구형 티비 리모콘으로 신형 티비를 사용하는것과 같음. 
 * 
 */


class Tv {
	boolean power;
	int channel;
	
	void power()	{power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
	
}

class SmartTv extends Tv{
	
	String text;
	void caption() {}
	
	SmartTv s = new SmartTv();
	Tv t = new SmartTv();
}