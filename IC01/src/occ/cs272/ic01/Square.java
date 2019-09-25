/**
 * 
 */
package occ.cs272.ic01;

/**
 * @author Mohammad Usman Qazi
 * @version Sep 4, 2019
 */
public class Square {
	
	private double width;
	
	public Square()
	{
		width = 0.0;
	}
	
	public Square(double newWidth)
	{
		width = newWidth;
	}
	
	public double getArea()
	{
		return (width * width);
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public void setWidth(double newWidth)
	{
		width = newWidth;
	}
	
	public void setArea(double area)
	{
		width = (Math.sqrt(area));
	}
	
}
