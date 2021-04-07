package inheritance;

import java.util.Scanner;
public class ServiceMain {

	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ypur Employee details");
		System.out.println("Employee name:");
		String name=sc.next();
		System.out.println("Employee ID:");
		int ID=sc.nextInt();
		System.out.println("Designation:");
		String desig=sc.next();
		System.out.println("Salary:");
		float sal=sc.nextFloat();
		Employee1 e=new Employee1();
		e.setName(name);
		e.setId(ID);
		e.setDesignation(desig);
		try {
			e.setSalary(sal);
			
		}

		catch(Exception el) {
			System.out.println("Salary is less than 3000");
			
		}
		
   e.choosingSchema();
	System.out.println("You are eligible for Insurance:"+e.getInsuranceScheme());
	System.out.println("Employee Details:");
	System.out.println("Id:"+e.getId());
	System.out.println("Name:"+e.getName());
	System.out.println("Designation:"+e.getDesignation());
	System.out.println("Salary:"+e.getSalary());
	System.out.println("Insurance Scheme:"+e.getInsuranceScheme());
	}
}






		

