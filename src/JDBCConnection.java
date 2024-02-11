import java.sql.*;

public class JDBCConnection {



    public static void main (String args[]) throws ClassNotFoundException, SQLException {



        Class.forName("oracle.jdbcdriver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@ DESCRIPTION=(ADDRESS=(PROTOCOL=tcp)(HOST=ofss-mum-2481.snbomprshared1.gbucdsint02bom.oraclevcn.com) (PORT=1521))(CONNECT_DATA= (SERVICE_NAME=fccmdb)))","ECM_ATOM807", "password");
        Statement st  = con.createStatement();
        ResultSet rs = st.executeQuery("select * from fcc_cust");
        while(rs.next()){

            rs.getString(0);
//            rs.getInt();

        }



    }





}
