/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package roadusers;

import java.io.* ;

enum Status {on, off} ;

class Car 
	{
	private static enum Status {ON, OFF} ; // Defines an enumerated type - for variables needing only a fixed set of possible values.
	private String name ;
	private int selectedGear, velocity ;

	Status engine = Status.OFF ;

	public void startEngine()
		{
		System.out.println("Pumping fuel.... Rummm, beep, beep, ready to go!");
		engine = Status.ON ;
		}
	
	public void selectGear(int gearChoice)
		{
		selectedGear = gearChoice ;
		
		System.out.println("CAR: Gear number " + gearChoice + " has been selected") ;
		}
	
	public void accelerate(int speed)
		{
		velocity = speed ;
		
		System.out.println("CAR: Speed has now increased to " + velocity + " mph") ;
		}
	
	public void brake(int newSpeed)
		{
		velocity = newSpeed ;
		
		System.out.println("CAR: Speed has now reduced to " + velocity + " mph") ;
		}
		
	public void setName(String itsName)
		{
		name = itsName ;
		
		System.out.println("CAR: The new car's name is: " + name) ;
		}
		
	public String getName()
		{
		return name ;
		}
		
	} // End of class Car
