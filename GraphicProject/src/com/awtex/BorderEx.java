package com.awtex;

import java.awt.*;

public class BorderEx extends Frame{

	Label a,b,c,d,e;
	
	public BorderEx() {
		
		super("BordLayout");
		setLayout(new BorderLayout(5,5));
		
		a = new Label("��",Label.CENTER);
		b = new Label("��",Label.CENTER);
		c = new Label("��",Label.CENTER);
		d = new Label("��",Label.CENTER);
		e = new Label("�̵�",Label.CENTER);
		
		setBackground(Color.gray);
		// ������ ����
		a.setBackground(Color.red);
		b.setBackground(Color.green);
		c.setBackground(Color.blue);
		d.setBackground(Color.magenta);
		e.setBackground(Color.yellow);
		
		// ����� ����
		a.setForeground(Color.white);
		b.setForeground(Color.white);
		c.setForeground(Color.white);
		d.setForeground(Color.white);
		e.setForeground(Color.white);
		
		// ���̾ƿ��� �߰�
		add("North",a);
		add("South",b);
		add("West",c);
		add("East",d);
		add("Center",e);
		
		
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		//setLocation(300, 300);
		setBounds(300, 300, 300, 200);
		//pack();
		
		//setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new BorderEx();
	}

}