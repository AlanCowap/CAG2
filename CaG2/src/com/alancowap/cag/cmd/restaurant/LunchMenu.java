/** 
 *  Demo class State and Behaviour
 *  Could improve with access modifiers for instance variables  
 *	 
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies none
 *  
 *  
 */

package com.alancowap.cag.cmd.restaurant;

class LunchMenu{
	// State
	double[] prices = new double[10];
	String[] items = new String[10];
	int currentItemNumber= 0;

	//Behaviour
	public void addItemToMenu(double price, String item){
		prices[currentItemNumber] = price;
		items[currentItemNumber] = item;
		currentItemNumber++;
	}

	//Delete a menu item
	public void deleteItemFromMenu(int index){
		prices[index] = 0.0D;
		items[index] = "";
	}

	// print out the menu
	public void printMenu(){
		for(int i=0; i < this.currentItemNumber; ++i){
			System.out.println(prices[i] +" " + items[i]);
		}
	}

}

