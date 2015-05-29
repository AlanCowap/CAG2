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

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}


	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Contact [name=" + name + ", email=" + email + ", phoneNumber="
				+ phoneNumber + "]";
	}

	
}
