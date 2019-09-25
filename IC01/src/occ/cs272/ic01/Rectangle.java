/**
 * 
 */
package occ.cs272.ic01;

/**
 * @author Mohammad Usman Qazi
 * @version Sep 4, 2019
 */
public class Rectangle {

	private double length;
	private double width;
	
	public Rectangle()
	{
		length = 0.0;
		width = 0.0;
	}
	
	public Rectangle(double newLength, double newWidth)
	{
		length = newLength;
		width = newWidth;
	}
	
	public void setLength(double newLength)
	{
		length = newLength;
	}
	
	public void setWidth(double newWidth)
	{
		width = newWidth;
	}
	
	public double getArea()
	{
		return (length * width);
	}
	
}
