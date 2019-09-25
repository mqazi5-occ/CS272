/**
 * CS 272 - Fall 2019
 * H01-Sequence.java
 */
package occ.cs272.h01;

/**
 * @author Mohammad Usman Qazi
 * @version September 1, 2019
 *
 */
public class Sequence
{
    // TODO: You must fill these in correctly to get credit
    public static final String STUDENT = "mqazi5";
    public static final String ASSIGNMENT = "H01-D";
    
    private int[] array;
    
    /**
     * Constructs a sequence of integers.
     * @param array the array to initialize the sequence.
     */
    public Sequence(int[] array)
    {
        this.array = array.clone();
    }
    
    // TODO: Write the three versions of slice() here
    public Sequence slice (int start)
    {
    	int count = 0;
    	int[] temp = null;
    	if (start >= 0)
    	{
    		temp = new int[array.length - start];
    		for (int i = start; i < array.length; i++)
    		{
    			temp[count] = array[i];
    			count++;
    		}
    	}
    	else if (start* - 1 <= array.length)
    	{
    		temp = new int[start* - 1];
    		for (int i = array.length + start; i < array.length; i++)
    		{
    			temp[count] = array[i];
    			count++;
    		}
    	}
    	return new Sequence(temp);
    }
    
    public Sequence slice (int start, int end)
    {
		int count = 0;
		int[] temp = new int[end - start];
    	if (start >= 0)
    	{
    		for (int i = start; i < end; i++)
    		{
    			temp[count] = array[i];
    			count++;
    		}
    	}
    	return new Sequence(temp);
    }
    
    public Sequence slice (int start, int end, int step)
    {
    	int count = 0;
		int[] temp = new int[(start+end+1)/step];
    	if (start >= 0)
    	{
    		for (int i = start; i < end; i += step)
    		{
    			temp[count] = array[i];
    			count++;
    		}
    	}
    	else
    	{
    		temp = new int[(end - start)/step];
    		for (int i = array.length + start; i > array.length + end; i += step)
    		{
    			temp[count] = array[i];
    			count++;
    		}
    	}
    	return new Sequence(temp);
    }
    
    
    @Override
    public String toString()
    {
        String result = "{";
        if (array.length > 0)
        {
            result += array[0];
            for (int i = 1; i < array.length; i++)
            {
                result += ", " + array[i];
            }
        }
        return result + "}";
    }
    
    public static void main(String[] args)
    {
        Sequence a = new Sequence(new int[]{1, 2, 3, 4, 5});
        // some informal testing
//        System.out.println("a.slice(0)->" + a.slice(0));
//        System.out.println("a.slice(1)->" + a.slice(1));
//        System.out.println("a.slice(-1)->" + a.slice(-1));
//        System.out.println("a.slice(-2)->" + a.slice(-2));
//        System.out.println("a.slice(5)->" + a.slice(5));
//        System.out.println("a.slice(-5)->" + a.slice(-5));
//        System.out.println("a.slice(0, 5, 2)->" + a.slice(0, 5, 2));
//        System.out.println("a.slice(1, 5, 2)->" + a.slice(1, 5, 2));
//        System.out.println("a.slice(1, 5, 3)->" + a.slice(1, 5, 3));
//        System.out.println("a.slice(2, 5, 3)->" + a.slice(2, 5, 3));
//        System.out.println("a.slice(-1, -6, -1)->" + a.slice(-1, -6, -1));
    }
}
