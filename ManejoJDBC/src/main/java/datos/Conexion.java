/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author sermar
 */
public class Conexion {
    public static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    public static final String JDBC_USER ="root";
    public static final String JDBC_PWD="123456";
   
    
    public static Connection getConnection() throws SQLException{
      return DriverManager.getConnection  (JDBC_URL, JDBC_USER, JDBC_PWD);
   }
    
    public static void close (ResultSet rs) throws SQLException{
        rs.close();
    }
    
    public static void close (Statement stm) throws SQLException{
        stm.close();
    }
    
    public static void close (Connection conn) throws SQLException{
        conn.close();
    }
}
