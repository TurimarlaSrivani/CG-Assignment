package inheritance;

public class Accountt {
private long accNum;
private double balance;
private Person accHolder;
	 Accountt(){
		  
	  }
	  Accountt(long accNum,double balance,Person accHolder){
	  this.accNum = accNum;
	  this.balance=balance;
	  this.accHolder=accHolder;
	  }

	  Accountt(String name,float age,long accNum,double balance,Person accHolder){
		  super();
		  this.accNum=accNum;
		  this.balance=balance;
		  this.accHolder=accHolder;
	  }
	  void deposit(double bal) {
		  this.balance = balance +bal;
	  }
	  void withdraw(double bal) {
		  this.balance =balance + bal;
	  }
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	 
	
	}


