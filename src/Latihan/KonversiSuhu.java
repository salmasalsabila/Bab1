/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        float R, F, K;
        System.out.print("Masukkan nilai dari Celcius : ");
        float C = masukan.nextInt();
        System.out.println("pilih konversi ke K, r, F :");
        String pilihan = masukan.next();
        switch (pilihan){
            case "K" :System.out.print("Hasil : "+ (K = C+273));
            break;
            case "R" :System.out.print("Hasil : "+ (R = C*4/5));
            break;
            case "F" :System.out.print("Hasil : "+ (F = C*9/5+32));
            break;
                
                
        }
    }
}
