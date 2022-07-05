package com.awtex;

import java.awt.*;


public class FileDialogEx extends Frame{
	
	FileDialog fd = new FileDialog(this,"내꺼 저장",FileDialog.SAVE);
	
	public FileDialogEx() {
		
		super("FileDialog 테스트");
		
		
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		//setLocation(300, 300);
		setBounds(300, 300, 300, 200);
		//pack();
		
		//setSize(300, 200);
		setVisible(true);
		fd.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		
		new FileDialogEx();
		
	}
	
	
	
	
	
	

}
