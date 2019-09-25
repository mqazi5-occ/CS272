/**
 * 
 */
package occ.cs272.ic03b;

/**
 * @author Mohammad Usman Qazi
 * @version Sep 16, 2019
 */
public class Dog implements Speakable 
{
	private String name;

	   public Dog(String name)
	   {
	      this.name = name;
	   }

	   public void speak()
	   {
	     System.out.println(name + " says woof, woof!");
	   }

	   public String toString()
	   {
	      return "Dog: " + name;
	   }

}
