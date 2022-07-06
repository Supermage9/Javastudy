package com.awteventex;

import java.awt.*;
import java.awt.event.*;
import com.awtex.*;

public class KeyEventEx extends Frame implements KeyListener {
	
	Label la = new Label("�ֹι�ȣ",Label.RIGHT);
	Label la1 = new Label("-",Label.CENTER);
	
	TextField jumin1 = new TextField(10);
	TextField jumin2 = new TextField(10);
	
	Button bt = new Button("Ȯ��");
	
	
	public KeyEventEx() {
		super("Key Event Test");
		
		setForm();
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
//		setSize(350,150);
		
		jumin1.addKeyListener(this);
		jumin2.addKeyListener(this);
		
		pack();
		setVisible(true);
	}
	
	public void setForm() {
		setLayout(new BorderLayout());
		add("West",la);
		
		Panel p = new Panel(new FlowLayout(FlowLayout.LEFT));
		p.add(jumin1);p.add(la1);p.add(jumin2);
		add("Center",p);
		
		Panel p1 = new Panel(new FlowLayout(FlowLayout.RIGHT));
		p1.add(bt);
		add("South",p1);
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
	
	}

	@Override
	public void keyPressed(KeyEvent e) {
	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		if(e.getSource()==jumin1) {
			if(jumin1.getText().trim().length()==6) {
				jumin2.requestFocus();
			}
		}
		if(e.getSource()==jumin2) {
			if(jumin1.getText().trim().length()==7) {
				bt.requestFocus();
			}
		}
	
	
	}

	public static void main(String[] args) {
		new KeyEventEx();
		
	}

}
