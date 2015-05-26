/** 
 *  Demo conditional statement: If statement
 *  
 *	 
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies none
 *  
 *  
 */
package com.alancowap.cag.cmd;

class IfApp{

	public static void main(String[] args){
		IfApp ia = new IfApp();
		ia.beginApp();
	}

	private void beginApp(){
		int age = 18;
		if(age > 17){
			System.out.println("You can join!"); //will only be printed if age is greater than 17
		}
	}
}