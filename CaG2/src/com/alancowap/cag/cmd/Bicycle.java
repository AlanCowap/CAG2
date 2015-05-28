/** 
 *  Demo Class definition, with State and Behaviour.
 *  Demo object creation, and method invocation 
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies none
 *  
 *  
 */

package com.alancowap.cag.cmd;

public class Bicycle {
	
	//State
	int gear=3;

	//Behaviour
	public void setGear(int newGear){
		gear = newGear;
	}

	public int getGear(){
		return gear;
	}

	public static void main(String[] args){
		Bicycle myBicycle = new Bicycle();
		System.out.println("Current gear is: " + myBicycle.getGear() );
		myBicycle.setGear(5);
		System.out.println("New gear is: " + myBicycle.getGear() );
	}

}
