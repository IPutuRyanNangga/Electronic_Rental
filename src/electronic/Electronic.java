/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package electronic;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane; 
/**
 *
 * @author Administrator
 */
public class Electronic {
    // Metode untuk mendapatkan koneksi ke database
    public static Connection getkoneksi() {
        Connection koneksi = null;
        try {
            String url = "jdbc:mysql://localhost:3306/login"; // Nama database Anda
            String username = "root"; // Username MySQL
            String password = ""; // Password MySQL
            Class.forName("com.mysql.cj.jdbc.Driver"); // Driver terbaru
            koneksi = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error koneksi: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver tidak ditemukan: " + e.getMessage());
        }
        return koneksi;
    }

    public static void main(String[] args) {
        // Memulai aplikasi
        new Login().setVisible(true);
    }
}

