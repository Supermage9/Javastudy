package com.threadex;

public class ThreadEx01 extends Thread{
	
	private int[]temp;
	
	public ThreadEx01(String threadname) {
		super(threadname);
		temp = new int[10];
		
		for(int start=0;start < temp.length;start++) {
			temp[start] = start;
		}
	}
	
	
	
	
	@Override
	public void run() { // 스레드 안의 run 메소드를 오버라이딩해서 구현
		
		for(int start : temp) {
			
			try {
				sleep(1000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.printf("스레드 이름 :%s,",currentThread().getName());
			System.out.printf("Temp Value :%d%n",start);
			
		}
	}
	
	
	

	public static void main(String[] args) {
		
		ThreadEx01 te = new ThreadEx01("홍길동");
		te.start();
	}

}
