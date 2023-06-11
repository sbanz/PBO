
package uas_pboo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class utility extends koneksi{
    private ResultSet rs;
    public utility(){
    super.koneksi();}
    public ResultSet utility(String Items, String query){
        try {rs = super.stm.executeQuery(query);
            return rs;
        }catch (SQLException sql) {     
            System.out.println(sql);}
            return null;}
    
    public void populateTable(JTable table, String query) {
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        dtm.setRowCount(0);
        rs= utility("water", query);
        DefaultTableModel tbmodel = (DefaultTableModel) table.getModel();
        try {
            while (rs.next()) {
                ArrayList<String> db = new ArrayList<String>();
                for (int col = 0; col < tbmodel.getColumnCount(); col++) {
                    db.add(rs.getString(tbmodel.getColumnName(col)));
                }
                tbmodel.addRow(db.toArray());
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void add_jadwal(String[] stuff){
       try {
           super.stm.executeUpdate("Insert into jadwal (MatKul,Dosen,Ruangan,Waktu,Catatan) values ('"+stuff[0]+"','"+stuff[1]+"','"+stuff[2]+"','"+stuff[3]+"','"+stuff[4]+"')");
    }catch (SQLException sql) {     
        JOptionPane.showMessageDialog(new JFrame(), "Jadwal gagal menambah", "ERROR INPUT", JOptionPane.WARNING_MESSAGE);}}
    
    public void edit_jadwal(String[] stuff){
       try {
           JOptionPane.showMessageDialog(new JFrame(), stuff, "ERROR INPUT", JOptionPane.WARNING_MESSAGE);
           super.stm.executeUpdate("Update jadwal set Dosen= '"+stuff[1]+"',Ruangan='"+stuff[2]+"',Waktu='"+stuff[3]+"',Catatan='"+stuff[4]+"' where MatKul='"+stuff[0]+"'");
    }catch (SQLException sql) {     
        JOptionPane.showMessageDialog(new JFrame(), "Jadwal gagal diubah", "ERROR INPUT", JOptionPane.WARNING_MESSAGE);}}
    
    public void delete_jadwal(String[] stuff){
       try {
           super.stm.executeUpdate("Delete from jadwal where MatKul= '"+stuff[0]+"'");
    }catch (SQLException sql) {     
           System.out.println(sql);}}
}
