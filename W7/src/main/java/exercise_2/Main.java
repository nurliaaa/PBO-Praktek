/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_2;

/**
 *
 * @author LIA
 */
public class Main {
    
    public static void main (String[] args) {
        
        Shape s1 = new Shape();
        System.out.println(s1.toString());
        
        Circle c1 = new Circle();
        System.out.println(c1.toString());
        System.out.println("Luas = " + c1.getArea() + 
        " Keliling = " + c1.getPerimeter());
        
        Rectangle r1 = new Rectangle ();
	System.out.println(r1.toString());
	System.out.println("Luas = " + r1.getArea() + 
        " Keliling = " + r1.getPerimeter());
        
        Square sq1 = new Square ();
	System.out.println(sq1.toString());
	System.out.println("Luas = " + sq1.getArea() + 
        " Keliling = " + sq1.getPerimeter());
    }   
}
