/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penggajian;
import java.util.ArrayList;
import javax.swing.JOptionPane; 
/**
 *
 * @author nafis
 */
public class karyawan { //private artinya gaboleh dikenalin sama objek lain.
    private String nip, nama, telp, golongan, statusNikah, lamaKerja;
    
    private ArrayList<String> dataNip; //karena membuat di class jadi ini dulu (dipisah ke dalam class)
    private ArrayList<String> dataNama;
    private ArrayList<String> dataTelp;
    private ArrayList<String> dataGolongan;
    private ArrayList<String> dataStatusNikah;
    private ArrayList<String> dataLamaKerja;
    
    public karyawan(){ //ini adalah constructor.
        dataNip = new ArrayList<>(); //ini array
        dataNama = new ArrayList<>();
        dataTelp = new ArrayList<>();
        dataGolongan = new ArrayList<>();
        dataStatusNikah = new ArrayList<>();
        dataLamaKerja = new ArrayList<>();
    } 
        
    public karyawan(String nip, String nama, 
            String telp, String golongan, 
            String statusNikah, String lamaKerja){
        this.nip = nip;
        this.nama = nama;
        this.telp = telp;
        this.golongan = golongan;
        this.statusNikah = statusNikah;
        this.lamaKerja = lamaKerja;
        
    }
    
    //array itu dimulai dari nol
    //20 Mei 2026
    public int getIndexData(String data){
        int index = -1; //inisialisasi -1 supaya ada datanya bukan 0, karena kalo 0 datanya ada
        index = this.dataNip.indexOf(data); //saat ingin mengetahui sesuai nip saja
        if(index <0){
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan"); //apabila data kurang dari nol maka muncul data tdk ditemukan
        } else {
            System.out.println(index);
        }
        return index;
    } 
    
   public void cariDataKaryawan(String nip){
       int i = getIndexData(nip);
       String nama = this.dataNama.get(i);
       String telp = this.dataTelp.get(i);
       String golongan = this.dataGolongan.get(i);
       String statusNikah = this.dataStatusNikah.get(i);
       String lamaKerja = this.dataLamaKerja.get(i);
       String isi = "nip :" + nip + "\n" + "nama :" + nama + "\n" + "telp :" + telp + "\n" + "golongan :" + golongan + "\n" +
               "statusNikah :" + statusNikah + "\n" + "LamaKerja :" + lamaKerja; 
       JOptionPane.showMessageDialog(null, isi);
   } 
    
    public void inputNip(String nip) {
        this.dataNip.add(nip);
    }
    
    public void inputNama(String nama) {
        this.dataNama.add(nama);
    }    
    
    public void inputTelp(String telp) {
        this.dataTelp.add(telp);
    }
    
    public void inputGolongan(String golongan) {
        this.dataGolongan.add(golongan);
    }
    
    public void inputStatusNikah(String statusNikah) {
        this.dataStatusNikah.add(statusNikah);
    }
    
    public void inputLamaKerja(String lamaKerja) {
        this.dataLamaKerja.add(lamaKerja);
    }
    
    public ArrayList<String> arrayNip(){ //mengembalikan data array
        return this.dataNip;
    }
    public ArrayList<String> arrayNama(){
        return this.dataNama;
    }
    public ArrayList<String> arrayTelp(){
        return this.dataTelp;
    }
    public ArrayList<String> arrayGolongan(){
        return this.dataGolongan;
    }
    public ArrayList<String> arrayStatusNikah(){
        return this.dataStatusNikah;
    }
    public ArrayList<String> arrayLamaKerja(){
        return this.dataLamaKerja;
    }
    
    //void hanya menjalankan tugas tidak bisa mengembalikan data
    public void setNIP(String nip) {
        this.nip = nip;
        try {
            if (nip.equals(null)) {
                JOptionPane.showMessageDialog(null, "nip belum diisi");
            }else {
                this.nip = nip;
            }
        } catch (Exception e) {    //semua jenis kesalahan ditampung disini
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
     
    public void setNama(String nama) {
        this.nama = nama;
        try {
            if (nama.equals(null)) {
                JOptionPane.showMessageDialog(null, "nama belum diisi");
            } else {
                this.nama = nama;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void setTelp(String telp) {
        this.telp = telp;
        try {
            if (telp.equals(null)) {
                JOptionPane.showMessageDialog(null, "telp belum diisi");
            } else {
                this.telp = telp;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void setGolongan(String golongan) {
        this.golongan = golongan;
            try {
            if (golongan.equals(null)) {
                JOptionPane.showMessageDialog(null, "golongan belum diisi");
            } else {
                this.golongan = golongan;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void setStatusNikah(String statusNikah) {
        this.statusNikah = statusNikah;
            try {
            if (statusNikah.equals(null)) {
                JOptionPane.showMessageDialog(null, "statusNikah belum diisi");
            } else {
                this.statusNikah = statusNikah;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void setlamaKerja(String lamaKerja) {
        this.lamaKerja = lamaKerja;
            try {
            if (lamaKerja.equals(null)) {
                JOptionPane.showMessageDialog(null, "lamaKerja belum diisi");
            } else {
                this.lamaKerja = lamaKerja;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    //kalo ada 2 construktor(public) berarti namanya overload constuktor
    public String getNIP(){ //get untuk mendapatkan data.
        return this.nip;
    }
    public String getNama(){
        return this.nama;
    }
    public String getTelp(){
        return this.telp;
    }
    public String getGolongan(){
        return this.golongan;
    }
    public String getStatusNikah(){
        return this.statusNikah;
    }
    public String getLamaKerja(){
        return this.lamaKerja;
    }
        
}