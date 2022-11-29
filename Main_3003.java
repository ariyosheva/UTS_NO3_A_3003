/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompanyject.main_3003;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author lenovo
 */
public class Main_3003 {

 public static void main(String[] args) {
     AsisPrak_3003[] ap = new AsisPrak_3003[1];
     StuStaff_3003[] ss = new StuStaff_3003[1];
        
      
        //program input menggunakan buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        try {
           
            for(int i = 0; i < 1; i++){
                System.out.print("NIM              : ");
                ap[i].nim_3003 = br.readLine();
                System.out.print("Nama             : ");
                ap[i].nama_3003 = br.readLine();
                System.out.print("Jurusan          : ");
                ap[i].jurusan_3003 =br.readLine();
                System.out.print("IPK              : ");
                ap[i].ipk_3003 =Integer.parseInt(br.readLine());
                System.out.print("Mata Kuliah      : ");
                ap[i].mkAsistensi_3003 = br.readLine();
                System.out.print("Jumlah Pertemuan : ");
                ap[i].jmlPertemuan_3003 = Integer.parseInt(br.readLine());
                System.out.println();
                ap[i].totalPendapatan();
                System.out.println();
            }
            
            //Menampilkan semua isi array pada data nelayan
            System.out.println("DATA ASISTEN PRAKTIKUM");
            for(AsisPrak_3003 AP : ap){
                AP.tampilDataMhs();
                System.out.println("");
            }

            //mengisi data ke array pada data dokter
            for(int i = 0; i < 1; i++){
                System.out.print("NIM         : ");
                ss[i].nim_3003 = br.readLine();
                System.out.print("Nama        : ");
                ss[i].nama_3003 = br.readLine();
                System.out.print("Jurusan     : ");
                ss[i].jurusan_3003  =br.readLine();
                System.out.print("IPK         : ");
                ss[i].ipk_3003 =Integer.parseInt(br.readLine());
                System.out.print(" Unit Kerja : ");
                ss[i].unitKerja_3003= Integer.parseInt(br.readLine());
                System.out.print("Jam Kerja   : ");
                ss[i].jamKerja_3003 = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
            //Menampilkan semua isi array pada data dokter
            System.out.println("DATA STUDENT STAFF");
            for(StuStaff_3003 SS : ss){
                SS.tampilDataMhs();
                System.out.println("");
            }
        } 
        catch (Exception ex){ // menangkap kesalahan
            System.out.println(ex);
        }
        
    }
    
    
}
