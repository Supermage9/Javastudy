package com.awteventex;
import java.awt.*;
import java.awt.event.*;


public class WindowEventEx04 extends Frame{

	public WindowEventEx04() {
		
		super("WinEvent4");
		
		addWindowListener(new WindowAdapter() { //익명타입
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		setSize(300,200);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new WindowEventEx04();
		
		
	}

}
