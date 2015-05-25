/** 
 * Sample first class
 *  
 *	 
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies none
 *  
 *  
 */
package com.alancowap.cag.cmd;

import java.io.Console;

public class HelloWorld {

	public HelloWorld() {
		//Get number of loops from user
		Console con = System.console();
		String choice = con.readLine("Please enter number of loops: ");

		//Convert String to int
		int numLoops = 0;
		numLoops = Integer.parseInt(choice);

		//Print name
		for(int i=0; i < numLoops; ++i){
			System.out.println(i+1 + ") Alan Cowap");
		}
	}

}
