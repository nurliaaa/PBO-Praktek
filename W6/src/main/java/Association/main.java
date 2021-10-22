/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Association;

/**
 *
 * @author LIA
 */
public class main {
    public static void main(String[] args){
        namaKereta nK = new namaKereta ("Kereta Malabar");
        penumpang nP = new penumpang ( 2101, "Adi") ;
        penumpang nP2 = new penumpang ( 2201, "Budi") ;
        
        System.out.println(nK.getnamakereta()+ " dengan daftar penumpang :");
        System.out.println("No " + nP.getid() + " nama " + nP.getName());
        System.out.println("No " + nP2.getid() + " nama " + nP2.getName());
    }
    
}
