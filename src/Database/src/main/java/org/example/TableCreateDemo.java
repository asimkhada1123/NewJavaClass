package org.example;

import util.DbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TableCreateDemo {

    public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    public static final String DB_URL = "jdbc:mysql://localhost:3306/jdbc_demo";
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "admin";
    public static final String SQL = "create table hello(id int not null auto_increment primary key, user_name varchar(45))";

    public static void main(String[] args) {

        try(
                Connection con = DbUtil.getConnection();
                Statement st = con.createStatement();
                ){

                st.executeUpdate(SQL);
                System.out.println("Table Created");

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
