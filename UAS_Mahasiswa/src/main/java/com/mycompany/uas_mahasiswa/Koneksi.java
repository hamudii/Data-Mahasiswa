package com.mycompany.uas_mahasiswa;
import java.sql.*;
import javax.swing.JOptionPane;

public class Koneksi {
    private String dbuser = "root";
    private String dbpasswd = "";
    private Statement stmt = null;
    private Connection con = null;
    private ResultSet rs = null;
    
    public Koneksi(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
    } catch(Exception e){
        JOptionPane.showMessageDialog(null, ""+e.getMessage(), "JDBC Driver Error", JOptionPane.WARNING_MESSAGE); 
    } 
    try{
        con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/uas_akademik", dbuser, dbpasswd);
        stmt = (Statement) con.createStatement(); } catch(Exception e){
        JOptionPane.showMessageDialog(null, ""+e.getMessage(), "Connection Error", JOptionPane.WARNING_MESSAGE); 
        }
   }
   public ResultSet getData(String SQLString){
       try{ 
           rs = stmt.executeQuery(SQLString);
        } 
       catch(Exception e){ 
           JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(),"Communication Error", JOptionPane.WARNING_MESSAGE); 
       }
       return rs;
   }
   public void query(String SQLString){
       try{ 
           stmt.executeUpdate(SQLString); 
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error: "+e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE); 
       } 
   }

}
