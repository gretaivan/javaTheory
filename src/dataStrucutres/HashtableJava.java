package dataStrucutres;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Dictionary is an abstract parent class to this class
 * 
 *
 */
public class HashtableJava {

	public static void main(String[] args) {
		
		Dictionary<Integer, String> dict = new Hashtable<>();
		
		// Add key-value pairs to dict
        dict.put(1, "hello");
        dict.put(5, "goodbye");
        // Access the values using the keys
        System.out.println("Value at key 1: " + dict.get(1));
        System.out.println("Value at key 5: " + dict.get(5));
        
        /*interface map use
         * This insterface is used as it is more robust and used implement 
         * hashmaps and hashtables
         */
        
        Map<String, Integer> m1 = new Hashtable<>();
        Map<String, Integer> m2 = new HashMap<>();
	}

}
