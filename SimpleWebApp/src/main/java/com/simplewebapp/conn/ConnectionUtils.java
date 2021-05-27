package com.simplewebapp.conn;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionUtils {
	public static Connection getConnection() throws SQLException {
		return MySQLConnUtils.getMySQLConnection();
	}
	
	public static void closeQuietly(Connection conn) {
		try {	
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void rollBackQuietly(Connection conn) {
		try {
			conn.rollback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
