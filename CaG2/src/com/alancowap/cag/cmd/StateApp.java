/** 
 *  Demo pre/post inc/dec-rement operators
 *  
 *	 
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies none
 *  
 *  
 */
package com.alancowap.cag.cmd;

public class StateApp{
	//state (instance variables)
	String name = "Richard Feynman";
	int age = 21;


	public static void main(String[] args){
		StateApp sa = new StateApp();
		sa.beginApp();		
	}

	public void beginApp(){
		System.out.println("Hello " + name);
		System.out.println(age);
		//age++;
		System.out.println("New age is " + age++); //we expect 22
		//age--;
		System.out.println("New age is " + age--);//we expect 21
		System.out.println(age);
	}

}
