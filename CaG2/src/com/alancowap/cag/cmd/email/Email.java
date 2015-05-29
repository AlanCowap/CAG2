/** 
 *  Demo class definition, with state and behaviour
 *  
 *  Could be improved to allow multiple to, cc, and bcc
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 *  
 */
package com.alancowap.cag.cmd.email;

public class Email {

	// state
	private String from;
	private String to;
	private String cc;
	private String bcc;
	private String subject;
	private String body;
	
	/**
	 * Sample cosntructor to create a simple Email
	 * This construcor is called with e.g. new Email("me@here.com", "you@there.com", "hi", "hello world")
	 * 
	 * @param from
	 * @param to
	 * @param subject
	 * @param body
	 */
	public Email(String from, String to, String subject, String body) {
		this.from = from;
		this.to = to;
		this.subject = subject;
		this.body = body;
	}
	
	
	//Behaviour
	

}
