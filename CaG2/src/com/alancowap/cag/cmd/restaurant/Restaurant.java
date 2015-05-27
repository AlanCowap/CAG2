/** 
 *  Demo creating an instance of another class and invoking methods on that class
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies none
 *  
 *  
 */
//

package com.alancowap.cag.cmd.restaurant;


class Restaurant{
	public static void main(String[] args){
		LunchMenu myLunchMenu = new LunchMenu();
		myLunchMenu.addItemToMenu(4.99, "Chicken Casserole"); // 0
		myLunchMenu.addItemToMenu(9.99, "Steak & Chips"); // 1
		myLunchMenu.printMenu();

		myLunchMenu.deleteItemFromMenu(1);
		myLunchMenu.printMenu();

		Customer newCustomer = new Customer();
		newCustomer.setPhoneNumber("555-123456");
		String phoneNumber = newCustomer.getPhoneNumber();
		System.out.println(phoneNumber);
		
		Customer newestCustomer = new Customer();
		newestCustomer.setPhoneNumber("353-1-1234567");
		String phoneNumber2 = newestCustomer.getPhoneNumber();
		System.out.println(phoneNumber2);
		
	}

}