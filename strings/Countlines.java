package strings;
import java.util.*;
 public class Countlines
	{
	public static void main(String args[])
	     {
	int nl=1,nw=0;          
	         char ch;
	         Scanner sc=new Scanner(System.in);
	                 System.out.print("\nEnter the string: ");
	                 String str=sc.nextLine();
	                 int n= str.length();
	                 for(int i=0;i<n;i++)
	                 {
	                ch = str.charAt(i);
	                     if(ch=='\n')
	                     {
	                         nl++;
	                     }
	                     else if(ch==' ')
	                     {
	                         nw++;
	                     }
	                 }
	                 System.out.println("\nNumber of lines : "+nl);
	                 System.out.println("\nNumber of words : "+(nl+nw));
	                 System.out.println("\nNumber of characters : "+n);
	               
	     }
	}

