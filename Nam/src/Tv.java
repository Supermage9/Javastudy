/*
 * ������ 
 * 
 * 	����Ÿ���� ���������� �ڼ�Ÿ�� �ν��Ͻ� ����
 *  ���� Ƽ�� ���������� ���� Ƽ�� ����ϴ°Ͱ� ����. 
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