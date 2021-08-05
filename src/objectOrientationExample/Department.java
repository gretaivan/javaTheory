package objectOrientationExample;


public class Department {
//	private Enum type; 
	private String name; 
	public Employee[] employees; 
	public int count = 0; 
	int number; 
	
	//perhaps a static array of department names to track the uniqueness
	
	public Department(String name) {
		this.name = name; 
		employees = new Employee[10]; 
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addEmployee(Employee e) {
		if(count < 10 ) {
			employees[count] = e; 
			count++; 
			e.setDepartment(this);
			System.out.println("Employee has been successfully added to the " + this.name + "department.");
		} else { 
			System.out.println("This department has reached a full capacity of employees. No more can be added, please try another department...");
		}
	}
	
	public Employee[] getEmployees() {
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