package com.awtex;
import java.awt.*;
public class TextEx extends Frame {

	private TextField tf = new TextField("����:");
	private TextArea ta = new TextArea("�޸�",5,10);
	
	private Button bt = new Button("Ȯ��");
	private Label lb = new Label("����");
	
	
	
	
	
	public TextEx() {
		
		super("TextField");
		setLayout(new BorderLayout());
		
		add("North",tf);
		add("South",bt);
		add("Center",ta);
		add("West",lb);
		
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		//setLocation(300, 300);
		setBounds(300, 300, 300, 200);
		//pack();
		
		//setSize(300, 200);
		setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
		
		new TextEx();


	}

}
