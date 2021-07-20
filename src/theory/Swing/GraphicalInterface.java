package theory.Swing;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;


public class GraphicalInterface extends JFrame{

	public static void main(String[] args) {
		new GraphicalInterface(); 
	}

	public GraphicalInterface() {
		this.setSize(400, 400);
	
		
		//change the location on the screen e.g. center
		this.setLocationRelativeTo(null);
	
		//abstract class of window toolkit, that enables communication with OS
		Toolkit tk = Toolkit.getDefaultToolkit();
		
		Dimension dim = tk.getScreenSize();
		
		// center everything 
		int xPos = (dim.width / 2) - (this.getWidth() / 2 ); 
		int yPos = (dim.height / 2) - (this.getHeight() / 2); 

		this.setLocation(xPos, yPos); 
		
		//dont allow resizing
		this.setResizable(false);
		
		//enable user to close the app on x click
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		this.setTitle("Java Theory");
		
		
		/*
		 * PANELS
		 */
		
		JPanel thePanel = new JPanel();
		JLabel label1 = new JLabel("New label");
		
		thePanel.add(label1);
		this.add(thePanel);
		
		//rename the label
		label1.setText("New label Text");
		label1.setToolTipText("I give tips");
		
		JButton button =  new JButton("Send!");
		
		//remove border
		//button.setBorderPainted(false); 
		//remove background
		//button.setContentAreaFilled(false); 
		thePanel.add(button);
		
		//Text box with defined size
		JTextField textField = new JTextField("placeholder here", 15);
		//change the size
		textField.setColumns(10);
		
		thePanel.add(textField);
		
		JTextArea area = new JTextArea(15, 20);
		area.setText("new text area");
		area.setLineWrap(true);
		
		//wrapt the words
		area.setWrapStyleWord(true);
		
		JScrollPane scrollbar1 = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		thePanel.add(scrollbar1);
		
		

		
		this.setVisible(true);
		
		//focus and other interaction after the window is visible!
		textField.requestFocus();
	}
	
}
