/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LIA
 */
import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args){
        long mobil;
        Scanner sc = new Scanner (System.in);
        int A, B,C,D;
        String gabung;
        long gabungan;
        
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        gabung = String.valueOf(A) + String.valueOf(B) + String.valueOf(C) + String.valueOf(D);
        
        gabungan = Long.parseLong(gabung);	// menconvert dari string ke long							//convert string ke long
		
		if((gabungan - 999999) %5 ==0){
			System.out.println("Jalan");
		}else{
			System.out.println("Berhenti");
		}
                sc.close();
    }
    
}
