/**
 * 
 */
package occ.cs272.ic03;

/**
 * @author Mohammad Usman Qazi
 * @version Sep 9, 2019
 */
public class DriverLicense extends Card {
	
	private String expYear;
	
	public DriverLicense(String n, String newExpYear)
	{
		super(n);
		expYear = newExpYear;
	}
	
	public String format()
	{
		return super.format() + ", Expiration Year: " + expYear;
	}
	
	public String toString()
	{
		return "DriverLicense [Name = " + getName() + "][Expiration Year = " + expYear + "]";
	}
}
