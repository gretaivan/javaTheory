package theory.Inheritance;

/*
 * Empty type of class that defines what methods should be defined 
 * */

public interface DrivableInterface {

	double PI = 3.14; 
	
	//replaces 
	//public abstract int getWheel();
	int getWheels();
	void setWheels(int numWheels);
	
	double getSpeed();
	void setSpeed(double speed); 
}
