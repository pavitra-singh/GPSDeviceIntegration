package com.locate365.mixlab.dataPackets.server;

public class AlarmDataPacketResponse {

	private String startBit;
	private String packetLength;
	private String protocolNumber;
	private String serialNumber;
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
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
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
	
	
	
}
