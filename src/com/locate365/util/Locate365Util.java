package com.locate365.util;

public class Locate365Util {

	
	/**
	 * Method to convert Hexadecimal String
	 * to Binary String
	 * @param hexadecimal String
	 * @return binary String
	 */
	public static String hexToBinaryStr(String hexStr){
		
		String binaryStr = "";
		int hexInt = Integer.parseInt(hexStr,16);  
		binaryStr = Integer.toBinaryString(hexInt);
		System.out.println("binary string..." + binaryStr);
		return binaryStr;
	}
	
	
	
}
