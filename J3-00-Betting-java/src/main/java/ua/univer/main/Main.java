package ua.univer.main;

import ua.univer.io.PSQLConnector;

import java.sql.Connection;

public class Main {

    public static void main(String[] args){

        PSQLConnector driver = new PSQLConnector();
        Connection[] pool = new Connection[10];
        for (int i = 0; i < pool.length; i++) {
            pool[i] = driver.getConnection();
        }
        System.out.println("xxx");
        for (int i = 0; i < pool.length; i++) {
            driver.closeConnection(pool[i]);
        }
	//	CreateTable.fillLineItems("Apple", "Orange", "Banana");
		driver.exit();
    }
}
