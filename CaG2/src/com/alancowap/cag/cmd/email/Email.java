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
	
	
	/**
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}


	/**
	 * @param from the from to set
	 */
	public void setFrom(String from) {
		this.from = from;
	}

	/**
	 * @return the to
	 */
	public String getTo() {
		return to;
	}

	/**
	 * @param to the to to set
	 */
	public void setTo(String to) {
		this.to = to;
	}

	/**
	 * @return the cc
	 */
	public String getCc() {
		return cc;
	}

	/**
	 * @param cc the cc to set
	 */
	public void setCc(String cc) {
		this.cc = cc;
	}

	/**
	 * @return the bcc
	 */
	public String getBcc() {
		return bcc;
	}

	/**
	 * @param bcc the bcc to set
	 */
	public void setBcc(String bcc) {
		this.bcc = bcc;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * @return the body
	 */
	public String getBody() {
		return body;
	}

	/**
	 * @param body the body to set
	 */
	public void setBody(String body) {
		this.body = body;
	}

}
