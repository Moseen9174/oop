package Interface;

 interface CoadingCourses {
  abstract void fronted();
  abstract void backend();
}
 class Rahul implements CoadingCourses{

	@Override
	public void fronted() {
	System.out.println("Basic Html Css java script");
	}

	@Override
	public void backend() {
		System.out.println("java paython both");
	}
	 
 }
 class Raj implements CoadingCourses{

	@Override
	public void fronted() {
		System.out.println("CSS javaScript");
	}

	@Override
	public void backend() {
		System.out.println("PHP");
	}
	 
 }
