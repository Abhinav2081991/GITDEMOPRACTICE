import java.sql.*;
import java.util.Arrays;
import java.util.Iterator;

public class StringReversePractice {

    public static void main(String[] args) {

        String input = "Abhinav Tiwari";
        String[] strArray = input.split("");
        String output = "";
        for(int i = strArray.length-1; i>=0;i--){

            output = output+strArray[i];
        }
        System.out.println(output);
    }


    public static void connectToDb() throws ClassNotFoundException, SQLException {



        Class.forName("");
        Connection con  = DriverManager.getConnection("");
        Statement stmt = con.createStatement();
        PreparedStatement p = con.prepareStatement("select * from tablename where a=?, b=?, c=?");

                p.setString(1, "Test");
        p.setString(2, "Test");
        p.setString(3, "Test");


//        ResultSet r =  p.executeQuery();
//        while(r)

//        ResultSet result  = stmt.executeQuery("");
//
//        stmt.e
//
//        while(result.next()){
//            result.getString("")
//        }







    }


}
