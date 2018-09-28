package ua.univer.io;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class PSQLConnector {
	static final String driverName = "org.postgresql.Driver";
	static final String db = "jdbc:postgresql://127.0.0.1:5432/test";
	static final String user = "postgres";
	static final String passw = "Esf123";	
	static Connection con = null;
	
	public static void loadDriver(String driver) {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Driver loaded");
	}
	
	public static void loadDriver() {
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Driver loaded");
	}
	
	public static void connect() {
		try {
			con = DriverManager.getConnection(db, user,	passw);
			System.out.println("Connected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		return con;
	}
	
	public static void closeConnection() {
		try {
			con.close();
			System.out.println("Driver loaded");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
