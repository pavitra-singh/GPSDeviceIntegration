package com.locate365.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Locate365MultipleSocketServer{

	private ServerSocket serverSocket;
    private int port;
    //private boolean running = false;
    
    public Locate365MultipleSocketServer(int port) {
		super();
		this.port = port;
	}
    
    
    public void startServer(){
		
    	try{
    	
    		// server is listening on port 
    		serverSocket = new ServerSocket(port);
		
    		// running infinite loop for getting client request
    		while (true) {			
			
				// socket object to receive incoming client requests
    			Socket clientSocket = serverSocket.accept();
				
				System.out.println("A new client is connected : " + clientSocket);
				
				// obtaining input and out streams
				BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));;
				PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
				
				System.out.println("Assigning new thread for this client");

				// create a new thread object
				Thread thread = new RequestHandler(clientSocket, in, out);

				// Invoking the start() method
				thread.start();
				System.out.println("RunnableJob is being run by " + thread.getName() + " (" + thread.getId() + ")");
				
			}
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}
    
    public static void main( String[] args ){
       
        int port = 8070;
        System.out.println( "Start server on port: " + port );

        Locate365MultipleSocketServer server = new Locate365MultipleSocketServer( port );
        server.startServer();

        /*// Automatically shutdown in 1 minute
        try
        {
            Thread.sleep( 60000 );
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }

        server.stopServer();*/
    }
}
