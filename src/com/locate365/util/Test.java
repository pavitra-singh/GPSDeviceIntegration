package com.locate365.util;

public class Test {

	public static void main(String[] args) {
		
		//hexToBinaryStr("78 78 ");
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
		
		
	}
	
}
