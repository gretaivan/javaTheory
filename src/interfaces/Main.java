package interfaces;

import java.util.Arrays;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		Flight f175 = new Flight(175);
		
		Passenger[] passengers = {
				new Passenger("Luisa", 1, 180),
				new Passenger("Jack", 1, 90),
				new Passenger("Ashanti", 3, 730),
				new Passenger("Harish", 2, 150)
		};

		//interface method implementation allows sorting the array
		Arrays.sort(passengers);
	
		
		
	}

}
