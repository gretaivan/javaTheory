package objectOrientationExample;

public class HRApp {

	public static void main(String[] args) {
		
		System.out.println("HR App started...");
		
		
		Employee sarah = new Employee("Sarah");
		Employee jerry = new Employee("Jerry", 33888.00);
		Employee gracie = new Employee("Gracie", 45000.00);

		System.out.println(sarah.toString());
		System.out.println(jerry.toString());
		System.out.println(gracie.toString() + "\n");
		
		Department fin = new Department ("finance"); 
		
		fin.addEmployee(sarah); 
		fin.addEmployee(jerry); 
		System.out.println();
		
		try {
			Employee withId = fin.getEmployeeById(1001);
			System.out.println("Employee found: " + withId.toString());
			Employee withIdNotValid = fin.getEmployeeById(1002);
			System.out.println(withIdNotValid.getName());
		} catch (Exception e) {
			System.out.println("Employee with the given ID does not exist in the indicated department");
		}
		
	
		
		System.out.println("\nIn the " + fin.getName() + " department currently there are " + fin.getEmployeeCount() + " employees.\n");
		
		for(Employee emp : fin.getEmployees()) {
			System.out.println(emp.toString());
		}
	
		System.out.println("\ncompleted");
	}

}
