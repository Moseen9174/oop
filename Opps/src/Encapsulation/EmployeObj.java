package Encapsulation;

public class EmployeObj {
public static void main(String[] args) {
	
	Employe e1=new Employe();
	e1.setEmployeID(44565);
	e1.setName("Rahul");
	e1.setSalary(20000);
	
	System.out.println(e1.getEmployeID());
	System.out.println(e1.getName());
	System.out.println(e1.getSalary());
}
}
