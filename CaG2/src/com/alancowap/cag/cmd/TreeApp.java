/** 
 *  Simple class to represent a Tree Application
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

class TreeApp{

	public static void main(String[] args){
		System.out.println("Hello world");

		Tree myTree = new Tree();
		myTree.setEvergreen(false);
		System.out.println("Evergreen: " + myTree.getEvergreen() );

	}

}