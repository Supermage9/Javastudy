package com.awtex;
import java.awt.*;
public class CheckBoxEx extends Frame {
	
	
	private Label lb = new Label("�����ϴ� ����?");
	private Checkbox[] cb = {
			new Checkbox("�ٳ���"),
			new Checkbox("���"),
			new Checkbox("���ξ���"),
			new Checkbox("����",true) // �������ڸ��� ����ɼ� true.
	}; 
	private Button bt = new Button("Ȯ��");
	
	
	public CheckBoxEx() {
		
		super("Checkbox");
		setLayout(new GridLayout(6,1));
		
		add(lb);
		for(int i=0;i<4;i++) {
			add(cb[i]);
		}
		add(bt);
		
		WinEvent we = new WinEvent();
		//addWindowListener(we);
		//setLocation(300, 300);
		setBounds(300, 300, 300, 200);
		//pack();
		
		//setSize(300, 200);
		setVisible(true);
		
		
		
	}
	
	

	public static void main(String[] args) {
		
		new CheckBoxEx();
		
	}

}
