package com.locate365.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Locate365ClientSocket {

	Socket clientSocket = null;
	BufferedReader in = null;
	PrintWriter out = null;
	
	static String loginMessagePacket = "78 78 0D 01 01 23 45 67 89 01 23 45 00 01 8C DD 0D 0A";
	static String locationDataPacket = "78 78 1F 12 0B 08 1D 11 2E 10 CF 02 7A C7 EB 0C 46 58 49 00 14 8F 01 CC 00 28 7D 00 1F B8 00 03 80 81 0D 0A";
	
	public static void main(String[] args){
		Locate365ClientSocket locate365ClientSocket = new Locate365ClientSocket();
		locate365ClientSocket.startConnection("10.4.22.143", 8070);
	}
	
	public void startConnection(String hostName, int portNumber) {

		try {

			System.out.println("Connect to the server....");
			clientSocket = new Socket(hostName, portNumber);

			//Sending to server
			out = new PrintWriter(clientSocket.getOutputStream(), true);
			
			// receiving from server
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			
			// the following loop performs the exchange of information between client and request handler
			while (true) {
				
				String sendMessage = loginMessagePacket;

				out.println(sendMessage);
				out.flush();
				
				String receiveMessage = in.readLine();
				if(receiveMessage.contains("78 78 ")){
					System.out.println("Message from Server : " +  receiveMessage);
					//Send location data packet 
					out.println("LBS From Client" + locationDataPacket);
					out.flush();
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
