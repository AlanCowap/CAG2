/** 
 *  Simple class to represent a ContactBook
 *  
 *  Demo class definition, with state and behaviour
 *  Demo constructor, demo toString
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

public class ContactBook {

	//State
	Contact contact1;
	Contact contact2;
	Contact contact3;
	
	/**
	 * Sample constructor to create a ContactBook, containing (referencing) 3 Contact objects
	 * 
	 * 
	 * @param contact1
	 * @param contact2
	 * @param contact3
	 */
	public ContactBook(Contact contact1, Contact contact2, Contact contact3) {
		super();
		this.contact1 = contact1;
		this.contact2 = contact2;
		this.contact3 = contact3;
	}

	
	//Behaviour
	
	/**
	 * @return the contact1
	 */
	public Contact getContact1() {
		return contact1;
	}

	/**
	 * @param contact1 the contact1 to set
	 */
	public void setContact1(Contact contact1) {
		this.contact1 = contact1;
	}

	/**
	 * @return the contact2
	 */
	public Contact getContact2() {
		return contact2;
	}

	/**
	 * @param contact2 the contact2 to set
	 */
	public void setContact2(Contact contact2) {
		this.contact2 = contact2;
	}

	/**
	 * @return the contact3
	 */
	public Contact getContact3() {
		return contact3;
	}

	/**
	 * @param contact3 the contact3 to set
	 */
	public void setContact3(Contact contact3) {
		this.contact3 = contact3;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ContactBook [contact1=" + contact1 + ", \ncontact2=" + contact2
				+ ", \ncontact3=" + contact3 + "]";
	}

	
}
