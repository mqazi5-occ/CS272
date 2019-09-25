/**
 * CS 272 - Fall 2019
 * H01-IceCreamCone.java
 */
package occ.cs272.h01;

/**
 * @author Mohammad Usman Qazi
 * @version September 1, 2019
 * 
 */
public class IceCreamCone
{
    // TODO: You must fill these in correctly to get credit
    public static final String STUDENT = "mqazi5";
    public static final String ASSIGNMENT = "H01-B";

    // TODO: Complete this class
    private double surfaceArea = 0.0;
    private double volume = 0.0;
    
    public IceCreamCone(double height, double radius)
    {
    	surfaceArea = Math.PI * radius * (radius + (Math.sqrt((Math.pow(height, 2)) + (Math.pow(radius, 2)))))
    			- (Math.PI * (Math.pow(radius, 2)));
    	volume = (height / 3.0) * Math.PI * Math.pow(radius, 2);
    }
    
    public double getSurfaceArea()
    {
    	return surfaceArea;
    }
    
    public double getVolume()
    {
    	return volume;
    }
}
