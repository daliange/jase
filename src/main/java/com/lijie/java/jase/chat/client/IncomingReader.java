package com.lijie.java.jase.chat.client;

import java.io.BufferedReader;

import javax.swing.JTextArea;

public class IncomingReader implements Runnable{
	
	JTextArea incoming;
	BufferedReader reader;
	
	public IncomingReader(JTextArea incoming,BufferedReader reader) {
		this.incoming = incoming;
		this.reader = reader;
	}
	
	public void run() {
		
		String message;
		try {
			while ((message = reader.readLine())!=null){
				System.out.println("read "+message);
				incoming.append(message +"\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}