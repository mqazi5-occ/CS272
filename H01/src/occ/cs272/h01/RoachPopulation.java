/**
 * CS 272 - Fall 2019
 * H01-RoachPopulation.java
 */
package occ.cs272.h01;

/**
 * @author Mohammad Usman Qazi
 * @version Augsut 29, 2019
 *
 */
public class RoachPopulation
{
    // TODO: You must fill these in correctly to get credit
    public static final String STUDENT = "mqazi5";
    public static final String ASSIGNMENT = "H01-A";

    // TODO: Complete the RoachPopulation class
    private int population;
    
    public RoachPopulation()
    {
    	 population = 0;
    }
    
    public RoachPopulation(int roachCount)
    {
    	population = roachCount;
    }
    
    public void breed()
    {
    	population *= 2;
    }
    
    public void spray()
    {
    	population -= ((population * 1) / 10); 
    }
    
    public int getRoaches()
    {
    	return population;
    }
}
