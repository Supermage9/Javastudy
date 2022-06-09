package study;

/*	접근 제어자
 * 
 *     public 접근제한 없음.
 *     
 *     protected 같은패키지 내에서, 다른패키지의 자손클래스에서 접근 가능
 *     
 *     (default) 같은 패키지 내에서만 접근 가능, 아무것도 안붙이면 디폴트
 *     
 *     private 같은 클래스 내에서만 접근 가능.
 * 		
 * 
 * 		접근제어자는 좁을수록 좋다. 좁혀놨다가 필요할 때 넓혀서 씀
 */


class Myparent{
	private 	int prv; // 같은 클래스
				int dft; // 같은 패키지
	protected 	int prt; // 같은 패키지 + 자손(다른 패키지)
	public 		int pub; // 접근 제한없음.
	
	public void printMembers() {
		System.out.println(prv); // OK
		System.out.println(dft); // OK
		System.out.println(prt); // OK
		System.out.println(pub); // OK
	}
}




public class Accesss1 {

	public static void main(String[] args) {
		
		Myparent p = new Myparent();
//		System.out.println(p.prv); // 에러.
		System.out.println(p.dft); // OK
		System.out.println(p.prt); // OK
		System.out.println(p.pub); // OK
		
	}

}
