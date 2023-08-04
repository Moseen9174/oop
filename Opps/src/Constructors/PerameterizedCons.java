package Constructors;

public class PerameterizedCons {

	int id=0;
	String name=null;
	
	public PerameterizedCons(int id , String name) {
		this.id=id;
		this.name=name;
	}
	void show() {
		System.out.println(id +" "+name);
	}
}
