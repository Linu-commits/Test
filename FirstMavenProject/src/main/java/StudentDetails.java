
public class StudentDetails {
	
	String name;
	int rollno;
	Address1 address;
	
	public StudentDetails(String name, int rollno,Address1 address) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.address = address;
	}

	

	public static void main(String[] args) {
		Address1 ad = new Address1("Sreekaryam", "Kerala", "India", 691523);
		StudentDetails obj = new StudentDetails("Maria", 10,ad);
		obj.display();

	}


	void display() {
		
		System.out.println(name +" " +rollno +"\n"+address.locality+ " "+address.country+" " +address.state +" "+address.pincode);
	}

}
