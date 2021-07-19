package theory.Inheritance;

public class ObjectJava {

	public static void main(String[] args) {
		//represents vehicle
		Object superCar = new Vehicle ();
		//type casting to vehicle
		System.out.println(((Vehicle)superCar).getSpeed());
		
		Vehicle superTruck = new Vehicle ();
		
		//equality check should be false as they are two different,objects
		System.out.println(superCar.equals(superTruck));
		
		// print the hashcode for the object, that is a unique identifier
		System.out.println("Hash code: " + superCar.hashCode());
		
		System.out.println("class check: " + superCar.getClass());
		
		System.out.println("class name: " + superCar.getClass().getName());
		
		//are two object same class? 
		 if(superCar.getClass() == superTruck.getClass()){
			 System.out.println("Objects are in the same class");
		 }
		 
		 //get super class
		 System.out.println("object super class is: " + superCar.getClass().getSuperclass());

		 //to clone objects see the required setup in the Vehicle class

         // THE CLONE METHOD
         // clone copies the current values of the object and assigns
         // them to another. If changes are made after the clone both
         // objects aren't effected though
//		 superTruck.setWheels(6);
//		 
//		 
//		 
//		 Vehicle superTruck2 = (Vehicle)superTruck.clone();
//		 System.out.println(superTruck2);
//		 System.out.println(superTruck.getWheels());
//		 System.out.println(superTruck2.getWheels());

		 //	CLONE SEEMS TO BE UNSUPPORTED
	}

}
