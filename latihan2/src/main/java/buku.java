/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LIA
 */
public class buku {
    private String namaBuku;
    private String namaPenulis;
    private int tahunTerbit;
    private int jumlahHalaman;
    
    public void setnameBuku(String namaBuku){
        this.namaBuku = namaBuku;
    }
    
    public String getnameBuku(){
        return this.namaBuku;
    }
    
    public void setpenulis(String namaPenulis){
        this.namaPenulis = namaPenulis;
    }
    
    public String getpenulis(){
        return this.namaPenulis;
    }
    
    public void settahun(int tahunTerbit){
        this.tahunTerbit = tahunTerbit;
    }
    
    public int gettahun(){
        return this.tahunTerbit;
    }
    
    public void setjmlHalaman(int jumlahHalaman){
        this.jumlahHalaman = jumlahHalaman;
    }
    
    public int getjmlHalaman(){
        return this.jumlahHalaman;
    }
}
