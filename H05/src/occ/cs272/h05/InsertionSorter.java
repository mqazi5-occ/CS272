package occ.cs272.h05;
/**
   The sort method of this class sorts an array, using the insertion 
   sort algorithm.
 */
public class InsertionSorter
{
	private static long compareCount = 0;
	private static long visitCount = 0;
    /**
      Sorts an array, using insertion sort.
      @param a the array to sort
     */
    public static void sort(int[] a)
    {
        for (int i = 1; i < a.length; i++)
        {
            int next = a[i];
            // Move all larger elements up
            int j = i;
            compareCount++;
            while (j > 0 && a[j - 1] > next)
            {
                a[j] = a[j - 1];
                j--;
                compareCount++;
                visitCount++;
            }
            // Insert the element
            a[j] = next;
        }
    }
    
    public static long getCompareCount()
    {
    	return compareCount;
    }
    
    public static long getVisitCount()
    {
    	return visitCount;
    }
    
    public static void resetCompareCount()
    {
    	compareCount = 0;
    }
    
    public static void resetVisitCount()
    {
    	visitCount = 0;
    }
}
