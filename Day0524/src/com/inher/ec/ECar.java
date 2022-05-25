package com.inher.ec;

public class ECar {
	
	private int batteryPercentage = 100;
	private int distance = 0;
	
	public static ECar getInstance() {
		//��ü ��ȯ
		return new ECar();
	}
	
	public void dispDistance() {
		System.out.println(distance+"ų�ι��� ����...");
	}
	
	public void dispBattery() {
		if(this.batteryPercentage==0) {
			System.out.println("���͸��� �����ϴ�.");
			return;
		}
		System.out.println("Battery :"+batteryPercentage);
	}
	
	public void drive() {
		if(this.batteryPercentage!=0) {
			this.distance += 1;
			this.batteryPercentage -= 10;
		}
	}
	
	
	public static void main(String[] args) {
		
		ECar car1 = ECar.getInstance();
		car1.drive();
		car1.drive();
		car1.drive();
		
		car1.dispDistance();
		car1.dispBattery();
		
		
		
	}

}
