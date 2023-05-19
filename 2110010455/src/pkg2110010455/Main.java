/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2110010455;
import obat.*;
import pegawai.*;
import java.util.Scanner;
import java.util.Date;
/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        
        do {
            System.out.println("============== Menu ==============");
            System.out.println("1. Persediaan Obat");
            System.out.println("2. Jenis Obat"); 
            System.out.println("3. Obat Masuk");
            System.out.println("4. Obat Keluar");
            System.out.println("5. Admin Login");
            System.out.println("6. Data Pegawai");
            System.out.println("0. Keluar");
            System.out.print("Pilih Nomor : ");
            pilihan = scanner.nextInt();
            scanner.nextLine();
            
            switch (pilihan) {
                case 1:
                    System.out.println("==================================");
                    System.out.print("Masukkan nama obat (amoxicillin/metformin)< input sesuai nama obat : ");
                    String inputobat = scanner.nextLine();
                    
                    persediaan_obat pobat = new persediaan_obat(); //agar constructor jalan
                    /*pobat.setHargaObat(inputobat);
                    System.out.println("Harga Obat : "+pobat.getHargaObat());

                    pobat.setStokObat(inputobat);
                    System.out.println("Stok Obat Tersedia : "+pobat.getStokObat());*/

                    System.out.println(pobat.perObat(inputobat,inputobat));
                    break;
                case 2:
                    System.out.println("==================================");
                    System.out.print("Masukkan nama obat (amoxicillin/metformin) < input sesuai nama obat : ");
                    String inputjenis = scanner.nextLine();
                    
                    jenis_obat jobat = new jenis_obat(); //agar constructor jalan

                    /*jobat.setNamaObat(inputjenis);
                    System.out.println("Nama Obat : "+jobat.getNamaObat());
                    
                    jobat.setJenisObat(inputjenis);
                    System.out.println("Jenis Obat : "+jobat.getJenisObat());*/
  
                     System.out.println(jobat.jenObat(inputjenis,inputjenis));
                    break;
                case 3:
                    System.out.println("==================================");
                    System.out.print("Masukkan nama obat : ");
                    String namaObatMasuk = scanner.nextLine();
                    
                    System.out.print("Masukkan jumlah obat : ");
                    String jumlahObatMasuk = scanner.nextLine();
                    
                    obat_masuk obmasuk = new obat_masuk(); //agar constructor jalan
                    
                    obmasuk.setNamaObatMasuk(namaObatMasuk);
                    obmasuk.setJumlahObatMasuk(jumlahObatMasuk);
                    obmasuk.setTanggalMasuk(new Date());

                    System.out.println(obmasuk.ObatMasuk("Nama Obat : "+namaObatMasuk+", Jumlah Obat : ",jumlahObatMasuk+", Tanggal Masuk : ", new Date()));
                    break;
                case 4:
                    System.out.println("==================================");
                    System.out.print("Masukkan nama obat : ");
                    String namaObatKeluar = scanner.nextLine();

                    System.out.print("Masukkan jumlah obat : ");
                    String jumlahObatKeluar = scanner.nextLine();
                    
                    obat_keluar obkeluar = new obat_keluar(); //agar constructor jalan
                    
                    obkeluar.setNamaObatKeluar(namaObatKeluar);
                    obkeluar.setJumlahObatKeluar(jumlahObatKeluar);
                    obkeluar.setTanggalKeluar(new Date());
                    
                    System.out.println(obkeluar.ObatKeluar("Nama Obat : "+namaObatKeluar+", Jumlah Obat : ", jumlahObatKeluar+", Tanggal Keluar : ", new Date()));;;

                    break;
                case 5:
                    System.out.println("==================================");
                    System.out.print("Masukkan nama admin : ");
                    String namaAdmin = scanner.nextLine();
                    
                    System.out.print("Masukkan password : ");
                    String password = scanner.nextLine();
                    
                    admin adminlogin = new admin(); //agar constructor jalan
                    
                    adminlogin.setNamaAdmin(namaAdmin);
                    adminlogin.setPassword(password);
                    
                    System.out.println(adminlogin.adminLogin("Nama Admin "+namaAdmin+" ","Password "+password));
                    System.out.println("Berhasi Login");
                    break;
                case 6:
                    System.out.println("==================================");
                    pegawai pegawai = new pegawai();
                    
                    System.out.println("Data Pegawai : ");
                    
                    System.out.println(pegawai.dataPegawai("Ahmad", "Ahmad", "Ahmad"));
                    break;
                case 0:
                    System.out.println("==================================");
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("==================================");
                    System.out.println("Pilihan tidak ada. Silakan pilih nomor yang ada.");
                    break;
            }

            System.out.println();
        } while (pilihan != 0);
    }    
}