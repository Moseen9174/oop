package Encapsulation;

public class AccountClass {

	private int number=0;
	private String AccountType=null;
	private int Balance=0;
	
	public String getAccountType() {
		return AccountType;
	}
	
	public void setAccountType(String accountType) {
		AccountType = accountType;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		Balance = balance;
	}
}
