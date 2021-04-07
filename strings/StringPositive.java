package strings;
import java.util.*;
public class StringPositive {
	
 		public static void main(String[] args) {
 			Scanner sc=new Scanner(System.in);
 			System.out.println("Enter the String:");
 			String str=sc.nextLine();
 			boolean flag=ispositive(str);
 			if(flag) {
 				System.out.println("The given string is positive");
 				
 			}
 			else {
 				 System.out.println("The given string is negative");
 				 
 			}
 			
	}

 		public static boolean ispositive(String str) {
 			int len=str.length();
 			Character ch=str.charAt(0);
 			if(len==1)
 				return true;
 			for(int i=1;i<len;i++) {
 				if(str.charAt(i)>ch) {
 					ch=str.charAt(i);
 				}
 				else {
 					return false;
 				}
 			}
 			return true;
 		}
}
