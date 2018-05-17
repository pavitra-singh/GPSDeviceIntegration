package com.locate365.util;

public class Test {

	public static void main(String[] args) {
		
		//hexToBinaryStr("78 78 ");
		//parseLoginMessagePacket();
		parseLocationDataPacket();
		
	}

	public static String hexToBinaryStr(String hexStr){
		
		StringBuffer binaryStr = new StringBuffer();
		//hexStr = hexStr.replaceAll("\\s+","");
		hexStr = hexStr.trim();
		String[] hexArr = hexStr.split("\\s+");
		for(int i = 0; i < hexArr.length; i++){
			int hexInt = Integer.parseInt(hexArr[i],16);  
			binaryStr = binaryStr.append(Integer.toBinaryString(hexInt));
			if(i != (hexArr.length-1))
				binaryStr.append(" ");
		}
		
		System.out.println("binary string..." + binaryStr);
		return binaryStr.toString().trim();
	}
	
	public static void parseLoginMessagePacket(){
		String loginMsgPacketStr = "78 78 0D 01 01 23 45 67 89 01 23 45 00 01 8C DD 0D 0A";
		String startBit = loginMsgPacketStr.substring(0, 6);
		String packetLength = loginMsgPacketStr.substring(6, 9);
		String protocolNumber = loginMsgPacketStr.substring(9, 12);
		String terminalId = loginMsgPacketStr.substring(12,36);
		String infoSerialNumber = loginMsgPacketStr.substring(36, 42);
		String errorCheck = loginMsgPacketStr.substring(42, 48);
		String stopBit = loginMsgPacketStr.substring(48, 53);
		System.out.println(startBit+ "-packetLength-" +  packetLength + "-protocolNumber-" + protocolNumber + "-terminalId-" +  terminalId + 
				"-infoSerialNumber-" +  infoSerialNumber);
		System.out.println("errorCheck: " + errorCheck);
		System.out.println("stopBit: " + stopBit);
	}
	
	
	public static void parseLocationDataPacket(){
		
		String locationDataPacketStr = "78 78 1F 12 0B 08 1D 11 2E 10 CF 02 7A C7 EB 0C 46 58 49 00 14 8F 01 CC 00 28 7D 00 1F B8 00 03 80 81 0D 0A";
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

		
		System.out.println("startBit: " + startBit);
		System.out.println("Packet Length: " +  packetLength);
		System.out.println("Protocol Number: " +  protocolNumber);
		System.out.println("Date Time: " +  dateTime);
		System.out.println("Quantity of GPS Information Satellites: " +  quantityOfGPSInfoSatellite);
		System.out.println("Latiude: " + latitude);
		System.out.println("Longitude: " +  longitude);
		System.out.println("Speed: " + speed);
		System.out.println("Course Status: " + courseStatus);
		System.out.println("mcc: " +  mcc);
		System.out.println("mnc: " + mnc);
		System.out.println("lac: " +  lac);
		System.out.println("Cell Id: " + cellID);
		System.out.println("Serial Number: " + serialNumber);
		System.out.println("Error Check: "+ errorCheck);
		System.out.println("Stop Bit: " + stopBit);
		
	}
	
}
