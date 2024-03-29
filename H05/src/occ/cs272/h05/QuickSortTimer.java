package occ.cs272.h05;

import java.util.Scanner;

public class QuickSortTimer 
{
	public static void main(String[] args)
    {  
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = in.nextInt();

        // Construct random array

        int[] a = ArrayUtil.randomIntArray(n, 100);

        // Use stopwatch to time selection sort

        StopWatch timer = new StopWatch();

        timer.start();
        QuickSorter.sort(a);
        timer.stop();

        System.out.println("Elapsed time: " 
                + timer.getElapsedTime() + " milliseconds");
    }
}
