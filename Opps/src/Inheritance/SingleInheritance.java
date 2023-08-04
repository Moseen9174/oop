package Inheritance;

public class SingleInheritance
{
   int a=10;
   int b=20;
   int c=30;
   void main() 
   {
	   System.out.println(a);         //B class extends all data and properties from the existing
	   System.out.println(b);         // class call inheritance
	   System.out.println(c);        
   }                                  //we create A class object to B class 
}
class B extends SingleInheritance     // java provide extends keyword
{
	public static void main(String args[])
	{
		B mk=new B();
		mk.main();
	}
}
