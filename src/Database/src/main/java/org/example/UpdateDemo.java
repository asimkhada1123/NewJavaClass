package org.example;

import util.DbUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {
    public static final String SQL = "update user_tbl set user_name = 'Hello' where id = 1";

    public static void main(String[] args) {

        try(
                Connection con = DbUtil.getConnection();
                Statement st = con.createStatement();
        ){

            st.executeUpdate(SQL);
            System.out.println("Data Updated");

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
