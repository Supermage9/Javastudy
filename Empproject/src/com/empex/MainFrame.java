package com.empex;
import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame {

	private JTabbedPane tp ;
	private AddPane ap;
	
	
	public MainFrame() {
		// TODO Auto-generated constructor stub
	tp = new JTabbedPane();
	ap = new AddPane();
	
	tp.addTab("��������Է�", ap);
	getContentPane().add(tp);
	setTitle("������� ���α׷�");
	
	pack();
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainFrame mf = new MainFrame();
		mf.setSize(600,600);
	}

}