package theory.Threads;
import java.util.*; 
import java.text.DateFormat; 

/*
 * Build as extending the thread class
 */
public class GetTime20 extends Thread {
	public void run() {
		Date now; 
		Locale currentLocale; 
		DateFormat timeFormatter;
		DateFormat dateFormatter;
		String timeOutput;
		String dateOutput;

		for(int i = 1; i <= 20; i++){
			now = new Date();
			currentLocale = new Locale("en");
			
			timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, currentLocale);
			dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, currentLocale);
			
			timeOutput = timeFormatter.format(now);
			dateOutput = dateFormatter.format(now);
			
			System.out.println(timeOutput);
			System.out.println(dateOutput);
			System.out.println();
			
			//threads should be handled 
			try {
				Thread.sleep(2000); 
			} catch (InterruptedException e) {
				System.out.println("interuption caught");
			}
		}
	}
}
