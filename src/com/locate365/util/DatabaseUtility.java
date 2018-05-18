package com.locate365.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtility {

	private static final String PGSQL_DRIVER = "org.postgresql.Driver";
	private static final String PGSQL_HOSTNAME = "jdbc:postgresql://127.0.0.1:5432/locate365";
	private static final String PGSQL_USERNAME = "postgres";
	private static final String PGSQL_PASSWORD = "admin";
	
	public static Connection connectToPostgreSQL() {

		try {

			Class.forName(PGSQL_DRIVER);

		} catch (ClassNotFoundException e) {

			System.out.println("Where is your PostgreSQL JDBC Driver? " + "Include in your library path!");
			e.printStackTrace();

		}

		System.out.println("PostgreSQL JDBC Driver Registered!");

		Connection connection = null;

		try {

			connection = DriverManager.getConnection(PGSQL_HOSTNAME, 
					PGSQL_USERNAME, PGSQL_PASSWORD);

		} catch (SQLException e) {

			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();

		}

		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
		
		return connection;

	}
}
