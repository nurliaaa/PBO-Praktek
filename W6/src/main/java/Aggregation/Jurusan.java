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
public class Jurusan {
    private String namaJurusan;
    private mahasiswa Mhs;
    
    public Jurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan;
    }
    
    public void setMahasiswa(mahasiswa Mhs) {
        this.Mhs = Mhs;
    }
    
    public String getNamaJurusan() {
        return namaJurusan;
    } 
}
