
public class Employee {

	int id;
	String name;
	Address address;  //instance of Address class for aggregation
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	
	public static void main(String args[]) {
		
		Address obj = new Address("Trivandrum", "Kerala", "India", 691523);
		Employee obj1 = new Employee(1,"Linu",obj );
		obj1.display();
		
	}
	public void display() {
		System.out.println(id +","+name);
		System.out.println(address.city +","+ address.state+","+address.country+","+address.zipCode);
	}

}
