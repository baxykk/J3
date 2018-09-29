package ua.univer.test;

import ua.univer.io.CreateTable;
import ua.univer.io.PSQLConnector;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MainTest {

    public static void main(String[] args){

        PSQLConnector driver = new PSQLConnector();
        ArrayList<Connection> c = PSQLConnector.getPool();
        for (Connection con : c) System.out.println(con.toString());
        System.out.println();
        Connection c1 = PSQLConnector.getConnection();
        System.out.println(c1);
        Connection c2 = PSQLConnector.getConnection();
        System.out.println(c2);
        System.out.println();
        for (Connection con : c) System.out.println(con.toString());
        System.out.println();
        PSQLConnector.closeConnection(c1);
        PSQLConnector.closeConnection(c2);
        for (Connection con : c) System.out.println(con.toString());
        System.out.println();
        driver.exit();
        System.out.println(" - ");
        for (Connection con : c) System.out.println(con.toString());

    }

}
