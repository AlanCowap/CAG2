/** 
 *  Simple class to represent an Email Application
 *  
 *  Demo object creation, getting and setting
 *  Demo usage of constructor, demo toString
 *  This is a simple sample class :)
 *  
 *  Assume learner has no knowledge of data structures, or iteration statements
 *  Simply allow 3 Contacts in the ContactBook
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 *  
 */
package com.alancowap.cag.cmd.email;

public class EmailApp {


	public static void main(String[] args) {
		System.out.println("Welcome to EmailApp");
		
		//Create and print out an Email
		Email myEmail = new Email("me@here.com", "you@there.com", "hi", "Great email!");
		myEmail.setCc("cc@somewhere.com");
		System.out.println(myEmail.toString());

		//Create three contacts
		Contact con1 = new Contact("Alan Cowap", "me@here.com", "00-353-1-1234567");
		Contact con2 = new Contact("Erwin Schrodinger", "cat@dias.ie", "00-353-1-123456");
		Contact con3 = new Contact("Richard Feynman", "feyn@caltech.edu", "555-123456");
		
		//Add contacts to ContactBook, print out contacts
		ContactBook cb = new ContactBook(con1, con2, con3);
		System.out.println(cb);
		
	}

}
