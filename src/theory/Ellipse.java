package theory;

import java.util.ArrayList;

/*
  * Passing multiple amount of var into the methods
  */
public class Ellipse {
	

	//method accepts 0 or more class references it must be the last parameter it receivest the list as an array
	static void multipleParam(int ...a)
    {
        System.out.println("Number of arguments: " + a.length);
  
        for (int i: a)
            System.out.print(i + " ");
        System.out.println();
    }

	public static void main(String[] args) {
		// Calling the varargs method with different number
        // of parameters
		multipleParam(100);         // one parameter
		multipleParam(1, 2, 3, 4);  // four parameters
		multipleParam();            // no parameter
	}
	
	


}

