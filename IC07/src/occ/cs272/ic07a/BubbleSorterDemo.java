package occ.cs272.ic07a;

import java.util.Scanner;

public class BubbleSorterDemo 
{
	public static void main(String[] args)
    {  
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = in.nextInt();

        int[] a = ArrayUtil.randomIntArray(n, 100);

        BubbleSorter.sort(a);

        System.out.println("Comparison Counter: " + BubbleSorter.getCount());
    }
}
