package com.locate365.mixlab.dataPackets.terminal;

public class LocationDataPacket {
	
	private String startBit;
	private String pacletLength;
	private String protocolNumber;
	private String dateTime;
	private String quantityOfGPSInformationSatellites;
	private String latitude;
	private String longitude;
	private String speed;
	private String couseStatus;
	private String mobileCountryCode;
	private String mobileNetworkCode;
	private String locationAreaCode;
	private String cellId;
	private String serialNumber;
	private String errorCheck;
	private String stopBit;
	
	
	public String getStartBit() {
		return startBit;
	}
	public void setStartBit(String startBit) {
		this.startBit = startBit;
	}
	public String getPacletLength() {
		return pacletLength;
	}
	public void setPacletLength(String pacletLength) {
		this.pacletLength = pacletLength;
	}
	public String getProtocolNumber() {
		return protocolNumber;
	}
	public void setProtocolNumber(String protocolNumber) {
		this.protocolNumber = protocolNumber;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public String getQuantityOfGPSInformationSatellites() {
		return quantityOfGPSInformationSatellites;
	}
	public void setQuantityOfGPSInformationSatellites(String quantityOfGPSInformationSatellites) {
		this.quantityOfGPSInformationSatellites = quantityOfGPSInformationSatellites;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public String getCouseStatus() {
		return couseStatus;
	}
	public void setCouseStatus(String couseStatus) {
		this.couseStatus = couseStatus;
	}
	public String getMobileCountryCode() {
		return mobileCountryCode;
	}
	public void setMobileCountryCode(String mobileCountryCode) {
		this.mobileCountryCode = mobileCountryCode;
	}
	public String getMobileNetworkCode() {
		return mobileNetworkCode;
	}
	public void setMobileNetworkCode(String mobileNetworkCode) {
		this.mobileNetworkCode = mobileNetworkCode;
	}
	public String getLocationAreaCode() {
		return locationAreaCode;
	}
	public void setLocationAreaCode(String locationAreaCode) {
		this.locationAreaCode = locationAreaCode;
	}
	public String getCellId() {
		return cellId;
	}
	public void setCellId(String cellId) {
		this.cellId = cellId;
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
		return "LocationDataPacket [startBit=" + startBit + ", pacletLength=" + pacletLength + ", protocolNumber="
				+ protocolNumber + ", dateTime=" + dateTime + ", quantityOfGPSInformationSatellites="
				+ quantityOfGPSInformationSatellites + ", latitude=" + latitude + ", longitude=" + longitude
				+ ", speed=" + speed + ", couseStatus=" + couseStatus + ", mobileCountryCode=" + mobileCountryCode
				+ ", mobileNetworkCode=" + mobileNetworkCode + ", locationAreaCode=" + locationAreaCode + ", cellId="
				+ cellId + ", serialNumber=" + serialNumber + ", errorCheck=" + errorCheck + ", stopBit=" + stopBit
				+ "]";
	}
	
	
	
	
}
