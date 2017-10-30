package com.lijie.java.jase.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class VerySimpleChatServer {
	
	ArrayList clientOutputStreams;
	
	public class ClientHandler implements Runnable{
		BufferedReader reader;
		Socket socket;
		
		public ClientHandler(Socket clientsocket){
			try {
				socket = clientsocket;
				InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
				reader = new BufferedReader(inputStreamReader);
				
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
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
				// TODO: handle exception
			}
		}
		
	}
	
	public static void main(String[] args) {
		new VerySimpleChatServer().go();
	}
	
	public void go(){
		clientOutputStreams = new ArrayList();
		try {
			ServerSocket serverSocket = new ServerSocket(5000);
			
			while(true){
				Socket clientSocket = serverSocket.accept();
				PrintWriter printWriter = new PrintWriter(clientSocket.getOutputStream());
				clientOutputStreams.add(printWriter);
				
				Thread t = new Thread(new ClientHandler(clientSocket));
				t.start();
				System.out.println("got a connection !")
				;
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
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
				// TODO: handle exception
			}
			
		}

	}

}
