package inheritance;

public class Main {
	public static void main(String args[]) {
	Person per1=new Person("smith",23);
    Person per2=new Person("kathy",25);
    
	Accountt ac1=new Accountt(123,2000,per1);
	Accountt ac2=new Accountt(456,3000,per2);
	
	ac1.deposit(2000);
	System.out.println("Smith balance is:" +ac1.getBalance());
	ac2.withdraw(2000);
	System.out.println("kathy balance is:" +ac2.getBalance());
	
	per1.getAge();
	ac2.getAccNum();
}
}