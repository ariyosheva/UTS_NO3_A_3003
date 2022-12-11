/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompanyject.uts_no3_05a_3003;

/**
 *
 * @author lenovo
 */
public class StudentStaff_3003 extends Mahasiswa_3003 implements iPendapatan_3003 {

    String unitKerja_3003;
    int jamKerja_3003;
    double totalPendapatan_3012;

    public StudentStaff_3003() {

    }

    public StudentStaff_3003(String nim, String nama, String Jurusan, int ipk,
            String unitKerja, int jamKerja) {
        super(nim, nama, Jurusan, ipk);
        this.jamKerja_3003 = jamKerja_3003;
    }
    
    public void tampilDataMhs(){
        super.tampilDataMhs();
        infostudent();
    }
    
    public void infostudent(){
        System.out.println("unitKerja : Fakultas Informatika" + unitKerja_3003);
        System.out.println("jamKerja : 12" + jamKerja_3003);
    }

    @Override
    public double totalPendapatan_3003() {
        int totalPendapatan_3003;
        return totalPendapatan_3003 = (int) (jamKerja_3003 *30000);
 
}

    
}
