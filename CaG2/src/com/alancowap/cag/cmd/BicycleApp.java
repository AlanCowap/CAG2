/** 
 *  Demo object creation, and method invocation 
 *  Demo keeping main() method separate from class definitions
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies Bicycle.java
 *  
 *  
 */
package com.alancowap.cag.cmd;

public class BicycleApp {

	public static void main(String[] args) {
		Bicycle myBicycle = new Bicycle();
		System.out.println("Current gear is: " + myBicycle.getGear() );
		myBicycle.setGear(10);
		System.out.println("New gear is: " + myBicycle.getGear() );
	}

}
