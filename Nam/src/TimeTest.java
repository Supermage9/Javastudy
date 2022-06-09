
class Time{
	private int hour; // 0~23 사이의 값을 가져야함.
	private int minute;
	private int second;
	
	public void setHour(int hour) { // 값 변경 메소드 set
		if(isValidHour(hour))
			return;
		this.hour = hour;
	}

	private boolean isValidHour(int hour) { // 굳이 public으로 안해도됨.
		return hour<0 || hour >23;
	}
	
	public int getHour() { // 값 호출 메소드 get
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
