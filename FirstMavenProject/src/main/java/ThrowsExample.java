
public class ThrowsExample {

	public static int divideNum(int m, int n) throws ArithmeticException {  
		int div = m / n;  
		return div;  
	} 

	public static void main(String[] args) {

		ThrowsExample obj = new ThrowsExample();
		try {
			System.out.println(obj.divideNum(10, 0));
			
		}catch(ArithmeticException e){
			System.out.println("Number cannot be divided by zero");
		}
		System.out.println("Rest of the code..");  
	}

}
