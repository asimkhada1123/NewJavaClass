package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class DbCreateDemo
{

    public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";

    public static final String DB_URL = "jdbc:mysql://localhost:3306/";

    public static final String USER_NAME = "root";

    public static final String PASSWORD = "admin";

    public static final String SQL = "create database jdbc_demo";

    public static void main( String[] args ) throws SQLException {
        Connection con = null;

        Statement st = null;

        try{

            Class.forName(DRIVER_NAME);

            con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);

            st = con.createStatement();

            st.executeUpdate(SQL);

            System.out.println("DB Created");


        } catch (ClassNotFoundException | SQLException E){
            E.printStackTrace();
        } finally {

            try{
                con.close();
                st.close();
            }catch (SQLException E){
                E.printStackTrace();
            }

        }
    }
}
