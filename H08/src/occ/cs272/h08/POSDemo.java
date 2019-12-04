/**
 * 
 */
package occ.cs272.h08;

import java.util.*;

import javax.swing.JOptionPane;

import java.io.*;
import java.text.DecimalFormat;
/**
 * @author Mohammad Usman Qazi
 * @author Richard Pham
 * @version Nov 14, 2019
 */
public class POSDemo
{
	private static DecimalFormat df = new DecimalFormat("0.00");
	private static final double TAX = 0.075;
	private static Scanner in = new Scanner(System.in);
	private static Cart cart = new Cart();
	
	public POSDemo()
	{
		cart = new Cart();
	}
	
	public static Cart getCart()
	{
		return cart;
	}
	
	public static Product search(String UPC) throws FileNotFoundException
	{
		File input = null; 
		input = new File("inventory.txt");
		Product p = null;
		Scanner in1 = new Scanner(input);
		boolean found = false; 
		String UPCtoFind = "";
		while(in1.hasNextLine() && !found)
		{
			UPCtoFind = in1.next();
			if(UPC.equals(UPCtoFind))
			{
				found = true;
			}
			else
			{
				in1.nextLine();
			}
		}
		
		if (found)
		{
			String name = in1.next(); 
			double price = in1.nextDouble();
			p = new Product(UPCtoFind, name, price); 
			in1.close();
		}
		else
		{
			System.err.println("Item not found! Please try again.");
			JOptionPane.showMessageDialog(POSFrame.getFrame(), "Item not found! Please try again.");
		}
		return p;
	}
	
	public static void scan(String UPC) throws FileNotFoundException
	{
		Product p = search(UPC);
		
		if (p != null)
		{
			cart.addToCart(p);
		}
		
		cart.print();
	}
	
	public static double priceCheck(String UPC) throws FileNotFoundException
	{
		Product p = search(UPC);
		System.out.println("$" + df.format(p.getPrice()));
		System.out.println("-----------------------------------");
		return p.getPrice();
	}
	
	public static void voidItem(String UPC) throws FileNotFoundException
	{
		Product p = search(UPC);
		
		if (p != null)
		{
			cart.removeItem(p.getUPC());
		}
		cart.print();
	}
	
	public static void voidTrans()
	{
		System.out.println("-----------------------------------");
		System.out.println("VOID TRANSACTION");
		cart = null;
		System.gc();
		cart = new Cart();
		cart.print();
	}
	
	public static void checkout()
	{
		cart.print();
		
		System.out.println("SUBTOTAL: $" + df.format(cart.getTotal()));
		System.out.println("TAX:      $" + df.format((cart.getTotal() * TAX)));
		double total = cart.getTotal() + (cart.getTotal() * TAX);
		System.out.println("TOTAL:    $" + df.format(total));
		System.exit(0);
	}
}
