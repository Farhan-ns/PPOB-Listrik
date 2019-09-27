 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppob.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SMKN4
 */
public class DBConnection {
    private final static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private final static String DB_URL = "jdbc:mysql://localhost/db_ppob";
    private static Connection CONNECTION = null;
    
    public static Connection getConnection() {
        try {
            Class.forName(JDBC_DRIVER);
            
            if (CONNECTION == null) {
                CONNECTION = DriverManager.getConnection(DB_URL, "root", "");
            }
            
            return CONNECTION;
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
