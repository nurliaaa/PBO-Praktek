/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dependency;

/**
 *
 * @author LIA
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Menu mn = new Menu();
        int pilih;
        
        System.out.println("==========MENU MARTABAK===============");
        System.out.println("1. Martabak Coklat       Rp. 15.000");
        System.out.println("2. Martabak Keju         Rp. 20.000");
        System.out.println("3. Martabak Pisang Susu  Rp. 17.500");
        System.out.println("4. Martabak Ketan        Rp. 12.000");
        System.out.println("Pilih menu : ");
        pilih = in.nextInt();
        
        switch (pilih) {
        case 1 :
        {
            System.out.println("Anda memesan Martabak Coklat.");
            mn.setMakanan("Martabak Coklat");
            mn.setHargaMakanan(15000.0);
            break;
        }
        case 2 :
        {
            System.out.println("Anda memesan Martabak Keju.");
            mn.setMakanan("Martabak Keju");
            mn.setHargaMakanan(20000.0);
            break;
        }
        case 3 :
        {
            System.out.println("Anda memesan Martabak Pisang Susu.");
            mn.setMakanan("Martabak Pisang Susu");
            mn.setHargaMakanan(17500.0);
            break;
        }
        case 4 :
        {
            System.out.println("Anda memesan Martabak Ketan.");
            mn.setMakanan("Martabak Ketan");
            mn.setHargaMakanan(12000.0);
            break;
        }
      } 
        
    }
        
}
