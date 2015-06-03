/** 
 *  Demo iteration statement (while loop)
 *  
 *	 
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies none
 *  
 *  
 */

package com.alancowap.cag.cmd.iteration;

public class GameApp {

	public static void main(String[] args) {
		int numLives = 4;
		while( numLives != 0 ){
			System.out.println("Number of lives remaining: " + numLives);
			numLives--;	
		}
		System.out.println("GAME OVER");		
	}

}
