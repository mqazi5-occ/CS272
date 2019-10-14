package occ.cs272.h05;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortCountDemo 
{
	public static void main(String[] args)
    {  
        int[] a = ArrayUtil.randomIntArray(10000, 10000);

        SelectionSorter.sort(a);

        System.out.println("Comparison Counter: " + SelectionSorter.getCompareCount());
        System.out.println("Visit Counter: " + SelectionSorter.getVisitCount());
        
        SelectionSorter.resetCompareCount();
        SelectionSorter.resetVisitCount();
        SelectionSorter.sort(a);
        System.out.println("Comparison Counter (sorted): " + SelectionSorter.getCompareCount());
        System.out.println("Visit Counter (sorted): " + SelectionSorter.getVisitCount());
        
        SelectionSorter.resetCompareCount();
        SelectionSorter.resetVisitCount();
        int i = 0; 
    	int c = 10000; 
    	while(c > 0)
    	{
    		a[i] = c; 
    		c--; 
    		i++; 
    	}
        SelectionSorter.sort(a);
        System.out.println("Comparison Counter (reversed): " + SelectionSorter.getCompareCount());
        System.out.println("Visit Counter (reversed): " + SelectionSorter.getVisitCount());
    }
}
