/** 
 *  Simple class to demo arrays.
 *  
 *  Declare, create, initialise, and iterate over an array
 *  Create a Fibonacci series
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */

package com.alancowap.cag.cmd;

public class ArrayClass {

	public static void main(String[] args) {
		int[] scoreArray = new int[10]; // create an array of 10 int
		scoreArray[6] = 86;				// assign a value to the 6th array element
//		System.out.println(scoreArray[6]);
		
		//initialise elements of the array (Fibonacci)
		//the first element is already initialised to 0
		scoreArray[1] = 1;
		for(int i = 2; i < scoreArray.length; ++i){
			scoreArray[i] = scoreArray[i-1] + scoreArray[i-2];
		}
		
		//iterate over the array an output contents
		for(int i=0; i < scoreArray.length; ++i){
			System.out.print(scoreArray[i] + " ");
		}
		
	}

}
