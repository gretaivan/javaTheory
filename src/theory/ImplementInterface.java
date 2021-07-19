package theory;

/*
 * Implements Abstract and Interface classes
 * */

public class ImplementInterface extends AbstractCrashable implements InterfacesJava {

	//interface implementation
	int numOfWheels =2; 
	double theSpeed = 0; 
	int carStrength = 0; 
	

	//all methods must be public
	public int getWheel() {
		return this.numOfWheels;
	}

	public void setWheels(int numWheels) {
		this.numOfWheels = numWheels; 
		
	}

	public double getSpeed() {
		return theSpeed;
	}

	public void setSpeed(double speed) {
		this.theSpeed = speed; 
		
	}

	public ImplementInterface (int wheels, double speed) {
		this.numOfWheels = wheels; 
		this.theSpeed = speed; 
	}

	// abstract class implementation
	public void setCarStrength(int carStrength) {
		this.carStrength = carStrength; 
		
	}

	@Override
	public int getCarStrength() {
		return this.carStrength;
	}
}
