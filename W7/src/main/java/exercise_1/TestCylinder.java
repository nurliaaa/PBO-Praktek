/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_1;

/**
 *
 * @author LIA
 */
public class TestCylinder {
     public static void main (String[] args) {
       
       Cylinder c1 = new Cylinder();
       System.out.println(c1.toString());
       
       Cylinder c4 = new Cylinder();
        System.out.println("Cylinder:"
            + " radius=" + c4.getRadius()
            + " height=" + c4.getHeight()
            + " base area=" + c4.getArea()
            + " volume=" + c4.getVolume());

        Cylinder c5 = new Cylinder(10.0); 
        System.out.println("Cylinder:"
            + " radius=" + c5.getRadius()
            + " height=" + c5.getHeight()
            + " base area=" + c5.getArea()
            + " volume=" + c5.getVolume());
        
        Cylinder c3 = new Cylinder(2.0, 10.0); 
        System.out.println("Cylinder:"
            + " radius=" + c3.getRadius()
            + " height=" + c3.getHeight()
            + " base area=" + c3.getArea()
            + " volume=" + c3.getVolume());
        
    }
}
