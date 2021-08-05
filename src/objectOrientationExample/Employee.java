package objectOrientationExample;

public class Employee {
	
	private int id = 1000; 
	private String name;
	private Department department; 
	private double salary;
	private static int count = 0;
	
	
	//featuring the constructor chaining
	
	public Employee(String name) {
		this.id += count;
		this.name = name;
		this.department  = null; 
		this.salary = 24000.00; 
		this.name = name; 
		count++;
	}
	
	public Employee(String name, Department dep) {
		this(name);
		this.department  = dep; 
	}
	
	public Employee(String name, double salary) {
		this(name);
		this.salary  = salary; 
	}
	
	public Employee(String name, Department dep, double salary) {
		this(name, dep);
		this.salary = salary;
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
			message = String.format("Employee %s, is assigned to a %s department", getName(), department.getName());
		} else {
			message = String.format("Employee: %-8d %-10s £%.2f", getId(),getName(), getSalary());
		}
		
		return message;
	}
  
  
}
