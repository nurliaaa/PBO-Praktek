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
public class Shape {
    private String color;
	private boolean filled;
	
	public Shape() {
		color = "green";
		filled = true;
	}
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public String toString() {
		return "Shape[color= " + getColor() + " ,filled= " + isFilled() + "]";
	}
}