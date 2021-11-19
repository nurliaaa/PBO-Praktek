/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasus2;

/**
 *
 * @author LIA
 */
public class DirtyBubble extends SuperHero {
	
	public DirtyBubble(int pwrLvl, String nm) {
		super(pwrLvl,nm);
		super.addPower(new Flying());
		super.addPower(new Strength());
	}
	
	public void identity() {
            System.out.println("It's " + super.getName() + ", the DirtyBubble!" + "It has the power level of " + super.getPowerLevel());
            System.out.println(".....HEED ME.....");
            System.out.println("FOR MY NAAAAAAAME IS " + super.getName().toUpperCase());
	}
	
}
