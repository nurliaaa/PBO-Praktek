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
public class Restaurant {
    private makanan[] MenuMakanan;
    private static byte id = 0;
    
    public Restaurant(){
        MenuMakanan = new makanan[20];
    }
    
    public void tambahMenuRestaurant(String nama, double harga, int stok){
        this.MenuMakanan[id] = new makanan(nama,harga,stok); 
    }
    
    public void tampilMenuMakanan(){
        for(int i =0; i <= id; i++){
            if(!isOutOfStock(i)){
                
                this.MenuMakanan[i].TampilMakanan();
            }
        }
    }
    
    public boolean isOutOfStock(int id){
    if(MenuMakanan[id].getStok() == 0){
        return true;
    }else{
        return false;
    }
  }
    
    public static void nextId(){
        id++;
    }
    
    public void pemesanan(String nama,int stok){
        for(int i = 0; i <=id; i++){
            if(nama.equals(MenuMakanan[i].getNamaMakanan())){
                if(stok <= MenuMakanan[i].getStok()){
                    System.out.println("Sisa Menu Terjual");
                    MenuMakanan[i].Kurang_Stok(stok);
            }
         }
       }
    }
}

