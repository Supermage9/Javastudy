package com.swingex;

import java.awt.*;
import javax.swing.*;
public class WindowExam02 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("참가자 명단 프로그램");
		
		frame.setPreferredSize(new Dimension(300,150));
		frame.setLocation(500,400);
		
		Container contentPane = frame.getContentPane();
		
		String[] colNames = {"이름","나이","성별"};
		
		Object data[][]= {
				{"홍길동",24,"남자"},
				{"이순희",21,"여자"},
				{"이순신",28,"남자"}
		};
		JTable table = new JTable(data,colNames);
		JScrollPane scrollpane = new JScrollPane(table);
		
		contentPane.add(scrollpane,BorderLayout.CENTER);
		JButton button = new JButton("출력");
		contentPane.add(button,BorderLayout.SOUTH);
		
		button.addActionListener(new PrintActionListener(table));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
	}

}
