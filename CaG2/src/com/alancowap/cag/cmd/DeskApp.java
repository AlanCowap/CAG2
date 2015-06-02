/** 
 *  Simple class to represent an Desk Application
 *  
 *  Demo object creation, setting and getting state
 *  This is a simple sample class :)
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */

package com.alancowap.cag.cmd;

public class DeskApp {

	public static void main(String[] args){
		Desk myDesk = new Desk();
		myDesk.setLength(100);
		System.out.println("Length = " + myDesk.getLength() );
	}

}
