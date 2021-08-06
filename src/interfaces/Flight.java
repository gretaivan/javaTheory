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
    
    //generic type interface example for iterator
    @Override
    public Iterator<Passenger> iterator() {
        return passengerList.iterator();
    }
    
    /* To use iterator above the implementation of Iterable is needed typically done in
    *  an inner class
    * But can be implemented with anonymous class
    */
    
   //Inner class example
   /*
      private class FlightIterable implements Iterable<Passenger> {
     	public Iterator<Passenger> iterator() {
    		Passenger[] passengers = new Passenger[passengerList.size()];
    		passengerList.toArray(passengers); 
    		Arrays.sort(passengers); 
    		return Arrays.asList(passengers).iterator();
    	}
    }
    */
    
	//Anonymous class implementation
	  public Iterable<Passenger> getOrderedPassengers() { 
		  return new Iterable<Passenger>() {  //implements iterable interface
		  //method
		  @Override 
		  public Iterator<Passenger> iterator() { 
			  Passenger[] passengers = new Passenger[passengerList.size()]; 
			  passengerList.toArray(passengers);
			  Arrays.sort(passengers); 
			  return Arrays.asList(passengers).iterator(); 
			  } 
		  }; //end of anonymous class instanciation
	  }
	 
	
	
	
	//sort according to the filght time
	@Override
	public int compareTo(Flight flight) {
		return flightTime - flight.flightTime;
	}
    
	//functionality methods
	
	private boolean hasSeating() {
        return passengers < seats;
	}
	
	private boolean hasSeating(int count) {
	   return passengers + count <= seats;
	}	
	
	//method chaining
	public void addPassenger() {

        if(hasSeating())
            passengers += 1;
    }
	
    public void addPassenger(int bags) {

        if (hasSeating()) {
            addPassenger();
            totalCheckedBags += bags;
        }
    }
    
    public void addPassenger(Passenger p) {

        passengerList.add(p);
        addPassenger(p.getCheckedBags());
    }
    
    public void addPassenger(int bags, int carryOns) {

        if(carryOns <= 2)
            addPassenger(bags);
    }
    
	public void addPassenger(Passenger p, int carryOns) {

        passengerList.add(p);
        addPassenger(p.getCheckedBags(), carryOns);
    }

    public void addPassengers(Passenger... list) {

        if (hasSeating(list.length)) {
            passengers += list.length;
            for (Passenger passenger : list) {
                passengerList.add(passenger);
                totalCheckedBags += passenger.getCheckedBags();
            }
        }
    }
	
	//getters and setters
	
	public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(int flightTime) {
        this.flightTime = flightTime;
    }

    public int getTotalCheckedBags() {
        return totalCheckedBags;
    }
    
}
