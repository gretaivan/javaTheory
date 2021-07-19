package theory;

public class MainForInterface {

	public static void main(String[] args) {
		ImplementInterface interfc = new ImplementInterface (4, 100.00);
		System.out.println("Max Speed: " + interfc.getSpeed()); 
		
		interfc.setCarStrength(10); 
		System.out.println("Car strength: " + interfc.getCarStrength()); 

	}

}
