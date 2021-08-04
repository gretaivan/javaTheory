package objectOrientationExample;

import java.util.ArrayList;

public class Department {
	private Enum type; 
	private String name; 
	public ArrayList <Employee> employees; 
	int number; 
	
	public Department(String name) {
		this.name = name; 
		employees = new ArrayList<Employee>();
	}
	
	public void addEmployee(Employee e) {
		employees.add(e);
	}
	
	public ArrayList getEmployees() {
		return this.employees;
	}
	
	public Department find(){
		
		return this; 
	}

	@Override
	public void DepartmentFinder() {
		// TODO Auto-generated method stub
		
	}
}