package inheritance;

public class SavingsAccount extends Accountt {
	
	final double minBalance=500;
	SavingsAccount(){}
	SavingsAccount(long accNum,double balance){
		super();
	}
	void withdraw(int amt) {
		if(this.getBalance()>minBalance)
			this.setBalance(this.getBalance() - amt);
	}

}
