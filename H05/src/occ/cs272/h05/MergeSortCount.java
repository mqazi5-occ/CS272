package occ.cs272.h05;

public class MergeSortCount 
{
	public static void main(String[] args)
    {  
		int[] a = ArrayUtil.randomIntArray(10000, 10000);

        MergeSorter.sort(a);

        System.out.println("Comparison Counter: " + MergeSorter.getCompareCount());
        System.out.println("Visit Counter: " + MergeSorter.getVisitCount());
        
        MergeSorter.resetCompareCount();
        MergeSorter.resetVisitCount();
        MergeSorter.sort(a);
        System.out.println("Comparison Counter (sorted): " + MergeSorter.getCompareCount());
        System.out.println("Visit Counter (sorted): " + MergeSorter.getVisitCount());
        
        MergeSorter.resetCompareCount();
        MergeSorter.resetVisitCount();
        int i = 0; 
    	int c = 10000; 
    	while(c > 0)
    	{
    		a[i] = c; 
    		c--; 
    		i++; 
    	}
        MergeSorter.sort(a);
        System.out.println("Comparison Counter (reversed): " + MergeSorter.getCompareCount());
        System.out.println("Visit Counter (reversed): " + MergeSorter.getVisitCount());
    }
}
