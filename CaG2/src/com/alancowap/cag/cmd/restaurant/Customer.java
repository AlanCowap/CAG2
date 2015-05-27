/** 
 *  Demo class State and Behaviour
 *  Could improve with access modifiers for instance variables  
 *	 
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies none
 *  
 *  
 */

package com.alancowap.cag.cmd.restaurant;

class Customer{

	//State
	String phoneNumber;
	String name;
	String address;

	//Behaviour
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;		
	}

	public String getPhoneNumber(){
		return this.phoneNumber;
	}
}