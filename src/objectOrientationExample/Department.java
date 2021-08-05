package objectOrientationExample;


public class Department {
//	private Enum type; 
	private String name; 
	public Employee[] employees; 
	private static int count = 0; 
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
		if(count < employees.length ) {
			employees[count] = e; 
			count++; 
			e.setDepartment(this);
			System.out.println("Employee has been successfully added to the " + this.name + " department.");
		} else { 
			System.out.println("This department has reached a full capacity of employees. No more can be added, please try another department...");
		}
	}
	
	public Employee[] getEmployees() {
		Employee[] existing = new Employee[count]; 
		int i = 0; 
		
		while(employees[i]!= null && i < count) {
			existing[i] = employees[i];
			i++;
		}
		return existing;
		
	}
	
	public int getEmployeeCount() {
		return count;
	}
	
	public Employee getEmployeeById(int id) {
		for(Employee e : employees) {
			if(e.getId() == id) {
				return e;
			}
		}
		return null;
	}
	public Department find(){
		
		return this; 
	}

	
	@Override
	public void DepartmentFinder() {
		// TODO Auto-generated method stub
		
	}
}