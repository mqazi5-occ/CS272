/**
 * 
 */
package occ.cs272.ic03;

/**
 * @author Mohammad Usman Qazi
 * @version Sep 9, 2019
 */
public class BillFold {
	
	private Card card1;
	private Card card2;
	
	public BillFold()
	{
		card1 = null;
		card2 = null;
	}
	
	public BillFold(Card newCard1, Card newCard2)
	{
		super();
		card1 = newCard1;
		card2 = newCard2;
	}
	
	public void addCard(Card c)
	{
		if (card1 == null)
		{
			card1 = c;
		}
		else if (card2 == null)
		{
			card2 = c;
		}
	}
	
	public String formatCards()
	{
		if (card1 == null)
		{
			return "Billfold [null]";
		}
		else if (card2 == null)
		{
			return "Billfold [" + card1.format() + "]";
		}
		return "Billfold [" + card1.format() + "][" + card2.format() + "]";
	}
}
