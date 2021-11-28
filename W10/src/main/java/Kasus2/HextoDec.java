/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasus2;

/**
 *
 * @author LIA
 */
import java.util.Scanner;

public class HextoDec {
    public static void main(String args[]) {
                String hex;
		int dec;
		try {
			Scanner input = new Scanner(System.in);
			System.out.println("Bilangan hexadesimal : ");	
			hex = input.nextLine();
			dec = Integer.parseInt(hex,16);
			System.out.println("Bilangan desimal : " + dec);	
		}
		catch(Exception ex) {
			System.out.println("Anda salah memasukkan input");
		}
	}
}
