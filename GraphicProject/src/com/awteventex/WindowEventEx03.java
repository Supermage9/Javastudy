package com.awteventex;
import java.awt.*;
import java.awt.event.*;
public class WindowEventEx03 extends Frame{

	public WindowEventEx03() {
		
		super("WinEvent3");
		addWindowListener(new WinEventEx());
		setSize(300,200);
		setVisible(true);
	}
	
	class WinEventEx extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	
	
	public static void main(String[] args) {
		
		new WindowEventEx03();
	}

}
