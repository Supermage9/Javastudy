package com.swingex;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
public class PrintActionListener implements ActionListener {
		
	JTable table;
	
	
	public PrintActionListener(JTable table) {
		this.table = table;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		TableModel model = table.getModel();
		
		int rowNum = model.getRowCount();
		int colNum = model.getColumnCount();
		
		for(int col=0;col<colNum;col++) {
			String colName = model.getColumnName(col);
			System.out.print(colName+"\t");
		}
	}
	
}
