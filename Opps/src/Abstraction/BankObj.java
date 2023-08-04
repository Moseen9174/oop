package Abstraction;

public class BankObj {
public static void main(String[] args) {
	BankOfIndia b1=new BankOfIndia();
	BankOfBadodha b2=new BankOfBadodha();
	HDFC h1=new HDFC();
	b1.getbalance();
	b2.getbalance();
	h1.getbalance();
}
}
