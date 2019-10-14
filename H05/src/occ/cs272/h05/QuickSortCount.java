package occ.cs272.h05;

import java.util.Arrays;

public class QuickSortCount 
{
	public static void main(String[] args)
    {  
		int[] a = ArrayUtil.randomIntArray(10000, 10000);

        QuickSorter.sort(a);

        System.out.println("Comparison Counter: " + QuickSorter.getCompareCount());
        System.out.println("Visit Counter: " + QuickSorter.getVisitCount());
        
        QuickSorter.resetCompareCount();
        QuickSorter.resetVisitCount();
        MergeSorter.sort(a);
        System.out.println("Comparison Counter (sorted): " + QuickSorter.getCompareCount());
        System.out.println("Visit Counter (sorted): " + QuickSorter.getVisitCount());
        
        QuickSorter.resetCompareCount();
        QuickSorter.resetVisitCount();
        int i = 0; 
    	int c = 10000; 
    	while(c > 0)
    	{
    		a[i] = c; 
    		c--; 
    		i++; 
    	}
    	QuickSorter.sort(a);
        System.out.println("Comparison Counter (reversed): " + QuickSorter.getCompareCount());
        System.out.println("Visit Counter (reversed): " + QuickSorter.getVisitCount());
    }
}
