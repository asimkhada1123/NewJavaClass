package ps;

import util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDemo {

    public static final String SQL = "delete from hello where id = ?";

    public static void main(String[] args){

        try(
                PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
        ){

            ps.setInt(1, 2);
           // ps.setInt(2,2);
            ps.executeUpdate();

            System.out.println("Data Deleted");

        } catch(SQLException | ClassNotFoundException E){
            E.printStackTrace();
        }

    }
}
