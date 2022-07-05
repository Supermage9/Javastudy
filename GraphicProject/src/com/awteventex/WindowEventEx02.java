package com.awteventex;

import java.awt.event.*;
import java.awt.*;
public class WindowEventEx02 extends Frame implements WindowListener{
	
	
	
	
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.exit(0);
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public WindowEventEx02() {
		
		super("WinEvent2");
		addWindowListener(this);
		setSize(300,200);
		setVisible(true);
		
		
		
	}

	public static void main(String[] args) {
		
		new WindowEventEx02();
		
		
		
	}

}
