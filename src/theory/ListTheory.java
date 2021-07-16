package theory;

import java.util.ArrayList; 
import java.util.Iterator; 
import java.util.Arrays;

public class ListTheory {
	public static void main (String [] args) {
		ArrayList arrOne; 
		arrOne = new ArrayList();
		ArrayList arrTwo = new ArrayList(); 
		
		ArrayList<String> names = new ArrayList <String>();
		
		names.add("John");
		names.add("Benett"); 
		
		for(String name : names) {
			System.out.println(name); 
		}
		
		names.add(2, "remove");
		names.set(2, "Replacor");
		System.out.println(""); 
		System.out.println("new list"); 
		for(String name : names) {
			System.out.println(name); 
		}
		
		System.out.println(""); 
		System.out.println("Using iterator"); 
		Iterator individ = names.iterator(); 
		while(individ.hasNext()) {
			System.out.println(individ.next());
		}
	}
}
