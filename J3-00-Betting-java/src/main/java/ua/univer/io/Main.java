package ua.univer.io;

import java.sql.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PSQLConnector.loadDriver();
		PSQLConnector.connect();
		CreateTable.fillLineItems("Apple", "Orange", "Banana");		
		PSQLConnector.closeConnection();		
	}

	
	
	
	/*	statement.execute("CREATE TABLE invoice("
	+ "id integer PRIMARY KEY,"
    + "inv_number text,"
	+ "item_id integer,"
    + "quantity integer);"); 

statement.execute("INSERT INTO invoice(id, inv_number, item_id, quantity)"
+ " VALUES(1, 001, 1, 2),"
+ 		 "(2, 002, 1, 4),"
+ 		 "(3, 002, 2, 1),"
+ 		 "(4, 003, 3, 4),"
+ 		 "(5, 004, 2, 3),"
+ 		 "(6, 004, 3, 10);"); 

statement.execute("CREATE TABLE item("
    + "id integer PRIMARY KEY,"
    + "description text);"); 
	
	*/
	
	/*
	  ResultSet rs = statement.executeQuery("SELECT * FROM invoice");
			while (rs.next()) {
				System.out.println(rs.getString("inv_number") + " : " + rs.getInt("item_id") + " : " + rs.getInt("quantity"));
	 */
	
}
