package interfaces;

import java.util.Arrays;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) { anonymousClass(); }
	
	private static void anonymousClass() {
		
		Flight f175 = new Flight(175);
		
		Passenger[] passengers = {
				new Passenger("Luisa", 1, 180),
				new Passenger("Jack", 1, 90),
				new Passenger("Ashanti", 3, 730),
				new Passenger("Harish", 2, 150)
		};
		
		f175.addPassenger(new Passenger("Luisa", 1, 180));
        f175.addPassenger(new Passenger("Jack", 1, 90));
        f175.addPassenger(new Passenger("Ashanti", 3, 730));
        f175.addPassenger(new Passenger("Harish", 2, 150));
        
        System.out.println(" ** Unordered passengers ** ");
		for(Passenger p : f175)
            System.out.println(p.getName());
		
		
		//interface method implementation allows sorting the array
//		Arrays.sort(passengers); 
//		System.out.println("*****Ordered passengers*****");
//		for(Passenger p : f175)
//            System.out.println(p.getName());
		
		System.out.println(" ** Passenger order using Flight class' Iterable implementation **");
        for(Passenger p : f175)
            System.out.println(p.getName());
        
        System.out.println(" ** Passenger order using the anonymous class' Iterable implementation **");
        for(Passenger p : f175.getOrderedPassengers())
            System.out.println(p.getName());
		
	}

}
