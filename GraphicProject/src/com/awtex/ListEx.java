package com.awtex;


import java.awt.*;
public class ListEx extends Frame {
	
	private Label lb = new Label("�ο� ���");
	private List li = new List(4,true);
	private Button bt = new Button("Ȯ��");
	private String[]name;
	
	

	public ListEx(String a[]) {
		
		super("List Test");
		name = a;
		
		setLayout(new BorderLayout());
		
		for(int i =0;i<name.length;i++) {
			li.add(name[i]);
		}
		
		
		add("North",lb);
		add("South",bt);
		add("Center",li);
		li.setFont(new Font("����ü",Font.BOLD,30));
		
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		//setLocation(300, 300);
		//setBounds(300, 300, 300, 200);
		pack();
		
		//setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		
		new ListEx(args);
		
		
	}

}
