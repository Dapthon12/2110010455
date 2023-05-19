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
public class obat_masuk {
    
    private String namaObatMasuk;
    private String jumlahObatMasuk;
    private Date tanggalMasuk;

    public obat_masuk(){}
    
    public obat_masuk(String x){
        setNamaObatMasuk(x);
    }
    
    public obat_masuk(String x,String y){
        setNamaObatMasuk(x);
        setJumlahObatMasuk(y);
    }
    
    public obat_masuk(String x,String y, Date z){
        setNamaObatMasuk(x);
        setJumlahObatMasuk(y);
        setTanggalMasuk(z);
    }
    
    public void setNamaObatMasuk(String namaObatMasuk) {
        this.namaObatMasuk = namaObatMasuk;
    }
    
    public String getNamaObatMasuk() {
        return namaObatMasuk;
    }

    public void setJumlahObatMasuk(String jumlahObatMasuk) {
        this.jumlahObatMasuk = jumlahObatMasuk;
    }
    
    public String getJumlahObatMasuk() {
        return jumlahObatMasuk;
    }

    public void setTanggalMasuk(Date tanggalMasuk) {
        this.tanggalMasuk = tanggalMasuk;
    }

    public Date getTanggalMasuk() {
        return tanggalMasuk;
    }
    
    public String ObatMasuk(){
        return getNamaObatMasuk()+getJumlahObatMasuk()+getTanggalMasuk();
    }
    
    public String ObatMasuk(String x, String y, Date z) {
        setNamaObatMasuk(x);
        setJumlahObatMasuk(y);
        setTanggalMasuk(z);
        return getNamaObatMasuk()+getJumlahObatMasuk()+getTanggalMasuk();
    }   
}