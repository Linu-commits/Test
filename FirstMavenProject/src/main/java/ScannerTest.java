import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter name");
		String name = s.next();
		
		System.out.println("Enter roll number");
		int rollNumber = s.nextInt();
		
		System.out.println("Enter City name");
		String city = s.next();
		
		System.out.println("Enter Mark");
		float f = s.nextFloat();
		

	}

}
