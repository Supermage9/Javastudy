package com.awtex;

import java.awt.*;


public class FrameEx02 extends Frame {// Frame클래스를 상속받아 이용

	public FrameEx02() {
		
		super("프레임");
		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300, 200);
		setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
		
		new FrameEx02();
		
	}

}
