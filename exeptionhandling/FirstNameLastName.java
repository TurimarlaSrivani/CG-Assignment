package exeptionhandling;
import java.util.Scanner;
class UserDefinedException extends Exception{
	public UserDefinedException(String s)
	{
		super(s);
	}
}

public class FirstNameLastName {
  private String fname;
  private String lname;
  public void name(String fname,String lname)throws UserDefinedException
  {
	  if(fname.length()!=0&&lname.length()!=0)
	  {
		  System.out.println("The first name is:"+fname+"\n The last name is:"+lname);
	  }
	  else
	  {
		  UserDefinedException ue=new UserDefinedException("Strings entered are blank");
		  throw ue;
	  }
  }

}