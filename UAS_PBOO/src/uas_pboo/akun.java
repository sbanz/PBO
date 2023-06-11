package uas_pboo;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class akun extends koneksi { 
   akun(String Username,String Password,JFrame frame){
       super.koneksi();
    try {
        String queryString = String.join("","SELECT * FROM akun where username= '",Username, "' and Password= '",Password,"'");
        ResultSet results = super.stm.executeQuery(queryString);
        if(!results.next()) {
            JOptionPane.showMessageDialog(new JFrame(),"Username/Password Anda Salah","Login",  JOptionPane.WARNING_MESSAGE);
        }
        else{
           new menu().setVisible(true);
           frame.dispose();
           results.close();
        }
        super.con.close();
    } catch (SQLException sql) {
        System.out.println(sql);
    }}
}