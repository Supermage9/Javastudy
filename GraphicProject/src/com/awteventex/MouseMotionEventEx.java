package com.awteventex;
import java.awt.*;
import java.awt.event.*;
import com.awtex.*;

public class MouseMotionEventEx extends Frame implements MouseMotionListener {
	
	public MouseMotionEventEx() {
		
		super("MouseMotion Test");
		
		addMouseMotionListener(this);
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300,200);
		setVisible(true);
	}
	
	
	@Override
	public void mouseDragged(MouseEvent e) {
		if(e.getSource()==this)
			System.out.println("X="+e.getX()+",Y="+e.getY());
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {

	}

	public static void main(String[] args) {
		new MouseMotionEventEx();
	}

}
