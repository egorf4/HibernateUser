package jm.task.core.jdbc.util;
import java.sql.*;

public class Util {
private final static String DB_URL = "jdbc:mysql://localhost:3306/mydb_schema1";
private final static String DB_USER = "user";
private final static String DB_PASSWORD = "user";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);

            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (SQLException e) {
            System.err.println("Can't connect to database or load driver!");
            e.printStackTrace();
        }
        return conn;
    }
}
