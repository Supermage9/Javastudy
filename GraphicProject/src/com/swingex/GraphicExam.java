package com.swingex;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;
public class GraphicExam {

	public static void main(String[] args) {
		JFrame frame = new JFrame("���� �׷��� ���α׷�");
		
		frame.setPreferredSize(new Dimension(400,200));
		frame.setLocation(500,400);
		
		Container contentPane = frame.getContentPane();
		
		DrawingPanel drawingPanel = new DrawingPanel();
		contentPane.add(drawingPanel,BorderLayout.CENTER);
		
		
		JPanel controlPanel = new JPanel();
		
		JTextField text1 = new JTextField(3);
		JTextField text2 = new JTextField(3);
		JTextField text3 = new JTextField(3);
		
		JButton button = new JButton("�׷��� �׸���");
		
		controlPanel.add(new JLabel("����"));
		controlPanel.add(text1);
		controlPanel.add(new JLabel("����"));
		controlPanel.add(text2);
		controlPanel.add(new JLabel("����"));
		controlPanel.add(text3);
		controlPanel.add(button);
		
		contentPane.add(controlPanel,BorderLayout.SOUTH);
		button.addActionListener(new DrawActionListener(text1, text2, text3, drawingPanel));
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
	}

}
