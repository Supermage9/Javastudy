package com.swingex;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class JSliderEx extends JFrame{
	
	JSlider red = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
	JSlider green = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
	JSlider blue = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
	
	JLabel rgb = new JLabel("RGB(0,0,0)",JLabel.CENTER);
	
	JPanel p1 = new JPanel(new BorderLayout());
	JPanel west = new JPanel(new GridLayout(0,1));
	JPanel cen = new JPanel(new GridLayout(0,1));
	JPanel p2 = new JPanel();
	
	JLabel rlabel = new JLabel("Red");
	JLabel glabel = new JLabel("Green");
	JLabel blabel = new JLabel("Blue");
	
	int r,g,b;
	
	public JSliderEx() {
		super("JSlider Test");
		
		red.setMajorTickSpacing(50);
		red.setMinorTickSpacing(5);
		red.setPaintTicks(true);
		red.setPaintLabels(true);
		
		green.setMajorTickSpacing(50);
		green.setMinorTickSpacing(5);
		green.setPaintTicks(true);
		green.setPaintLabels(true);
		
		blue.setMajorTickSpacing(50);
		blue.setMinorTickSpacing(5);
		blue.setPaintTicks(true);
		blue.setPaintLabels(true);
		
		rlabel.setForeground(Color.red);
		glabel.setForeground(Color.green);
		blabel.setForeground(Color.blue);
		
		
		rgb.setFont(new Font("�ü�ü",Font.BOLD,25));
		
		west.add(rlabel);west.add(glabel);west.add(blabel);
		cen.add(red);cen.add(green);cen.add(blue);
		
		p1.add("West",west);p1.add("Center",cen);
		add("North",rgb);
		add("South",p1);
		add("Center",p2);
		
		red.addChangeListener(new Sevent());
		green.addChangeListener(new Sevent());
		blue.addChangeListener(new Sevent());
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300,200,300,100);
//		pack();
		setVisible(true);
	}
	
	class Sevent implements ChangeListener{
		
		
		
		@Override
		public void stateChanged(ChangeEvent e) {
			JSlider source = (JSlider)e.getSource();
			if(e.getSource()==red) {
				r = source.getValue();
			}
			if(e.getSource()==green) {
				g = source.getValue();
			}
			if(e.getSource()==blue) {
				b = source.getValue();
			}
			p2.setBackground(new Color(r,g,b));
			rgb.setText("RGB("+r+","+g+","+b+")");
		}
		
	}
	
	public static void main(String[] args) {
		new JSliderEx();
	}

}
