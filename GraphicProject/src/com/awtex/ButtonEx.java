package com.awtex;

import java.awt.*;
public class ButtonEx extends Frame{
	
	private String[] str = {"7","8","9","4","5","6","1","2","3","#","0","*"};
	private Button[] bt = new Button[str.length];
	
	
	
	public ButtonEx() {
		
		super("Button �׽�Ʈ");
		setLayout(new GridLayout(4,3,5,5));
		
		for(int i=0;i<bt.length;i++) {
			bt[i]=new Button(str[i]);
			bt[i].setFont(new Font("����ü",Font.BOLD, 30));
			add(bt[i]);
		}
		
		
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		//setLocation(300, 300);
		setBounds(300, 300, 300, 200);
		//pack();
		
		//setSize(300, 200);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		
		new ButtonEx();
		
	}

}
