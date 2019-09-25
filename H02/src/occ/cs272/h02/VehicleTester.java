/**
 * 
 */
package occ.cs272.h02;

/**
 * @author Mohammad Usman Qazi
 * @version Sep 9, 2019
 */
public class VehicleTester
{
   public static void main(String[] args)
   {
      Vehicle myVehicle = new Auto("0149162536496481100", "5ZSN090");
      myVehicle.move(1000);
      myVehicle.move(2000);
      System.out.println(myVehicle.getID());
      System.out.println("Expected: VIN=0149162536496481100,plate=5ZSN090");
      System.out.println(myVehicle.getMileage());
      System.out.println("Expected: 3000.0");
   }        
}