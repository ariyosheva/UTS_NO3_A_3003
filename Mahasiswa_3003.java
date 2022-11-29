/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompanyject.main_3003;

/**
 *
 * @author lenovo
 */
public class Mahasiswa_3003 {

  
    protected String nim_3003;
    protected String nama_3003;
    protected String jurusan_3003;
    protected int ipk_3003;
    
    public Mahasiswa_3003(String nim_3003,String nama_3003,String jurusan_3003,int ipk_3003){
        this.nama_3003 = nama_3003;
        this.nim_3003 = nim_3003;
        this.jurusan_3003 = jurusan_3003;
        this.ipk_3003 = ipk_3003;
    }
    public void tampilDataMhs() {
        System.out.println("Nama : " + nama_3003);
        System.out.println("NIM : " + nim_3003);
        System.out.println("Jurusan : " + jurusan_3003);
        System.out.println("IPK : " + ipk_3003);
    }
    }
    



