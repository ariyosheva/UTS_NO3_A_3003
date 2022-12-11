/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompanyject.uts_no3_05a_3003;

/**
 *
 * @author lenovo
 */
public class UTS_NO3_05A_3003 {

     public static void main(String[] args) {
        Asprak_3003 A = new Asprak_3003("21103003", "Pinsen", "Sistem Informasi", 3, "PBO", 12);
        A.tampilDataMhs();
        System.out.println("Total : " + A.totalPendapatan_3003());
        System.out.println("");

        StudentStaff_3003 B = new StudentStaff_3003("211480", "Faruk", "Sistem Informasi", 4, 2, 8);
        B.tampilDataMhs();
        System.out.println("Total : " + B.totalPendapatan_3003());
        System.out.println("");

    }
}

