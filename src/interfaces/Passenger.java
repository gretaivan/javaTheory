package interfaces;

public class Passenger implements Comparable {
	private String name; 
	private int memberLevel; // 3 (1st priority), 2, 1
	private int memberDays; 
	
	public Passenger(String name, int memberLevel, int memberDays) {
		this.name = name; 
		this.memberLevel = memberLevel; 
		this.memberDays = memberDays; 
	}
	
	//INTERFACE METHOD: order members on the membership level
	//the rule is to return -1|0|1 
	public int compareTo(Object o) {
		Passenger p = (Passenger) o;
		
		int returnValue = p.memberLevel - memberLevel; 
		
		return returnValue; 
	}
	
}
