package ps;

import util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectDemo {
    public static final String SQL = "select * from hello where user_name = ?";

    public static void main(String[] args){

        try(
                PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
        ){
            ps.setString(1,"Messi");

            ResultSet rs = ps.executeQuery();

            while (rs.next()){

                System.out.println("====================");
                System.out.println("Id is: " + rs.getInt("id"));
                System.out.println("User Name is: " + rs.getString("user_name"));
            }

        } catch(SQLException | ClassNotFoundException E){
            E.printStackTrace();
        }

    }
}
