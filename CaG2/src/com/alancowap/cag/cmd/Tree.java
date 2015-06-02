/** 
 *  Simple class to represent a Tree
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


class Tree{

	//State
	private boolean evergreen;

	//Behaviour
	public void setEvergreen(boolean newEvergreen){
		this.evergreen = newEvergreen;
	}	

	public boolean getEvergreen(){
		return this.evergreen;
	}

}