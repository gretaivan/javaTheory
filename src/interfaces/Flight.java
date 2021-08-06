package interfaces;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;

public class Flight 
	implements Comparable<Flight>, Iterable<Passenger> {

	private int passengers;
    private int seats = 150;
    private ArrayList<Passenger> passengerList = new ArrayList<>();
    private int totalCheckedBags;
    private int flightTime ;
    private int flightNumber;
    private char flightClass;
    
    public Flight() { }

    public Flight(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Flight(char flightClass) {
        this.flightClass = flightClass;
    }
    
    //generic type interface example
	public Iterable<Passenger> getOrderedPassengers() {
        return new Iterable<Passenger>() {
            @Override
            public Iterator<Passenger> iterator() {
                Passenger[] passengers = new Passenger[passengerList.size()];
                passengerList.toArray(passengers);
                Arrays.sort(passengers);
                return Arrays.asList(passengers).iterator();
            }
        };
    }
	
	@Override
	public int compareTo(Flight o) {
		// TODO Auto-generated method stub
		return 0;
	}
    
    
}
