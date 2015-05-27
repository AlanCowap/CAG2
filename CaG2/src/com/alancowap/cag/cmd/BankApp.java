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
		int interestEarned = (principal * rate) / 100; //if possible multiply first, divide last to reduce rounding errors
		int total = principal + interestEarned;
		
		// Print out results
		System.out.println("Interest earned: EURO " + interestEarned);
		System.out.println("Investment value: EURO " + total);
		
		// Integration and Testing
		//Test with principal of 1000, and interest rate of 10%
		//Test with principal of 999, and interest rate of 10% - what effect did the rounding have
		
	}

}


/*
  PROBLEM DEFINITION
  
	Your team has been asked to write the BankApp application for a well known bank.
	The BankApp application should allow an investment advisor to input an investment amount,
	and an investment rate. The investment advisor should then be given the amount of the
	interest earned, and the total value of the investment.

 PROBLEM ANALYSIS

	Inputs:
	investment amount
	investment rate
	
	Outputs:
	amount of interest earned
	total investment value

 */