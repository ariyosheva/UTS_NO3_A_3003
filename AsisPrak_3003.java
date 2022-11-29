/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompanyject.main_3003;

/**
 *
 * @author lenovo
 */
public class AsisPrak_3003 extends Mahasiswa_3003 {
  
    public String mkAsistensi_3003;
    public int jmlPertemuan_3003;
    
    public AsisPrak_3003(String nama_3003,String nim_3003,String jurusan_3003,int ipk_3003,String mkAsistensi_3003,int jmlPertemuan_3003){
        super(nama_3003,nim_3003,jurusan_3003,ipk_3003);
        this.mkAsistensi_3003 = mkAsistensi_3003;
        this.jmlPertemuan_3003 = jmlPertemuan_3003;
    }
    public double totalPendapatan(){
        return jmlPertemuan_3003 * 50000;
    }
    public void tampilDataMhs(){
        System.out.println("Mata kuliah : " +mkAsistensi_3003);
        System.out.println("Jumlah pertemuan : " + jmlPertemuan_3003);
    }
}