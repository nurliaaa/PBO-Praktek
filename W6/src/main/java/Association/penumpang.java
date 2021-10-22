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
public class penumpang {
    private int id_penumpang;
    private String name;
    
    public penumpang(int id, String nama){
        name = nama;
        id_penumpang = id;
    }
    
    public String getName(){
        return name;
    }
    
    public int getid(){
        return id_penumpang;
    }
}
