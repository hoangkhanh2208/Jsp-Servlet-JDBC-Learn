package com.simplewebapp.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnUtils {
	public static Connection getMySQLConnection() throws SQLException {
		String hostName = "localhost";
	     String dbName = "simplewebapp";
	     String userName = "root";
	     String password = "Nhanphamtot";
	     return getMySQLConnection(hostName, dbName, userName, password);
	}
	
	public static Connection getMySQLConnection(String hostName, String dbName, String userName, String password) throws SQLException {
		String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
		Connection conn = DriverManager.getConnection(connectionURL, userName, password);
	     return conn;
	}
}
