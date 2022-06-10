
abstract class Player{ // 추상클래스
	abstract void play(int pos); //추상메서드. 선언부만있고 구현부는 없음.
	abstract void stop();
	
}
//추상클래스는 상속을 통해 완성해야 객체생성 가능.
class AudioPlayer extends Player{
	void play(int pos) {System.out.println(pos+"위치부터 플레이");}
	void stop() {System.out.println("멈춤");}
}

public class Abstract {

	public static void main(String[] args) {
		
//		Player p = new Player(); // 조상 추상클래스의 객체는 생성불가
		AudioPlayer ap = new AudioPlayer();
		
		
		Player ap1= new AudioPlayer(); // 다형성
		ap1.play(100);
		ap1.stop();
		

	}

}
