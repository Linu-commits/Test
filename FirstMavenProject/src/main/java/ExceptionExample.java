
public class ExceptionExample {

	public static void main(String[] args) {
		try {
			//int b[] = new int[2];
			//System.out.println(b[10]);
			//int data = 100/0;
			String s = null;
			System.out.println(s.charAt(1));
			
//		}catch(ArithmeticException e) {  // to handle arithmetic exception
//			
//			System.out.println("Division by zero not possible");
//			
//		}catch(ArrayIndexOutOfBoundsException e) {  //to handle out of bound exception
//			
//			System.out.println("Index out of bound");
		}catch(Exception e) {  // super class exceptionto handle if no other exception is written
			System.out.println("Exception handled");
		}finally{   // must executable code is written in finally block
			System.out.println("Inside finally block");
		}
		System.out.println("proceed rest of the code");

	}

}
