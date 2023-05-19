/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obat;

/**
 *
 * @author User
 */
public class persediaan_obat {
    
    private String hargaObat;
    private String stokObat;
    
    public persediaan_obat(){} //constructor
    
    public persediaan_obat(String x){
        setHargaObat(x);
    }
    
    public persediaan_obat(String x, String y){
        setHargaObat(x);
        setStokObat(y);
    }
    
    public persediaan_obat(int says){
        System.out.println( says);
    }
    
    public void setHargaObat(String hargaObat){
        if(hargaObat.equals("amoxicillin")){
            this.hargaObat="Harga Obat : 4000 , ";
        }else if(hargaObat.equals("metformin")){
            this.hargaObat="Harga Obat : 5000 , ";
        }else {
            this.hargaObat="Harga Obat : 0 , ";
        }
    }
    
    public String getHargaObat(){
        return this.hargaObat;
    }
    
    public void setStokObat(String stokObat){
        if(stokObat.equals("amoxicillin")){
            this.stokObat="Stok Obat : 80 ";
        }else if(stokObat.equals("metformin")){
            this.stokObat="Stok Obat : 20 ";
        }else {
            this.stokObat="Stok Obat : 0 ";
        }
    }
    
    public String getStokObat(){
        return this.stokObat;
        
    }
    
    public String perObat(){
        return getHargaObat()+getStokObat();
    }
    
    public String perObat(String x, String y) {
        setHargaObat(x);
        setStokObat(y);
       
        return getHargaObat()+getStokObat();       
    }
}