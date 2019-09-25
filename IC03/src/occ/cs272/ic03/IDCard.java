/**
 * 
 */
package occ.cs272.ic03;

/**
 * @author Mohammad Usman Qazi
 * @version Sep 9, 2019
 */
public class IDCard extends Card {
	
	private String id;
	
	public IDCard(String n, String newId)
	{
		super(n);
		id = newId;
	}
	
	public String format()
	{
		return super.format() + ", ID Number: " + id;
	}
	
	public String toString()
	{
		return "IDCard [Name = " + getName() + "][ID = " + id + "]";
	}
	
	public boolean equals(IDCard c)
	{
		boolean result = false;
		if (super.equals(c) && id == c.id)
		{
			result = true;
		}
		return result;
	}
}
