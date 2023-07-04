
public class B implements  A,C{


	@Override
	public void print() {
		System.out.println("Hello");
		
	}
	public static void main(String args[]) {
		B obj = new B();
		obj.print();
	}

}
