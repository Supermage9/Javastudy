package com.empex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
public class FindPane extends JPanel implements ActionListener {
	
	// 화면관련 멤버 필드 정의
		private JPanel jp[] = new JPanel[6];
		private JLabel jl[] = new  JLabel[5];
		private JTextField tf[] = new JTextField[5];
		
		private JButton okb;
		private JButton rsb;
		

		//제목
		String [] caption = {"번호 : ","이름 : ","직책 : ","부서 : ","메일 : "};
	
	public FindPane() {
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {

	}

}
