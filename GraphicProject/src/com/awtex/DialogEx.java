package com.awtex;

import java.awt.*;
public class DialogEx extends Frame{
	
	private Dialog d = new Dialog(this,"조회서비스",false);
	
	private Label dlb = new Label("이름과 주민번호로 비밀번호 찾기");
	private Label dlb1 = new Label("이름:",Label.RIGHT);
	private Label dlb2 = new Label("주민번호:",Label.RIGHT);
	private Label dlb3 = new Label("-",Label.CENTER);
	
	private TextField dtf = new TextField(20);
	private TextField dtf1 = new TextField(6);
	private TextField dtf2 = new TextField(7);
	
	private Button dbt = new Button("찾기");
	private Button dbt1 = new Button("취소");
	
	
	public DialogEx() {
		
		super("Dialog Test");
		setDialog();
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		//setLocation(300, 300);
		setBounds(300, 300, 300, 200);
		//pack();
		
		//setSize(300, 200);
		setVisible(true);
		
		d.setVisible(true);
	}
	
	private void setDialog() {
		d.setLayout(new BorderLayout());// BorderLayout 상하좌우
		
		d.add("North",dlb);
		
		Panel p1 = new Panel(new BorderLayout());
		Panel p2 = new Panel(new GridLayout(2,1));
		
		
		p2.add(dlb1);
		p2.add(dlb2);
		p1.add("West",p2);
		
		Panel p3 = new Panel(new GridLayout(2,1));
		Panel tPanel1 = new Panel(new FlowLayout(FlowLayout.LEFT));
		
		
		tPanel1.add(dtf);
		p3.add(tPanel1);		
		
		Panel p4 = new Panel(new FlowLayout(FlowLayout.LEFT));
		
		p4.add(dtf1);
		p4.add(dlb3);
		p4.add(dtf2);
		
		p3.add(p4);
		
		p1.add("Center",p3);
		
		
		d.add("Center",p1);
		
		Panel p = new Panel(new FlowLayout());
		p.add(dbt);
		p.add(dbt1);
		
		d.add("South",p);
		d.setSize(280,150);
		d.setResizable(false);
		
		
	}
	

	public static void main(String[] args) {
		
		new DialogEx();
		
		
	}

}
