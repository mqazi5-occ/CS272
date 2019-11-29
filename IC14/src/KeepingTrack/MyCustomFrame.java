package KeepingTrack;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;

public class MyCustomFrame extends JFrame
{
    private JButton button1, button2;
    private JLabel countL, trendL;
    private JPanel panel;
    private JComponent component;
    private JTextField countT, trendT;
    
    
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;
    private static final int COMPONENT_WIDTH = 400;
    private static final int COMPONENT_HEIGHT = 400;
    
    private static int count = 0;
    
    // Constructor
    public MyCustomFrame()
    {
        createComponents();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
    
    private void createComponents()
    {
        // Create the GUI components
        
        // Create the buttons
        button1 = new JButton("Up");
        button2 = new JButton("Down");
        // Connect the listeners (event handlers) to the buttons
        button1.addActionListener(new Increment());
        button2.addActionListener(new Decrement());
        
        // Create the label
        countL = new JLabel("Count: ");
        trendL = new JLabel("Trend: ");
        
        countT = new JTextField(10);
        trendT = new JTextField(10);
        trendT.setText("Flat");
        
        // Create the component (which we will use draw things)
        component = new MyCustomComponent();
        component.setPreferredSize(new Dimension(COMPONENT_WIDTH, COMPONENT_HEIGHT));
        
        // Create the panel and add the GUI components to the panel
        panel = new JPanel();
        panel.add(countL);
        panel.add(countT);
        panel.add(trendL);
        panel.add(trendT);
        panel.add(button1);
        panel.add(button2);
        //panel.setBackground(Color.RED);
        
        panel.add(component);
        
        // Add the panel to the frame
        this.add(panel);
    }
    
    // Event handlers
    class Increment implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            count++;
            countT.setText("" + count);
            trendT.setText("Rising");
            Graphics g = component.getGraphics();
            g.setColor(Color.blue);
            g.fillOval(100, 100, component.getWidth()/2, component.getHeight()/2);
        }
    }
    
    class Decrement implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            count--;
            countT.setText("" + count);
            trendT.setText("Falling");
            Graphics g = component.getGraphics();
            g.setColor(Color.red);
            g.fillOval(100, 100, component.getWidth()/2, component.getHeight()/2);
        }
    }
    
}
