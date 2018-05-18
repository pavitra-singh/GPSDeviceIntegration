package com.locate365.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

import com.locate365.mixlab.dataFetch.ParseDataPackets;

public class RequestHandler extends Thread{

	private Socket socket;
	BufferedReader in = null;
	PrintWriter out = null;
	
    public RequestHandler(Socket socket, BufferedReader in, PrintWriter out){
        this.socket = socket;
        this.in = in;
        this.out =  out;
    }
   
    @Override
    public void run(){
    	
    	while(true){

            try{
                
            	System.out.println( "Received a connection" );

                String line = in.readLine();
            	System.out.println("Message from Client" + this.getName() + " : " + line);
                
            	if(line.contains("EB")){

            		ParseDataPackets.parseLocationDataPacketFromTerminalAndSaveInDatabase(line);

            		break;
            	}
            	String messageToClient = "78 78 0D 01 00 01 8C DD 0D 0A";
            	out.println(messageToClient);
            	out.flush();
                
            }
            catch( Exception e )
            {
                e.printStackTrace();
            }
        
    	}
    	
    }
    
    public void close(){
    	
    	try {
    		out.close();
			in.close();
			socket.close();
			System.out.println("Connection closed");
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    }
}
