package com.lijie.java.headfirst.chapter15Socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 需要理清楚
 * inputstream
 * outputstream
 * 
 * reader
 * writer
 * 之间的关系，很重要
 * 
 * **/
public class DailyAdviceServer {
	
	String[] advicelist = {"hello","hi","heihei"};
	
	public void go(){
		try {
			ServerSocket serverSocket = new ServerSocket(4242);
			
			while (true){
				Socket socket = serverSocket.accept();
				
				/**PrintWriter往客户端发送信息**/
//				PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
//				printWriter.write("hello client!");
//				printWriter.close();
				
				/**OutputStreamWriter往客户端发送信息**/
//				OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
//				BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
//				bufferedWriter.write("hello client!");
//				bufferedWriter.close();
//				outputStreamWriter.close();
				
				/**从客户端读取信息**/
				InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
				BufferedReader reader = new BufferedReader(inputStreamReader);
				System.out.println(reader.readLine());
				reader.close();
				inputStreamReader.close();
				
				socket.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		DailyAdviceServer dailyAdviceServer = new DailyAdviceServer();
		dailyAdviceServer.go();
	}

}
