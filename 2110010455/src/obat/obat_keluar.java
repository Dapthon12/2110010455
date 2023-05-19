/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obat;
import java.util.Date;
/**
 *
 * @author User
 */
public class obat_keluar {
    
    private String namaObatKeluar;
    private String jumlahObatKeluar;
    private Date tanggalKeluar;
    
    public obat_keluar(){}
    
    public obat_keluar(String x){
        setNamaObatKeluar(x);
    }
    
    public obat_keluar(String x,String y){
        setNamaObatKeluar(x);
        setJumlahObatKeluar(y);
    }
    
    public obat_keluar(String x,String y, Date z){
        setNamaObatKeluar(x);
        setJumlahObatKeluar(y);
        setTanggalKeluar(z);
    }

    public void setNamaObatKeluar(String namaObatKeluar) {
        this.namaObatKeluar = namaObatKeluar;
    }

    public String getNamaObatKeluar() {
        return namaObatKeluar;
    }

    public void setJumlahObatKeluar(String jumlahObatKeluar) {
        this.jumlahObatKeluar = jumlahObatKeluar;
    }

    public String getJumlahObatKeluar() {
        return jumlahObatKeluar;
    }

    public void setTanggalKeluar(Date tanggalKeluar) {
        this.tanggalKeluar = tanggalKeluar;
    }

    public Date getTanggalKeluar() {
        return tanggalKeluar;
    }
    
    public String ObatKeluar(){
        return getNamaObatKeluar()+getJumlahObatKeluar()+getTanggalKeluar();
    }
    
    public String ObatKeluar(String x, String y, Date z) {
        setNamaObatKeluar(x);
        setJumlahObatKeluar(y);
        setTanggalKeluar(z);
        return getNamaObatKeluar()+getJumlahObatKeluar()+getTanggalKeluar();
    }
}