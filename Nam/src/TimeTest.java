
class Time{
	private int hour; // 0~23 ������ ���� ��������.
	private int minute;
	private int second;
	
	public void setHour(int hour) { // �� ���� �޼ҵ� set
		if(isValidHour(hour))
			return;
		this.hour = hour;
	}

	private boolean isValidHour(int hour) { // ���� public���� ���ص���.
		return hour<0 || hour >23;
	}
	
	public int getHour() { // �� ȣ�� �޼ҵ� get
		return hour;
	}
	
	
}

public class TimeTest {

	public static void main(String[] args) {
		
		Time t = new Time();
//		t.hour = 100;
		t.setHour(12);
		System.out.println(t.getHour());
		
		
	}

}
