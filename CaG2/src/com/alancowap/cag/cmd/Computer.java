/** 
 *  Simple class to demo local variables & instance variables
 *  
 *  instance variables belong to the whole class
 *  local variables belong to the method (or other code block e.g. if-statement).
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */

package com.alancowap.cag.cmd;

public class Computer {
	
	//instance variables. These get initialised to default values
	private String manufacturer;
	private int ramGB = 4; // Gigabytes 
	
	
	public void setRam(int ram){
		if(ram > 0){
			ramGB = ram;
		}else{
			System.out.println("RAM must be greater than 0 GB");
		}
	}
	
	public int getRam(){
		return ramGB;
	}
	
	public void doubleRam(){

		System.out.println("RAM in GB:" + ramGB);
		int doubleRam = ramGB * 2;	//local variable (will not be initialised)
		System.out.println("Double RAM in GB:" + doubleRam);
//		System.out.println("Half RAM in GB:" + halfRam); //can't access halfRam from this method
		ramGB *= 2;
	}
	
	public void halfRam(){
		System.out.println("RAM in GB:" + ramGB);
		int halfRam = ramGB / 2; //local variable (will not be initialised)
		System.out.println("Half RAM in GB:" + halfRam);
//		System.out.println("Double RAM in GB:" + doubleRam); //can't access doubleRam from this method
	}

}
