package com.locate365.mixlab.dataFetch;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.locate365.util.DatabaseUtility;
import com.locate365.util.Locate365QueryConstants;

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
		
		String sql = Locate365QueryConstants.INSERT_INTO_LOGIN_PACKET + "('" + startBit + "','" + packetLength + "','" + protocolNumber + "','" + terminalId + "','"
                + infoSerialNumber + "','" + errorCheck + "','" + stopBit + "','" + new java.sql.Timestamp(new java.util.Date().getTime()) +"')";
		
		exeStatus = saveInDatabaseAndReturnExecutionStatus(sql);
		
		return exeStatus;
	}
	
	
	public static int parseLocationDataPacketFromTerminalAndSaveInDatabase(String locationDataPacketStr){
		
		int exeStatus = 0;
		
		//locationDataPacketStr = "78 78 1F 12 0B 08 1D 11 2E 10 CF 02 7A C7 EB 0C 46 58 49 00 14 8F 01 CC 00 28 7D 00 1F B8 00 03 80 81 0D 0A";
		String loginPacketId = "2";
		String startBit = locationDataPacketStr.substring(0, 6);
		String packetLength = locationDataPacketStr.substring(6, 9);
		String protocolNumber = locationDataPacketStr.substring(9, 12);
		String dateTime = locationDataPacketStr.substring(12, 30);
		String quantityOfGPSInfoSatellite = locationDataPacketStr.substring(30, 33);
		String latitude = locationDataPacketStr.substring(33, 45);
		String longitude = locationDataPacketStr.substring(45, 57);
		String speed = locationDataPacketStr.substring(57, 60);
		String courseStatus = locationDataPacketStr.substring(60, 66);
		String mcc = locationDataPacketStr.substring(66, 72);
		String mnc = locationDataPacketStr.substring(72, 75);
		String lac = locationDataPacketStr.substring(75, 81);
		String cellID = locationDataPacketStr.substring(81, 90);
		String serialNumber = locationDataPacketStr.substring(90, 96);
		String errorCheck = locationDataPacketStr.substring(96, 102);
		String stopBit = locationDataPacketStr.substring(102, 107);
		
		String sql = Locate365QueryConstants.INSERT_INTO_LOCATION_DATA_PACKET + "('" + loginPacketId + "','" + startBit + "','" + packetLength + "','" + protocolNumber + "','" 
                + dateTime + "','" + quantityOfGPSInfoSatellite + "','" + latitude + "','" + longitude  + "','" + speed + "','" + courseStatus + "','" + mcc + "','" 
                + mnc + "','" + lac + "','" + cellID + "','" + serialNumber + "','" + errorCheck + "','" + stopBit + "')";;
		
		exeStatus = saveInDatabaseAndReturnExecutionStatus(sql);
		
		
		return exeStatus;
	}
	
	
	public static int saveInDatabaseAndReturnExecutionStatus(String sql){
		
		int exeStatus = 0;
		
		Connection connectionObj = DatabaseUtility.connectToPostgreSQL();
		if(connectionObj != null){
			
			//save into database
			Statement stmnt = null;
	        try {
				stmnt = connectionObj.createStatement();
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
