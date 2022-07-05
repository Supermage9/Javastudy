package com.awteventex;
import java.awt.*;
import java.awt.event.*;
import com.awtex.*;
public class ActionEventEx04 extends Frame implements ActionListener{
	
	private Button[] bt = new Button[4];
	private Panel[] pp = new Panel[4];
	private Color[] cc = {Color.red,Color.green,Color.blue,Color.yellow};
	private CardLayout card = new CardLayout();
	private Panel pptop;
	
	
	public ActionEventEx04() {
		super("ActionEvent4");
		
		setLayout(new BorderLayout());
		
		Panel p = new Panel(new GridLayout(1,4));
		for(int i=0;i<bt.length;i++) {
			bt[i] = new Button(i+1+"¹ø ¹öÆ°");
			bt[i].addActionListener(this);
			p.add(bt[i]);
		}
		
		add("North",p);
		
		pptop = new Panel(card);
		for(int i=0;i<pp.length;i++) {
			pp[i]=new Panel();
			pp[i].setBackground(cc[i]);
			pptop.add(""+i,pp[i]);
		}
		
		add("Center",pptop);
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ActionEventEx04();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0;i<4;i++) {
			if(e.getSource()==bt[i]) {
				card.show(pptop,""+i);
			}
		}
		
	}

}
