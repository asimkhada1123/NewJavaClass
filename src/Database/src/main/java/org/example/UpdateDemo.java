package org.example;

import util.DbUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {

    public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    public static final String DB_URL = "jdbc:mysql://localhost:3306/jdbc_demo";
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "admin";
    //public static final String SQL = "insert into hello " + "VALUES(1,'Hi')";
    public static final String sql = "update hello set user_name = 'Anuj' where id = 1";

  public static void main(String[] args){

      try(
              Connection con = DbUtil.getConnection();
              Statement st = con.createStatement();
      ){
            st.executeUpdate(sql);

            System.out.println("Success");
      } catch (SQLException throwables) {
          throwables.printStackTrace();
      } catch (ClassNotFoundException e) {
          e.printStackTrace();
      }
  }




}
