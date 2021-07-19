package theory.Inheritance;

/*
 * Implements Abstract and Interface classes 
 * Makes use of Object class
 * */

public class Vehicle extends AbstractCrashable implements DrivableInterface {

	public Vehicle(){  }
		
	public Vehicle(int wheels, double speed) {	
        this.numOfWheels = wheels;
        this.theSpeed = speed;
    }

	
	//interface implementation
	int numOfWheels =2; 
	double theSpeed = 0; 
	int carStrength = 0; 
	

	//all methods must be public
	public int getWheels() {
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

	// abstract class implementation
	public void setCarStrength(int carStrength) {
		this.carStrength = carStrength; 
		
	}

	@Override
	public int getCarStrength() {
		return this.carStrength;
	}
	
	
	/*
	 * THIS IS REQUIRED EVERY TIME
	 * handles the object cloning
	*/
	public Object clone(){
		Vehicle car;
		try{
			car = (Vehicle) super.clone();
		} catch(CloneNotSupportedException e){
			return null;
		}
			return car;
		}

}
