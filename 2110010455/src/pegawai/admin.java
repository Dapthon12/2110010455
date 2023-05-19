/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pegawai;

/**
 *
 * @author User
 */
public class admin {
    public String namaAdmin;
    public String password;
    
    public admin(){}
    
    public admin(String x){
        setNamaAdmin(x);
    }
    
    public admin(String x, String y){
        setNamaAdmin(x);
        setPassword(y);
    }
   
    public void setNamaAdmin(String namaAdmin){
        this.namaAdmin = namaAdmin;
    }
    
    public String getNamaAdmin() {
        return namaAdmin;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String adminLogin(){
        return getNamaAdmin()+getPassword();
    }
    
    public String adminLogin(String x,String y){
        setNamaAdmin(x);
        setPassword(y);
        return getNamaAdmin()+getPassword();
    }
}
