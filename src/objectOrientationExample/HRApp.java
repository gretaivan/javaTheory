package objectOrientationExample;

public class HRApp {

	public static void main(String[] args) {
		Employee newEmp = new Employee();
//		int departmentNumber = 1;
//		Department aDept = DepartmentFinder.find(departmentNumber);

		System.out.println(newEmp.toString());
		//print get employees
		
		Department fin = new Department ("finance"); 
		
		fin.addEmployee(newEmp); 
		
		Employee[] test = fin.getEmployees(); 
		
		System.out.println(test.length);
		
		for(Employee emp : fin.getEmployees()) {
			System.out.println(emp.toString());
		}
	
	}

}
