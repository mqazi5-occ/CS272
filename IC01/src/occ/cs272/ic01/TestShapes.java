/**
 * 
 */
package occ.cs272.ic01;

/**
 * @author Mohammad Usman Qazi
 * @version September 4, 2019
 *
 */
public class TestShapes {

	public static void testCircle(double r, double a)
	{
		System.out.print("Inputted ");
		if (a == -1)
		{
			Circle circle = new Circle(r);
			System.out.println("Radius = " + r + " ---> " + circle.toString());
		}
		else if (r == -1)
		{
			Circle circle = new Circle();
			circle.setArea(a);
			System.out.println("Area = " + a + " ---> " + circle.toString());
		}
	}
	
	public static void testRectangle(double l, double w)
	{
		Rectangle rectangle = new Rectangle(l, w);
		System.out.printf("Inputted Length = " + l + ", Width = " + w + " ---> {Area: " + "%.2f", rectangle.getArea());
		System.out.print("}\n");
	}
	
	public static void testSquare(double w, double a)
	{
		System.out.print("Inputted ");
		if (a == -1)
		{
			Square square = new Square(w);
			System.out.printf("Width = " + w + " ---> {Area: " + "%.2f", square.getArea());
			System.out.print("}\n");
		}
		else if (w == -1)
		{
			Square square = new Square();
			square.setArea(a);
			System.out.printf("Area = " + a + " ---> {Width: " + "%.2f", square.getWidth());
			System.out.print("}\n");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Testing Circle");
		System.out.println("---------------------------------------------------");
		
		testCircle(5, -1);
		testCircle(2.3, -1);
		
		Circle[] a = new Circle[100];
		for (int i = 0; i < a.length; ++i)
		{
			a[i] = new Circle(Math.random() * 50);
		}
		
		double sum = 0.0;
		double smallest = 50;
		double largest = 0.0;
		for (int i = 0; i < a.length; i++)
		{
			sum = a[i].getArea();
			double r = a[i].getRadius();
			if (r > largest)
			{
				largest = r;
			}
			else if (r < smallest)
			{
				smallest = r;
			}
		}
		
		System.out.printf("Sum = %.2f\n", sum);
		System.out.printf("Smallest = %.2f\n", smallest);
		System.out.printf("Largest = %.2f\n", largest);
		
		System.out.println("\nTesting Rectangle");
		System.out.println("---------------------------------------------------");
		testRectangle(3, 5);
		testRectangle(6.3, 8);
		
		System.out.println("\nTesting Square");
		System.out.println("---------------------------------------------------");
		testSquare(2, -1);
		testSquare(6, -1);
		
		System.out.println("\nTesting setArea Function");
		System.out.println("---------------------------------------------------");
		System.out.println("Circle: ");
		testCircle(-1, 78.54);
		testCircle(-1, 16.62);
		testCircle(-1, 162.86);
		
		System.out.println("\nSquare: ");
		testSquare(-1, 4);
		testSquare(-1, 36);
		testSquare(-1, 64);
		
	}

}
