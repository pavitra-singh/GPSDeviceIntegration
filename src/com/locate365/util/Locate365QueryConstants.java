package com.locate365.util;

public class Locate365QueryConstants {

	
	public static String INSERT_INTO_LOGIN_PACKET = "INSERT INTO loginPacket (start_bit ,packet_length ,protocol_number ,terminal_id ,"
			+ "information_serial_number , error_check ,stop_bit, created_on ) VALUES ";
	
	public static String INSERT_INTO_LOCATION_DATA_PACKET = "INSERT INTO location_data_packet (loginpacket_id, start_bit ,packet_length ,protocol_number ,date_time ,"
			+ "quantity_of_gps_information_satellites, latitude, longitude, speed, course_status, mcc, mnc, lac, cell_id , serial_number, "
			+ "error_check ,stop_bit ) VALUES ";
	
}
