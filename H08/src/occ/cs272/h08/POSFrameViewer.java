/**
 * 
 */
package occ.cs272.h08;

import java.awt.BorderLayout;

import javax.swing.JFrame;

/**
 * @author Mohammad Usman Qazi
 * @author Richard Pham
 * @version Nov 26, 2019
 */
public class POSFrameViewer 
{
	public static void main(String[] args)
	   {
	      POSFrame frame = new POSFrame();
	      frame.setTitle("Point of Sale");
	      frame.setLocationRelativeTo(null);
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setVisible(true);
	   }
}
