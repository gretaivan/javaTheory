package objectOrientationExample;

public class HRApp {

	public static void main(String[] args) {
		Employee newEmp = new Employee("Sarah");
//		int departmentNumber = 1;
//		Department aDept = DepartmentFinder.find(departmentNumber);

		System.out.println(newEmp.toString() + "\n");
		//print get employees
		
		Department fin = new Department ("finance"); 
		
		fin.addEmployee(newEmp); 

		
//		Employee[] existing = fin.getEmployees(); 
//		
//		System.out.println(test.length + "test");
		
		for(Employee emp : fin.getEmployees()) {
			System.out.println(emp.toString());
		}
	
		System.out.println("\ncompleted");
	}

}
