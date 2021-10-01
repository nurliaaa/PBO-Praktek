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

public class Soal2_IO {
    
    public static void main(String[] args) {
            String[] karakter = new String[3];
            int[] angka = new int[3];
            
            Scanner sc = new Scanner(System.in);
           
            for(int i=0;i<3;i++){
                karakter[i] = sc.next();
                angka[i]    = sc.nextInt();     
            }
            
            System.out.println("================================");
            System.out.printf("%-14s %03d\n", karakter[0], angka[0]);
            System.out.printf("%-14s %03d\n", karakter[1], angka[1]);    
            System.out.printf("%-14s %03d\n", karakter[2], angka[2]);    
            System.out.println("================================");

    }
}
