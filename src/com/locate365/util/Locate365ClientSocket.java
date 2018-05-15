package com.locate365.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Locate365ClientSocket {

	public static void main(String[] arg){
		
		Socket clientSocket = null;
		String hostName = "10.4.22.143";
		int portNumber = 8070;
		BufferedReader in = null;
		BufferedWriter out = null;
		
		try {
			
			System.out.println("Connecting to the server....");
			clientSocket = new Socket(hostName, portNumber);
			
		} catch (Exception e) {
			System.out.println("Cannot connect....");
			e.printStackTrace();
		} 
		
		try {
			
			out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
			out.write("Sending to the server....");
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}finally{
			try {
				clientSocket.close();
				in.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
	
}
