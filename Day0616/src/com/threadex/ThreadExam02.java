package com.threadex;

class ThreadEx04 extends Thread{
	
	private String firstname;
	private String lastname;
	
	public ThreadEx04(String a,String b,int x) {
		firstname = a;
		lastname = b;
		setPriority(x);
		setDaemon(true);
	}	
	
	
	@Override
	public void run() {
		
		System.out.println(Thread.activeCount());
		int xx = Thread.activeCount();
		Thread[]th = new Thread[xx];
		
		Thread.enumerate(th);
		
		for(int i=0;i<th.length;i++) {
			System.out.println(th[i].getName()+" : "+th[i].getPriority()+" : "+th[i].isDaemon()+" : "+th[i].isAlive());
		}
		
		while(true) {
			System.out.println("ÀÌ¸§ :"+firstname);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("ÀÌ¸§ 2:"+lastname);
		}
	}
	
}



public class ThreadExam02 {

	public static void main(String[] args) {
		
		ThreadEx04 t1 = new ThreadEx04("±æµ¿", "È«", 1);
		t1.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {}
		
		ThreadEx04 t2 = new ThreadEx04("À¯½Å", "±è", 5);
		t2.start();
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {}
	}

}
