package com.awtex;

import java.awt.*;
import java.awt.event.*;
public class FrameEx01 {// ������ ��ü�� ���� �̿�

	public static void main(String[] args) {
		// ������ ��ü ����
		Frame frame = new Frame();
		WinEvent We = new WinEvent();
		frame.addWindowListener(We);
		frame.setSize(300, 200);
		frame.setVisible(true);
		
		
	}

}
