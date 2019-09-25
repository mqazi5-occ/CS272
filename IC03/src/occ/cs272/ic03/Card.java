/**
 * 
 */
package occ.cs272.ic03;

/**
 * @author Mohammad Usman Qazi
 * @version Sep 9, 2019
 */
public class Card
{
   private String name;

   public Card()
   {
      name = "";
   }

   public Card(String n)
   {
      name = n;
   }

   public String getName()
   {
      return name;
   }

   public boolean isExpired()
   {
      return false;
   }

   public String format()
   {
      return "Card Holder: " + name;
   }
   
   public String toString()
   {
	   return "Card [Name = " + name + "]";
   }
   
   public boolean equals(Card c)
   {
	   boolean result = false;
	   if (getClass() == c.getClass() && name == c.getName())
	   {
		   result = true;
	   }
	   return result;
   }
}

