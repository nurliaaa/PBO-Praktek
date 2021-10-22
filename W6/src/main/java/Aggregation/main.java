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
public class main {
    public static void main(String[] args) {
        mahasiswa sc = new mahasiswa(201511055, "Nur Lia");
        Jurusan sj = new Jurusan("Teknik Komputer dan Informatika");
        
        sj.setMahasiswa(sc);
        
        System.out.println("NIM          : "+ sc.getNIM());
        System.out.println("Nama Mahasiswa : "+sc.getNama());
        System.out.println("Jurusan        : "+ sj.getNamaJurusan());
    } 
}
