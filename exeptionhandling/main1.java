package exeptionhandling;

import java.util.Scanner;

public class main1 {
 public static void main(String[] args) {
	 System.out.println("Enter age");
	 Scanner sc=new Scanner(System.in);
	int age=sc.nextInt();
	 AgeException ae=new AgeException();
	 try {
		 ae.personAge();
	 }
	 catch(UserDefinedException e) {
		 System.out.println(e.getMessage());
	 }
 }
}
