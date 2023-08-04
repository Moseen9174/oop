package Encapsulation;

public class StudentClass {

	private int Id=0;
	private String name=null;
	private int Rollno=0;
	
	public int getId() {
		return Id;
	}
	
	public void setId(int id) {
		Id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRollno() {
		return Rollno;
	}
	
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
}
