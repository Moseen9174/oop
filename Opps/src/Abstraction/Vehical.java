package Abstraction;

abstract class Vehical
{
   abstract void start();
}
class car extends Vehical{
	void start() {
		System.out.println("start with key");
	}
}
class bike extends Vehical{
	void start() {	
		System.out.println("start with kick");
	}
}
