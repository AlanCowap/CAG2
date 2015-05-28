/** 
 *  Demo primitive declaration and initialisation
 *  Demo primitive literal default types (i.e. int, double)
 *  Demo casting with primitives
 *  Any integer literal is treated as an int (use L or l to specify as a long)
 *  Any floating point literal is treated as a double (use f or F to specify as a float)
 *  Note: Contains code that will cause compiler errors, can you debug these?
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies none
 *  
 *  
 */
package com.alancowap.cag.cmd;

public class Primitives {

	public static void main(String[] args){
	
		byte b = 127;
		b=128; // compiler does a range check and realises 128 is Out Of Range for a byte

		short s = 32767;
		s = 32768; // compiler does a range check and realises 32768 is Out Of Range for a short

		l = 10000000000; // compiler does a range check and realises this is Out Of Range for an int
		long l = 10000000000L; 
		
		float myFloat = 1.0; // compiler won't implicitly put a double into a float
		myFloat = 1.0F;
		
		b = 128; //still doesn't work
		byte b = (byte) 128;
		System.out.println(b); // Surprised by the output? Check out encoding using "Twos Complement"

	}

}
