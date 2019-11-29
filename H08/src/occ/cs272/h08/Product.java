/**
 * 
 */
package occ.cs272.h08;
import java.text.DecimalFormat;

/**
 * @author Mohammad Usman Qazi
 * @author Richard Pham
 * @version Nov 14, 2019
 */

public class Product 
{
	static DecimalFormat df = new DecimalFormat("0.00");
	private String UPC;
	private String name;
	private double price;
	
	public Product()
	{
		UPC = "00000";
		name = "NULL";
		price = 0;
	}
	
	public Product(String newUPC, String newName, double newPrice)
	{
		UPC = newUPC;
		name = newName;
		price = newPrice;
	}
	
	public void print()
	{
		System.out.println(UPC + "	" + name + "	$" + df.format(price));
	}
	
	public double getPrice()
	{
		return price;
	}
	
	// other needed functions...
	public String getUPC()
	{
		return UPC; 
	}
	
	public String getName()
	{
		return name; 
	}

	public void setPrice(double p)
	{
		price = p;
	}
	
	public void setUPC(String newUPC)
	{
		UPC = newUPC;
	}
	
	public void setName(String newN)
	{
		name = newN; 
	}
	
	public String toString()
	{
		return UPC + ", " + name + ", $" + df.format(price); 
	}
}
