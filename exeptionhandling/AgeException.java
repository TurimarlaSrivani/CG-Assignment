package exeptionhandling;

import java.util.Scanner;
class UserDefinedException extends Exception{
	public UserDefinedException(String string) {
		super(string);
	}
}
public class AgeException {
	private static int age;
	public void personAge() throws UserDefinedException
	{
		if(age>15)
		{
			System.out.println(age+" is correct");
		}
		else
		{
			UserDefinedException ue=new UserDefinedException("Age is  less");
			 throw ue;
		}
	}

}
