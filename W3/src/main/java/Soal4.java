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

public class Soal4 {
    
    public static void main(String []argh) {
        int Gajipokok = 500000;
        int Hargaitem = 50000;
        int item;
        Scanner sc = new Scanner(System.in);
            item = sc.nextInt();
            if (item >40 && item< 80){
                Gajipokok += item * Hargaitem * 0.25;
            }
            else if(item > 80){
                Gajipokok += item * Hargaitem * 0.35;
            }
            else if(item < 15){
                Gajipokok -= (15 - item) * Hargaitem * 0.15;
            }
            else
                Gajipokok += item * Hargaitem *0.1;
            System.out.println(Gajipokok);
    }
}
