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
		
		this.setVisible(true);
	}
	
}
