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
public class Nilai_Kuliah {
    private String npm;
    private String kode_kuliah;
    private int nilai;
    
    public String getNPM() {
        return npm;
    }
    public String getKode_kuliah() {
        return kode_kuliah;
    }
    public int getNilai() {
        return nilai;
    }
    public void setNPM(String npm) {
        this.npm = npm;
    }
    public void setKodeKuliah(String kode_kuliah) {
        this.kode_kuliah = kode_kuliah;
    }
    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
    
    public void insertNilai() {
        Koneksi kon = new Koneksi();
        System.out.print(this.kode_kuliah);
        String s = "insert into nilai_kuliah values ('" + this.npm + "', '"+this.kode_kuliah+"', '"+this.nilai+"')";
        kon.query(s);
    }
    public void updateNilai() {
        Koneksi kon = new Koneksi();
        String s = "update nilai_kuliah set kode_kul  = '"+this.kode_kuliah+"', nilai = '"+this.nilai+"' where npm = '"+this.npm+"'";
        kon.query(s);
    }
    public void deleteNilai() {
        Koneksi kon = new Koneksi();
        String s = "delete from nilai_kuliah where npm = '"+this.npm+"'";
        kon.query(s);
    }
    public ResultSet getNilai_K() {
        ResultSet r = null;
        Koneksi kon = new Koneksi();
        String s = "insert into nilai_kuliah values ('" + this.npm + "', '"+this.kode_kuliah+"', '"+this.nilai+"')";
        kon.query(s);
        return r;
    }
}
