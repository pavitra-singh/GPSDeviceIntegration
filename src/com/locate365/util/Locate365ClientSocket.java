package com.locate365.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Locate365ClientSocket {

	Socket clientSocket = null;
	BufferedReader in = null;
	PrintWriter out = null;
	
	public static void main(String[] args){
		Locate365ClientSocket locate365ClientSocket = new Locate365ClientSocket();
		locate365ClientSocket.startConnection("10.4.22.143", 8070);
	}
	
	public void startConnection(String hostName, int portNumber) {

		try {

			System.out.println("Connecting to the server....");
			clientSocket = new Socket(hostName, portNumber);

			//Sending to server
			out = new PrintWriter(clientSocket.getOutputStream(), true);
			
			// receiving from server
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			
			String sendMessage, receiveMessage;
			
			while (true) {
				
				sendMessage = "78 78 0D 01 01 23 45 67 89 01 23 45 00 01 8C DD 0D 0A";
				out.println(sendMessage);
				out.flush();
				
				if((receiveMessage = in.readLine()) != null)  
		        {
		           //Send location data packet
					System.out.println(receiveMessage);         
		        } 
				
				

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/*public String loginMessagePacket(){
		
		LoginMessagePacket loginMessagePacket = new LoginMessagePacket();
		
		loginMessagePacket.setStartBit("1");
		loginMessagePacket.setPacketLength("1");
		loginMessagePacket.setProtocolNumber("1");
		loginMessagePacket.setInformationSerialNumber("12");
		loginMessagePacket.setTerminalId("huhv1869869");
		loginMessagePacket.setStopBit("1");
		
		return loginMessagePacket.toString();
	}*/
}
