/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasus1;

/**
 *
 * @author LIA
 */
public abstract class Shape {
    private String shapeName;
    
    public abstract double area();
    
    public Shape(String Name){
        this.shapeName = Name;
    }
    
    public String toString(){
        return shapeName;
    }
}
