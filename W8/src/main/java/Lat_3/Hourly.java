/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat_3;

/**
 *
 * @author LIA
 */

public class Hourly extends Employee{
	
	private int hoursWorked;
	
	public Hourly (String eName, String eAddress, String ePhone, String sosSecNumber, double rate)
	{
		super (eName, eAddress, ePhone, sosSecNumber, rate);
		
		hoursWorked = 0;
	}
	
	public void addHours (int moreHours)
	{
		hoursWorked +=moreHours;
	}
	
	public double pay ()
	{
		double payment = payRate * hoursWorked;
		
		hoursWorked = 0;
		
		return payment;
	}
	
	public String toString () {
		String result = super. toString();
		
		result += "\nCurrent hourse " + hoursWorked;
		
		return result;
	}
	
}