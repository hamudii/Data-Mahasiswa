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
public class Mahasiswa {
    private String npm;
    private String nama_mhs;
    private String jenis_kelamin;
    private String tgl_lahir;
    private int no_telp;
    private String alamat;
    
    public String getNPM() {
        return npm;
    }
    public String getNama() {
        return nama_mhs;
    }
    public String getJK() {
        return jenis_kelamin;
    }
    public String getTglLahir() {
        return tgl_lahir;
    }
    public int getNoTelp() {
        return no_telp;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setNPM(String npm) {
        this.npm = npm;
    }
    public void setNama(String nama) {
        this.nama_mhs = nama;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public void setJK(String jk) {
        this.jenis_kelamin = jk;
    }
    public void setTglLahir(String tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }
    public void setNoTelp(int no_telp) {
        this.no_telp = no_telp;
    }
    public void insertMahasiswa() {
        Koneksi kon = new Koneksi();
        String s = "insert into mahasiswa values ('" + this.npm + "', '"+this.nama_mhs+"', '"+this.jenis_kelamin+"', '"+this.tgl_lahir+"', '"+this.no_telp+"', '"+this.alamat+"')";
        kon.query(s);
    }
    public void updateMahasiswa() {
        Koneksi kon = new Koneksi();
        String s = "update mahasiswa set nama_mhs  = '"+this.nama_mhs+"', jenis_kelamin = '"+this.jenis_kelamin+"', alamat = '"+
                this.alamat+"', tgl_lahir ='"+this.tgl_lahir+"', no_telp = '"+
                this.no_telp+"' where npm = '"+this.npm+"'";
        kon.query(s);
    }
    public void deleteMahasiswa() {
        Koneksi kon = new Koneksi();
        String s = "delete from mahasiswa where npm = '"+this.npm+"'";
        kon.query(s);
    }
    public ResultSet getMahasiswa() {
        ResultSet r = null;
        Koneksi kon = new Koneksi();
        String s = "insert into mahasiswa values ('" + this.npm + "', '"+this.nama_mhs+"', '"+this.jenis_kelamin+"', '"+this.tgl_lahir+"', '"+this.no_telp+"', '"+this.alamat+")";
        kon.query(s);
        return r;
    }
}
