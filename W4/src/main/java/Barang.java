/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LIA
 */
public class Barang {
    //String kode_barang;
    String nama_barang;
    private int stok;
    
    public void setNamaBarang(String nama_barang){
        this.nama_barang = nama_barang;
    }
    public String getNamaBarang(){
        return this.nama_barang;
    }
    
    public void setStok(int stok){
        this.stok = stok;
    }
    public int getStok(){
        return this.stok;
    }
    
        public Barang(String kode, String nama, int stk) {
 //       kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }
}
