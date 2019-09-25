/**
 * 
 */
package occ.cs272.ic03;

/**
 * @author Mohammad Usman Qazi
 * @version Sep 11, 2019
 */
public class BillFoldTester {

	public static void main(String[] args) {
		
		BillFold cards = new BillFold();
		
		Card dl = new DriverLicense("Natasha Romanoff", "2025");
		Card cc = new CallingCard("Tony Stark", "90412428", "3000");
		Card id = new IDCard("Steve Rogers", "16352954");
		
		System.out.println(cards.formatCards());
		
		cards.addCard(dl);
		System.out.println(cards.formatCards());
		
		cards.addCard(cc);
		System.out.println(cards.formatCards());
		
		cards.addCard(id);
		System.out.println(cards.formatCards());
	}

}
