/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompanyject.main_3003;

/**
 *
 * @author lenovo
 */
public class StuStaff_3003 extends Mahasiswa_3003 {
    
    public int unitKerja_3003;
    public int jamKerja_3003;
    
    public StuStaff_3003 (String nama_3003,String nim_3003,String jurusan_3003,int ipk_3003,int unitKerja_3003,int jamKerja_3003){
        super(nama_3003,nim_3003,jurusan_3003,ipk_3003);
        this.unitKerja_3003 = unitKerja_3003;
        this.jamKerja_3003 = jamKerja_3003;
    }
    public double totalPendapatan(){
        return jamKerja_3003 * 30000;
    }
    public void tampilDataMhs(){
        System.out.println("Unit kerja : " + unitKerja_3003);
        System.out.println("Jam kerja : " + jamKerja_3003);
        
    }
}
