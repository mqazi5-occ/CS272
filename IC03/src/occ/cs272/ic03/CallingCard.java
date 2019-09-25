/**
 * 
 */
package occ.cs272.ic03;

/**
 * @author Mohammad Usman Qazi
 * @version Sep 9, 2019
 */
public class CallingCard extends Card {
	
	private String cardNumber;
	private String pin;
	
	public CallingCard(String n, String newCardNumber, String newPin)
	{
		super(n);
		cardNumber = newCardNumber;
		pin = newPin;
	}
	
	public String format()
	{
		return super.format() + ", Card Number: " + cardNumber + ", PIN: " + pin;
	}
	
	public String toString()
	{
		return "CallingCard [Name = " + getName() + "][Number = " + cardNumber + ", PIN = " + pin + "]";
	}
}
