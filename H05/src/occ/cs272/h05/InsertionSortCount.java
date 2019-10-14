package occ.cs272.h05;

import java.util.Scanner;

public class InsertionSortCount 
{
	public static void main(String[] args)
    {  
		int[] a = ArrayUtil.randomIntArray(10000, 10000);

        InsertionSorter.sort(a);

        System.out.println("Comparison Counter: " + InsertionSorter.getCompareCount());
        System.out.println("Visit Counter: " + InsertionSorter.getVisitCount());
        
        InsertionSorter.resetCompareCount();
        InsertionSorter.resetVisitCount();
        InsertionSorter.sort(a);
        System.out.println("Comparison Counter (sorted): " + InsertionSorter.getCompareCount());
        System.out.println("Visit Counter (sorted): " + InsertionSorter.getVisitCount());
        
        InsertionSorter.resetCompareCount();
        InsertionSorter.resetVisitCount();
        int i = 0; 
    	int c = 10000; 
    	while(c > 0)
    	{
    		a[i] = c; 
    		c--; 
    		i++; 
    	}
        InsertionSorter.sort(a);
        System.out.println("Comparison Counter (reversed): " + InsertionSorter.getCompareCount());
        System.out.println("Visit Counter (reversed): " + InsertionSorter.getVisitCount());
    }
}
