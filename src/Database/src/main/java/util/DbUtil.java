package util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

    public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    public static final String DB_URL = "jdbc:mysql://localhost:3306/jdbc_demo";
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "admin";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {

        Class.forName(DRIVER_NAME);

        return DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
    }
}
