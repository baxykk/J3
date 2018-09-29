package ua.univer.io;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public final class PSQLConnector {
	private static final String driverName = "org.postgresql.Driver";
	private static final String db = "jdbc:postgresql://127.0.0.1:5432/test";
	private static final String user = "postgres";
	private static final String passw = "Esf123";
	private static ArrayList<Connection> pool = new ArrayList<>(10);

    public PSQLConnector() {
        loadDriver();
        createConnectionPool();
    }

    private static void loadDriver() {
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
		}
	}

    private void createConnectionPool(){
        try {
            for (int i = 0; i < 10; i++) {
                pool.add(DriverManager.getConnection(db, user, passw));
            }
        } catch (SQLException e) {}

    }

	public static synchronized Connection getConnection() {
        Connection c = pool.get(pool.size()-1);
        pool.remove(pool.size()-1);
        return c;
	}

    public static synchronized void closeConnection(Connection con) {
        pool.add(con);
    }

    public void exit() {
        if (pool.size() == 10)
            try {
                while (pool.size() > 0)
                    getConnection().close();
            }
            catch (java.sql.SQLException e){}
    }

    public static ArrayList<Connection> getPool() {
        return pool;
    }

}
