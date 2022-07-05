package com.awteventex;
import java.awt.*;
import java.awt.event.*;
import com.awtex.*;
public class ActionEventEx02 extends Frame implements ActionListener{
	
	private Button bt = new Button("Á¾·á");
	
	
	
	public ActionEventEx02() {
		
		super("ActionEvent2");
		
		bt.addActionListener(this);
		setLayout(new FlowLayout());
		add(bt);
		setSize(300,200);
		setVisible(true);
		WinEvent we = new WinEvent();
		addWindowListener(we);
	}
	
	
	
	public static void main(String[] args) {
		new ActionEventEx02();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

}
