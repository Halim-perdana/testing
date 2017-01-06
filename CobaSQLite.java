/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptik;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Mr.0
 */
public class CobaSQLite {
 
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:bukualamat.db");
        Statement stat = conn.createStatement();
 
        ResultSet rs = stat.executeQuery("select * from alamat;");
        while (rs.next()) {
            System.out.println("Nama = " + rs.getString("nama"));
            System.out.println("Alamat = " + rs.getString("alamat"));
            System.out.println("No Telepon = " + rs.getString("telp"));
            System.out.println("Email = " + rs.getString("email"));
        }
        rs.close();
        conn.close();
    }
}
