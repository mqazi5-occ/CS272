/**
 * 
 */
package occ.cs272.h08;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * @author Mohammad Usman Qazi
 * @author Richard Pham
 * @version Dec 3, 2019
 */
public class POSFrame extends JFrame
{
	private static DecimalFormat df = new DecimalFormat("0.00");

	private static final double TAX = 0.075;
	private static final int FRAME_WIDTH = 700;
	private static final int FRAME_HEIGHT = 500;
	
	private static JFrame frame;
	private static JPanel cartPane;
	private static JPanel actionPane;
	private static JPanel cartPanel; 
	private JButton scan, priceCheck, voidItem, voidTrans, checkout;
	private JTextArea UPC, name, price;
	private JTextArea cartel; 
	
	private static Cart cart;
	private static Product product;
	
	private static int index = 0;
	
	public POSFrame()
	{
		frame = this;
		createComponents();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	public static JPanel getPanel(int num)
	{
		if (num == 0)
		{
			return cartPane;
		}
		else
		{
			return actionPane;
		}
	}
	
	public static JFrame getFrame()
	{
		return frame;
	}
	
	private void createComponents()
	{
		cartPane = new JPanel();
		actionPane = new JPanel();
		cartPanel = new JPanel(); 
		
		cartel = new JTextArea(); 
		cartel.setText("CART: ");
		cartel.setEditable(false);
		cartel.setFont(cartel.getFont().deriveFont(Font.BOLD, cartel.getFont().getSize()));
		cartel.setFont(cartel.getFont().deriveFont(24f));
		
		UPC = new JTextArea();
		name = new JTextArea();
		price = new JTextArea();
		
		UPC.setText("  UPC" + "\n----------");
		name.setText("	                Name" + "\n---------------------------------------------------------------------------");
		price.setText("   Price" + "\n-------------");
		
		UPC.setFont(UPC.getFont().deriveFont(Font.BOLD, UPC.getFont().getSize()));
		name.setFont(name.getFont().deriveFont(Font.BOLD, name.getFont().getSize()));
		price.setFont(price.getFont().deriveFont(Font.BOLD, price.getFont().getSize()));
		
		UPC.setEditable(false);
		name.setEditable(false);
		price.setEditable(false);
		
		scan = new JButton("Scan Item");
		priceCheck = new JButton("Price Check");
		voidItem = new JButton("Void Item");
		voidTrans = new JButton("Void Transaction");
		checkout = new JButton("Checkout");
		
		scan.addActionListener(new Scan());
		priceCheck.addActionListener(new PriceCheck());
		voidItem.addActionListener(new VoidItem());
		voidTrans.addActionListener(new VoidTrans());
		checkout.addActionListener(new Checkout());

		Dimension buttonSize = new Dimension(130, 125);
		scan.setPreferredSize(buttonSize);
		priceCheck.setPreferredSize(buttonSize);
		voidItem.setPreferredSize(buttonSize);
		voidTrans.setPreferredSize(buttonSize);
		checkout.setPreferredSize(buttonSize);
		
		scan.setBackground(Color.white);
		priceCheck.setBackground(Color.white);
		voidItem.setBackground(Color.white);
		voidTrans.setBackground(Color.white);
		checkout.setBackground(Color.white);
		
		Cursor hover = new Cursor(Cursor.HAND_CURSOR);
		scan.setCursor(hover);
		priceCheck.setCursor(hover);
		voidItem.setCursor(hover);
		voidTrans.setCursor(hover);
		checkout.setCursor(hover);
		
		cartPanel.add(cartel); 
		
		cartPane.add(UPC);
		cartPane.add(name);
		cartPane.add(price);
		
		actionPane.add(scan);
		actionPane.add(priceCheck);
		actionPane.add(voidItem);
		actionPane.add(voidTrans);
		actionPane.add(checkout);
		
		
		UPC.setBackground(Color.LIGHT_GRAY);
		name.setBackground(Color.LIGHT_GRAY);
		price.setBackground(Color.LIGHT_GRAY);
		cartel.setBackground(Color.LIGHT_GRAY);
		cartPane.setBackground(Color.LIGHT_GRAY);
		cartPanel.setBackground(Color.LIGHT_GRAY);
		actionPane.setBackground(Color.gray);
		this.add(cartPanel, BorderLayout.NORTH); 
		this.add(cartPane);
		this.add(actionPane, BorderLayout.SOUTH);
	}
	
	class Scan implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            String upc = JOptionPane.showInputDialog(getFrame(), "Enter UPC:");
            
            try {
				POSDemo.scan(upc);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

       	 	cart = POSDemo.getCart();
       	 	product = cart.getProduct(index);
            
       	 	if (product != null)
       	 	{
           	 	index++;
           	 	
	       	 	UPC.setText(UPC.getText() + "\n" + product.getUPC());
	       	 	name.setText(name.getText() + "\n" + product.getName());
	       	 	price.setText(price.getText() + "\n" + "$" + product.getPrice());
	            
	    		cartPane.add(UPC);
	    		cartPane.add(name);
	    		cartPane.add(price);
       	 	}
        }
    }
	
