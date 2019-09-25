/**
 * 
 */
package occ.cs272.ic01;

/**
 * @author Mohammad Usman Qazi
 * @version August 28, 2019
 */
public class RandomArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int [100];
		int rowCount = 0;
		
		for (int i = 0; i < 100; i++)
		{
			a[i] = (int)(Math.random() * ((75 - 25) + 1)) + 25;
			if (rowCount % 20 == 0 && rowCount != 0)
			{
				System.out.println();
			}
			System.out.print(a[i] + " ");
			rowCount++;
		}
	}

}
