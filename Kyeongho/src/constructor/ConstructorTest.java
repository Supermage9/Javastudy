package constructor;

class Data1 {
//	public Data1() {} // 기본생성자. 컴파일러가 자동생성하지만 써주는게 좋다.	
	int value;
}
class Data2 {
	int value;
	//매개변수가 있는 생성자.
	public Data2(int x) { // 생성자는 메소드이고 기본적으로 클래스와 이름이 같다.
		value = x;
	}
}

public class ConstructorTest {

	public static void main(String[] args) {
		
		Data1 d1 = new Data1();
		Data2 d2 = new Data2(2);
		

	}

}
// 기본생성자가 컴파일러에 의해 추가되는 경우는 클래스에 정의된 생성자가 하나도 없을 때 뿐이다.(매개변수가 있는 생성자가 존재하면 기본생성자 안만들어줌)