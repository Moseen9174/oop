package Encapsulation;

public class AccountClassObj {

	public static void main(String[] args) {
		AccountClass a1=new AccountClass();
		a1.setAccountType("Saving Account");
		a1.setBalance(2000);
		a1.setNumber(574857477);
		
		System.out.println(a1.getAccountType());
		System.out.println(a1.getBalance());
		System.out.println(a1.getNumber());
	}
}
