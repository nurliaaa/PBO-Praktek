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
import java.util.*;

abstract class SuperHero implements Comparable<SuperHero> {
	protected int powerLevel;
	protected String name;
	protected List <Power> powerList;
	
	public SuperHero(int pLv, String name) {
		powerLevel = pLv;
		this.name = name;
		powerList = new ArrayList<Power>();
	}
	
	public int getPowerLevel() {
		return powerLevel;
	}
	
	public String getName() {
		return name;
	}
	
	public void addPower(Power power) {
		powerList.add(power);
	}
	
	abstract void identity();
	
	public void showPowers() {
		System.out.println("TIME TO SHOW YOU MY POWERS");
		for (Power p:powerList) {
			p.doPower();
		}
	}
	
	@Override
	public int compareTo(SuperHero s){
		if(this.powerLevel > s.powerLevel) {
			return 1;
		}else if(this.powerLevel < s.powerLevel) {
			return -1;
		}
		return 0;
	}
}
