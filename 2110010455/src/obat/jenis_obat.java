/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obat;

/**
 *
 * @author User
 */
public class jenis_obat {
    
    private String namaObat;
    private String jenisObat;
        
    public jenis_obat(){} //constructor
    
    public jenis_obat(String x){
        setNamaObat(x);
    }
    
    public jenis_obat(String x, String y){
        setNamaObat(x);
        setJenisObat(y);
    }
        
    public jenis_obat(int says){
        System.out.println( says);
    }    
    
    public void setNamaObat(String nobat){
        if (nobat.equals("amoxicillin")){
            this.namaObat="Nama Obat : amoxicillin , ";
        }else if(nobat.equals("metformin")){
            this.namaObat="Nama Obat : metformin , ";
        }else
            this.namaObat="Nama Obat : Tidak Tersedia , ";
    }
    
    public String getNamaObat() {
        return namaObat;
    }
    
    public void setJenisObat(String jobat){
        if (jobat.equals("amoxicillin")){
            this.jenisObat="Jenis Obat : antibiotik ";
        }else if(jobat.equals("metformin")){
            this.jenisObat="Jenis Obat : obat mata ";
        }else
            this.jenisObat="Jenis Obat : Tidak Tersedia ";
    }
        
    public String getJenisObat() {
        return jenisObat;
    }
    
    public String jenObat(){
        return getNamaObat()+getJenisObat();
    }
    
    public String jenObat(String x, String y) {
        setNamaObat(x);
        setJenisObat(y);

        return getNamaObat()+getJenisObat();
    }
}