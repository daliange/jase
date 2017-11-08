package com.lijie.java.jase.chat.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class ClientHandler implements Runnable{
	BufferedReader reader;
	Socket socket;
	ArrayList clientOutputStreams;
	
	public ClientHandler(Socket clientsocket,ArrayList arrayList){
		try {
			socket = clientsocket;
			InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
			reader = new BufferedReader(inputStreamReader);
			clientOutputStreams = arrayList;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void run (){
		String message ;
		try {
			while ((message=reader.readLine())!=null){
				System.out.println("read "+message);
				tellEveryone(message);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void tellEveryone(String message) {
		Iterator it = clientOutputStreams.iterator();
		while(it.hasNext()){
			try {
				PrintWriter printWriter = (PrintWriter)it.next();
				printWriter.println(message);
				printWriter.flush();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}