package inheritance;

public class Employee1 implements EmployeeService1 {
	
	
	int id;
	String name;
	float salary;
	String designation;
	String insuranceScheme;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary1(float salary) {
		this.salary = salary;
	}
	
	public void setSalary(float salary)throws Exception{
		
		this.salary=salary;
		if(salary<3000)
		{
			Exception ee=new Exception("The salary is  less than 3000");
			throw ee;
		}
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	
	
public void choosingSchema() {
		if(salary>500 && salary<20000)
			insuranceScheme="Scheme C";
		else if(salary>=2000&&salary<40000)
			insuranceScheme="Scheme B";
		else if(salary>=40000)
			insuranceScheme="Schme A";
		else if(salary<5000)
			insuranceScheme="No Scheme";
	}

}

