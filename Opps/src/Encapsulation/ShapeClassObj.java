package Encapsulation;

public class ShapeClassObj {
 
	public static void main(String[] args) {
	
		ShapClass s1=new ShapClass();
		
		s1.setBorder(100);
		s1.setColor("blue");
		
		System.out.println(s1.getBorder());
		System.out.println(s1.getColor());
}
 
}
