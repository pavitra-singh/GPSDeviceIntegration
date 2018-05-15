-- Database: locate365

-- DROP DATABASE locate365;

CREATE DATABASE locate365
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'English_India.1252'
    LC_CTYPE = 'English_India.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;


CREATE TABLE loginPacket(
 	loginPacket_id serial PRIMARY KEY,
 	start_bit VARCHAR (50) NOT NULL,
	packet_length VARCHAR (50) NOT NULL,
	protocol_number VARCHAR (50) NOT NULL,
	terminal_id VARCHAR (50) NOT NULL,
	information_serial_number VARCHAR (50) NOT NULL,
	error_check VARCHAR (50) NOT NULL,
	stop_bit VARCHAR (50) NOT NULL,
 created_on TIMESTAMP NOT NULL
);