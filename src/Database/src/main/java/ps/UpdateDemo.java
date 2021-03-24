package ps;

import util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDemo {

    public static final String SQL = "update hello set user_name=? where id = ?";

    public static void main(String[] args){

        try(
                PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
                ){

            ps.setString(1,"Hey");
            ps.setInt(2,2);
            ps.executeUpdate();

            System.out.println("Data Updated");

        } catch(SQLException | ClassNotFoundException E){
            E.printStackTrace();
        }

    }


}
