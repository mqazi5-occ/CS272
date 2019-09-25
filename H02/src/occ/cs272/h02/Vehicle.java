/**
 * 
 */
package occ.cs272.h02;

/**
 * @author Mohammad Usman Qazi
 * @version Sep 9, 2019
 */
public class Vehicle
{
   private String id;
   private double mileage;

   public Vehicle(String anId)
   {
      id = anId;
      mileage = 0;
   }

   public void move(double milesMoved)
   {
      mileage = mileage + milesMoved;
   }

   public String getID()
   {
      return id;
   }
   
   public double getMileage()
   {
      return mileage;
   }
}
