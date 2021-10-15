/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasus_2;

/**
 *
 * @author LIA
 
 */
import java.util.Scanner;

public class RestaurantMain {
    public static void main(String[] args) {
		Restaurant menu = new Restaurant();
                Scanner sc = new Scanner(System.in);
                String makanan;
                int jumlah;
                
		System.out.println("MENU MAKANAN");
		System.out.println("---------------------------");
		menu.tambahMenuRestaurant("Bala-Bala", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuRestaurant("Gehu", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuRestaurant("Tahu", 1_000, 0);
		Restaurant.nextId();
		menu.tambahMenuRestaurant("Molen", 1_000, 20);
		menu.tampilMenuMakanan();
		System.out.println("---------------------------");
                
                System.out.println("Masukan nama makanan :");
                makanan = sc.nextLine();
		System.out.println("Jumlah makanan yang dibeli: ");
                jumlah = sc.nextInt();
           
		System.out.println("---------------------------");
                menu.pemesanan(makanan, jumlah);
		menu.tampilMenuMakanan();
    }
}
