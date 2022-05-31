package q;

//private 접근제한자는 같은 클래스 내에서만 접근 가능
//protected 접근제한자는 같은 패키지 내에서 접근가능, 다른패키지 접근불가
//default 접근제한자는 아무것도 안쓴것, 생략한것.




class FinalClass{
	protected final int finalMethod() {
		return 0;
	}
}

class Subclass extends FinalClass{
//	protected int finalMethod() {return 0;}
}


public class B {
	 
	public int n;
	public void g() { 
		n = 5;
	}
}
