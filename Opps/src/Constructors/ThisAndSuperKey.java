package Constructors;

public class ThisAndSuperKey {

	int id=0;
	String name=null;
	
	public ThisAndSuperKey(int id , String name) {
		this.id=id;
		this.name=name;
	}
}

class B extends ThisAndSuperKey{

	public B(int id, String name) {
		super(id, name);
		
	}
	void show() {
		System.out.println(id +" "+name);
	}
}
