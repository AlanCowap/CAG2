/** 
 *  Demo if else-if statement
 *  
 *	 
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies none
 *  
 *  
 */

package com.alancowap.cag.cmd;

class GradeApp{
	public static void main(String[] args){
		System.out.println("GradeApp");

		// get score
		int score = 88;
		char grade = 'Z';
		
		// compare score & output grade
		if (score > 84){
			grade = 'A';
		}else if (score > 69){
			grade = 'B';
		}else if (score > 54){
			grade = 'C';
		}else if (score > 39){
			grade = 'D';
		}else if (score > 24){
			grade = 'E';
		}else {
			grade = 'F';
		}

		//Output Grade
		System.out.println("You got an " + grade);
	}
}