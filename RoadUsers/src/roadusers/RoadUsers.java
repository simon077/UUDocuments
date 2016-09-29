/**
 * @(#)RoadUsers.java
 *
 * RoadUsers application
 *
 * @author : F.G Wilkie 
 * @version 1.00 2009/10/22
 */
 
package roadusers;

import java.io.* ;

public class RoadUsers 
	{
    Driver george ;
    
    public static void main(String[] args) throws IOException 
    	{
    	// This small program is used to demonstrate the creation of some objects,
    	// the passing of objects as references and the interaction between objects
    	// via message passing.
    	// It involves three user-defined classes: Driver, Manufacturer and Car.
    	
    	RoadUsers exampleProg = new RoadUsers() ;
    	
    	exampleProg.start() ;
    	}
    	
    public void start()
    	{
    	boolean result = true ;
    	int counter = 0 ;
    	
    	// First of all we will create an instance of a Driver, called "george"
    	
    	george = new Driver() ;
    	
    	// Then we will create an instance of the Manufacturer class and request it to create three cars - building up its stock
    	
    	Manufacturer dorf = new Manufacturer() ;
    	
    	while((result) && counter < 3)
    		{
    		result = dorf.makeCar() ;
    		
    		if (result)
    			{
    			counter++ ; // Increment the counter variable
    			
    			System.out.println("Car " + counter + " has been created") ;		
    			}
    		else
    			{
    			System.out.println("Stock dept. now full!") ;
    			}
    		} // End of While statement
    		
    	// Now we will instruct "george" to purchase a new car from the "dorf" manufacturer
    	
    	george.purchaseVehicle(dorf) ;
    	
    	// The we will get "george" to drive the car
    	
    	george.driveCar() ;
    	
    	}
	} // End of class 'RoadUsers'