package theory.Inheritance;

public abstract class AbstractCrashable {
	boolean carDrivable = true; 
	
	public void youCrashed() {
		this.carDrivable = false; 
	}
	
	public abstract void setCarStrength(int carStrength); 
	
	public abstract int getCarStrength(); 
}
