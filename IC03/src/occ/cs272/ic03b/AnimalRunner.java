/**
 * 
 */
package occ.cs272.ic03b;

import java.util.*;

/**
 * @author Mohammad Usman Qazi
 * @version Sep 16, 2019
 */
public class AnimalRunner 
{	
	public static void main(String[] args)
	   {
	      ArrayList<Speakable> dogcatList = new ArrayList<Speakable>();
	      dogcatList.add(new Dog("Fred"));
	      dogcatList.add(new Cat("Wanda"));
	      for (Speakable obj : dogcatList)
	      {
	    	  obj.speak();
	      }
	   }
}
