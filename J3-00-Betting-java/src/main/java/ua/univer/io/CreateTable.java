package ua.univer.io;

import java.sql.*;

public final class CreateTable {	
	
	public static void createTable(String str) {
		// TODO Auto-generated method stub		
		try ( Connection connection = PSQLConnector.getConnection();
			  Statement statement = connection.createStatement())
		{
			statement.execute(str);
		} 
		catch (SQLException e)
		{
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
		}
	}

	public static void fillLineItems(String... values) {
		// TODO Auto-generated method stub

		//String columns = generateString(values);
		try ( Connection connection = PSQLConnector.getConnection();
				PreparedStatement statement = connection.prepareStatement
						  ("INSERT INTO item(id, description) values(?, ?)" ))
		{
			int i = 0;
			for (int j = 0; j < values.length; j++) {
				statement.setInt(1, ++i);
				statement.setString(2, values[j]);
				statement.addBatch();
			}
			statement.executeBatch();
		} 
		catch (SQLException e)
		{
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
		}
	}
	
	
	
/*
	public static void fillLine(String tableName, String... values) {
		// TODO Auto-generated method stub

		String columns = generateString(values);
		try ( Connection connection = PSQLConnector.getConnection();
				PreparedStatement statement = connection.prepareStatement
						  ("INSERT INTO " + tableName + columns))
		{
			statement.;
		} 
		catch (SQLException e)
		{
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
		}
	}
	
	public static String generateString(String... values) {
		String cols="", vals="";
			for (int i = 0; i < values.length; i++) {
				if (i == values.length - 1) {
					cols += values[i];
					vals += "?";
				}
				else {
					cols += values[i]+", ";
					vals += "?, ";
				}
			}
		return "("+ cols + ") values(" + vals+ ")";
	}
	
	/*	statement.execute("CREATE TABLE invoice("
	+ "id integer PRIMARY KEY,"
    + "inv_number text,"
	+ "item_id integer,"
    + "quantity integer);");

	statement.execute("CREATE TABLE item("
			+ "id integer PRIMARY KEY,"
	        + "description text);"); 
	 */	
	
	
}
