/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompanyject.uts_no3_05a_3003;

/**
 *
 * @author lenovo
 */
public class Mahasiswa_3003 {
    String nim_3003;
    String nama_3003;
    String Jurusan_3003;
    int ipk_3003;
    
    public Mahasiswa_3003(){
        
    }
    
    public Mahasiswa_3003(String nim_3003, String nama_3003, String Jurusan_3003, int ipk_3003){
        this.nim_3003 = nim_3003;
        this.nama_3003 = nama_3003;
        this.Jurusan_3003 = Jurusan_3003;
        this.ipk_3003 = ipk_3003;
    }
    
    public void tampilDataMhs(){
        System.out.println("nim : " + nim_3003);
        System.out.println("nama: " + nama_3003);
        System.out.println("Jurusan : " + Jurusan_3003);
        System.out.println("ipk : " + ipk_3003);

}
}
    



