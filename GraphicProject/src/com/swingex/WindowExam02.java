package com.swingex;

import java.awt.*;
import javax.swing.*;
public class WindowExam02 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("������ ��� ���α׷�");
		
		frame.setPreferredSize(new Dimension(300,150));
		frame.setLocation(500,400);
		
		Container contentPane = frame.getContentPane();
		
		String[] colNames = {"�̸�","����","����"};
		
		Object data[][]= {
				{"ȫ�浿",24,"����"},
				{"�̼���",21,"����"},
				{"�̼���",28,"����"}
		};
		JTable table = new JTable(data,colNames);
		JScrollPane scrollpane = new JScrollPane(table);
		
		contentPane.add(scrollpane,BorderLayout.CENTER);
		JButton button = new JButton("���");
		contentPane.add(button,BorderLayout.SOUTH);
		
		button.addActionListener(new PrintActionListener(table));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
	}

}
