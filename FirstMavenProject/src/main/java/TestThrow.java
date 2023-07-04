public class TestThrow {

	public static void validateAge() {
		int age = 10;
		if(age<18) {
			throw new ArithmeticException("Person is not eligible to vote");
		}else {
			System.out.println("Person is eligible to vote");
		}
	}
	
	public static void main(String[] args) {
	
		validateAge();
		System.out.println("Run rest of the code");
		
	}

}
