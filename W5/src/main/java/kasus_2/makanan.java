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
public class makanan {
    private String nama_makanan;
    private double harga_makanan;
    private int stok;
    
    public makanan (String namaMakanan, double hargaMakanan, int Stokk){
        this.nama_makanan = namaMakanan;
        this.harga_makanan = hargaMakanan;
        this.stok = Stokk; 
    }
    
    public String getNamaMakanan (){
        return nama_makanan;
    }
    
    public double getHargaMakanan(){
        return harga_makanan;
    }
    
    public int getStok(){
        return stok;
    }
    
    public void TampilMakanan(){
        System.out.println(nama_makanan + "{" + stok + "}" + harga_makanan);
    }
    
    public void Kurang_Stok (int stokMakanan ){
        stok -= stokMakanan;
    }
}

    
