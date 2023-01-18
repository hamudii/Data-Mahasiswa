/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uas_mahasiswa;
import java.sql.ResultSet;
/**
 *
 * @author DELL
 */
public class Kuliah {
    private String kode_kul;
    private String nama_kul;
    private String sks;
    private String semester;
    
     public String getKode_kul() {
        return kode_kul;
    }
    public String getNama_Kul() {
        return nama_kul;
    }
    public String getSks() {
        return sks;
    }
    public String getSemester() {
        return semester;
    }
    public void setKode_Kul(String kode_kul) {
        this.kode_kul = kode_kul;
    }
    public void setNama_Kul(String nama_kul) {
        this.nama_kul = nama_kul;
    }
    public void setSks(String sks) {
        this.sks = sks;
    }
    public void setSemester(String semester) {
        this.semester = semester;
    }
    
    public void insertKuliah() {
        Koneksi kon = new Koneksi();
        String s = "insert into kuliah values ('" + this.kode_kul + "', '"+this.nama_kul+"', '"+this.sks+"', '"+this.semester+"')";
        kon.query(s);
    }
    public void updateKuliah() {
        Koneksi kon = new Koneksi();
        String s = "update kuliah set nama_kul  = '"+this.nama_kul+"', sks = '"+this.sks+"', semester = '"+this.semester+"' where kode_kul = '"+this.kode_kul+"'";
        kon.query(s);
    }
    public void deleteKuliah() {
        Koneksi kon = new Koneksi();
        String s = "delete from kuliah where kode_kul = '"+this.kode_kul+"'";
        kon.query(s);
    }
    public ResultSet getKuliah() {
        ResultSet r = null;
        Koneksi kon = new Koneksi();
        String s = "insert into kuliah values ('" + this.kode_kul + "', '"+this.nama_kul+"', '"+this.sks+"', '"+this.semester+")";
        kon.query(s);
        return r;
    }
    
}
