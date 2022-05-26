package com.hw;

public class Flute extends Instrument{

	public static void main(String[] args) {
		
		Flute f = new Flute();
		f.play();
		f.volumeup();
		f.volumedown();
		
		

	}

	@Override
	void play() {
		System.out.println("Flute : Play() »£√‚µ ");
		
	}

	@Override
	void volumeup() {
		System.out.println("Flute : VolumeUp() »£√‚µ ");
		
	}

	@Override
	void volumedown() {
		System.out.println("Flute : VolumeDown() »£√‚µ ");
		
	}

}
