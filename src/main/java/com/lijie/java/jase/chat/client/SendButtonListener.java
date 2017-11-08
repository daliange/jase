package com.lijie.java.jase.chat.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;

import javax.swing.JTextField;

/**外部类**/
public class SendButtonListener implements ActionListener{
	
	JTextField outgoing;
	PrintWriter writer;
	
	public SendButtonListener(JTextField outgoing, PrintWriter writer) {
		this.outgoing = outgoing;
		this.writer = writer;
	}

	public void actionPerformed(ActionEvent e) {
		
		try {
			writer.println(outgoing.getText());
			writer.flush();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		
	}

}
