package com.threadex;

class MyThread implements Runnable{

	@Override
	public void run() {
		System.out.println("run");
		first();
		
	}
	
	public void first() {
		System.out.println("first");
		second();
		
	}
	
	
	public void second() {
		System.out.println("second");
		
		
	}
	
}

public class JoinEx {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName()+" start");
		
		Runnable r = new MyThread();
		Thread myThread = new Thread(r);
		myThread.start();
		
		try {
			myThread.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" end");
		
	}

}
