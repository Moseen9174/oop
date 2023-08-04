package ObjectClonnig;

public class ShallowCloning implements Cloneable {
  int a=0;
  ShallowCloning(int a) {
	this.a=a;
}
  @Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
