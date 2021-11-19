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
public class Sphere extends Shape{
	private double radius; // radius in feet
	
	public Sphere (double r){
            super("Sphere");
            radius = r;
        }
        
        public double area(){
            return 4*Math.PI*radius*radius;
        }
        
        public String toString(){
            return super.toString() + " of radius " + radius;
        }
}