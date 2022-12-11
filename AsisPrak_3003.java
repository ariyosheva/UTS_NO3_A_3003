/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompanyject.uts_no3_05a_3003;

/**
 *
 * @author lenovo
 */
public class Asprak_3003  extends Mahasiswa_3003 implements iPendapatan_3003{
    String MKasistensi_3003;
    int jmlhPertemuan_3003;
    double totalPendapatan_3003;

    public Asprak_3003(){
        
    }
    
    public Asprak_3003(String nim, String nama, String Jurusan, int ipk, 
            String MKasistensi, int jmlhPertemuan){
        super(nim,nama,Jurusan,ipk);
        this.MKasistensi_3003 = MKasistensi_3003;
        this.jmlhPertemuan_3003 = jmlhPertemuan_3003;
        
    }
    
    public void infoAsprak(){
        System.out.println("MKasistensi : PBO" + MKasistensi_3003);
        System.out.println("jmlhPertemuan : 2" + jmlhPertemuan_3003);
    }
    
    public void tampilDataMhs(){
        super.tampilDataMhs();
        infoAsprak();
    }
    
    public double totalPendapatan_3003(){
        return totalPendapatan_3003 = (jmlhPertemuan_3003 *50000);
        
 
}
    

}
