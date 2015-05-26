/** 
 *  Menu driven program to be run from the Command line
 *  Demonstrates I/O with user, if statements, basic operators: + - * /
 *  Can be improved to use if - else-if
 *	 
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies none
 *  
 *  
 */

package com.alancowap.cag.cmd;

//menu driven program giving user choice of numerical operators
//Demonstrates Console IO, numerical operators, if statement

import java.io.Console;

class Calculator{

	public static void main(String[] args){
		//Present Menu
		System.out.println("~~~~~ Welcome to Calculator ~~~~~");
		System.out.println("1) Addition");
		System.out.println("2) Subtraction");
		System.out.println("3) Multiplication");
		System.out.println("4) Division");

		//Display numbers
		int num1 = 100;
		int num2 = 10;
		System.out.println("Num1 is: " +num1 + " Num2 is:" + num2);

		//Get user choice
		Console con = System.console();
		String choice = con.readLine("Please enter a choice: ");		
		System.out.println("You chose " + choice);
		int selection = Integer.parseInt(choice);
		

		//Evaluate user choice
		if(selection == 1){
			System.out.println(num1 + num2);
		}
		if(selection == 2){
			System.out.println(num1 - num2);
		}
		if(selection == 3){
			System.out.println(num1 * num2);
		}
		if(selection == 4){
			System.out.println(num1 / num2);
		}

	}
}










