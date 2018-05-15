package com.locate365.mixlab.dataPackets.server;

public class LoginMessagePacketResponse {
	
	private String startBit;
	private String packetLength;
	private String protocolNumber;
	private String informationSerialNumber;
	private String errorCheck;
	private String stopBit;
	
	public String getStartBit() {
		return startBit;
	}
	public void setStartBit(String startBit) {
		this.startBit = startBit;
	}
	public String getPacketLength() {
		return packetLength;
	}
	public void setPacketLength(String packetLength) {
		this.packetLength = packetLength;
	}
	public String getProtocolNumber() {
		return protocolNumber;
	}
	public void setProtocolNumber(String protocolNumber) {
		this.protocolNumber = protocolNumber;
	}
	public String getInformationSerialNumber() {
		return informationSerialNumber;
	}
	public void setInformationSerialNumber(String informationSerialNumber) {
		this.informationSerialNumber = informationSerialNumber;
	}
	public String getErrorCheck() {
		return errorCheck;
	}
	public void setErrorCheck(String errorCheck) {
		this.errorCheck = errorCheck;
	}
	public String getStopBit() {
		return stopBit;
	}
	public void setStopBit(String stopBit) {
		this.stopBit = stopBit;
	}
	@Override
	public String toString() {
		return "LoginMessagePacketResponse [startBit=" + startBit + ", packetLength=" + packetLength
				+ ", protocolNumber=" + protocolNumber + ", informationSerialNumber=" + informationSerialNumber
				+ ", errorCheck=" + errorCheck + ", stopBit=" + stopBit + "]";
	}
	
	
}
