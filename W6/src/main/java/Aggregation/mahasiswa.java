/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aggregation;

/**
 *
 * @author LIA
 */
public class mahasiswa {
    private int nim;
    private String nama;
    
    public mahasiswa(int nim, String nama){
        this.nim = nim;
        this.nama = nama;
    }
    
    public int getNIM(){
        return nim;
    }
    public String getNama(){
        return nama;
    }
}
