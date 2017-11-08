package com.lijie.java.jase.chat.server;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class VerySimpleChatServer {
	
	ArrayList clientOutputStreams;
	
	
	
	public static void main(String[] args) {
		VerySimpleChatServer verySimpleChatServer= new VerySimpleChatServer();
		verySimpleChatServer.go();
	}
	
	public void go(){
		
		clientOutputStreams = new ArrayList();
		try {
			ServerSocket serverSocket = new ServerSocket(5000);
			System.out.println("server启动成功，监听中。。。");
			while(true){
				Socket clientSocket = serverSocket.accept();
				PrintWriter printWriter = new PrintWriter(clientSocket.getOutputStream());
				clientOutputStreams.add(printWriter);
				Thread t = new Thread(new ClientHandler(clientSocket,clientOutputStreams));
				t.start();
				System.out.println("got a connection !");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
