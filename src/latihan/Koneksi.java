/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Deddy
 */
public class Koneksi {
    Connection koneksi;
    
    public Connection con(){
        if (koneksi == null) {
            String database = "praktikum_db";
            String username= "root";
            String password= "";
            try{
                koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/"+ database, username, password);
               
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        return koneksi;   
    }
}
