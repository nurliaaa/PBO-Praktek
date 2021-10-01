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
public class Soal3 {
    
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
        int A,B = 0;
        int hasil ;
	String operator;
		
	A = input.nextInt();			
	operator = input.next();
	B = input.nextInt();
		
	if (A >= 1 && A <= 1000 && B >= 1 && B <= 1000) {		
			
            switch (operator){									
			
		case "+" : 
                    hasil = A + B;
                    System.out.println(hasil);
                    break; 
		case "-" : 
                    hasil = A - B;
                    System.out.println(hasil);
                    break; 
		case "*" : 
		    hasil = A * B;
		    System.out.println(hasil);
		    break;
		case "/" : 
		    hasil = A / B;
		    System.out.println(hasil);
		    break;
		case "%" : 
		    hasil = A % B;
		    System.out.println(hasil);
		    break;
		default : System.out.println(" - ");
		   }
			
		} else {
		System.out.println("Angka yang Anda masukkan salah"); 
				    }
			input.close();
        
    
}
    
}
