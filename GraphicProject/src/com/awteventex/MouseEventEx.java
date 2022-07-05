package com.awteventex;
import java.awt.*;
import java.awt.event.*;
import com.awtex.*;
public class MouseEventEx extends Frame implements MouseListener{
	
	private Button bt = new Button("Ȯ��");
	private Button bt1 = new Button("���");
	
	
	
	
	
	public MouseEventEx() {
		super("Mouse Test");
		setLayout(new FlowLayout());
		
		add(bt);
		add(bt1);
		
		bt.addMouseListener(this);
		bt1.addMouseListener(this);
		
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300,200);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new MouseEventEx();
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==bt) {
			System.out.println("Ȯ�� ��ư...");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getSource()==bt1) {
			System.out.println("��� ��ư�� ������");
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.getSource()==bt1) {
			System.out.println("��� ��ư�� ������ �´�");
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if(e.getSource()==bt||e.getSource()==bt1) {
			System.out.println("���콺�� ��ư���� �ִ�");
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if(e.getSource()==bt||e.getSource()==bt1) {
			System.out.println("���콺�� ��ư���� �����Դ�");
		}
	}

}
