/**
 * 
 */
package occ.cs272.ic01;

import java.text.*;

/**
 * @author Mohammad Usman Qazi
 * @version September 4, 2019
 *
 */
public class Circle {

	private double radius;
	
	public Circle()
	{
		radius = 0.0;
	}
	
	public Circle(double newRadius)
	{
		radius = newRadius;
	}
	
	public void setRadius(double newRadius)
	{
		radius = newRadius;
	}
	
	public void setArea(double area)
	{
		radius = Math.sqrt((area/Math.PI));
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double getArea() 
	{
		return (Math.PI * Math.pow(radius, 2));
	}
	
	public String toString()
	{
		DecimalFormat d2 = new DecimalFormat("##.00");
		return "{Radius: " + d2.format(radius) + ", Area: " + d2.format(getArea()) + "}";
	}

}
