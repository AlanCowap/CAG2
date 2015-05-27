/** 
 *  Demo console I/O, simple operators, rounding with int.
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies none
 *  
 *  
 */

package com.alancowap.cag.cmd;

import java.io.Console;

class BankApp{

	public static void main(String[] args){

		// Get user input
		Console con = System.console();
		String choice = con.readLine("Please enter principal: ");
		int principal = Integer.parseInt(choice);
		//System.out.println("You are investing " + principal);
		
		choice = con.readLine("Please enter interest rate: ");
		int rate = Integer.parseInt(choice);
		//System.out.println("Chosen interest rate is: " + rate + "%");

		// Calculate values
		int interestEarned = principal * rate / 100;
		int total = principal + interestEarned;
		
		// Print out results
		System.out.println("Interest earned: EURO " + interestEarned);
		System.out.println("Investment value: EURO " + total);
		

		// Integration and Testing
	}

}





//Inputs
//investment amount
//investment rate

//Outputs
//amount of interest earned
//total investment value


