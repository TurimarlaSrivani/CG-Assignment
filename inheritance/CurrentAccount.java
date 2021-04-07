package inheritance;

public class CurrentAccount {
     long overdraftlimit=6000l;
     CurrentAccount(){}
     CurrentAccount(long accNum,double balance){
    	 super();
     }
     void withdraw(int amt) {
    	 if(this.getBalance()>overdraftlimit)
    	
    		 this.setBalance(this.getBalance()-amt);
     }
	private void setBalance(long l) {
		// TODO Auto-generated method stub
		
	}
	private long getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}
}
