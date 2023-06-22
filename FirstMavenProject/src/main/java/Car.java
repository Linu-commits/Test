
public class Car extends Vehicle{
	

	public static void main(String[] args) {
	Car obj = new Car();
	obj.display();
	Vehicle  obj1 = new Vehicle();
	obj1.display();
	Vehicle obj2 = new Car(); //upcasting car object is created and display method of car is invoked
	obj2.display();

	}
	public void display() {
		System.out.println("Car is a vehicle");
	}

}
