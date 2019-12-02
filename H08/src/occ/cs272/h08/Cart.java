/**
 * 
 */
package occ.cs272.h08;

/**
 * @author Mohammad Usman Qazi
 * @author Richard Pham
 * @version Nov 17, 2019
 */
public class Cart 
{
	private Product[] cart;
	private int numOfItems;
	
	public Cart()
	{
		cart = new Product[9999];
		numOfItems = 0;
	}
	
	public void addToCart(Product p)
	{
		cart[numOfItems] = p;
		numOfItems++;
	}
	
	public double getTotal()
	{
		double total = 0.0;
		for (int i = 0; i < numOfItems; i++)
		{
			total += cart[i].getPrice();
		}
		return total;
	}
	
	public void print()
	{
		System.out.println("-----------------------------------");
		System.out.println("CART:");
		for (int i = 0; i < numOfItems; i++)
		{
			cart[i].print();
		}
		System.out.println("-----------------------------------");
	}
	
	public void removeItem(String UPC)
	{
		boolean found = false;
		int count = 0;
		while(!found)
		{
			if(cart[count].getUPC().equals(UPC))
			{
				found = true; 
			}
			else
				count++;
		}
		for(int i = count; i < numOfItems; i++)
		{
			cart[i] = cart[i+1];
		}
		numOfItems--;
	}
	
	public Product getProduct(int i)
	{
		return cart[i];
	}
	
	public boolean isEmpty()
	{
		return (numOfItems == 0);
	}
}
