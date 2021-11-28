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

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Operasifile {

	public static void main (String[] args) {
		//try {
			File text = new File("file.txt");
			Scanner myReader = new Scanner(text);
			myReader.close();
	//	} catch (Exception e) {
			System.out.println("File tidak ditemukan");
		}
	}
	
//}