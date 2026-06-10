/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penggajian;

/**
 *
 * @author nafis
 */

//artinya class gaji mewarisi method yang ada di karyawan
public class gaji extends karyawan{
    private int tunjGolongan;
    private int tunjStatus; //variabel global
    private int tunjLamaKerja;
    private int gajiTotal;

    public gaji () {} //wajib ada construktor, agar bisa dikenali
    
    public int getTunjGol(){
        int gaji = 0; //bikin inisialisasi variabel dulu, di set 0 dulu
        if (getGolongan().equals("I")) { //equlas (persamaan)
            gaji = 2500000; 
        } else if (getGolongan().equals("II")) {
            gaji = 3000000;
        } else if (getGolongan().equals("III")) {
            gaji = 3500000;
        } else {
            gaji = 4000000;
        }
        return gaji;
    }
    
    public int getTunjStatus (){
        int StatusTunjangan = 0;
        if (getStatusNikah().equals("Belum Menikah")) {
            StatusTunjangan = 500000;
        } else {
            StatusTunjangan = 1000000;
        }
        return StatusTunjangan;
    }
    
    public int getTunjLamaKerja () {
        int LamaKerjaTunj = 0;
        if (getLamaKerja().equals("I")) {
            LamaKerjaTunj = 500000;
        } else if (getLamaKerja().equals("II")) {
            LamaKerjaTunj = 700000;
        } else if (getLamaKerja().equals("III")) {
            LamaKerjaTunj = 1000000;
        } else if (getLamaKerja().equals("IV")) {
            LamaKerjaTunj = 1200000;
        } else {
            LamaKerjaTunj = 1500000;
        }
    return LamaKerjaTunj;
    }
    
    public int getGajiTotal () {
        return getTunjGol()+ getTunjLamaKerja() + getTunjStatus();
    }
}


