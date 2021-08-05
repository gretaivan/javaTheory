package objectOrientationExample;

public class Employee {
	
	private int id = 1000; 
	private String name;
	private Department department; 
	private double salary;
	
	
	//featuring the constructor chaining
	
	public Employee(String name) {
		this.id++;
		this.name = name;
		this.department  = null; 
		this.salary = 1000.00; 
		this.name = name; 
	}
	
	public Employee(String name, Department dep) {
		this(name);
		this.department  = dep; 
	}
	
	
	
	//setter and getters to encapsulate the fields
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name; 
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Department getDepartment() {
		return this.department; 
	}
	
	@Override
	public String toString() {
		String message;
		
		if(department != null) {
			message = String.format("Employee %s, is assigned to %s  department", getName(), department.getName());
		} else {
			message = String.format("Employee %s, is not assigned to any department", getName());
		}
		
		return message;
	}
  
  
}
