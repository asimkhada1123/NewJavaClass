package org.example;

import util.DbUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDemo {

    public static final String SQL = "select * from user_tbl";

    public static void main(String[] args) {

        try(
                Connection con = DbUtil.getConnection();
                Statement st = con.createStatement();
        ){

            ResultSet rs = st.executeQuery(SQL);
                    //rs = st.executeUpdate(SQL);

            while(rs.next()){

                System.out.println("================");
                System.out.println("Id is: "+ rs.getInt("id"));
                System.out.println("Password is " + rs.getString("user_name"));
                System.out.println(("=========="));
            }
           // System.out.println("Data Updated");

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
