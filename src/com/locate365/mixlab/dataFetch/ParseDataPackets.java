package com.locate365.mixlab.dataFetch;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.locate365.util.JDBCUtil;

public class ParseDataPackets {

	
	public static int parseLoginMessagePacketFromTerminalAndSaveInDatabase(String loginMessagePacketStr){
		
		int exeStatus = 0;
		String startBit = loginMessagePacketStr.substring(0, 6).trim();
		String packetLength = loginMessagePacketStr.substring(6, 9).trim();
		String protocolNumber = loginMessagePacketStr.substring(9, 12).trim();
		String terminalId = loginMessagePacketStr.substring(12,36).trim();
		String infoSerialNumber = loginMessagePacketStr.substring(36, 42).trim();
		String errorCheck = loginMessagePacketStr.substring(42, 48).trim();
		String stopBit = loginMessagePacketStr.substring(48, 53).trim();
		
		
		Connection connectionObj = JDBCUtil.connectToPostgreSQL();
		if(connectionObj != null){
			
			//save into database
			Statement stmnt = null;
	        try {
				stmnt = connectionObj.createStatement();
				String sql = "INSERT INTO loginPacket (start_bit ,packet_length ,protocol_number ,terminal_id ,information_serial_number , error_check ,stop_bit, created_on ) "
		                + "VALUES " + "('" + startBit + "','" + packetLength + "','" + protocolNumber + "','" + terminalId + "','"
		                + infoSerialNumber + "','" + errorCheck + "','" + stopBit + "','" + new java.sql.Timestamp(new java.util.Date().getTime()) +"')";
				System.out.println("SQL Query : " +  sql);
		        exeStatus = stmnt.executeUpdate(sql);
		        System.out.println("Statement execution statement : " +  exeStatus);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return exeStatus;
	}
	
}
