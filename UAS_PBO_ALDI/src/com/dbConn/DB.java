package com.dbConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DB {
    public static Connection con = null;

    public static void loadConnection() {
        String url = "jdbc:mysql://localhost:3306/dbnebulamotor";
        String root = "root";
        String pass = "";

        try {
            con = DriverManager.getConnection(url, root, pass);

            if (con != null) {
                JOptionPane.showMessageDialog(null, "Database sudah terkoneksi");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database tidak dapat terkoneksi : " + e.getMessage());
        }
    }
}