	class PriceCheck implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			String upc = JOptionPane.showInputDialog(getFrame(), "Enter UPC:");
			
			try {
				product = POSDemo.search(upc);
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			
			if (product != null)
			{
				try {
					JOptionPane.showMessageDialog(getFrame(), "Item with UPC " + upc + " has a price of $" + POSDemo.priceCheck(upc));
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	class VoidItem implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			cart = POSDemo.getCart();
			
			if (cart.isEmpty())
			{
				JOptionPane.showMessageDialog(getFrame(), "The cart is empty! Cannot void.");
			}
			else
			{
				String upc = JOptionPane.showInputDialog(getFrame(), "Enter UPC:");

				try {
					product = POSDemo.search(upc);
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
				
				if (product != null)
				{
					try {
						POSDemo.voidItem(upc);
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}
					
					UPC.setText("  UPC" + "\n----------");
					name.setText("	                Name" + "\n---------------------------------------------------------------------------");
					price.setText("   Price" + "\n-------------");
					
					index = 0;
		   	 		product = cart.getProduct(index);
		            
		       	 	while (product != null)
		       	 	{
		           	 	index++;
		           	 	
			       	 	UPC.setText(UPC.getText() + "\n" + product.getUPC());
			       	 	name.setText(name.getText() + "\n" + product.getName());
			       	 	price.setText(price.getText() + "\n" + "$" + product.getPrice());
			            
			    		cartPane.add(UPC);
			    		cartPane.add(name);
			    		cartPane.add(price);

		       	 		product = cart.getProduct(index);
		       	 	}
					JOptionPane.showMessageDialog(getFrame(), "The item has successfully been voided");
				}
			}
		}
	}
	
	class VoidTrans implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			cart = POSDemo.getCart();
			
			if (cart.isEmpty())
			{
				JOptionPane.showMessageDialog(getFrame(), "The cart is empty! Cannot void.");
			}
			else
			{
				POSDemo.voidTrans();
				index = 0;
				UPC.setText("  UPC" + "\n----------");
				name.setText("	                Name" + "\n---------------------------------------------------------------------------");
				price.setText("   Price" + "\n-------------");
				JOptionPane.showMessageDialog(getFrame(), "The transaction has successfully been voided");
			}
		}
	}
	
	class Checkout implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			cart = POSDemo.getCart();
			
			if (cart.isEmpty())
			{
				JOptionPane.showMessageDialog(getFrame(), "The cart is empty! Cannot checkout.");
			}
			else
			{
				double total = cart.getTotal() + (cart.getTotal() * TAX);
				JOptionPane.showMessageDialog(getFrame(), "SUBTOTAL: $" + df.format(cart.getTotal()) +
						"\nTAX:              $" + df.format((cart.getTotal() * TAX)) 
						+ "\nTOTAL:         $" + df.format(total));
				POSDemo.checkout();
			}
		}
	}
}
