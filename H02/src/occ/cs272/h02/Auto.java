/**
 * 
 */
package occ.cs272.h02;

/**
 * @author Mohammad Usman Qazi
 * @version Sep 9, 2019
 */

/**
Represents an automobile.
*/
public class Auto extends Vehicle // TODO: Inherit from Vehicle
{
	// TODO: Declare instance variables
	private String licensePlate;
	
	public Auto(String vin, String plate)
	{
	   // TODO: Complete the constructor
		super(vin);
		licensePlate = plate;
	}
	
	// TODO:  implement the getID() method for autos
	public String getID()
	{
		String result = "VIN=" + super.getID() + ",plate=" + licensePlate;
		return result;
	}
}