
abstract class a{
	abstract void stop();
}

abstract class b extends a{
	abstract void go();
}
abstract class c extends b{
	abstract void down();
}

class e extends b{
	void stop() {
		
	}
	void go() {
		
	}
}


class d extends c{
	void stop(){
		
	}
	void go() {
		
	}
	void down() {
		
	}
}



public class AbsEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
