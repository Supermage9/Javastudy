/*
 *  인스턴스오브 
 *  
 *  참조변수의 형변환 가능여부 확인에 사용. 가능하면 true반환.
 *  형변환하기 전에 반드시 인스턴스오브로 확인하고 변환해야함.
 *  
 *  
 */

public class Instanceof {

	public static void main(String[] args) {
		
		Instanceof fe = new Inst1();
		
		System.out.println(fe instanceof Object);
		System.out.println(fe instanceof Inst1);
		System.out.println(fe instanceof Instanceof);
		
	
	}

}

class Inst1 extends Instanceof{
	
}
