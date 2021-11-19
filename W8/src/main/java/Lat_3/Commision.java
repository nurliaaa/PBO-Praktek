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
public class Commision extends Hourly {
	private double totalSale;
	private double CommisionRate;
	
	public Commision (String eName, String eAddress, String ePhone, 
					  String sosSecNumber, double rate, double comRate)
	{
		super (eName, eAddress, ePhone, sosSecNumber, rate);
		CommisionRate = comRate;
	}
	
	public void addSales (double totalSale){
		this.totalSale = totalSale * CommisionRate;
	}
	
	public double pay (){
		double payment = super.pay() + totalSale;
		totalSale = 0;
		return payment;
	}
	
	public String toString(){
		String result = super.toString();
		result += "\nTotal Sale : " + totalSale;
		return result;
	}
}
