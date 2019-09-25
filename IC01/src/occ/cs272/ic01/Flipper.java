/**
 * 
 */
package occ.cs272.ic01;

import java.util.Scanner;

/**
 * @author Mohammad Usman Qazi
 * @version August 28, 2019
 *
 */
public class Flipper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Flipper\n------------------");
		Scanner input = new Scanner(System.in);
		System.out.print("How many coins do you want to flip?: ");
		int numOfCoins = input.nextInt();
		
		System.out.println("\nFlipped " + numOfCoins + " coins...\n");
		
		double coinFlip = 0.0;
		int headsCount = 0;
		int tailsCount = 0;
		int rowCount = 0;
		for (int i = 0; i < numOfCoins; i++) 
		{
			rowCount++;
			if (Math.random() < 0.5)
			{
				System.out.printf("%-7s", "Heads");
				headsCount++;
			} 
			else
			{
				System.out.printf("%-7s", "Tails");
				tailsCount++;
			}
			if (rowCount % 10 == 0)
			{
				System.out.println();
			}
		}
		//output spacing
		if (rowCount % 10 != 0)
		{
			System.out.println();
		}
			
		System.out.println("\nNumber of heads: " + headsCount);
		System.out.println("Number of tails: " + tailsCount);
		
	}

}
