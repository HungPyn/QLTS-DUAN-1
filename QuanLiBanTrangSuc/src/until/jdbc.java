/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package until;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbc {

    public static Connection getConnection() {
        Connection c = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost;encrypt=true;trustServerCertificate=true;databaseName=QuanLyBanHang;user=sa;password=1q2w3e4r5t";
            c = DriverManager.getConnection(url);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return c;
    }
    ;
    public static void closeConnection(Connection c) {
        try {
            if (c != null) {
                c.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    ;
    
    public static void main(String[] args) throws Exception {
        Connection con = getConnection();
        DatabaseMetaData dbmt = con.getMetaData();
        System.out.println(dbmt.getDriverName());
        System.out.println(dbmt.getDatabaseProductName());
        System.out.println(dbmt.getDatabaseProductVersion());
    }
}
