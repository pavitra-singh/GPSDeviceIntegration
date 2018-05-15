package com.locate365.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import com.locate365.mixlab.dataFetch.ParseDataPackets;

public class Locate365ServerSocket {

	ServerSocket serverSocket = null;
	Socket clientSocket = null;
	BufferedReader in = null;
	PrintWriter out = null;

	public static void main(String[] args) {
		Locate365ServerSocket locate365ServerSocket = new Locate365ServerSocket();
		locate365ServerSocket.connect(8070);
	}

	public void connect(int portNumber) {

		try {
			System.out.println("Starting server....");
			serverSocket = new ServerSocket(portNumber);
			clientSocket = serverSocket.accept();

			//Sending to client
			out = new PrintWriter(clientSocket.getOutputStream(), true);
			
			// receiving from client
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			
			String sendMessage, receiveMessage;
			
			while (true) {
				if((receiveMessage = in.readLine()) != null)  
		        {
		           System.out.println(receiveMessage);   
		           int isSaved = ParseDataPackets.parseLoginMessagePacketFromTerminalAndSaveInDatabase(receiveMessage);
		           if(isSaved == 1){
		        	   sendMessage = receiveMessage;
			           out.println(sendMessage);
			           out.flush();
		           }else{
		        	   sendMessage = "NOTHING";
			           out.println(sendMessage);
			           out.flush();
		           }
		           
		        } 
				
				

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		/*try {
			in.close();
			out.close();
			clientSocket.close();
			
		} catch (IOException e) {
			System.out.println(e);
		}*/
	}

}
