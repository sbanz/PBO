/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_pboo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Reihan Al Sya'Ban
 */
 
public abstract class koneksi{
    protected Statement stm;
    public Connection con;
    public final void koneksi(){
        try {
            String url ="jdbc:mysql://localhost/uas_pbo";
            String user="root";
            String pass="";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,pass);
            stm = con.createStatement();        
        } catch (Exception e) {
            System.err.println("koneksi gagal" +e.getMessage());
        }
    }    
}
