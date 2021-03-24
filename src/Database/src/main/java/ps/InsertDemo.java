package ps;

import util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

        public static final String SQL = "insert into hello(user_name)values(?)";

        public static void main(String[] args) {
            try (
                    PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
            ){

                ps.setString(1, "Messi");
                //ps.setString(2, "Messi");
                ps.executeUpdate();
                System.out.println("Added Values in the table");
            } catch(SQLException | ClassNotFoundException E){
                E.printStackTrace();
            }


        }
}
