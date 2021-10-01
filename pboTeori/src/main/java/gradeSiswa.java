/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LIA
 */

import java.util.*;
public class gradeSiswa {
    
    public static void main(String[]args){
      
        Scanner input = new Scanner(System.in);
        String nama;
        int nim;
        final double Nilai_Tugas, Nilai_UTS, Nilai_UAS, Nilai_Akhir;
        
        System.out.println("Masukkan nama : ");
        nama = input.nextLine();
        System.out.println("Masukkan nim : ");
        nim = input.nextInt();
        System.out.println("Masukkan Nilai Tugas: ");
        Nilai_Tugas = input.nextInt();
        System.out.println("Masukkan Nilai UTS: ");
        Nilai_UTS = input.nextInt();
        System.out.println("Masukkan Nilai UAS: ");
        Nilai_UAS = input.nextInt();
        
        Nilai_Akhir = (0.2 * Nilai_Tugas + 0.35 * Nilai_UTS + 0.45 * Nilai_UAS );
        
        if(Nilai_Akhir > 85){
            System.out.println("Anda Mendapatkan Nilai Akhir A");
        } 
        else if (Nilai_Akhir > 75 && Nilai_Akhir < 84){
            System.out.println("Anda Mendapatkan Nilai Akhir B");
        }
        else if (Nilai_Akhir > 65 && Nilai_Akhir < 74){
            System.out.println("Anda Mendapatkan Nilai Akhir C");
        }
        else if (Nilai_Akhir > 49 && Nilai_Akhir < 64){
            System.out.println("Anda Mendapatkan Nilai Akhir D");
        }
        else if (Nilai_Akhir < 50){
            System.out.println("Anda Mendapatkan Nilai Akhir E");
        }
        
        
    }
}
