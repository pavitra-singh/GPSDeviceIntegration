package com.locate365.mixlab.dataFetch;

import java.net.ServerSocket;
import java.net.Socket;

public class ConnectToTerminal {
	
	public void connection(){
		
		String terminalIPAdress = null;
		int terminalPortNumber = 0;
		
		try{
			ServerSocket serverSocket = new ServerSocket (terminalPortNumber);
			 while(true){
		            System.out.println("Waiting for client request");
		            //creating socket and waiting for client connection
		            Socket socket = serverSocket.accept();
			 }
		}catch(Exception e){			
			e.printStackTrace();		
		}
		
	}
	
}
