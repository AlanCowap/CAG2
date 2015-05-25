/** 
 *  Demonstrate non-static vs static variables
 *  Can be improved to use access modifiers for member variables
 *	 
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies none
 *  
 *  
 */

package com.alancowap.cag.cmd;

public class Person{

	//inidividual state/attributes/characteristics
	//these are all non-static
	String name;
	int age;
	char gender;

	//common value(s). this is static
	static int numberOfPeople = 0;

	public static void main(String[] args){

		System.out.println("Number of people is " + numberOfPeople);

		//Create a Person
		Person me = new Person();
		numberOfPeople++;
		me.age = 21;
		me.name = "Alan";
		me.gender='M';
		System.out.println("Number of people is " + numberOfPeople);

		//Create a second Person
		Person you = new Person();
		numberOfPeople++;
		you.age = 24;
		you.name = "Sarah";
		you.gender='F';
		System.out.println("Number of people is " + numberOfPeople);


		//Show persons details
		System.out.println(me.age + me.name + me.gender);
		System.out.println(you.age + you.name + you.gender);

	}

}