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
public class Circle {
    
    private double radius;
    //menambahkan variable color : String
    private String color;
    
    public Circle (){
        radius = 1.0;
        color = "red";
    }
    
    public Circle(double r){
        radius = r;
        color = "red";
    }
    
        // menambahkan contructor
    public Circle(double R, String C){
        radius = R;
        color = C;
    }
    
    // menambahkan getter dan setter
    public String getColor(){
        return color;
    }
    
     public void setColor(String color){
        this.color = color;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public double getArea(){
        return radius*radius*Math.PI;
    }
    
    public String toString(){
      return "Circle[radius=" + radius + "color=" + color + "]";  
    }
    
}
