package com.locate365.mixlab.dataPackets.terminal;

public class HeartbeatDataPacket {

	private String startBit;
	private String packetLength;
	private String protocolNumber;
	private String terminalInformationContent;
	private String voltageLevel;
	private String gsmSignalStrength;
	private String alarmLanguage;
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
	public String getTerminalInformationContent() {
		return terminalInformationContent;
	}
	public void setTerminalInformationContent(String terminalInformationContent) {
		this.terminalInformationContent = terminalInformationContent;
	}
	public String getVoltageLevel() {
		return voltageLevel;
	}
	public void setVoltageLevel(String voltageLevel) {
		this.voltageLevel = voltageLevel;
	}
	public String getGsmSignalStrength() {
		return gsmSignalStrength;
	}
	public void setGsmSignalStrength(String gsmSignalStrength) {
		this.gsmSignalStrength = gsmSignalStrength;
	}
	public String getAlarmLanguage() {
		return alarmLanguage;
	}
	public void setAlarmLanguage(String alarmLanguage) {
		this.alarmLanguage = alarmLanguage;
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
	
	@Override
	public String toString() {
		return "AlarmDataPacket [startBit=" + startBit + ", packetLength=" + packetLength + ", protocolNumber="
				+ protocolNumber + ", terminalInformationContent=" + terminalInformationContent + ", voltageLevel="
				+ voltageLevel + ", gsmSignalStrength=" + gsmSignalStrength + ", alarmLanguage=" + alarmLanguage
				+ ", serialNumber=" + serialNumber + ", errorCheck=" + errorCheck + ", stopBit=" + stopBit + "]";
	}
	
	
}
