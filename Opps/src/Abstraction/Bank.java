package Abstraction;

abstract class Bank {                               //Abstract class
 abstract void getbalance();                        //Abstract method
}
class BankOfIndia extends Bank{

	@Override
	void getbalance() {
		System.out.println("Deposite 1000");
		
	}
	
}
class BankOfBadodha extends Bank{

	@Override
	void getbalance() {
		System.out.println("Deposite 2000");
	}	
}
class HDFC extends Bank{

	@Override
	void getbalance() {
		System.out.println("Deposite 3000");
		
	}
	
}
