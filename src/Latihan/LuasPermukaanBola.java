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
public class LuasPermukaanBola {
    public static void main(String[] args) {
        Scanner bil = new Scanner(System.in);
        System.out.println("Masukkan r : ");
        Float r = bil.nextFloat();
        System.out.println("Luas permukaan bola adalah : "+4*22*r/7*r);
    }
}
