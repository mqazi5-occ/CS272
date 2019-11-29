package KeepingTrack;

import javax.swing.JButton;
/**
 * A code stub/template for a simple GUI
 * - This file has the component which will
 *   contain the graphics.
 * 
 * @author Justin Jang
 * @version 11/25/2019
 */
import javax.swing.JComponent;
import javax.swing.JTextField;

import java.awt.Graphics;
import java.awt.Color;

public class MyCustomComponent extends JComponent
{
    // Make instance variable(s) to hold references to
    // any objects you need to refer to.
	
    // Overload the constructor to pass reference(s) to 
    // any objects that you need to refer to.
    public MyCustomComponent()
    {
    	
    }
    
    public void paintComponent(Graphics g)
    {
        // Use this method to draw whatever you want
        g.setColor(Color.black);
        g.drawRect(0, 0, getWidth()-1, getHeight()-1);
        g.fillOval(100, 100, getWidth()/2, getHeight()/2);
    }
        
}
