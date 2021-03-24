package org.example;

import util.DbUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDemo {
    public static final String SQL = "delete from hello where id = 1";

    public static void main(String[] args){

        try(
            Statement st = DbUtil.getConnection().createStatement();
        ){
            st.executeUpdate(SQL);
            System.out.println("Deleted");
        } catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }

    }

}
