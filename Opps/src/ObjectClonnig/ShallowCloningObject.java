package ObjectClonnig;

public class ShallowCloningObject  {
   public static void main(String[] args) throws CloneNotSupportedException {
	ShallowCloning s1=new ShallowCloning(10);
	ShallowCloning s2=new ShallowCloning(20);
	s1=s2;
	s2=(ShallowCloning) s2.clone();
	s2.a=50;
	System.out.println(s1.a);
	System.out.println(s2.a);	
}
}
