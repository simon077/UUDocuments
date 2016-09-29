/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package roadusers;

import java.io.* ;

class Manufacturer 
	{
	// Create an area where cars can be stored.
	
	private Car[] stock = new Car[20] ;

	// Note: The above statement creates an array of 20 references to Cars - 
	// It does NOT create 20 Cars (instances of the Car class).
	
	private int numberInStock = 0;
	
	// ------------------------------------------------------------------------------------
	
	public boolean makeCar()
		{
		boolean returnValue ;
		
		System.out.println("MANUFACTURER: Method 'makeCar' called");
			
		if (numberInStock < 20)
			{
			// Still room for more cars
			
			stock[numberInStock] = new Car() ;  // Instantiating a new car
			
			stock[numberInStock].setName("Car index number " + numberInStock) ;
			
			numberInStock++ ; // Increment the stock level
			
			returnValue = true ;
			}
		else
			{
			returnValue = false ;
			}
			
		return returnValue ;
		
		} // End of method 'makeCar'
		
    // -----------------------------------------------------------------------------------	
	public Car sellMeACar()
		{
		Car purchasedCar ;
		
		System.out.println("MANUFACTURER: Method 'sellMeACar' called");
			
		if(numberInStock > 1)
			{
			purchasedCar = stock[numberInStock-1] ; // Allocates a free car to the purchaser 
											// - object reference is returned to the 'Driver' object.
		
			System.out.println("The name of the purchased car is: " + purchasedCar.getName()) ;
		
			numberInStock-- ; // Decrement stock level
			}
		else
			{
			purchasedCar = null ;
			}	
					
		return purchasedCar ; // Returns a response indicating success or failure to the calling method
		
		} // end of method 'sellMeACar'
		
	// --------------------------------------------------------------------------------
	
	} // End of class 'Manufacturer'
