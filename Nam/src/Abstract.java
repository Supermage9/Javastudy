
abstract class Player{ // �߻�Ŭ����
	abstract void play(int pos); //�߻�޼���. ����θ��ְ� �����δ� ����.
	abstract void stop();
	
}
//�߻�Ŭ������ ����� ���� �ϼ��ؾ� ��ü���� ����.
class AudioPlayer extends Player{
	void play(int pos) {System.out.println(pos+"��ġ���� �÷���");}
	void stop() {System.out.println("����");}
}

public class Abstract {

	public static void main(String[] args) {
		
//		Player p = new Player(); // ���� �߻�Ŭ������ ��ü�� �����Ұ�
		AudioPlayer ap = new AudioPlayer();
		
		
		Player ap1= new AudioPlayer(); // ������
		ap1.play(100);
		ap1.stop();
		

	}

}
