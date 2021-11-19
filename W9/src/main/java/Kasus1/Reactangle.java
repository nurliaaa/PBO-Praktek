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
public class Reactangle extends Shape {
    private double length; 
    private double width;
	
	public Reactangle (double l, double w){
            super("Reactangle");
            length = l;
            width = w;
        }
        
        public double area(){
            return length*width;
        }
        
        public String toString(){
            return super.toString() + " of length " + length + " and width " + width;
        }
}
