package occ.cs272.h05;
/**
   The sort method of this class sorts an array, using the quick 
   sort algorithm.
 */
public class QuickSorter
{
	private static long compareCount = 0;
	private static long visitCount = 0;
    /**
      Sorts an array, using quick sort.
      @param a the array to sort
     */
    public static void sort(int[] a)
    {  
        sort(a, 0, a.length - 1);
    }

    /**
      Sorts a portion of an array, using quick sort.
      @param a the array to sort
      @param from the first index of the portion to be sorted
      @param to the last index of the portion to be sorted
     */
    public static void sort(int[] a, int from, int to)
    {
        if (from >= to) 
        {
        	compareCount++;
        	return;
        }
        int p = partition(a, from, to);
        sort(a, from, p);
        sort(a, p + 1, to);
    }

    /**
      Partitions a portion of an array.
      @param a the array to partition
      @param from the first index of the portion to be partitioned
      @param to the last index of the portion to be partitioned
      @return the last index of the first partition
     */
    private static int partition(int[] a, int from, int to)
    {
    	int pivot = a[from];
        int i = from - 1;
        int j = to + 1;
        while (i < j)
        {
            i++; 
            while (a[i] < pivot) 
            { 
            	i++; 
            	compareCount++;
            }
            j--; 
            while (a[j] > pivot) 
            { 
            	j--; 
            	compareCount++;
            }
            if (i < j) 
            { 
            	ArrayUtil.swap(a, i, j); 
            	visitCount++;
            }
        }
        return j;
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
