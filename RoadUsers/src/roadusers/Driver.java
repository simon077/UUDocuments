/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package roadusers;

import java.io.* ;

class Driver 
	{
	private Car ownedVehicle ;
	
	public void purchaseVehicle(Manufacturer from)
		{
			
		ownedVehicle = from.sellMeACar() ;
		
		if(ownedVehicle != null)
			{
			System.out.println("DRIVER: I now have a car. Its name is: " + ownedVehicle.getName()) ;
			}
		else
			{
			System.out.println("DRIVER: Manufacturer had no cars for sale");
			} 
					
		} // End of method 'purchaseVehicle'.
	
	public void driveCar()
		{
		ownedVehicle.selectGear(1) ;
		ownedVehicle.accelerate(30);
		ownedVehicle.brake(10);
		}
	
	} // End of class 'Driver'
