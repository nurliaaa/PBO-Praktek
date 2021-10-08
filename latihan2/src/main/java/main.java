/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LIA
 */
public class main {
    
    public static void main(String[] args){
        
        buku b = new buku();
        b.setnameBuku("Dia Tanpa Aku");
        b.setpenulis("Esti Kinasih");
        b.settahun(2015);
        b.setjmlHalaman(280);
        
        System.out.println("Buku");
        System.out.println("Nama Buku      = "+ b.getnameBuku());
        System.out.println("Penulis        = "+ b.getpenulis());
        System.out.println("Tahun Terbit   = "+ b.gettahun());
        System.out.println("Jumlah Halaman = "+ b.getjmlHalaman());
    }
}
