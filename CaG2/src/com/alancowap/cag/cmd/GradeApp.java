/** 
 *  Demo if else-if else statement
 *  Demo switch statement
 *	 
 * @author Alan Cowap 
 * @version 1.1  
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

		// Use switch statement to convert grade to score range
		String result = "Not set";
		switch (grade){
			case 'A' : result = "85-100"; break;
			case 'B' : result = "70-84"; break;
			case 'C' : result = "55-69"; break;
			case 'D' : result = "40-54"; break;
			default  : result = "Fail"; break;
		}
		System.out.println(result);

	}

}
