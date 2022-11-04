
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DbConnection {
     public static void main(String[] args) {
        System.out.println(DbConnection.getDB());
    }
   public static Connection getDB()
    {
        java.sql.Connection conn=null;
        String url="jdbc:mysql://localhost:3306/ordersystem";
        String user="root";
        String password="1234";      
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(url, user, password);
            System.out.println("connection");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("nodriver");
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("unconnection");
        }
        return conn;
    }
}