package Encapsulation;

public class Employe {
	
	private String name=null;
	private int EmployeID=0;
	private int salary=0;
	
	public int getEmployeID() {
		return EmployeID;
	}
	public void setEmployeID(int employeID) {
		EmployeID = employeID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

}
