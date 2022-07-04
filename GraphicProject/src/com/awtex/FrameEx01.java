package com.awtex;

import java.awt.*;
import java.awt.event.*;
public class FrameEx01 {// 프레임 객체를 만들어서 이용

	public static void main(String[] args) {
		// 프레임 객체 생성
		Frame frame = new Frame();
		WinEvent We = new WinEvent();
		frame.addWindowListener(We);
		frame.setSize(300, 200);
		frame.setVisible(true);
		
		
	}

}
