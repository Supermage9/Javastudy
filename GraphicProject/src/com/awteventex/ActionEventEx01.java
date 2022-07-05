package com.awteventex;
import java.awt.*;
import java.awt.event.*;
import com.awtex.*;

public class ActionEventEx01 extends Frame implements ActionListener{
	
	private TextField tf = new TextField(10);
	
	public ActionEventEx01() {
		super("ActionEvent Test");
		setLayout(new FlowLayout());
		
		add(tf);
		
		tf.addActionListener(this);
		
		setSize(300,200);
		setVisible(true);
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == tf) {
			String imsi = tf.getText();
			System.out.println("¸Þ½ÃÁö:"+imsi);
			tf.setText("");
		}
		
	}

	public static void main(String[] args) {
		new ActionEventEx01();

	}


}
