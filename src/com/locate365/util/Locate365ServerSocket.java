package com.locate365.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Locate365ServerSocket {

	static String dataToClient = "Message from locate365 server";
	
	public static void main(String[] args) {
		// socket server port on which it will listen/running
		int portNumber = 8070;
		ServerSocket serverSocket = null;
		Socket clientSocket = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		
		try {
			System.out.println("Creating socket connection on the server....");
			// create and open a socket connection on the server
			serverSocket = new ServerSocket(portNumber);

		} catch (Exception e) {
			e.printStackTrace();
		}

		//while(true){
			try {
				// create a socket object from the ServerSocket in order to listen
				// for
				// and accept connections from clients
				System.out.println("Socket object to listen to clients.....");
				clientSocket = serverSocket.accept();
				
				System.out.println("Reading data from the client/.....");
				// Open input and output streams
				in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				// received data from client
				String dataFromClient = in.readLine();
				while(dataFromClient != null){
									
					dataToClient = dataToClient + "//" + dataFromClient;
					System.out.println("DATA RECEIVED FROM CLIENT : " + dataFromClient);
				}
				
				//Sending the response back to the client
				OutputStream os = clientSocket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(os);

				out = new BufferedWriter(osw);
				out.write(dataToClient);
				
				System.out.println("DATA SENT TO CLIENT : " + dataToClient);
					

			} catch (IOException e) {
				System.out.println(e);
			}finally{
			
				try{
					serverSocket.close();
					clientSocket.close();
					in.close();
					out.close();
				}catch(IOException e){
					System.out.println(e);
				}
			
			}
	//	}

	}
}
