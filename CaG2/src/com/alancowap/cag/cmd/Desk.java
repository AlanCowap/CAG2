/** 
 *  Simple class to represent a Desk
 *  
 *  Demo class definition, with state and behaviour
 *  This is a simple sample class :)
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.cag.cmd;

public class Desk {

	// State
	private int length;

	// Behaviour
	public void setLength(int newLength){
		this.length = newLength;
	}

	public int getLength(){
		return this.length;
	}

}
