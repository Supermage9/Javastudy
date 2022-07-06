package com.swingex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class WindowExam01 {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Swing Programming"); // 제목
		frame.setPreferredSize(new Dimension(200,70));
		frame.setLocation(500,400);
		Container contentPane = frame.getContentPane();
		JTextField text = new JTextField();				//텍스트필드
		JLabel label = new JLabel("Hello ");			//라벨
		JButton button = new JButton("확인");				//버튼
		contentPane.add(text,BorderLayout.CENTER);
		contentPane.add(button,BorderLayout.EAST);
		contentPane.add(label,BorderLayout.SOUTH);
		
		ActionListener listener = new ConfirmButtonActionListener(text,label);
		
		button.addActionListener(listener);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
	}

}
