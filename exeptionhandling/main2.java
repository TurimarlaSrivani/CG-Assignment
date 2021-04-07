package exeptionhandling;

import java.util.Scanner;

public class main2 {
	public static void main(String[] args) {
		System.out.println("Enter the first name");
		Scanner sc=new Scanner(System.in);
		String fname=sc.nextLine();
		System.out.println("Enter the last name:");
		String lname=sc.nextLine();
		FirstNameLastName fl=new FirstNameLastName();
		try
		{
			fl.name(fname,lname);
		}
		catch(UserDefinedException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
