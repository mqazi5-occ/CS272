/**
 * 
 */
package occ.cs272.ic03b;

/**
 * @author Mohammad Usman Qazi
 * @version Sep 16, 2019
 */
public class Cat implements Speakable
{
	private String name;

	   public Cat(String name)
	   {
	      this.name = name;
	   }

	   public void speak()
	   {
	     System.out.println(name + " says meow, meow!");
	   }

	   public String toString()
	   {
	      return "Cat: " + name;
	   }
}
