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
public class soal5 {
   public static void main(String[] args) {

        String A,B;
        int sum;
        Scanner sc = new Scanner(System.in);
        A=sc.nextLine();
        B=sc.nextLine();

        sum = A.length()+B.length(); 
     
        System.out.println(sum);
        if (A.compareTo(B) > 0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        
        A = A.substring(0,1).toUpperCase()+A.substring(1);
        B = B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(A+" "+B);
        
    }
}
