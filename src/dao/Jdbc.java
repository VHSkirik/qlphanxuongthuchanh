
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author @VHSkirik
 */
public class Jdbc {
    
    public static Connection getConnection(){
        Connection c = null;
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlphongthuchanh","root","");
        } catch (SQLException e){
            e.printStackTrace();
        }
        return c;
    }
    
    public static void closeConnection(Connection c){
        if (c != null){
            try {
                c.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
