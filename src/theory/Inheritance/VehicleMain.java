package theory.Inheritance;

public class VehicleMain {

	public static void main(String[] args) {
		Vehicle interfc = new Vehicle (4, 100.00);
		System.out.println("Max Speed: " + interfc.getSpeed()); 
		
		interfc.setCarStrength(10); 
		System.out.println("Car strength: " + interfc.getCarStrength()); 

	}

}
