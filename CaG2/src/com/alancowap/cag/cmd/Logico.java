/** 
 *  Simple class to demo logical operators
 *  
 *  Use of &&, || and ! logical operators (AND, OR, NOT)
 *  Use of compound assignment operators
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */

package com.alancowap.cag.cmd;

public class Logico {

	public static void main(String[] args) {
		
		int points = 0;
		System.out.println(points); //0
		points = points + 10;
		System.out.println(points);//10
		points += 10; //compound assignment operator
		System.out.println(points);//20
		points -= 5;
		System.out.println(points);//15
		
		
		boolean hasTicket = true; 
		boolean isOver18 = false;
		boolean onGuestlist = true;
		boolean onBlacklist = true;
		
		//Allow entry to people over 18 with a ticket. AND
		if(isOver18 && hasTicket){
			System.out.println("Person is over 18, and has ticket");
		}else{
			System.out.println("Sorry, entry refused");
		}
		
		//Allow entry to people with a ticket or on Guestlist (all ages event). OR
		if(hasTicket || onGuestlist){
			System.out.println("Person has ticket or is on Guestlist");
		}else{
			System.out.println("Sorry, entry refused");
		}
		
		//Allow entry to people not on the blacklist. NOT
		if (!onBlacklist){
			System.out.println("Allow entry, not on Blacklist");
		}else{
			System.out.println("Deny entry, subject is on Blacklist");
		}
//		System.out.println("onBlacklist: " + onBlacklist);
//		System.out.println("!onBlacklist: " + !onBlacklist);
		
		
	}

}
