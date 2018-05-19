package com.lijie.java.headfirst.chapter15Socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class DailyAdviceClient {
	
	public void go(){
		try {
			Socket s =new Socket("127.0.0.1", 4242);
			
			/**从服务器端读取信息**/
//			InputStreamReader inputStreamReader = new InputStreamReader(s.getInputStream());
//			BufferedReader reader = new BufferedReader(inputStreamReader);
//			String advice = reader.readLine();
//			System.out.println(advice);
//			reader.close();
//			inputStreamReader.close();
			
			/**往服务器端发送信息**/
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(s.getOutputStream());
			BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
			bufferedWriter.write("Hello server, I am client !");
			System.out.println("Hello server, I am client !");
			bufferedWriter.close();
			outputStreamWriter.close();
			
			s.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		DailyAdviceClient client = new DailyAdviceClient();
		client.go();
	}

}
