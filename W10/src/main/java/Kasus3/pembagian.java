/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasus3;

/**
 *
 * @author LIA
 */
import java.util.Scanner;
public class pembagian {
    public static void main (String[] args) {
	try {
		Scanner sc = new Scanner (System.in);
		System.out.println("Bilangan : ");
		int Angka = sc.nextInt();
		System.out.println("Pembagi : ");
		int Pembagi = sc.nextInt();
		System.out.println("Hasil " + Angka/Pembagi);
	} catch (ArithmeticException ex) {
		System.out.println("Pembagi tidak boleh nol!");
	}
 }
}
