package occ.cs272.ic07a;

/**
 * The sort method of this class sorts an array, using the bubble sort
 * algorithm.
 */
public class BubbleSorter 
{
	private static long count = 0;
	/**
	 * Sorts an array, using bubble sort.
	 * 
	 * @param a the array to sort
	 */
	public static void sort(int[] a) 
	{
		int len = a.length;
		int temp = 0;
		for (int i = 0; i < len; i++)
		{
			for (int j = 1; j < (len - i); j++)
			{
				if (a[j - 1] > a[j])
				{
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
				count++;
			}
		}
	}
	
	public static long getCount()
	{
		return count;
	}
}

