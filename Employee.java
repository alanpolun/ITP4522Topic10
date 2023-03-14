public class Employee {
	private String name;   
	private int salary;    

  public Employee(String name, int salary) {
    setName(name);
    setSalary(salary);
  }

	public void setName(String inName) { 
		name = inName; 
	}    

	public void setSalary(int inSalary) { 
		salary = inSalary; 
	}

	public String getName() { 
		return name; 
	}

	public int getSalary() { 
		return salary; 
	}
}
