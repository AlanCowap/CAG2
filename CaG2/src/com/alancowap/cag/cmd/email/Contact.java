/** 
 *  Demo class definition, with state and behaviour
 *  This is a simple sample class
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 *  
 */
package com.alancowap.cag.cmd.email;

public class Contact {

	//State
	private String name;
	private String email;
	private String phoneNumber;
	

	/**
	 * Sample constructor to create a simple Contact
	 * This constructor is called with e.g. new Email("Alan Cowap", "me@here.com", "00-353-1-1234567")
	 * 
	 * @param name
	 * @param email
	 * @param phoneNumber
	 */
	public Contact(String name, String email, String phoneNumber) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	//Behaviour
	
	
}
