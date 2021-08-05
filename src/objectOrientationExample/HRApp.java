package objectOrientationExample;

public class HRApp {

	public static void main(String[] args) {
		
		System.out.println("HR App started...");
		
		
		Employee sarah = new Employee("Sarah");
		Employee jerry = new Employee("Jerry", 33888.00);
		Employee gracie = new Employee("Gracie", 45000.00);
//		int departmentNumber = 1;
//		Department aDept = DepartmentFinder.find(departmentNumber);

		System.out.println(sarah.toString());
		System.out.println(jerry.toString());
		System.out.println(gracie.toString() + "\n");
		//print get employees
		
		Department fin = new Department ("finance"); 
		
		fin.addEmployee(sarah); 
		fin.addEmployee(jerry); 
		
//		Employee[] existing = fin.getEmployees(); 
//		
//		System.out.println(test.length + "test");
		
		for(Employee emp : fin.getEmployees()) {
			System.out.println(emp.toString());
		}
	
		System.out.println("\ncompleted");
	}

}
