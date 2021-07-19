/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author fahrul
 */
public class koneksi {
     private static Connection conn;
    public static Connection getKoneksi(){
        String host = "jdbc:mysql://localhost/donation", 
                user = "root",
                pass = "Fahrul2016";
        try {
            conn = (Connection) DriverManager.getConnection(host, user,  pass);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "database error");
        }
        return conn;
    }
}
